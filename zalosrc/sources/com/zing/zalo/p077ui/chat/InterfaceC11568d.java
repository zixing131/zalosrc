package com.zing.zalo.p077ui.chat;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import androidx.lifecycle.InterfaceC1764d0;
import b90.EnumC2667d;
import c60.InterfaceC3299a;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.location.C8969o;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.dialog.ChatDialogView;
import com.zing.zalo.p077ui.chat.transfer.ChatWindowReference;
import com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import com.zing.zalo.zview.ZaloView;
import df0.C17914d;
import dj.C17945a0;
import dj.C17988o1;
import fi.C18946d;
import g30.AbstractC19215a;
import ge.C19411c;
import gi.EnumC19449b;
import gi.EnumC19450c;
import i60.C20343i;
import i60.EnumC20344j;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k60.InterfaceC21485c;
import l30.AbstractC22055v0;
import org.json.JSONObject;
import p056cj.C3535c;
import p056cj.C3538f;
import p056cj.C3545m;
import p105dn.EnumC18030a;
import p133ek.C18460c;
import p205hc.InterfaceC19970i;
import p325lj.C22499f;
import p394oj.C24277c;
import p471r3.C25630b;
import p510sq.C26365a;
import p716zh.C31862c;
import p716zh.C31877d;
import p716zh.C31890dc;
import p716zh.C31902e9;
import p716zh.C31922g;
import p716zh.C31973j5;
import p716zh.C31980jc;
import p716zh.C32002l4;
import p716zh.C32018m5;
import pm0.C24860q;
import v50.C27675hd;
import v50.C27856ub;
import vg.AbstractC28207v1;
import vg.C28212v6;

/* renamed from: com.zing.zalo.ui.chat.d */
/* loaded from: classes5.dex */
public interface InterfaceC11568d extends InterfaceC19970i {
    /* renamed from: A2 */
    boolean mo59559A2();

    /* renamed from: AI */
    void mo59562AI();

    /* renamed from: Ad */
    void mo59566Ad();

    /* renamed from: Ae */
    void mo59567Ae(String str, ArrayList arrayList);

    /* renamed from: Ah */
    void mo59568Ah();

    /* renamed from: Ai */
    void mo59569Ai();

    /* renamed from: Ar */
    void mo59570Ar(C17988o1 c17988o1);

    /* renamed from: Av */
    void mo59571Av(int i11, String str, ActionLogChatLocation.FooterLogData footerLogData);

    /* renamed from: B6 */
    void mo59572B6();

    /* renamed from: BB */
    void mo59573BB(boolean z11);

    /* renamed from: BD */
    void mo59574BD(String str);

    /* renamed from: BE */
    void mo59575BE();

    /* renamed from: Ba */
    void mo59578Ba();

    /* renamed from: Bf */
    void mo59579Bf(C25630b c25630b, int i11, int i12, int i13);

    /* renamed from: Bi */
    void mo59580Bi();

    /* renamed from: Bj */
    void mo59581Bj();

    /* renamed from: Bl */
    void mo59582Bl();

    /* renamed from: Br */
    void mo59583Br(String str, String str2, String str3, boolean z11, boolean z12);

    /* renamed from: Bx */
    void mo59584Bx();

    /* renamed from: By */
    void mo59585By(CharSequence charSequence);

    /* renamed from: C5 */
    List mo59587C5();

    /* renamed from: C6 */
    void mo59588C6();

    /* renamed from: CF */
    void mo59589CF(Drawable drawable);

    /* renamed from: CG */
    void mo59590CG(boolean z11);

    /* renamed from: Cc */
    void mo59593Cc();

    /* renamed from: Ch */
    void mo59594Ch(int i11, ContactProfile contactProfile);

    /* renamed from: Ci */
    void mo59595Ci();

    /* renamed from: Cl */
    void mo59596Cl();

    /* renamed from: Cq */
    void mo59597Cq();

    /* renamed from: Cv */
    boolean mo59598Cv(int i11);

    /* renamed from: Cx */
    void mo59599Cx(String str, boolean z11, String str2, String str3);

    /* renamed from: Cy */
    void mo59600Cy();

    /* renamed from: D6 */
    void mo59601D6();

    /* renamed from: D7 */
    void mo59602D7();

    /* renamed from: DC */
    void mo59603DC(ArrayList arrayList);

    /* renamed from: DD */
    void mo59604DD(String str, String str2, long j11, boolean z11);

    /* renamed from: DH */
    boolean mo59605DH();

    /* renamed from: Dc */
    int mo59610Dc();

    /* renamed from: Dd */
    String mo59611Dd();

    /* renamed from: De */
    void mo59612De();

    /* renamed from: Df */
    boolean mo59613Df();

    /* renamed from: Dk */
    void mo59614Dk(int i11, ContactProfile contactProfile);

    /* renamed from: Dl */
    void mo59615Dl(C31902e9 c31902e9, C25630b c25630b, C18946d c18946d, AbstractC19215a abstractC19215a);

    /* renamed from: Do */
    void mo59616Do(ContactProfile contactProfile);

    /* renamed from: Du */
    void mo59617Du();

    /* renamed from: Dx */
    void mo59618Dx(Conversation conversation, String str, int i11, String str2);

    /* renamed from: Dz */
    void mo59619Dz();

    /* renamed from: E4 */
    void mo59620E4();

    /* renamed from: E7 */
    void mo59621E7();

    /* renamed from: Ec */
    void mo59625Ec(long j11);

    /* renamed from: El */
    void mo59626El(C31902e9 c31902e9);

    /* renamed from: Es */
    void mo59627Es(String str, boolean z11, boolean z12, String str2, String str3, boolean z13);

    /* renamed from: Et */
    void mo59628Et();

    /* renamed from: F0 */
    void mo59629F0(String str, String str2);

