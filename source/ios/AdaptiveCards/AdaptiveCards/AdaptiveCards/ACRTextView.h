//
//  ACRTextView
//  ACRTextView.h
//
//  Copyright © 2017 Microsoft. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "ACRIBaseInputHandler.h"
#import "ACOBaseCardElement.h"

@interface ACRTextView:UITextView<ACRIBaseInputHandler, UITextViewDelegate>
@property NSString* id;
@property bool isRequired;
@property NSUInteger maxLength;

-(instancetype)initWithFrame:(CGRect)frame element:(ACOBaseCardElement *)element;

@end
