(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-37c9e9f6"],{"1b3c":function(t,i,s){var a;
/*!
 * sChart JavaScript Library v2.0.1
 * http://blog.gdfengshuo.com/example/sChart/ | Released under the MIT license
 * Date: 2018-04-16T18:59Z
 */
/*!
 * sChart JavaScript Library v2.0.1
 * http://blog.gdfengshuo.com/example/sChart/ | Released under the MIT license
 * Date: 2018-04-16T18:59Z
 */
(function(e,h){a=function(){return h(e)}.call(i,s,i,t),void 0===a||(t.exports=a)})(this,function(t){"use strict";function i(t,i,s,a){this.canvas=document.getElementById(t),this.ctx=this.canvas.getContext("2d"),this.dpi=window.devicePixelRatio||1,this.type=i,this.data=s,this.dataLength=this.data.length,this.showValue=!0,this.autoWidth=!1,this.width=this.canvas.width*this.dpi,this.height=this.canvas.height*this.dpi,this.topPadding=50*this.dpi,this.leftPadding=50*this.dpi,this.rightPadding=0*this.dpi,this.bottomPadding=50*this.dpi,this.yEqual=5,this.yLength=0,this.xLength=0,this.yFictitious=0,this.yRatio=0,this.bgColor="#ffffff",this.fillColor="#1E9FFF",this.axisColor="#666666",this.contentColor="#eeeeee",this.titleColor="#000000",this.title="",this.titlePosition="top",this.radius=100*this.dpi,this.innerRadius=70*this.dpi,this.colorList=["#1E9FFF","#13CE66","#F7BA2A","#FF4949","#72f6ff","#199475","#e08031","#726dd1"],this.legendColor="#000000",this.legendTop=40*this.dpi,this.totalValue=this.getTotalValue(),this.init(a)}return i.prototype={init:function(t){if(0===this.dataLength)return!1;if(t){var i=["topPadding","leftPadding","rightPadding","bottomPadding","radius","innerRadius","legendTop"];for(var s in t)"colorList"===s&&Array.isArray(t[s])?this[s]=t[s].concat(this[s]):i.indexOf(s)>-1?this[s]=t[s]*this.dpi:this[s]=t[s]}t.autoWidth?(this.width=this.canvas.width=this.canvas.parentNode.offsetWidth*this.dpi,this.height=this.canvas.height=this.canvas.parentNode.offsetHeight*this.dpi,this.canvas.setAttribute("style","width:"+this.canvas.parentNode.offsetWidth+"px;height:"+this.canvas.parentNode.offsetHeight+"px;")):(this.canvas.setAttribute("style","width:"+this.canvas.width+"px;height:"+this.canvas.height+"px;"),this.canvas.width*=this.dpi,this.canvas.height*=this.dpi),"bar"===this.type||"line"===this.type?(this.yLength=Math.floor((this.height-this.topPadding-this.bottomPadding-10)/this.yEqual),this.xLength=Math.floor((this.width-this.leftPadding-this.rightPadding-10)/this.dataLength),this.yFictitious=this.getYFictitious(this.data),this.yRatio=this.yLength/this.yFictitious,this.drawBarUpdate()):this.drawPieUpdate()},drawBarUpdate:function(){this.ctx.fillStyle=this.bgColor,this.ctx.fillRect(0,0,this.width,this.height),this.drawAxis(),this.drawPoint(),this.drawTitle(),this.drawBarChart()},drawPieUpdate:function(){this.ctx.fillStyle=this.bgColor,this.ctx.fillRect(0,0,this.width,this.height),this.drawLegend(),this.drawTitle(),this.drawPieChart()},drawBarChart:function(){this.ctx.fillStyle=this.fillColor,this.ctx.strokeStyle=this.fillColor;for(var t=0;t<this.dataLength;t++)this.data[t].left=this.leftPadding+this.xLength*(t+.25),this.data[t].top=this.height-this.bottomPadding-this.data[t].value*this.yRatio,this.data[t].right=this.leftPadding+this.xLength*(t+.75),this.data[t].bottom=this.height-this.bottomPadding,"line"===this.type?(this.ctx.beginPath(),this.ctx.arc(this.data[t].left+this.xLength/4,this.data[t].top,2,0,2*Math.PI,!0),this.ctx.fill(),0!==t&&(this.ctx.moveTo(this.data[t].left+this.xLength/4,this.data[t].top),this.ctx.lineTo(this.data[t-1].left+this.xLength/4,this.data[t-1].top)),this.ctx.stroke()):"bar"===this.type&&this.ctx.fillRect(this.data[t].left,this.data[t].top,this.data[t].right-this.data[t].left,this.data[t].bottom-this.data[t].top),this.showValue&&(this.ctx.font=12*this.dpi+"px Arial",this.ctx.fillText(this.data[t].value,this.data[t].left+this.xLength/4,this.data[t].top-5))},drawPieChart:function(){for(var t=this.width/2,i=this.height/2,s=0,a=0,e=0;e<this.dataLength;e++)this.ctx.beginPath(),this.ctx.fillStyle=this.colorList[e],this.ctx.moveTo(t,i),this.data[e].start=0===e?-Math.PI/2:this.data[e-1].end,this.data[e].end=this.data[e].start+this.data[e].value/this.totalValue*2*Math.PI,this.ctx.arc(t,i,this.radius,this.data[e].start,this.data[e].end),this.ctx.closePath(),this.ctx.fill(),this.data[e].middle=(this.data[e].start+this.data[e].end)/2,s=Math.ceil(Math.abs(this.radius*Math.cos(this.data[e].middle))),a=Math.floor(Math.abs(this.radius*Math.sin(this.data[e].middle))),this.ctx.strokeStyle=this.colorList[e],this.showValue&&(this.data[e].middle<=0?(this.ctx.textAlign="left",this.ctx.moveTo(t+s,i-a),this.ctx.lineTo(t+s+10,i-a-10),this.ctx.moveTo(t+s+10,i-a-10),this.ctx.lineTo(t+s+this.radius/2,i-a-10),this.ctx.stroke(),this.ctx.fillText(this.data[e].value,t+s+5+this.radius/2,i-a-5)):this.data[e].middle>0&&this.data[e].middle<=Math.PI/2?(this.ctx.textAlign="left",this.ctx.moveTo(t+s,i+a),this.ctx.lineTo(t+s+10,i+a+10),this.ctx.moveTo(t+s+10,i+a+10),this.ctx.lineTo(t+s+this.radius/2,i+a+10),this.ctx.stroke(),this.ctx.fillText(this.data[e].value,t+s+5+this.radius/2,i+a+15)):this.data[e].middle>Math.PI/2&&this.data[e].middle<Math.PI?(this.ctx.textAlign="right",this.ctx.moveTo(t-s,i+a),this.ctx.lineTo(t-s-10,i+a+10),this.ctx.moveTo(t-s-10,i+a+10),this.ctx.lineTo(t-s-this.radius/2,i+a+10),this.ctx.stroke(),this.ctx.fillText(this.data[e].value,t-s-5-this.radius/2,i+a+15)):(this.ctx.textAlign="right",this.ctx.moveTo(t-s,i-a),this.ctx.lineTo(t-s-10,i-a-10),this.ctx.moveTo(t-s-10,i-a-10),this.ctx.lineTo(t-s-this.radius/2,i-a-10),this.ctx.stroke(),this.ctx.fillText(this.data[e].value,t-s-5-this.radius/2,i-a-5)));"ring"===this.type&&(this.ctx.beginPath(),this.ctx.fillStyle=this.bgColor,this.ctx.arc(t,i,this.innerRadius,0,2*Math.PI),this.ctx.fill())},drawAxis:function(){this.ctx.beginPath(),this.ctx.strokeStyle=this.axisColor,this.ctx.moveTo(this.leftPadding+.5,this.height-this.bottomPadding+.5),this.ctx.lineTo(this.leftPadding+.5,this.topPadding+.5),this.ctx.moveTo(this.leftPadding+.5,this.height-this.bottomPadding+.5),this.ctx.lineTo(this.width-this.rightPadding-.5,this.height-this.bottomPadding+.5),this.ctx.stroke()},drawPoint:function(){this.ctx.beginPath(),this.ctx.font=12*this.dpi+"px Microsoft YaHei",this.ctx.textAlign="center",this.ctx.fillStyle=this.axisColor;for(var t=0;t<this.dataLength;t++){var i=this.data[t].name,s=this.xLength*(t+1);this.ctx.moveTo(this.leftPadding+s+.5,this.height-this.bottomPadding+.5),this.ctx.lineTo(this.leftPadding+s+.5,this.height-this.bottomPadding+5.5),this.ctx.fillText(i,this.leftPadding+s-this.xLength/2,this.height-this.bottomPadding+15*this.dpi)}this.ctx.stroke(),this.ctx.beginPath(),this.ctx.font=12*this.dpi+"px Microsoft YaHei",this.ctx.textAlign="right",this.ctx.fillStyle=this.axisColor,this.ctx.moveTo(this.leftPadding+.5,this.height-this.bottomPadding+.5),this.ctx.lineTo(this.leftPadding-4.5,this.height-this.bottomPadding+.5),this.ctx.fillText(0,this.leftPadding-10,this.height-this.bottomPadding+5);for(t=0;t<this.yEqual;t++){var a=this.yFictitious*(t+1),e=this.yLength*(t+1);this.ctx.beginPath(),this.ctx.strokeStyle=this.axisColor,this.ctx.moveTo(this.leftPadding+.5,this.height-this.bottomPadding-e+.5),this.ctx.lineTo(this.leftPadding-4.5,this.height-this.bottomPadding-e+.5),this.ctx.stroke(),this.ctx.fillText(a,this.leftPadding-10,this.height-this.bottomPadding-e+5),this.ctx.beginPath(),this.ctx.strokeStyle=this.contentColor,this.ctx.moveTo(this.leftPadding+.5,this.height-this.bottomPadding-e+.5),this.ctx.lineTo(this.width-this.rightPadding-.5,this.height-this.bottomPadding-e+.5),this.ctx.stroke()}},drawTitle:function(){this.title&&(this.ctx.beginPath(),this.ctx.textAlign="center",this.ctx.fillStyle=this.titleColor,this.ctx.font=16*this.dpi+"px Microsoft YaHei","bottom"===this.titlePosition&&this.bottomPadding>=40?this.ctx.fillText(this.title,this.width/2,this.height-5):this.ctx.fillText(this.title,this.width/2,this.topPadding/2+5))},drawLegend:function(){for(var t=0;t<this.dataLength;t++)this.ctx.fillStyle=this.colorList[t],this.ctx.fillRect(10,this.legendTop+15*t*this.dpi,20,11),this.ctx.fillStyle=this.legendColor,this.ctx.font=12*this.dpi+"px Microsoft YaHei",this.ctx.textAlign="left",this.ctx.fillText(this.data[t].name,35,this.legendTop+10+15*t*this.dpi)},getYFictitious:function(t){var i=t.slice(0);i.sort(function(t,i){return-(t.value-i.value)});var s=Math.ceil(i[0].value/this.yEqual),a=s.toString().length-1;return a=a>2?2:a,Math.ceil(s/Math.pow(10,a))*Math.pow(10,a)},getTotalValue:function(){for(var t=0,i=0;i<this.dataLength;i++)t+=this.data[i].value;return t}},i})},"34aa":function(t,i,s){"use strict";var a=s("3caf"),e=s.n(a);e.a},"3caf":function(t,i,s){},7159:function(t,i,s){t.exports=s.p+"img/img.146655c9.jpg"},"7ed4":function(t,i,s){"use strict";s("a1bf"),s("e5df"),s("aa7b"),s("b328");var a=s("9ca1"),e=new a["default"];i["a"]=e},"94eb":function(t,i,s){"use strict";var a=function(){var t=this,i=t.$createElement,s=t._self._c||i;return s("div",[s("canvas",{attrs:{id:t.canvasId}})])},e=[],h=(s("a1bf"),s("e5df"),s("aa7b"),s("b328"),s("1b3c")),o=s.n(h),n={data:function(){return{schart:null,opt:{}}},props:{canvasId:{type:String,default:""},type:{type:String,default:"bar"},data:{type:Array,default:[]},options:{type:Object,required:!1}},mounted:function(){this.renderChart()},methods:{renderChart:function(){this.schart=null,this.opt=this.options,this.width&&this.height||(this.opt?this.opt["autoWidth"]=!0:this.opt={autoWidth:!0}),this.schart=new o.a(this.canvasId,this.type,this.data,this.opt)}},watch:{data:function(){this.renderChart()},options:function(){this.renderChart()},type:function(){this.renderChart()}}},d=n;function l(t,i,s,a,e,h,o,n){var d,l="function"===typeof t?t.options:t;if(i&&(l.render=i,l.staticRenderFns=s,l._compiled=!0),a&&(l.functional=!0),h&&(l._scopeId="data-v-"+h),o?(d=function(t){t=t||this.$vnode&&this.$vnode.ssrContext||this.parent&&this.parent.$vnode&&this.parent.$vnode.ssrContext,t||"undefined"===typeof __VUE_SSR_CONTEXT__||(t=__VUE_SSR_CONTEXT__),e&&e.call(this,t),t&&t._registeredComponents&&t._registeredComponents.add(o)},l._ssrRegister=d):e&&(d=n?function(){e.call(this,this.$root.$options.shadowRoot)}:e),d)if(l.functional){l._injectStyles=d;var r=l.render;l.render=function(t,i){return d.call(i),r(t,i)}}else{var c=l.beforeCreate;l.beforeCreate=c?[].concat(c,d):[d]}return{exports:t,options:l}}var r=l(d,a,e,!1,null,null,null);i["a"]=r.exports},e2ad:function(t,i,s){"use strict";s.r(i);var a=function(){var t=this,i=t.$createElement,a=t._self._c||i;return a("div",[a("el-row",{attrs:{gutter:20}},[a("el-col",{attrs:{span:8}},[a("el-card",{staticClass:"mgb20",staticStyle:{height:"252px"},attrs:{shadow:"hover"}},[a("div",{staticClass:"user-info"},[a("img",{staticClass:"user-avator",attrs:{src:s("7159"),alt:""}}),a("div",{staticClass:"user-info-cont"},[a("div",{staticClass:"user-info-name"},[t._v(t._s(t.name))]),a("div",[t._v(t._s(t.role))])])]),a("div",{staticClass:"user-info-list"},[t._v("上次登录时间："),a("span",[t._v("2019-01-01")])]),a("div",{staticClass:"user-info-list"},[t._v("上次登录地点："),a("span",[t._v("北京")])])]),a("el-card",{staticStyle:{height:"252px"},attrs:{shadow:"hover"}},[a("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[a("span",[t._v("擅长技能")])]),t._v("\n                Vue\n                "),a("el-progress",{attrs:{percentage:71.3,color:"#42b983"}}),t._v("\n                JavaScript\n                "),a("el-progress",{attrs:{percentage:24.1,color:"#f1e05a"}}),t._v("\n                CSS\n                "),a("el-progress",{attrs:{percentage:3.7}}),t._v("\n                HTML\n                "),a("el-progress",{attrs:{percentage:.9,color:"#f56c6c"}})],1)],1),a("el-col",{attrs:{span:16}},[a("el-row",{staticClass:"mgb20",attrs:{gutter:20}},[a("el-col",{attrs:{span:8}},[a("el-card",{attrs:{shadow:"hover","body-style":{padding:"0px"}}},[a("div",{staticClass:"grid-content grid-con-1"},[a("i",{staticClass:"el-icon-lx-calendar grid-con-icon"}),a("div",{staticClass:"grid-cont-right"},[a("div",{staticClass:"grid-num"},[t._v("0天")]),a("div",[t._v("2月请假数")])])])])],1),a("el-col",{attrs:{span:8}},[a("el-card",{attrs:{shadow:"hover","body-style":{padding:"0px"}}},[a("div",{staticClass:"grid-content grid-con-2"},[a("i",{staticClass:"el-icon-lx-time grid-con-icon"}),a("div",{staticClass:"grid-cont-right"},[a("div",{staticClass:"grid-num"},[t._v("30小时")]),a("div",[t._v("2月加班数")])])])])],1),a("el-col",{attrs:{span:8}},[a("el-card",{attrs:{shadow:"hover","body-style":{padding:"0px"}}},[a("div",{staticClass:"grid-content grid-con-3"},[a("i",{staticClass:"el-icon-lx-notice grid-con-icon"}),a("div",{staticClass:"grid-cont-right"},[a("div",{staticClass:"grid-num"},[t._v("6")]),a("div",[t._v("消息提醒")])])])])],1)],1),a("el-card",{staticStyle:{height:"403px"},attrs:{shadow:"hover"}},[a("div",{staticClass:"clearfix",attrs:{slot:"header"},slot:"header"},[a("span",[t._v("待办事项")]),a("el-button",{staticStyle:{float:"right",padding:"3px 0"},attrs:{type:"text"}},[t._v("添加")])],1),a("el-table",{staticStyle:{width:"100%","font-size":"14px"},attrs:{data:t.todoList,"show-header":!1,height:"304"}},[a("el-table-column",{attrs:{width:"40"},scopedSlots:t._u([{key:"default",fn:function(i){return[a("el-checkbox",{model:{value:i.row.status,callback:function(s){t.$set(i.row,"status",s)},expression:"scope.row.status"}})]}}])}),a("el-table-column",{scopedSlots:t._u([{key:"default",fn:function(i){return[a("div",{staticClass:"todo-item",class:{"todo-item-del":i.row.status}},[t._v(t._s(i.row.title))])]}}])}),a("el-table-column",{attrs:{width:"60"},scopedSlots:t._u([{key:"default",fn:function(t){return[a("i",{staticClass:"el-icon-edit"}),a("i",{staticClass:"el-icon-delete"})]}}])})],1)],1)],1)],1),a("el-row",{attrs:{gutter:20}},[a("el-col",{attrs:{span:12}},[a("el-card",{attrs:{shadow:"hover"}},[a("schart",{ref:"bar",staticClass:"schart",attrs:{canvasId:"bar",data:t.data,type:"bar",options:t.options}})],1)],1),a("el-col",{attrs:{span:12}},[a("el-card",{attrs:{shadow:"hover"}},[a("schart",{ref:"line",staticClass:"schart",attrs:{canvasId:"line",data:t.data,type:"line",options:t.options2}})],1)],1)],1)],1)},e=[],h=(s("38f0"),s("58b5"),s("94eb")),o=s("7ed4"),n={name:"dashboard",data:function(){return{name:localStorage.getItem("ms_username"),todoList:[{title:"今天要修复100个bug",status:!1},{title:"今天要修复100个bug",status:!1},{title:"今天要写100行代码加几个bug吧",status:!1},{title:"今天要修复100个bug",status:!1},{title:"今天要修复100个bug",status:!0},{title:"今天要写100行代码加几个bug吧",status:!0}],data:[{name:"2018/09/04",value:1083},{name:"2018/09/05",value:941},{name:"2018/09/06",value:1139},{name:"2018/09/07",value:816},{name:"2018/09/08",value:327},{name:"2018/09/09",value:228},{name:"2018/09/10",value:1065}],options:{title:"最近七天每天的用户访问量",showValue:!1,fillColor:"rgb(45, 140, 240)",bottomPadding:30,topPadding:30},options2:{title:"最近七天用户访问趋势",fillColor:"#FC6FA1",axisColor:"#008ACD",contentColor:"#EEEEEE",bgColor:"#F5F8FD",bottomPadding:30,topPadding:30}}},components:{Schart:h["a"]},computed:{role:function(){return"admin"===this.name?"超级管理员":"普通用户"}},created:function(){this.handleListener(),this.changeDate()},activated:function(){this.handleListener()},deactivated:function(){window.removeEventListener("resize",this.renderChart),o["a"].$off("collapse",this.handleBus)},methods:{changeDate:function(){var t=(new Date).getTime();this.data.forEach(function(i,s){var a=new Date(t-864e5*(6-s));i.name="".concat(a.getFullYear(),"/").concat(a.getMonth()+1,"/").concat(a.getDate())})},handleListener:function(){o["a"].$on("collapse",this.handleBus),window.addEventListener("resize",this.renderChart)},handleBus:function(t){var i=this;setTimeout(function(){i.renderChart()},300)},renderChart:function(){this.$refs.bar.renderChart(),this.$refs.line.renderChart()}}},d=n,l=(s("34aa"),s("5be0")),r=Object(l["a"])(d,a,e,!1,null,"3248e4ea",null);i["default"]=r.exports}}]);