    /* renamed from: F6 */
    void mo59630F6(String str);

    /* renamed from: FC */
    void mo59631FC(int i11);

    /* renamed from: FD */
    void mo59632FD();

    /* renamed from: FI */
    void mo59633FI();

    /* renamed from: Fb */
    void mo59635Fb(boolean z11);

    /* renamed from: Fc */
    void mo59636Fc(C11598e.e eVar);

    /* renamed from: Fe */
    void mo59637Fe();

    /* renamed from: Fl */
    boolean mo59638Fl();

    /* renamed from: Fp */
    boolean mo59639Fp();

    /* renamed from: Fu */
    void mo59640Fu(C17914d.b bVar);

    /* renamed from: Fv */
    void mo59641Fv();

    /* renamed from: Fw */
    void mo59642Fw(String str);

    /* renamed from: G0 */
    void mo59643G0();

    /* renamed from: G1 */
    boolean mo59644G1(String str);

    /* renamed from: G7 */
    void mo59645G7(String str, boolean z11, ArrayList arrayList);

    /* renamed from: G9 */
    void mo59646G9();

    /* renamed from: GA */
    void mo59647GA(ChatView.InterfaceC11310u0 interfaceC11310u0, boolean z11);

    /* renamed from: GC */
    void mo59648GC(boolean z11);

    /* renamed from: GG */
    void mo59649GG(String str, boolean z11);

    /* renamed from: Ga */
    boolean mo59652Ga();

    /* renamed from: Gc */
    boolean mo59653Gc();

    /* renamed from: Ge */
    void mo59654Ge();

    /* renamed from: Gh */
    void mo59655Gh(int i11, ContactProfile contactProfile);

    /* renamed from: Gk */
    void mo59656Gk(long j11);

    /* renamed from: Go */
    void mo59657Go(int i11);

    /* renamed from: Gp */
    void mo59658Gp(boolean z11);

    /* renamed from: Gs */
    void mo59659Gs(boolean z11);

    /* renamed from: Gt */
    void mo59660Gt();

    /* renamed from: Gx */
    boolean mo59661Gx();

    /* renamed from: Gy */
    void mo59662Gy(MessageId messageId, boolean z11);

    /* renamed from: H7 */
    void mo59663H7(String str);

    /* renamed from: HB */
    boolean mo59664HB();

    /* renamed from: HC */
    void mo59665HC(Object... objArr);

    /* renamed from: HD */
    void mo59666HD(C17945a0 c17945a0, long j11);

    /* renamed from: HH */
    void mo59667HH();

    /* renamed from: HI */
    boolean mo59668HI(String str);

    /* renamed from: Ha */
    void mo59670Ha(ArrayList arrayList, String str);

    /* renamed from: He */
    void mo59671He();

    /* renamed from: Hg */
    void mo59672Hg(MessageId messageId, String str);

    /* renamed from: Hh */
    void mo59673Hh();

    /* renamed from: Hj */
    void mo59674Hj();

    /* renamed from: Hl */
    void mo59675Hl(boolean z11);

    /* renamed from: Hm */
    int mo59676Hm();

    /* renamed from: Hq */
    void mo59677Hq();

    /* renamed from: Hu */
    void mo59678Hu(int i11, boolean z11, boolean z12);

    /* renamed from: Hy */
    void mo59679Hy(boolean z11);

    /* renamed from: Hz */
    void mo59680Hz(int i11);

    /* renamed from: I7 */
    void mo59681I7();

    /* renamed from: I8 */
    boolean mo59682I8();

    /* renamed from: IB */
    void mo59683IB(C3538f c3538f);

    /* renamed from: IE */
    boolean mo59684IE();

    /* renamed from: Ia */
    boolean mo59685Ia();

    /* renamed from: If */
    void mo59686If(long j11);

    /* renamed from: Is */
    void mo59687Is(String str, C28212v6 c28212v6);

    /* renamed from: Ix */
    void mo59688Ix(boolean z11);

    /* renamed from: J4 */
    void mo59689J4(boolean z11);

    /* renamed from: Je */
    boolean mo59690Je();

    /* renamed from: Jg */
    void mo59691Jg();

    /* renamed from: Ji */
    void mo59692Ji(boolean z11);

    /* renamed from: Jm */
    void mo59693Jm();

    /* renamed from: Jp */
    boolean mo59694Jp();

    /* renamed from: Jr */
    void mo59695Jr();

    /* renamed from: Js */
    void mo59696Js();

    /* renamed from: Jt */
    boolean mo59697Jt();

    /* renamed from: K */
    void mo59698K(C18460c c18460c, String str, String str2, int i11, ActionLogChatLocation.FooterLogData footerLogData);

    /* renamed from: K4 */
    void mo59699K4(ZaloView zaloView, String str, JSONObject jSONObject, AbstractC28207v1.h0 h0Var);

    /* renamed from: K5 */
    void mo59700K5(C31973j5 c31973j5, int i11, String str, String str2);

    /* renamed from: KC */
    void mo59701KC(String str, boolean z11);

    /* renamed from: KH */
    void mo59702KH(String str);

    /* renamed from: KI */
    void mo59703KI(String str, boolean z11, C28212v6 c28212v6);

    /* renamed from: Ka */
    void mo59706Ka(int i11);

    /* renamed from: Kd */
    boolean mo59707Kd();

    /* renamed from: Kh */
    void mo59708Kh(String str, ContactProfile contactProfile, String str2);

    /* renamed from: Kk */
    boolean mo59709Kk();

    /* renamed from: Km */
    void mo59710Km();

    /* renamed from: Kn */
    void mo59711Kn(int i11);

    /* renamed from: Kp */
    void mo59712Kp(C22499f c22499f);

    /* renamed from: L9 */
    void mo59713L9();

    /* renamed from: LA */
    void mo59714LA();

