package com.zing.zalo.p077ui.chat;

import ak0.C0888c;
import android.content.Intent;
import android.graphics.Rect;
import android.text.Editable;
import b60.InterfaceC2585a;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.feed.adapters.C8050a;
import com.zing.zalo.p077ui.chat.C11598e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.rightmenu.ChatInfoView;
import com.zing.zalo.p077ui.chat.transfer.ChatWindowReference;
import com.zing.zalo.p077ui.chat.transfer.DrawDoodleResult;
import com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer;
import com.zing.zalo.p077ui.chat.widget.inputbar.ChatInputBar;
import com.zing.zalo.p077ui.mycloud.EmbeddedMyCloudPagesLayout;
import com.zing.zalo.p077ui.picker.QuickPickerView;
import com.zing.zalo.p077ui.widget.ChatComposePanelNew;
import com.zing.zalo.p077ui.zviews.AvatarPickerView;
import com.zing.zalo.zview.ZaloView;
import dj.C17945a0;
import fd0.C18888h;
import g30.AbstractC19215a;
import gi.EnumC19450c;
import i60.C20335a;
import i60.C20336b;
import i60.C20337c;
import i60.C20340f;
import i60.C20341g;
import i60.C20343i;
import i60.C20345k;
import i60.C20346l;
import i60.C20347m;
import i60.C20348n;
import i60.C20349o;
import i60.C20351q;
import i60.C20352r;
import i60.C20353s;
import i60.C20354t;
import i60.C20355u;
import i60.C20356v;
import i60.EnumC20344j;
import java.util.ArrayList;
import java.util.List;
import p056cj.C3535c;
import p056cj.C3554v;
import p205hc.InterfaceC19966e;
import p394oj.C24277c;
import p450qj.C25301c;
import p549uj.AbstractC27282a;
import p585vs.C28610b;
import p611wj.C29059g;
import p647xj.C29676b;
import p716zh.C31842a9;
import p716zh.C31862c;
import p716zh.C31870c7;
import p716zh.C31877d;
import p716zh.C31887d9;
import p716zh.C31902e9;
import p716zh.C32002l4;
import p716zh.C32205z8;
import v50.C27675hd;
import vg.AbstractC28207v1;
import vg.C28212v6;
import z50.InterfaceC31658c;
import z50.InterfaceC31661f;

/* renamed from: com.zing.zalo.ui.chat.c */
/* loaded from: classes5.dex */
public interface InterfaceC11320c extends InterfaceC19966e, InterfaceC2585a, ChatInfoView.InterfaceC11697a, InterfaceC31658c, InterfaceC31661f, AbstractC28207v1.i0, C32205z8.b {

    /* renamed from: com.zing.zalo.ui.chat.c$a */
    /* loaded from: classes5.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m60848a(InterfaceC11320c interfaceC11320c, MessageId messageId, long j11, boolean z11, C20343i c20343i, String str, EnumC20344j enumC20344j, int i11, Object obj) {
            long j12;
            boolean z12;
            C20343i c20343i2;
            String str2;
            EnumC20344j enumC20344j2;
            if (obj == null) {
                if ((i11 & 2) != 0) {
                    j12 = 0;
                } else {
                    j12 = j11;
                }
                if ((i11 & 4) != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if ((i11 & 8) != 0) {
                    c20343i2 = null;
                } else {
                    c20343i2 = c20343i;
                }
                if ((i11 & 16) != 0) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if ((i11 & 32) != 0) {
                    enumC20344j2 = EnumC20344j.f100335q;
                } else {
                    enumC20344j2 = enumC20344j;
                }
                interfaceC11320c.mo60747ii(messageId, j12, z12, c20343i2, str2, enumC20344j2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpToMessage");
        }
    }

    /* renamed from: A */
    void mo60527A();

    /* renamed from: A3 */
    void mo60528A3(int i11, int i12);

    /* renamed from: A4 */
    void mo60529A4();

    /* renamed from: A7 */
    void mo60530A7(int i11, int i12, String str, C28212v6 c28212v6, boolean z11);

