
# react-native-pinch-ssl-pinning

## Getting started

`$ npm install react-native-pinch-ssl-pinning --save`

### Mostly automatic installation

`$ react-native link react-native-pinch-ssl-pinning`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-pinch-ssl-pinning` and add `RNPinchSslPinning.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNPinchSslPinning.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNPinchSslPinningPackage;` to the imports at the top of the file
  - Add `new RNPinchSslPinningPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-pinch-ssl-pinning'
  	project(':react-native-pinch-ssl-pinning').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-pinch-ssl-pinning/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-pinch-ssl-pinning')
  	```

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNPinchSslPinning.sln` in `node_modules/react-native-pinch-ssl-pinning/windows/RNPinchSslPinning.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using Pinch.Ssl.Pinning.RNPinchSslPinning;` to the usings at the top of the file
  - Add `new RNPinchSslPinningPackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNPinchSslPinning from 'react-native-pinch-ssl-pinning';

// TODO: What to do with the module?
RNPinchSslPinning;
```
  