    /* renamed from: LD */
    void mo59715LD(String str, C24277c c24277c, String str2);

    /* renamed from: LE */
    void mo59716LE(EnumC19450c enumC19450c, ArrayList arrayList, EnumC19449b enumC19449b, String str, AbstractC19215a abstractC19215a);

    /* renamed from: Ld */
    boolean mo59720Ld();

    /* renamed from: Lg */
    void mo59721Lg();

    /* renamed from: Lq */
    void mo59722Lq(String str, String str2, boolean z11);

    /* renamed from: Ls */
    void mo59723Ls();

    /* renamed from: Lv */
    boolean mo59724Lv();

    /* renamed from: Lw */
    void mo59725Lw(C27856ub c27856ub);

    /* renamed from: Lx */
    void mo59726Lx(String str, Conversation conversation);

    /* renamed from: Ly */
    boolean mo59727Ly();

    /* renamed from: M6 */
    boolean mo59728M6();

    /* renamed from: M7 */
    void mo59729M7(C31973j5 c31973j5, C32018m5 c32018m5, int i11, String str);

    /* renamed from: MH */
    void mo59730MH(String str, C24277c c24277c, String str2);

    /* renamed from: Mb */
    void mo59733Mb(CharSequence charSequence, int i11);

    /* renamed from: Mi */
    void mo59734Mi();

    /* renamed from: Mj */
    void mo59735Mj();

    /* renamed from: Mm */
    int mo59736Mm();

    /* renamed from: Mn */
    boolean mo59737Mn();

    /* renamed from: Mu */
    void mo59738Mu();

    /* renamed from: Mx */
    boolean mo59739Mx();

    /* renamed from: NA */
    void mo59741NA();

    /* renamed from: NE */
    void mo59742NE();

    /* renamed from: NG */
    void mo59743NG();

    /* renamed from: Na */
    boolean mo59748Na();

    /* renamed from: Nb */
    void mo59749Nb();

    /* renamed from: Ni */
    void mo59750Ni(C19411c c19411c, int i11, boolean z11);

    /* renamed from: Nj */
    void mo59751Nj(boolean z11);

    /* renamed from: Nm */
    void mo59752Nm(boolean z11);

    /* renamed from: Nt */
    void mo59753Nt(EnumC2667d enumC2667d);

    /* renamed from: Nv */
    void mo59754Nv();

    /* renamed from: Nw */
    void mo59755Nw(MessageId messageId, String str, boolean z11, boolean z12);

    /* renamed from: Nx */
    void mo59756Nx();

    /* renamed from: Ny */
    void mo59757Ny(Editable editable, int i11, int i12, boolean z11);

    /* renamed from: Nz */
    void mo59758Nz();

    /* renamed from: OE */
    boolean mo59759OE();

    /* renamed from: Oa */
    void mo59762Oa();

    /* renamed from: Od */
    boolean mo59763Od();

    /* renamed from: Oe */
    void mo59764Oe();

    /* renamed from: Oh */
    void mo59765Oh(String str, boolean z11, boolean z12);

    /* renamed from: Om */
    boolean mo59766Om();

    /* renamed from: Os */
    void mo59767Os(ArrayList arrayList, String str, String str2);

    /* renamed from: Ox */
    void mo59768Ox();

    /* renamed from: P0 */
    boolean mo59769P0();

    /* renamed from: P4 */
    void mo59770P4(boolean z11);

    /* renamed from: PG */
    void mo59771PG(String str, long j11, String str2);

    /* renamed from: Pa */
    void mo59773Pa();

    /* renamed from: Pf */
    void mo59774Pf(String str, String str2);

    /* renamed from: Ph */
    void mo59775Ph();

    /* renamed from: Po */
    void mo59776Po(EnumC19450c enumC19450c, ArrayList arrayList, EnumC19449b enumC19449b, String str);

    /* renamed from: Pp */
    AbstractC28207v1.f0 mo59777Pp(String str, String str2);

    /* renamed from: Pu */
    boolean mo59778Pu();

    /* renamed from: Pv */
    void mo59779Pv(MessageId messageId);

    /* renamed from: Px */
    void mo59780Px(String str);

    /* renamed from: Py */
    void mo59781Py(String str, long j11);

    /* renamed from: Pz */
    void mo59782Pz(String str);

    /* renamed from: Q1 */
    void mo59783Q1(String str);

    /* renamed from: Q4 */
    void mo59784Q4(String str, String str2, String str3, int i11);

    /* renamed from: Q6 */
    void mo59785Q6();

    /* renamed from: QF */
    void mo59786QF(int i11);

    /* renamed from: QH */
    boolean mo59787QH();

    /* renamed from: Qg */
    void mo59792Qg(ArrayList arrayList);

    /* renamed from: Qm */
    void mo59793Qm();

    /* renamed from: Qp */
    void mo59794Qp(boolean z11);

    /* renamed from: Qr */
    void mo59795Qr(String str, String str2);

    /* renamed from: Qt */
    void mo59796Qt(boolean z11);

    /* renamed from: Qu */
    void mo59797Qu(String str);

    /* renamed from: Qz */
    boolean mo59798Qz();

    /* renamed from: RB */
    void mo59799RB(C32002l4 c32002l4);

    /* renamed from: RF */
    void mo59800RF();

    /* renamed from: RH */
    void mo59801RH(boolean z11);

    /* renamed from: Ra */
    void mo59805Ra(boolean z11);

    /* renamed from: Rh */
    void mo59806Rh();

    /* renamed from: Rk */
    void mo59807Rk(boolean z11);

    /* renamed from: Rl */
    Editable mo59808Rl();

    /* renamed from: Rm */
    void mo59809Rm();

    /* renamed from: Rv */
    boolean mo59810Rv();

