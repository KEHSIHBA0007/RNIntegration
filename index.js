import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View
} from 'react-native';

import App from "./src/index"


AppRegistry.registerComponent(
  'MyReactNativeActivity',
  () => App
);

AppRegistry.registerComponent(
  'MyReactNativeFragment',
  () => App
);