function TG(){}
function OG(){}
function E$(){}
function s0(){}
function aob(){}
function _nb(){}
function rYb(){}
function HYb(){}
function LYb(){}
function PYb(){}
function TYb(){}
function IYb(b){this.b=b}
function MYb(b){this.b=b}
function QYb(b){$();this.b=b}
function FYb(b,c){b.enctype=c;b.encoding=c}
function xub(b,c){b.onload=function(){c.gf()}}
function t0(){var b;this.zb=(b=$doc.createElement(yfc),b.type=Ifc,b)}
function UYb(b){var c;this.b=b;this.zb=(c=$doc.createElement(yfc),c.type='file',c);this.zb[jfc]='gwt-FileUpload'}
function tYb(b){Xvb(b.n,false);b.o||(b.e.zb[wec]=true,undefined);b.d=false}
function uYb(b){Xvb(b.n,true);b.e.zb[wec]=false;b.d=true;if(b.o){sYb(b);b.o=false}}
function sYb(b){if(b.p){$doc.body.removeChild(b.p);b.p.onload=null;b.p=null}}
function xYb(b,c){if(b.f!=c){b.f=c;if(b.f){OW(b.e,1024);OW(b.e,2048)}}yW(b.zb,'v-upload-immediate',b.f)}
function wYb(b){oX(b.k,b.n);oX(b.k,b.e);b.e=new UYb(b);b.e.zb.name=b.j+ylc;b.e.zb[wec]=!b.d;p_(b.k,b.e);p_(b.k,b.n);b.f&&OW(b.e,1024)}
function VG(){RG=new TG;Sb((Qb(),Pb),1);!!$stats&&$stats(vc(wlc,Odc,-1,-1));RG.yc();!!$stats&&$stats(vc(wlc,xlc,-1,-1))}
function SG(){var b,c,d;while(PG){d=lb;PG=PG.b;!PG&&(QG=null);if(!d){(Xnb(),Wnb).Gf(XC,new aob);fgb()}else{try{(Xnb(),Wnb).Gf(XC,new aob);fgb()}catch(b){b=$F(b);if(Op(b,38)){c=b;Blb.ie(c)}else throw b}}}}
function yYb(b){if(b.e.zb.value.length==0||b.o||!b.d){Blb.ke('Submit cancelled (disabled, no file or already submitted)');return}Ndb(b.b);b.c.submit();b.o=true;Blb.ke('Submitted form');tYb(b);b.q=new QYb(b);bb(b.q,800)}
function vYb(b){var c;if(!b.p){c=$doc.createElement(Gfc);c.innerHTML="<iframe src=\"javascript:''\" name='"+b.j+"_TGT_FRAME' style='position:absolute;width:0;height:0;border:0'>"||Jdc;b.p=fe(c);$doc.body.appendChild(b.p);b.c.target=b.j+'_TGT_FRAME';xub(b.p,b)}}
function zYb(){this.zb=$doc.createElement('form');this.e=new UYb(this);this.k=new s_;this.g=new t0;this.c=this.zb;FYb(this.zb,zlc);this.c.method='post';CZ(this,this.k);p_(this.k,this.g);p_(this.k,this.e);this.n=new Zvb;FW(this.n,new IYb(this),(Ci(),Ci(),Bi));p_(this.k,this.n);this.zb[jfc]='v-upload';this.wb==-1?mU(this.zb,241|(this.zb.__eventBits||0)):(this.wb|=241)}
var ylc='_file',Alc='buttoncaption',wlc='runCallbacks1';_=TG.prototype=OG.prototype=new J;_.gC=function UG(){return Js};_.yc=function YG(){SG()};_.cM={};_=E$.prototype=new cW;_.gC=function F$(){return Tu};_.Dc=function G$(b){JW(this,b)};_.cM={10:1,13:1,15:1,22:1,72:1,73:1};_=t0.prototype=s0.prototype=new cW;_.gC=function u0(){return gv};_.cM={10:1,13:1,15:1,22:1,72:1,73:1};_=aob.prototype=_nb.prototype=new J;_.te=function bob(){return new zYb};_.gC=function cob(){return $x};_.cM={140:1};_=zYb.prototype=rYb.prototype=new zZ;_.gC=function AYb(){return XC};_.Vc=function BYb(){IW(this);!!this.b&&vYb(this)};_.Dc=function CYb(b){(mV(b.type)&241)>0&&(anb(this.b.C,b,this,null),undefined);JW(this,b)};_.Wc=function DYb(){KW(this);this.o||sYb(this)};_.gf=function EYb(){Tmb((Ec(),Dc),new MYb(this))};_.Qd=function GYb(b,c){var d;if(Wdb(c,this,b,true)){return}if('notStarted' in b[1]){bb(this.q,400);return}if('forceSubmit' in b[1]){yYb(this);return}xYb(this,Boolean(b[1][$gc]));this.b=c;this.j=b[1][Cfc];this.i=b[1]['nextid'];d=Tdb(c,b[1][bhc][ekc]);this.c.action=d;if(Alc in b[1]){this.n.c.textContent=b[1][Alc]||Jdc;this.n.zb.style.display=Jdc}else{this.n.zb.style.display=fec}this.e.zb.name=this.j+ylc;if(wec in b[1]||Ygc in b[1]){tYb(this)}else if(!Boolean(b[1][qhc])){uYb(this);vYb(this)}};_.cM={10:1,13:1,15:1,17:1,19:1,20:1,21:1,22:1,26:1,34:1,72:1,73:1,91:1,93:1};_.b=null;_.c=null;_.d=true;_.f=false;_.i=0;_.j=null;_.n=null;_.o=false;_.p=null;_.q=null;_=IYb.prototype=HYb.prototype=new J;_.gC=function JYb(){return TC};_.Wb=function KYb(b){this.b.f?(this.b.e.zb.click(),undefined):yYb(this.b)};_.cM={12:1,40:1};_.b=null;_=MYb.prototype=LYb.prototype=new J;_.Ib=function NYb(){if(this.b.o){if(this.b.b){!!this.b.q&&ab(this.b.q);Blb.ke('VUpload:Submit complete');Ndb(this.b.b)}wYb(this.b);this.b.o=false;uYb(this.b);this.b.vb||sYb(this.b)}};_.gC=function OYb(){return UC};_.cM={3:1,14:1};_.b=null;_=QYb.prototype=PYb.prototype=new Y;_.gC=function RYb(){return VC};_.Eb=function SYb(){Blb.ke('Visiting server to see if upload started event changed UI.');odb(this.b.b,this.b.j,'pollForStart',Jdc+this.b.i,true,105)};_.cM={68:1};_.b=null;_=UYb.prototype=TYb.prototype=new E$;_.gC=function VYb(){return WC};_.Dc=function WYb(b){JW(this,b);if(mV(b.type)==1024){this.b.f&&this.b.e.zb.value!=null&&!D5b(Jdc,this.b.e.zb.value)&&yYb(this.b)}else if((qhb(),!phb&&(phb=new Khb),qhb(),phb).b.i&&mV(b.type)==2048){this.b.e.zb.click();this.b.e.zb.blur()}};_.cM={10:1,13:1,15:1,22:1,72:1,73:1};_.b=null;var Js=j4b(ilc,'AsyncLoader1'),Tu=j4b(llc,'FileUpload'),gv=j4b(llc,'Hidden'),$x=j4b(slc,'WidgetMapImpl$1$1'),TC=j4b(qlc,'VUpload$1'),UC=j4b(qlc,'VUpload$2'),VC=j4b(qlc,'VUpload$3'),WC=j4b(qlc,'VUpload$MyFileUpload');Fdc(VG)();