    /* renamed from: Rw */
    void mo59811Rw(String str, String str2, C31973j5 c31973j5);

    /* renamed from: S4 */
    void mo59812S4(List list);

    /* renamed from: S7 */
    boolean mo59813S7();

    /* renamed from: SB */
    void mo59814SB();

    /* renamed from: SC */
    void mo59815SC();

    /* renamed from: SD */
    void mo59816SD(ChatAttachmentContainer.C11728c c11728c);

    /* renamed from: Sb */
    void mo59819Sb();

    /* renamed from: Sd */
    void mo59820Sd(ArrayList arrayList, int i11, String str, boolean z11, boolean z12);

    /* renamed from: Sg */
    void mo59821Sg();

    /* renamed from: Sm */
    boolean mo59822Sm();

    /* renamed from: Sq */
    boolean mo59823Sq();

    /* renamed from: Ss */
    void mo59824Ss(CharSequence charSequence);

    /* renamed from: Su */
    void mo59825Su(ArrayList arrayList, String str);

    /* renamed from: Sx */
    boolean mo59826Sx();

    /* renamed from: T4 */
    void mo59827T4(ContactProfile contactProfile, String str);

    /* renamed from: T5 */
    void mo59828T5(C24277c c24277c);

    /* renamed from: T8 */
    void mo59829T8(String str, boolean z11, InterfaceC3299a interfaceC3299a, boolean z12, boolean z13);

    /* renamed from: T9 */
    void mo59830T9();

    /* renamed from: TD */
    void mo59831TD();

    /* renamed from: TE */
    void mo59832TE(C31890dc c31890dc);

    /* renamed from: TF */
    void mo59833TF();

    /* renamed from: Tc */
    void mo59837Tc(String str, boolean z11);

    /* renamed from: Tg */
    void mo59838Tg(String str, String str2, int i11, String str3, boolean z11);

    /* renamed from: Ti */
    void mo59839Ti(C3538f c3538f);

    /* renamed from: Tj */
    void mo59840Tj(boolean z11);

    /* renamed from: Tk */
    void mo59841Tk(MessageId messageId, String str, boolean z11);

    /* renamed from: Tm */
    boolean mo59842Tm(String str);

    /* renamed from: Tn */
    void mo59843Tn(int i11, ContactProfile contactProfile, String str);

    /* renamed from: Tp */
    void mo59844Tp();

    /* renamed from: Tw */
    boolean mo59845Tw();

    /* renamed from: U5 */
    void mo59846U5(boolean z11);

    /* renamed from: U8 */
    void mo59847U8();

    /* renamed from: UA */
    void mo59848UA(String str);

    /* renamed from: UB */
    void mo59849UB();

    /* renamed from: UC */
    void mo59850UC();

    /* renamed from: UG */
    boolean mo59851UG();

    /* renamed from: Ua */
    void mo59855Ua(int i11, ContactProfile contactProfile);

    /* renamed from: Ub */
    void mo59856Ub(String str, JSONObject jSONObject);

    /* renamed from: Uh */
    void mo59857Uh();

    /* renamed from: Uk */
    void mo59858Uk();

    /* renamed from: Un */
    void mo59859Un(String str);

    /* renamed from: Uy */
    boolean mo59860Uy();

    /* renamed from: V5 */
    void mo59861V5(String str);

    /* renamed from: V8 */
    boolean mo59862V8();

    /* renamed from: VF */
    void mo59864VF(ArrayList arrayList);

    /* renamed from: Vb */
    void mo59869Vb(int i11);

    /* renamed from: Vd */
    void mo59870Vd();

    /* renamed from: Vf */
    void mo59871Vf();

    /* renamed from: Vg */
    void mo59872Vg();

    /* renamed from: Vj */
    boolean mo59873Vj();

    /* renamed from: Vk */
    void mo59874Vk(int i11, int i12);

    /* renamed from: Vl */
    void mo59875Vl();

    /* renamed from: Vq */
    void mo59876Vq();

    /* renamed from: Vz */
    boolean mo59877Vz();

    /* renamed from: W5 */
    boolean mo59878W5();

    /* renamed from: WA */
    void mo59880WA();

    /* renamed from: WC */
    void mo59881WC(ArrayList arrayList);

    /* renamed from: WD */
    void mo59882WD(String[] strArr);

    /* renamed from: WG */
    void mo59883WG(String str, MessageId messageId);

    /* renamed from: Wa */
    void mo59885Wa();

    /* renamed from: Wb */
    boolean mo59886Wb();

    /* renamed from: Wc */
    void mo59887Wc();

    /* renamed from: Wq */
    void mo59888Wq(boolean z11);

    /* renamed from: Wr */
    int mo59889Wr();

    /* renamed from: Wt */
    void mo59890Wt(String str);

    /* renamed from: Wu */
    void mo59891Wu(String str, boolean z11, boolean z12);

    /* renamed from: Wz */
    boolean mo59892Wz();

    /* renamed from: X8 */
    void mo59893X8(C22499f c22499f);

    /* renamed from: XD */
    void mo59894XD();

    /* renamed from: XF */
    void mo59895XF();

    /* renamed from: Xa */
    void mo59897Xa();

    /* renamed from: Xc */
    void mo59898Xc(boolean z11);

    /* renamed from: Xd */
    void mo59899Xd();

    /* renamed from: Xf */
    void mo59900Xf(String str);

    /* renamed from: Xh */
    void mo59901Xh(C17945a0 c17945a0, String[] strArr, boolean z11, boolean z12, boolean z13);

    /* renamed from: Xk */
    void mo59902Xk();

    /* renamed from: Xp */
    void mo59903Xp(String str, int i11, String str2, boolean z11);

    /* renamed from: Xv */
    void mo59904Xv(List list);

    /* renamed from: Y6 */
    void mo59905Y6();

    /* renamed from: Y9 */
    void mo59906Y9(boolean z11);