    /* renamed from: Aa */
    void mo60531Aa(C17945a0 c17945a0);

    /* renamed from: Ac */
    boolean mo60532Ac();

    /* renamed from: Af */
    void mo60533Af(C27675hd c27675hd);

    /* renamed from: Ai */
    void mo60534Ai(boolean z11, C20356v c20356v);

    /* renamed from: Al */
    void mo60535Al(int i11);

    /* renamed from: B3 */
    void mo60536B3(C31862c c31862c);

    /* renamed from: B9 */
    void mo60537B9(Intent intent);

    /* renamed from: Ba */
    void mo60538Ba(String str, int i11, double d11, double d12);

    /* renamed from: Bc */
    void mo60539Bc();

    /* renamed from: Bd */
    boolean mo60540Bd();

    /* renamed from: Bg */
    void mo60541Bg(C20352r c20352r);

    /* renamed from: Bk */
    boolean mo60542Bk();

    /* renamed from: Bm */
    void mo60543Bm();

    /* renamed from: Bo */
    void mo60544Bo();

    /* renamed from: C1 */
    void mo60545C1();

    /* renamed from: Cc */
    boolean mo60546Cc();

    /* renamed from: Cd */
    int mo60547Cd();

    /* renamed from: Cn */
    void mo60548Cn(boolean z11);

    /* renamed from: D1 */
    int mo60549D1();

    /* renamed from: D8 */
    void mo60550D8(C7904b c7904b);

    /* renamed from: D9 */
    void mo60551D9(boolean z11, C20340f c20340f);

    /* renamed from: Da */
    void mo60552Da(boolean z11, C20354t c20354t);

    /* renamed from: Dj */
    void mo60553Dj();

    /* renamed from: Dn */
    String mo60554Dn();

    /* renamed from: E8 */
    void mo60555E8();

    /* renamed from: E9 */
    void mo60556E9(int i11, int i12, String str, int i13, String str2);

    /* renamed from: Eb */
    void mo60557Eb();

    /* renamed from: F1 */
    void mo60558F1(int i11);

    /* renamed from: F5 */
    boolean mo60559F5();

    /* renamed from: F7 */
    void mo60560F7(boolean z11, C20337c c20337c);

    /* renamed from: Ff */
    void mo60561Ff();

    /* renamed from: Fi */
    List mo60562Fi();

    /* renamed from: Fk */
    void mo60563Fk(MessageId messageId);

    /* renamed from: Fl */
    void mo60564Fl(ArrayList arrayList, String str, String str2);

    /* renamed from: Fn */
    void mo60565Fn(ChatView.EnumC11304r0 enumC11304r0, int i11, ContactProfile contactProfile, String str);

    /* renamed from: G5 */
    boolean mo60566G5(String str, boolean z11);

    /* renamed from: Ga */
    void mo60567Ga(boolean z11);

    /* renamed from: Gd */
    boolean mo60568Gd(boolean z11, boolean z12);

    /* renamed from: Gn */
    void mo60569Gn(String str, int i11);

    /* renamed from: Go */
    void mo60570Go(boolean z11);

    /* renamed from: Hb */
    void mo60571Hb(ContactProfile contactProfile);

    /* renamed from: Hc */
    void mo60572Hc(C17945a0 c17945a0, String str);

    /* renamed from: Hj */
    void mo60573Hj(String str);

    /* renamed from: Hk */
    void mo60574Hk(boolean z11, DrawDoodleResult drawDoodleResult);

    /* renamed from: Hn */
    void mo60575Hn();

    /* renamed from: I2 */
    void mo60576I2(C31902e9 c31902e9);

    /* renamed from: I8 */
    void mo60577I8();

    /* renamed from: I9 */
    void mo60578I9(boolean z11);

    /* renamed from: Id */
    void mo60579Id(int i11);

    /* renamed from: If */
    void mo60580If(C20348n c20348n);

    /* renamed from: Ij */
    boolean mo60581Ij(boolean z11);

