//
//  ACRTextView
//  ACRTextView.mm
//
//  Copyright © 2017 Microsoft. All rights reserved.
//

#import "ACOBaseCardElementPrivate.h"
#import "ACRTextView.h"
#import "TextInput.h"

@implementation ACRTextView

-(instancetype)initWithFrame:(CGRect)frame element:(ACOBaseCardElement *)element
{
    self = [super initWithFrame:frame];
    if(self) {
        std::shared_ptr<BaseCardElement> elem = [element element];
        std::shared_ptr<TextInput> inputBlck = std::dynamic_pointer_cast<TextInput>(elem);
        _maxLength = inputBlck->GetMaxLength();
    }
    return self;
}

- (BOOL)validate:(NSError **)error
{
    if(self.isRequired && !self.hasText)
    {
        if(error)
        {
            *error = [NSError errorWithDomain:ACRInputErrorDomain code:ACRInputErrorValueMissing userInfo:nil];
        }
        return NO;
    }
    else
        return YES;
}

- (void)getInput:(NSMutableDictionary *)dictionary
{
    dictionary[self.id] = self.text;
}

- (BOOL)textFieldShouldReturn:(UITextField *)textField
{
    [self resignFirstResponder];
    return YES;
}

- (void)dismissNumPad
{
    [self resignFirstResponder];
}

- (CGSize)intrinsicContentSize
{
    return self.frame.size;
}

- (BOOL)textView:(UITextView *)textView shouldChangeTextInRange:(NSRange)range replacementText:(NSString *)text;
{
    if(range.length + range.location > textView.text.length) {
        return NO;
    }
    NSUInteger newLength = [textView.text length] + [text length] - range.length;
    return newLength <= _maxLength;
}

@end