    /* renamed from: YG */
    boolean mo59907YG();

    /* renamed from: YH */
    boolean mo59908YH();

    /* renamed from: Ya */
    void mo59912Ya();

    /* renamed from: Yg */
    boolean mo59913Yg();

    /* renamed from: Yh */
    int mo59914Yh(MessageId messageId);

    /* renamed from: Yi */
    void mo59915Yi();

    /* renamed from: Ym */
    void mo59916Ym();

    /* renamed from: Yo */
    void mo59917Yo(String str);

    /* renamed from: Yt */
    void mo59918Yt();

    /* renamed from: Yu */
    void mo59919Yu();

    /* renamed from: Yv */
    void mo59920Yv();

    /* renamed from: Z4 */
    void mo59921Z4();

    /* renamed from: Z6 */
    void mo59922Z6();

    /* renamed from: Z8 */
    void mo59923Z8(ZaloView zaloView, C8969o c8969o, int i11);

    /* renamed from: ZF */
    void mo59924ZF(String str, boolean z11);

    /* renamed from: ZG */
    boolean mo59925ZG();

    /* renamed from: ZH */
    Set mo59926ZH();

    /* renamed from: Za */
    void mo59929Za();

    /* renamed from: Zq */
    void mo59930Zq(boolean z11);

    /* renamed from: Zs */
    void mo59931Zs();

    /* renamed from: Zt */
    C24860q mo59932Zt();

    /* renamed from: aH */
    void mo59933aH(int i11, String str, int i12);

    /* renamed from: ac */
    void mo59936ac();

    /* renamed from: ag */
    void mo59937ag(boolean z11);

    /* renamed from: ah */
    void mo59938ah(int i11);

    /* renamed from: ai */
    void mo59939ai();

    /* renamed from: ay */
    void mo59940ay();

    /* renamed from: az */
    void mo59941az();

    /* renamed from: b5 */
    void mo59942b5();

    /* renamed from: b6 */
    void mo59943b6();

    /* renamed from: b7 */
    void mo59944b7(int i11);

    /* renamed from: ba */
    boolean mo59948ba(EnumC19450c enumC19450c);

    /* renamed from: bd */
    void mo59949bd();

    /* renamed from: bf */
    void mo59950bf();

    /* renamed from: bj */
    void mo59951bj(int i11);

    /* renamed from: bm */
    C17945a0 mo59952bm();

    /* renamed from: bo */
    boolean mo59953bo();

    /* renamed from: bq */
    void mo59954bq(String str, boolean z11);

    /* renamed from: br */
    void mo59955br(ZaloView zaloView);

    /* renamed from: c9 */
    void mo59956c9(C31862c c31862c);

    /* renamed from: cF */
    void mo59957cF(String str, int i11);

    /* renamed from: cf */
    void mo59963cf(int i11, String str, String str2, int i12);

    /* renamed from: ci */
    void mo59964ci();

    /* renamed from: cj */
    void mo59965cj(C3545m c3545m);

    /* renamed from: cl */
    void mo59966cl(String str);

    /* renamed from: cn */
    int mo59967cn();

    /* renamed from: co */
    int mo59968co();

    /* renamed from: cu */
    void mo59969cu(C31980jc c31980jc, int i11, AbstractC22055v0.g gVar);

    /* renamed from: cv */
    EnumC19450c mo59970cv();

    /* renamed from: d6 */
    void mo59971d6(C17945a0 c17945a0);

    /* renamed from: d7 */
    void mo59972d7();

    /* renamed from: dc */
    void mo59978dc(String str, String str2, String str3);

    /* renamed from: dk */
    void mo59979dk();

    /* renamed from: dm */
    void mo59980dm();

    /* renamed from: du */
    boolean mo59981du(String str);

    /* renamed from: dw */
    void mo59982dw();

    /* renamed from: dz */
    void mo59983dz(EnumC19450c enumC19450c);

    /* renamed from: e6 */
    void mo59984e6(boolean z11);

    /* renamed from: eD */
    void mo59985eD(int i11, ContactProfile contactProfile, String str);

    /* renamed from: eI */
    void mo59986eI();

    /* renamed from: eh */
    boolean mo59988eh();

    /* renamed from: ek */
    void mo59989ek();

    /* renamed from: em */
    void mo59990em();

    /* renamed from: er */
    void mo59991er(ChatAttachmentContainer.C11728c c11728c);

    /* renamed from: es */
    void mo59992es();

    /* renamed from: eu */
    void mo59993eu(String str);

    /* renamed from: ev */
    void mo59994ev();

    /* renamed from: ex */
    void mo59995ex(int i11, String str, String str2);

    /* renamed from: ey */
    void mo59996ey(C3545m c3545m);

    /* renamed from: f0 */
    void mo59997f0();

    /* renamed from: f7 */
    void mo59998f7(String str);

    /* renamed from: fA */
    boolean mo59999fA();

    /* renamed from: fE */
    void mo60000fE();

    /* renamed from: fG */
    void mo60001fG(CharSequence charSequence);

    /* renamed from: fH */
    void mo60002fH(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16);

    /* renamed from: fI */
    void mo60003fI(C3538f c3538f);

    /* renamed from: fb */
    void mo60007fb(C17945a0 c17945a0, String str);

    /* renamed from: fd */
    void mo60008fd();

    /* renamed from: fk */
    void mo60009fk();

    /* renamed from: fu */
    void mo60010fu();

    /* renamed from: fw */
    void mo60011fw();

    /* renamed from: fx */
    void mo60012fx();

    /* renamed from: gA */
    void mo60014gA(int i11);

    /* renamed from: gB */
    void mo60015gB(String str, String str2);

    /* renamed from: gC */
    boolean mo60016gC();

    /* renamed from: gF */
    void mo60017gF();