    /* renamed from: Il */
    void mo60582Il();

    /* renamed from: J0 */
    boolean mo60583J0();

    /* renamed from: Ja */
    boolean mo60584Ja();

    /* renamed from: Jb */
    void mo60585Jb(ChatView.EnumC11304r0 enumC11304r0, int i11, ContactProfile contactProfile, String str);

    /* renamed from: Je */
    void mo60586Je(String str);

    /* renamed from: Jf */
    boolean mo60587Jf();

    /* renamed from: Jg */
    void mo60588Jg(boolean z11, List list);

    /* renamed from: Jl */
    void mo60589Jl(AbstractC19215a abstractC19215a);

    /* renamed from: Jo */
    void mo60590Jo(boolean z11);

    /* renamed from: K3 */
    void mo60591K3(C17945a0 c17945a0);

    /* renamed from: K4 */
    void mo60592K4();

    /* renamed from: K5 */
    void mo60593K5(C17945a0 c17945a0);

    /* renamed from: K8 */
    boolean mo60594K8();

    /* renamed from: Kl */
    void mo60595Kl(String str);

    /* renamed from: Kn */
    void mo60596Kn(boolean z11);

    /* renamed from: L5 */
    ChatComposePanelNew.InterfaceC13481j mo60597L5();

    /* renamed from: L7 */
    void mo60598L7();

    /* renamed from: Lf */
    void mo60599Lf();

    /* renamed from: Li */
    void mo60600Li(MessageId messageId);

    /* renamed from: Ln */
    void mo60601Ln(C11598e.e eVar);

    /* renamed from: M5 */
    void mo60602M5();

    /* renamed from: Mc */
    void mo60603Mc(int i11, boolean z11);

    /* renamed from: Md */
    void mo60604Md();

    /* renamed from: Me */
    void mo60605Me(C20341g c20341g);

    /* renamed from: Mo */
    boolean mo60606Mo();

    /* renamed from: N6 */
    int mo60607N6();

    /* renamed from: Na */
    void mo60608Na();

    /* renamed from: Nf */
    boolean mo60609Nf();

    /* renamed from: Nl */
    void mo60610Nl(String str, boolean z11);

    /* renamed from: No */
    void mo60611No();

    /* renamed from: O0 */
    void mo60612O0(int i11, String str, MessageId messageId);

    /* renamed from: O9 */
    void mo60613O9(String str, Conversation conversation);

    /* renamed from: Ob */
    void mo60614Ob();

    /* renamed from: Oc */
    C3535c mo60615Oc();

    /* renamed from: Og */
    void mo60616Og();

    /* renamed from: Oi */
    boolean mo60617Oi();

    /* renamed from: P7 */
    void mo60618P7(boolean z11);

    /* renamed from: Pa */
    void mo60619Pa();

    /* renamed from: Pc */
    void mo60620Pc();

    /* renamed from: Ph */
    void mo60621Ph(boolean z11, boolean z12, boolean z13, List list, List list2);

    /* renamed from: Pi */
    void mo60622Pi(int i11, String str, int i12);

    /* renamed from: Q */
    boolean mo60623Q();

    /* renamed from: Q7 */
    boolean mo60624Q7();

    /* renamed from: Qa */
    void mo60625Qa();

    /* renamed from: Qb */
    void mo60626Qb(boolean z11, C31887d9 c31887d9, String str, Integer num);

    /* renamed from: Qg */
    boolean mo60627Qg();

    /* renamed from: Qi */
    void mo60628Qi(String str, Rect rect);

    /* renamed from: Qn */
    void mo60629Qn();

    /* renamed from: R4 */
    void mo60630R4(int i11, C20353s c20353s);

    /* renamed from: R5 */
    void mo60631R5();

    /* renamed from: R6 */
    void mo60632R6(C0888c c0888c);

    /* renamed from: Rc */
    ContactProfile mo60633Rc();

    /* renamed from: Rj */
    void mo60634Rj(String str, boolean z11);

