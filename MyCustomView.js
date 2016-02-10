var React= require('react-native');

var iface = {
  name: 'MyCustomView',
  propTypes: {
	  onChangeMessage: React.PropTypes.func,
	  renderToHardwareTextureAndroid: React.PropTypes.bool,
	  onLayout: React.PropTypes.bool,
	  accessibilityLiveRegion: React.PropTypes.string,
	  accessibilityComponentType: React.PropTypes.string,
	  src: React.PropTypes.string,
	  importantForAccessibility: React.PropTypes.string,
	  accessibilityLabel: React.PropTypes.string,
	  testID: React.PropTypes.string
  }
};

module.exports = React.requireNativeComponent('RCTMyCustomView', iface);