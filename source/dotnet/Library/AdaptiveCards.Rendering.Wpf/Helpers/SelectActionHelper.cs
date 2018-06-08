﻿using System.Windows;
using System.Windows.Controls;
using System.Windows.Media;

namespace AdaptiveCards.Rendering.Wpf
{
    public static class AdaptiveRenderContextExtensions
    {
        public static FrameworkElement RenderSelectAction(this AdaptiveRenderContext context, AdaptiveAction selectAction, FrameworkElement uiElement, string backgroundColor = null)
        {
            if (context.Config.SupportsInteractivity)
            {
                var uiButton = (Button) context.Render(selectAction);
                uiButton.HorizontalAlignment = HorizontalAlignment.Left;
                if (backgroundColor != null)
                {
                    uiButton.Background = context.GetColorBrush(backgroundColor);
                }
                uiButton.BorderThickness = new Thickness(0);
                uiButton.Content = uiElement;
                uiButton.Style = context.GetStyle("Adaptive.Action.Tap");
                return uiButton;
            }

            return uiElement;
        }
    }
}