using System;
using Newtonsoft.Json;

namespace AdaptiveCards
{
    [JsonConverter(typeof(IgnoreDefaultStringEnumConverter<AdaptiveContainerStyle>), true)]
    public enum AdaptiveContainerStyle
    {
        /// <summary>
        /// The container does not have specified style and should adopt style from ancestors' closest style
        /// </summary>
        None,
        
        /// <summary>
        /// The container is a default container
        /// </summary>
        Default,

        /// <summary>
        /// The container is a normal container
        /// </summary>
        [Obsolete("ContainerStyle.Normal has been deprecated.  Use ContainerStyle.Default", false)]
        Normal,

        /// <summary>
        /// The container should be emphasized as a grouping of elements
        /// </summary>
        Emphasis,
    }
}