using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Pinch.Ssl.Pinning.RNPinchSslPinning
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNPinchSslPinningModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNPinchSslPinningModule"/>.
        /// </summary>
        internal RNPinchSslPinningModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNPinchSslPinning";
            }
        }
    }
}
