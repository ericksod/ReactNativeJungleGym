import React from 'react-native';
class MyCustomView extends React.Component {
  constructor() {
    super();
    this._onChange = this._onChange.bind(this);
  }
  _onChange(event: Event) {
    if (!this.props.onChangeMessage) {
      return;
    }
    this.props.onChangeMessage(event.nativeEvent.message);
  }
  render() {
    return <RCTMyCustomView {...this.props} onChange={this._onChange} />;
  }
}
MyCustomView.propTypes = {
  /**
   * Callback that is called continuously when the user is dragging the map.
   */
  onChangeMessage: React.PropTypes.func,
  renderToHardwareTextureAndroid: React.PropTypes.bool,
  onLayout: React.PropTypes.bool,
  accessibilityLiveRegion: React.PropTypes.string,
  accessibilityComponentType: React.PropTypes.string,
  src: React.PropTypes.string,
  importantForAccessibility: React.PropTypes.string,
  accessibilityLabel: React.PropTypes.string,
  testID: React.PropTypes.string
};  

var RCTMyCustomView = React.requireNativeComponent(`RCTMyCustomView`, MyCustomView, {
  nativeOnly: {onChange: true}
});