    /* renamed from: Rl */
    void mo60635Rl(boolean z11);

    /* renamed from: Rn */
    boolean mo60636Rn();

    /* renamed from: S */
    boolean mo60637S(C17945a0 c17945a0);

    /* renamed from: S2 */
    String mo60638S2();

    /* renamed from: Sg */
    void mo60639Sg();

    /* renamed from: T8 */
    boolean mo60640T8();

    /* renamed from: Tc */
    ChatInputBar.InterfaceC11745g mo60641Tc();

    /* renamed from: Ti */
    void mo60642Ti();

    /* renamed from: U */
    void mo60643U(int i11, Object... objArr);

    /* renamed from: U7 */
    void mo60644U7(boolean z11);

    /* renamed from: U9 */
    void mo60645U9(ZaloView zaloView, String str, int i11, String str2, AbstractC28207v1.h0 h0Var, String str3, AbstractC28207v1.f0 f0Var, C31877d c31877d);

    /* renamed from: Ua */
    void mo60646Ua();

    /* renamed from: Ub */
    void mo60647Ub();

    /* renamed from: Uh */
    void mo60648Uh(C17945a0 c17945a0);

    /* renamed from: Ui */
    void mo60649Ui(C17945a0 c17945a0);

    /* renamed from: Uk */
    void mo60650Uk(String str);

    /* renamed from: V8 */
    void mo60651V8();

    /* renamed from: V9 */
    void mo60652V9(C29676b c29676b);

    /* renamed from: Vc */
    void mo60653Vc();

    /* renamed from: Vm */
    C3554v mo60654Vm();

    /* renamed from: Vn */
    void mo60655Vn(String str, int i11);

    /* renamed from: W4 */
    void mo60656W4(boolean z11, C20336b c20336b);

    /* renamed from: Wa */
    void mo60657Wa(String str);

    /* renamed from: Wb */
    void mo60658Wb(String str);

    /* renamed from: Wd */
    void mo60659Wd(int i11);

    /* renamed from: Wg */
    void mo60660Wg();

    /* renamed from: Wj */
    boolean mo60661Wj();

    /* renamed from: Wo */
    void mo60662Wo();

    /* renamed from: X1 */
    boolean mo60663X1();

    /* renamed from: X5 */
    void mo60664X5(C31870c7 c31870c7);

    /* renamed from: X7 */
    void mo60665X7();

    /* renamed from: X8 */
    void mo60666X8(int i11);

    /* renamed from: Xb */
    boolean mo60667Xb(C17945a0 c17945a0, int i11, int i12);

    /* renamed from: Xd */
    void mo60668Xd();

    /* renamed from: Xe */
    void mo60669Xe();

    /* renamed from: Y5 */
    void mo60670Y5(boolean z11, C20349o c20349o);

    /* renamed from: Yh */
    void mo60671Yh();

    /* renamed from: Yk */
    void mo60672Yk(C17945a0 c17945a0);

    /* renamed from: Yo */
    void mo60673Yo(boolean z11);

    /* renamed from: Z4 */
    void mo60674Z4();

    /* renamed from: Z5 */
    ContactProfile mo60675Z5();

    /* renamed from: Zd */
    C31862c mo60676Zd();

    /* renamed from: Ze */
    void mo60677Ze(boolean z11, C20347m c20347m);

    /* renamed from: Zf */
    void mo60678Zf(String str);

    /* renamed from: Zh */
    void mo60679Zh(EnumC19450c enumC19450c, C31902e9 c31902e9, int i11, int i12, int i13, AbstractC19215a abstractC19215a);

    /* renamed from: Zl */
    void mo60680Zl();

    /* renamed from: a3 */
    void mo60681a3(C18888h c18888h);

    /* renamed from: a9 */
    void mo60682a9();

    /* renamed from: ab */
    void mo60683ab(boolean z11, C20351q c20351q);

    /* renamed from: ad */
    void mo60684ad();

    void afterTextChanged(Editable editable);