    /* renamed from: gH */
    void mo60018gH(boolean z11);

    /* renamed from: gc */
    void mo60023gc(C31973j5 c31973j5, String str, boolean z11, Rect rect);

    /* renamed from: gg */
    boolean mo60024gg();

    /* renamed from: gh */
    void mo60025gh();

    /* renamed from: gi */
    void mo60026gi();

    /* renamed from: gq */
    void mo60027gq(int i11, ArrayList arrayList);

    /* renamed from: gz */
    void mo60028gz();

    /* renamed from: h3 */
    void mo60029h3(ChatWindowReference chatWindowReference);

    /* renamed from: h5 */
    void mo60030h5(String str, C7904b c7904b, boolean z11);

    /* renamed from: hG */
    void mo60031hG(String str);

    /* renamed from: hI */
    void mo60032hI(boolean z11);

    /* renamed from: ha */
    void mo60036ha(C17945a0 c17945a0);

    /* renamed from: hh */
    boolean mo60037hh();

    /* renamed from: hj */
    void mo60038hj(C31862c c31862c, String str, String str2);

    /* renamed from: hl */
    void mo60039hl(C7904b c7904b, int i11, boolean z11);

    /* renamed from: hn */
    void mo60040hn(boolean z11);

    /* renamed from: hr */
    void mo60041hr(boolean z11);

    /* renamed from: ht */
    void mo60042ht(String str);

    /* renamed from: hy */
    void mo60043hy();

    /* renamed from: hz */
    void mo60044hz();

    /* renamed from: i6 */
    boolean mo60045i6(String str);

    /* renamed from: i8 */
    void mo60046i8();

    /* renamed from: iC */
    void mo60047iC(boolean z11);

    /* renamed from: iD */
    void mo60048iD(boolean z11);

    /* renamed from: id */
    void mo60051id(int i11);

    /* renamed from: ij */
    boolean mo60052ij();

    /* renamed from: il */
    void mo60053il();

    /* renamed from: iq */
    void mo60054iq();

    /* renamed from: is */
    void mo60055is();

    /* renamed from: iu */
    ChatDialogView mo60056iu(int i11, Object obj);

    /* renamed from: iy */
    void mo60057iy(boolean z11, boolean z12);

    /* renamed from: iz */
    void mo60058iz(int i11);

    /* renamed from: j1 */
    void mo60059j1();

    /* renamed from: j3 */
    boolean mo60060j3();

    /* renamed from: j5 */
    void mo60061j5(String str, int i11, int i12);

    /* renamed from: j9 */
    void mo60062j9(String str);

    /* renamed from: jA */
    void mo60063jA(String str);

    /* renamed from: jE */
    void mo60064jE(boolean z11);

    /* renamed from: jG */
    void mo60065jG();

    /* renamed from: ja */
    String mo60067ja();

    /* renamed from: jg */
    void mo60068jg(C27675hd c27675hd);

    /* renamed from: jj */
    void mo60069jj(String str, String str2, Integer num);

    /* renamed from: jk */
    void mo60070jk();

    /* renamed from: jm */
    void mo60071jm(int i11);

    /* renamed from: jt */
    boolean mo60072jt();

    /* renamed from: jv */
    void mo60073jv();

    /* renamed from: jw */
    void mo60074jw(int i11);

    /* renamed from: jy */
    void mo60075jy(List list);

    /* renamed from: k */
    ZaloView mo60076k();

    /* renamed from: k1 */
    void mo60077k1();

    /* renamed from: k5 */
    void mo60078k5(int i11);

    /* renamed from: k6 */
    boolean mo60079k6();

    /* renamed from: k9 */
    void mo60080k9();

    /* renamed from: kA */
    void mo60081kA();

    /* renamed from: kF */
    void mo60082kF(int i11);

    /* renamed from: kH */
    void mo60083kH(C31973j5 c31973j5, int i11, String str);

    /* renamed from: ka */
    void mo60085ka(int i11);

    /* renamed from: kc */
    void mo60086kc(boolean z11);

    /* renamed from: kg */
    void mo60087kg(String str, MessageId messageId, EnumC18030a enumC18030a, String str2, String str3);

    /* renamed from: ki */
    void mo60088ki();

    /* renamed from: ko */
    void mo60089ko();

    /* renamed from: kr */
    void mo60090kr(ContactProfile contactProfile, boolean z11, C31922g c31922g, boolean z12, boolean z13, boolean z14, boolean z15, int i11, InterfaceC21485c interfaceC21485c);

    /* renamed from: ku */
    void mo60091ku(String str);

    /* renamed from: kz */
    void mo60092kz();

    /* renamed from: l7 */
    void mo60094l7(int i11, boolean z11);

    /* renamed from: l8 */
    void mo60095l8(ArrayList arrayList);

    /* renamed from: lC */
    void mo60096lC();

    /* renamed from: lF */
    void mo60097lF();

    /* renamed from: lG */
    boolean mo60098lG();

    /* renamed from: ld */
    void mo60102ld(int i11);

    /* renamed from: le */
    void mo60103le(int i11);

    /* renamed from: lf */
    void mo60104lf();

    /* renamed from: ll */
    void mo60105ll();

    /* renamed from: lr */
    void mo60106lr(int i11, boolean z11);

    /* renamed from: lv */
    void mo60107lv(String str);

    /* renamed from: m5 */
    void mo60108m5(C17945a0 c17945a0, C20343i c20343i, EnumC20344j enumC20344j);

    /* renamed from: m8 */
    void mo60109m8(int i11, String[] strArr, int[] iArr);

    /* renamed from: mA */
    void mo60110mA(String str);

    /* renamed from: mB */
    void mo60111mB(ChatAttachmentContainer.C11728c c11728c);

    /* renamed from: mg */
    void mo60115mg();

