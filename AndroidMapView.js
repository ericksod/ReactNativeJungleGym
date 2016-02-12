import React, {requireNativeComponent, View} from 'react-native';

export default class AndroidMapView extends React.Component {
  // constructor() {
  //   // this._onChange = this._onChange.bind(this);
  // }

  render() {
    return <OSMMapView {...this.props}/>;
  }
}

AndroidMapView.propTypes = {
  ...View.propTypes,
  src: React.PropTypes.string
};

var OSMMapView = requireNativeComponent('RCTMyCustomView', AndroidMapView, {});








// var iface = {
//   name: 'AndroidMapView',
//   propTypes: {
//   	  ...View.propTypes,
// 	  onChangeMessage: React.PropTypes.func,
// 	  onLayout: React.PropTypes.bool,
// 	  src: React.PropTypes.string
//   }
// };

// module.exports = requireNativeComponent('RCTMyCustomView', iface);