    /* renamed from: ag */
    void mo60685ag();

    /* renamed from: ah */
    void mo60686ah();

    /* renamed from: ak */
    boolean mo60687ak(boolean z11, boolean z12, boolean z13);

    /* renamed from: an */
    void mo60688an();

    /* renamed from: b5 */
    void mo60689b5();

    /* renamed from: ba */
    void mo60690ba(C29059g c29059g);

    /* renamed from: bd */
    void mo60691bd();

    /* renamed from: bi */
    void mo60692bi(Intent intent);

    /* renamed from: bk */
    void mo60693bk(C17945a0 c17945a0);

    /* renamed from: bn */
    void mo60694bn(MessageId messageId);

    /* renamed from: bo */
    void mo60695bo(String str);

    /* renamed from: c3 */
    int mo60696c3();

    /* renamed from: cb */
    void mo60697cb(ContactProfile contactProfile);

    /* renamed from: ch */
    void mo60698ch(int i11);

    /* renamed from: cl */
    void mo60699cl();

    /* renamed from: co */
    void mo60700co(boolean z11, C20335a c20335a);

    /* renamed from: cp */
    void mo60701cp();

    /* renamed from: d5 */
    void mo60702d5(C20345k c20345k);

    /* renamed from: dc */
    void mo60703dc(C31902e9 c31902e9);

    /* renamed from: dd */
    void mo60704dd();

    /* renamed from: df */
    void mo60705df(boolean z11, C20337c c20337c);

    /* renamed from: dl */
    void mo60706dl(C17945a0 c17945a0);

    /* renamed from: e4 */
    void mo60707e4(ChatAttachmentContainer.C11728c c11728c);

    /* renamed from: e5 */
    void mo60708e5();

    /* renamed from: e6 */
    void mo60709e6(CharSequence charSequence, int i11, int i12, int i13);

    /* renamed from: e9 */
    void mo60710e9();

    /* renamed from: eb */
    int mo60711eb();

    /* renamed from: ef */
    void mo60712ef(C17945a0 c17945a0, boolean z11);

    /* renamed from: ei */
    void mo60713ei(boolean z11);

    /* renamed from: ek */
    void mo60714ek();

    /* renamed from: em */
    void mo60715em(String str);

    /* renamed from: en */
    void mo60716en(String str);

    /* renamed from: ep */
    void mo60717ep(ChatView chatView);

    /* renamed from: f4 */
    boolean mo60718f4(String str);

    /* renamed from: f9 */
    void mo60719f9();

    /* renamed from: fk */
    void mo60720fk();

    /* renamed from: fm */
    void mo60721fm(C7904b c7904b);

    /* renamed from: g */
    C32002l4 mo60722g();

    /* renamed from: g4 */
    void mo60723g4();

    /* renamed from: g5 */
    void mo60724g5();

    /* renamed from: gc */
    void mo60725gc(Intent intent);

    /* renamed from: gd */
    void mo60726gd(int i11);

    C11598e.e getCurrMyCloudChatMode();

    String getGroupId();

    /* renamed from: gf */
    void mo60727gf();

    /* renamed from: gi */
    void mo60728gi(boolean z11);

    /* renamed from: gp */
    boolean mo60729gp(boolean z11);

    /* renamed from: h0 */
    boolean mo60730h0(C17945a0 c17945a0);

    /* renamed from: h3 */
    void mo60731h3(ChatWindowReference chatWindowReference);

    /* renamed from: h4 */
    void mo60732h4();

    /* renamed from: h7 */
    void mo60733h7(boolean z11);

    /* renamed from: h8 */
    void mo60734h8(String str, int i11);

    /* renamed from: hd */
    void mo60735hd();

    /* renamed from: hf */
    boolean mo60736hf(int i11);

    /* renamed from: hi */
    void mo60737hi(boolean z11, List list);

    /* renamed from: hj */
    void mo60738hj(String str, long j11);

    /* renamed from: hl */
    void mo60739hl(String str);

    /* renamed from: hm */
    void mo60740hm();