    /* renamed from: mh */
    boolean mo60116mh(String str);

    /* renamed from: mi */
    void mo60117mi(boolean z11);

    /* renamed from: mj */
    void mo60118mj();

    /* renamed from: mo */
    void mo60119mo(boolean z11);

    /* renamed from: mu */
    boolean mo60120mu();

    /* renamed from: mv */
    void mo60121mv(String str, String str2);

    /* renamed from: my */
    void mo60122my(boolean z11);

    /* renamed from: mz */
    void mo60123mz(String str);

    /* renamed from: n3 */
    boolean mo60124n3();

    /* renamed from: n5 */
    void mo60125n5();

    /* renamed from: nA */
    boolean mo60126nA();

    /* renamed from: nB */
    boolean mo60127nB();

    /* renamed from: nD */
    void mo60128nD(String str);

    /* renamed from: nI */
    void mo60129nI(MessageId messageId);

    /* renamed from: na */
    void mo60133na();

    /* renamed from: nc */
    void mo60134nc(boolean z11, boolean z12);

    /* renamed from: nh */
    boolean mo60135nh(String str, C28212v6 c28212v6);

    /* renamed from: nk */
    void mo60136nk();

    /* renamed from: no */
    void mo60137no(String str);

    /* renamed from: nx */
    void mo60138nx();

    /* renamed from: ny */
    boolean mo60139ny();

    /* renamed from: o2 */
    void mo60140o2(String str);

    /* renamed from: o4 */
    void mo60141o4(C3535c c3535c);

    /* renamed from: oB */
    boolean mo60142oB();

    /* renamed from: oF */
    void mo60143oF(boolean z11, boolean z12);

    /* renamed from: oG */
    void mo60144oG(int i11, ContactProfile contactProfile, String str);

    /* renamed from: ob */
    boolean mo60148ob();

    /* renamed from: oe */
    void mo60149oe();

    /* renamed from: oi */
    void mo60150oi();

    /* renamed from: oq */
    void mo60151oq(List list);

    /* renamed from: os */
    void mo60152os();

    /* renamed from: ot */
    void mo60153ot();

    /* renamed from: oz */
    void mo60154oz(String str, C24277c c24277c, String str2, int i11, int i12);

    /* renamed from: p3 */
    void mo60155p3(C17945a0 c17945a0);

    /* renamed from: p4 */
    void mo60156p4(int i11);

    /* renamed from: p5 */
    void mo60157p5();

    /* renamed from: p6 */
    void mo60158p6(String str);

    /* renamed from: pB */
    boolean mo60159pB();

    /* renamed from: pg */
    void mo60164pg(int i11);

    /* renamed from: pn */
    void mo60165pn();

    /* renamed from: pp */
    void mo60166pp(MessageId messageId);

    /* renamed from: pq */
    void mo60167pq(C25630b c25630b);

    /* renamed from: ps */
    void mo60168ps(C31902e9 c31902e9);

    /* renamed from: px */
    void mo60169px(C3535c c3535c);

    /* renamed from: q2 */
    void mo60170q2(C26365a c26365a, int i11);

    /* renamed from: q5 */
    void mo60171q5();

    /* renamed from: qA */
    boolean mo60172qA();

    /* renamed from: qB */
    void mo60173qB(C31862c c31862c);

    /* renamed from: qF */
    void mo60174qF();

    /* renamed from: qI */
    void mo60175qI();

    /* renamed from: qd */
    int mo60178qd();

    /* renamed from: qm */
    void mo60179qm(String str);

    /* renamed from: qp */
    void mo60180qp();

    /* renamed from: qu */
    C17945a0 mo60181qu();

    /* renamed from: qv */
    void mo60182qv(boolean z11);

    /* renamed from: qw */
    void mo60183qw();

    /* renamed from: qx */
    boolean mo60184qx();

    /* renamed from: qy */
    void mo60185qy();

    /* renamed from: rB */
    boolean mo60186rB();

    /* renamed from: rC */
    void mo60187rC(InterfaceC1764d0 interfaceC1764d0);

    /* renamed from: rE */
    void mo60188rE(boolean z11);

    /* renamed from: rH */
    void mo60189rH(boolean z11);

    /* renamed from: rI */
    void mo60190rI(String str, String str2);

    /* renamed from: rc */
    int mo60194rc();

    /* renamed from: rf */
    void mo60195rf();

    /* renamed from: rj */
    void mo60196rj(String str, String str2, String str3);

    /* renamed from: rm */
    void mo60197rm(String str, String str2, int i11);

    /* renamed from: rn */
    boolean mo60198rn(C17945a0 c17945a0);

    /* renamed from: ro */
    void mo60199ro(String str, int i11, int i12);

    /* renamed from: rp */
    List mo60200rp();

    /* renamed from: rw */
    void mo60201rw();

    /* renamed from: s4 */
    void mo60202s4(int i11);

    /* renamed from: sB */
    void mo60203sB(C17945a0 c17945a0, String str, int i11);

    /* renamed from: sD */
    void mo60204sD();

    /* renamed from: sF */
    void mo60205sF(String str);

    /* renamed from: sG */
    void mo60206sG();

    /* renamed from: sa */
    void mo60210sa();

    void setKeepScreenOn(boolean z11);

    /* renamed from: sf */
    void mo60211sf(boolean z11);

    /* renamed from: sl */
    void mo60212sl(String str);

    /* renamed from: sm */
    void mo60213sm(JSONObject jSONObject);

    /* renamed from: sv */
    void mo60214sv(CharSequence charSequence);

    /* renamed from: sw */
    boolean mo60215sw();

    /* renamed from: sy */
    boolean mo60216sy();

    /* renamed from: t5 */
    void mo60217t5(String str, String str2, String str3, String str4);

    /* renamed from: t9 */
    void mo60218t9(boolean z11);