    /* renamed from: i0 */
    boolean mo60741i0();

    /* renamed from: i3 */
    void mo60742i3(C31902e9 c31902e9);

    /* renamed from: i4 */
    void mo60743i4();

    /* renamed from: i6 */
    void mo60744i6(ChatView chatView, EnumC19450c enumC19450c, C31902e9 c31902e9, int i11, int i12, int i13);

    /* renamed from: if */
    void mo60745if(boolean z11);

    /* renamed from: ih */
    void mo60746ih();

    /* renamed from: ii */
    void mo60747ii(MessageId messageId, long j11, boolean z11, C20343i c20343i, String str, EnumC20344j enumC20344j);

    /* renamed from: j */
    void mo60748j(C7853b.b bVar);

    /* renamed from: jg */
    void mo60749jg(EnumC19450c enumC19450c);

    /* renamed from: jl */
    boolean mo60750jl();

    /* renamed from: jn */
    void mo60751jn();

    /* renamed from: jo */
    String mo60752jo();

    /* renamed from: k8 */
    void mo60753k8(String str);

    /* renamed from: k9 */
    void mo60754k9(List list, String str);

    /* renamed from: kc */
    void mo60755kc(boolean z11, int i11);

    /* renamed from: kh */
    void mo60756kh();

    /* renamed from: l2 */
    void mo60757l2(AbstractC27282a abstractC27282a);

    /* renamed from: la */
    void mo60758la(boolean z11);

    /* renamed from: ld */
    void mo60759ld();

    /* renamed from: lj */
    void mo60760lj(EnumC19450c enumC19450c, C31902e9 c31902e9, int i11, int i12, int i13);

    /* renamed from: ll */
    void mo60761ll(String str, int i11);

    /* renamed from: ln */
    boolean mo60762ln(C17945a0 c17945a0);

    /* renamed from: m */
    void mo60763m(C7853b.d dVar);

    /* renamed from: m8 */
    boolean mo60764m8();

    /* renamed from: m9 */
    void mo60765m9();

    /* renamed from: me */
    void mo60766me();

    /* renamed from: mh */
    void mo60767mh();

    /* renamed from: mo */
    void mo60768mo();

    /* renamed from: mp */
    void mo60769mp();

    /* renamed from: n9 */
    void mo60770n9(C17945a0 c17945a0, String str);

    /* renamed from: na */
    void mo60771na();

    /* renamed from: nh */
    void mo60772nh(String str, C32002l4 c32002l4, C8050a.d0 d0Var);

    /* renamed from: nk */
    void mo60773nk(int i11, int i12);

    /* renamed from: nn */
    void mo60774nn(Intent intent);

    /* renamed from: np */
    void mo60775np(boolean z11, C20355u c20355u);

    /* renamed from: o */
    void mo60776o();

    /* renamed from: oa */
    void mo60777oa();

    void onStart();

    void onStop();

    /* renamed from: p3 */
    void mo60778p3(C17945a0 c17945a0);

    /* renamed from: pa */
    void mo60779pa(MessageId messageId, String str);

    /* renamed from: pe */
    void mo60780pe(C20346l c20346l);

    /* renamed from: ph */
    void mo60781ph();

    /* renamed from: q8 */
    void mo60782q8(C31842a9 c31842a9);

    /* renamed from: qa */
    boolean mo60783qa();

    /* renamed from: qc */
    void mo60784qc(CharSequence charSequence, int i11, int i12, int i13);

    /* renamed from: qd */
    void mo60785qd();

    /* renamed from: qg */
    boolean mo60786qg();

    /* renamed from: r3 */
    void mo60787r3(C17945a0 c17945a0);

    /* renamed from: r5 */
    void mo60788r5();

    /* renamed from: r6 */
    boolean mo60789r6();

    /* renamed from: rj */
    void mo60790rj();

    /* renamed from: ro */
    void mo60791ro(C17945a0 c17945a0);

    /* renamed from: s6 */
    void mo60792s6();

    /* renamed from: sd */
    void mo60793sd(boolean z11);

    /* renamed from: se */
    void mo60794se(float f11, C24277c c24277c);

    /* renamed from: sg */
    void mo60795sg();

    /* renamed from: sk */
    void mo60796sk(C28610b c28610b);

    /* renamed from: sl */
    void mo60797sl(MessageId messageId);

    /* renamed from: sp */
    boolean mo60798sp();

    /* renamed from: t4 */
    void mo60799t4(C25301c c25301c);

    /* renamed from: t9 */
    boolean mo60800t9();

    /* renamed from: ta */
    EmbeddedMyCloudPagesLayout.InterfaceC12480b mo60801ta();

    /* renamed from: tb */
    void mo60802tb();

    /* renamed from: th */
    void mo60803th(boolean z11);

    /* renamed from: tl */
    void mo60804tl();

    /* renamed from: tm */
    void mo60805tm(String str);

    /* renamed from: tn */
    void mo60806tn(Intent intent);

    /* renamed from: u7 */
    void mo60807u7();

    /* renamed from: u8 */
    boolean mo60808u8();

    /* renamed from: u9 */
    void mo60809u9(EnumC19450c enumC19450c, C31902e9 c31902e9, int i11, int i12, int i13);

    /* renamed from: ub */
    void mo60810ub(C17945a0 c17945a0);

    /* renamed from: uh */
    void mo60811uh();

    /* renamed from: ui */
    void mo60812ui(C17945a0 c17945a0);

    /* renamed from: uj */
    void mo60813uj();

    /* renamed from: uk */
    void mo60814uk();

    /* renamed from: up */
    void mo60815up(int i11);

    /* renamed from: v5 */
    boolean mo60816v5(String str);

    /* renamed from: v6 */
    void mo60817v6(boolean z11, String str, boolean z12);

    /* renamed from: v7 */
    void mo60818v7(String str);

    /* renamed from: va */
    void mo60819va(int i11);

    /* renamed from: vf */
    void mo60820vf();

    /* renamed from: vg */
    QuickPickerView.InterfaceC12664z mo60821vg();

    /* renamed from: vo */
    void mo60822vo();

    /* renamed from: w6 */
    void mo60823w6(C17945a0 c17945a0);

    /* renamed from: w7 */
    void mo60824w7();

    /* renamed from: wa */
    void mo60825wa();

    /* renamed from: wd */
    void mo60826wd();

    /* renamed from: wh */
    void mo60827wh(boolean z11);

    /* renamed from: wj */
    void mo60828wj(boolean z11, boolean z12, EnumC20344j enumC20344j);

    /* renamed from: wm */
    boolean mo60829wm();

    /* renamed from: wn */
    void mo60830wn(boolean z11);

    /* renamed from: wo */
    void mo60831wo();

    /* renamed from: x4 */
    void mo60832x4(boolean z11);

    /* renamed from: x5 */
    boolean mo60833x5(int i11);

    /* renamed from: x7 */
    boolean mo60834x7();

    /* renamed from: xa */
    void mo60835xa(long j11);

    /* renamed from: xi */
    boolean mo60836xi();

    /* renamed from: xo */
    boolean mo60837xo();

    /* renamed from: y5 */
    void mo60838y5();

    /* renamed from: yb */
    boolean mo60839yb();

    /* renamed from: ye */
    AvatarPickerView.InterfaceC14082a mo60840ye();

    /* renamed from: yo */
    void mo60841yo(boolean z11);

    /* renamed from: z */
    boolean mo60842z(C17945a0 c17945a0);

    /* renamed from: z4 */
    void mo60843z4(int i11);

    /* renamed from: z9 */
    void mo60844z9(String str);

    /* renamed from: zd */
    void mo60845zd(C17945a0 c17945a0);

    /* renamed from: zj */
    void mo60846zj(boolean z11);

    /* renamed from: zo */
    void mo60847zo(int i11, boolean z11, EnumC20344j enumC20344j);
}