    /* renamed from: tB */
    void mo60219tB();

    /* renamed from: tD */
    void mo60220tD();

    /* renamed from: tG */
    String mo60221tG(CharSequence charSequence, C7907e c7907e);

    /* renamed from: tc */
    void mo60225tc();

    /* renamed from: td */
    void mo60226td(String str, boolean z11);

    /* renamed from: tk */
    void mo60227tk(int i11);

    /* renamed from: tm */
    void mo60228tm();

    /* renamed from: tn */
    void mo60229tn();

    /* renamed from: tt */
    void mo60230tt(String str, String str2, String str3);

    /* renamed from: tu */
    boolean mo60231tu();

    /* renamed from: ty */
    void mo60232ty(String str, C7904b c7904b);

    /* renamed from: u2 */
    void mo60233u2(int i11);

    /* renamed from: u6 */
    void mo60234u6(int i11, String str, Conversation conversation, String str2, String str3);

    /* renamed from: u8 */
    void mo60235u8(boolean z11);

    /* renamed from: uH */
    void mo60236uH(String str);

    /* renamed from: ub */
    void mo60237ub(C3538f c3538f, C3538f c3538f2, String str);

    /* renamed from: uh */
    void mo60238uh(C17945a0 c17945a0, String str, long j11);

    /* renamed from: uk */
    void mo60239uk();

    /* renamed from: ul */
    ChatDialogView mo60240ul(int i11);

    /* renamed from: uq */
    void mo60241uq();

    /* renamed from: ut */
    void mo60242ut(boolean z11);

    /* renamed from: uy */
    void mo60243uy(int i11, ContactProfile contactProfile, String str);

    /* renamed from: v2 */
    boolean mo60244v2();

    /* renamed from: v6 */
    void mo60245v6();

    /* renamed from: v8 */
    void mo60246v8();

    /* renamed from: vA */
    void mo60247vA(boolean z11);

    /* renamed from: vD */
    void mo60248vD(String str, String str2, String str3);

    /* renamed from: vF */
    boolean mo60249vF();

    /* renamed from: vG */
    void mo60250vG();

    /* renamed from: vH */
    void mo60251vH(boolean z11);

    /* renamed from: vI */
    void mo60252vI(C31862c c31862c, boolean z11);

    /* renamed from: va */
    void mo60254va(String str);

    /* renamed from: vk */
    void mo60255vk(boolean z11);

    /* renamed from: vl */
    void mo60256vl();

    /* renamed from: vm */
    boolean mo60257vm();

    /* renamed from: vu */
    void mo60258vu();

    /* renamed from: vy */
    void mo60259vy();

    /* renamed from: w5 */
    boolean mo60260w5();

    /* renamed from: w7 */
    void mo60261w7(ArrayList arrayList, String str);

    /* renamed from: w9 */
    boolean mo60262w9();

    /* renamed from: wD */
    void mo60263wD(String str, String str2);

    /* renamed from: wE */
    void mo60264wE(boolean z11);

    /* renamed from: wG */
    void mo60265wG(String str, ArrayList arrayList);

    /* renamed from: wf */
    void mo60268wf(boolean z11);

    /* renamed from: wl */
    void mo60269wl();

    /* renamed from: wn */
    void mo60270wn(List list, int i11);

    /* renamed from: wv */
    void mo60271wv(String str, String str2, AbstractC28207v1.h0 h0Var, C31877d c31877d);

    /* renamed from: ww */
    void mo60272ww();

    /* renamed from: x4 */
    boolean mo60273x4();

    /* renamed from: x5 */
    void mo60274x5(int i11, String str);

    /* renamed from: x7 */
    void mo60275x7();

    /* renamed from: xa */
    boolean mo60279xa(String str);

    /* renamed from: xe */
    Object mo60280xe(int i11);

    /* renamed from: xj */
    void mo60281xj();

    /* renamed from: xk */
    void mo60282xk();

    /* renamed from: xm */
    void mo60283xm(boolean z11);

    /* renamed from: xo */
    void mo60284xo(ArrayList arrayList, String str, String str2);

    /* renamed from: xq */
    void mo60285xq(String str);

    /* renamed from: xs */
    void mo60286xs(int i11, String str, String str2, int i12);

    /* renamed from: y */
    String mo60287y();

    /* renamed from: y5 */
    void mo60288y5();

    /* renamed from: y6 */
    void mo60289y6();

    /* renamed from: yb */
    void mo60292yb();

    /* renamed from: yc */
    void mo60293yc(boolean z11);

    /* renamed from: yp */
    boolean mo60294yp();

    /* renamed from: yu */
    void mo60295yu(String str, String str2, boolean z11);

    /* renamed from: yv */
    boolean mo60296yv();

    /* renamed from: z */
    void mo60297z(boolean z11, List list);

    /* renamed from: z5 */
    void mo60299z5();

    /* renamed from: z8 */
    void mo60300z8();

    /* renamed from: zB */
    boolean mo60301zB();

    /* renamed from: zD */
    void mo60302zD(String str, String str2, String str3);

    /* renamed from: zG */
    void mo60303zG(String str);

    /* renamed from: zI */
    void mo60304zI(MessageId messageId);

    /* renamed from: zb */
    void mo60308zb();

    /* renamed from: zf */
    boolean mo60309zf();

    /* renamed from: zg */
    void mo60310zg(int i11);

    /* renamed from: zk */
    void mo60311zk(int i11, C8969o c8969o);

    /* renamed from: zq */
    void mo60312zq(String str);

    /* renamed from: zr */
    void mo60313zr();

    /* renamed from: zu */
    boolean mo60314zu();

    /* renamed from: zv */
    void mo60315zv();

    /* renamed from: zw */
    boolean mo60316zw(int i11);

    /* renamed from: zz */
    boolean mo60317zz();
}
