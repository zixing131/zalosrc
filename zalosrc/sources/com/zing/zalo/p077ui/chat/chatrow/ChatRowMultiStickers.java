package com.zing.zalo.p077ui.chat.chatrow;

import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewGroup;
import bd0.C2770a;
import c30.C3255n;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.C13804v0;
import com.zing.zalo.uicontrol.PushToTalkControl;
import com.zing.zalo.utils.ToastUtils;
import dj.C17945a0;
import dj.C17949b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb0.C21197a;
import me0.AbstractC23080g8;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p207he.C20024r;
import p268ji.C21270p;
import p268ji.C21272r;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p471r3.C25630b;
import p588vw.C28644j;
import p647xj.C29675a;
import p647xj.C29676b;
import p684yk.InterfaceC31005a;
import tg.C26674y;
import vg.AbstractC28236y3;
import vg.C28227x3;
import w50.C28769a;
import w50.C28771c;

/* loaded from: classes5.dex */
public class ChatRowMultiStickers extends ChatRowMultiItems<C11501m2> implements C2770a.a {

    /* renamed from: Y7 */
    private static List f58226Y7;

    /* renamed from: h8 */
    private static Paint f58235h8;

    /* renamed from: i8 */
    private static C13704p1 f58236i8;

    /* renamed from: j8 */
    private static Paint f58237j8;

    /* renamed from: A7 */
    private boolean f58239A7;

    /* renamed from: B7 */
    private int f58240B7;

    /* renamed from: C7 */
    private int f58241C7;

    /* renamed from: D7 */
    private boolean f58242D7;

    /* renamed from: E7 */
    private boolean f58243E7;

    /* renamed from: F7 */
    private boolean f58244F7;

    /* renamed from: G7 */
    private boolean f58245G7;

    /* renamed from: H7 */
    private C13804v0 f58246H7;

    /* renamed from: I7 */
    int f58247I7;

    /* renamed from: J7 */
    int f58248J7;

    /* renamed from: K7 */
    private final RectF f58249K7;

    /* renamed from: L7 */
    private final RectF f58250L7;

    /* renamed from: M7 */
    private final RectF f58251M7;

    /* renamed from: N7 */
    private final Rect f58252N7;

    /* renamed from: O7 */
    private StaticLayout f58253O7;

    /* renamed from: P7 */
    private int f58254P7;

    /* renamed from: Q7 */
    private int f58255Q7;

    /* renamed from: R7 */
    private C29676b f58256R7;

    /* renamed from: S7 */
    boolean f58257S7;

    /* renamed from: T7 */
    private boolean f58258T7;

    /* renamed from: U7 */
    private final InterfaceC31005a f58259U7;

    /* renamed from: o7 */
    private boolean f58260o7;

    /* renamed from: p7 */
    private boolean f58261p7;

    /* renamed from: q7 */
    private C25630b f58262q7;

    /* renamed from: r7 */
    private int f58263r7;

    /* renamed from: s7 */
    private InterfaceC11505n2 f58264s7;

    /* renamed from: t7 */
    private C21197a f58265t7;

    /* renamed from: u7 */
    private boolean f58266u7;

    /* renamed from: v7 */
    private boolean f58267v7;

    /* renamed from: w7 */
    private int f58268w7;

    /* renamed from: x7 */
    private int f58269x7;

    /* renamed from: y7 */
    private boolean f58270y7;

    /* renamed from: z7 */
    private boolean f58271z7;

    /* renamed from: V7 */
    public static final int f58223V7 = AbstractC23136l9.m118742r(153.0f);

    /* renamed from: W7 */
    public static final int f58224W7 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: X7 */
    private static final int f58225X7 = ChatRow.f57205N5;

    /* renamed from: Z7 */
    private static final int f58227Z7 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: a8 */
    private static final int f58228a8 = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: b8 */
    private static final int f58229b8 = AbstractC23136l9.m118742r(7.0f);

    /* renamed from: c8 */
    private static final int f58230c8 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: d8 */
    private static final int f58231d8 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: e8 */
    private static final int f58232e8 = AbstractC23136l9.m118742r(5.0f);

    /* renamed from: f8 */
    private static final int f58233f8 = AbstractC23136l9.m118742r(4.5f);

    /* renamed from: g8 */
    private static final int f58234g8 = AbstractC23136l9.m118742r(9.0f);

    /* renamed from: k8 */
    private static boolean f58238k8 = false;

    public ChatRowMultiStickers(Context context, String str) {
        super(context);
        this.f58249K7 = new RectF();
        this.f58250L7 = new RectF();
        this.f58251M7 = new RectF();
        this.f58252N7 = new Rect();
        this.f58256R7 = null;
        this.f58257S7 = false;
        this.f58258T7 = false;
        this.f58259U7 = AbstractC23306f.m120726x1();
        m61514N4(str);
    }

    /* renamed from: A4 */
    public static void m61507A4() {
        if (f58235h8 == null || f58238k8) {
            f58238k8 = false;
            Paint paint = new Paint(1);
            f58235h8 = paint;
            paint.setStyle(Paint.Style.STROKE);
            Paint paint2 = f58235h8;
            int i11 = f58231d8;
            paint2.setStrokeWidth(i11);
            f58235h8.setColor(C23212s8.m119606n(AbstractC16781w.ReceiverBubbleChatBorderNormal));
            Paint paint3 = new Paint(1);
            f58237j8 = paint3;
            paint3.setStrokeWidth(i11);
            f58237j8.setStyle(Paint.Style.FILL);
            f58237j8.setColor(C23212s8.m119606n(AbstractC16781w.PopupBackgroundColor));
            C13704p1 c13704p1 = new C13704p1(1);
            f58236i8 = c13704p1;
            c13704p1.m76613c();
            f58236i8.m76614d(f58227Z7, false);
            f58236i8.setColor(C23212s8.m119606n(AbstractC16781w.AppPrimaryColor));
        }
    }

    /* renamed from: B4 */
    private boolean m61508B4(float f11, float f12) {
        if (this.f58265t7 == null) {
            return false;
        }
        if (f11 <= this.f58268w7 || f11 >= r2 + r0.m109762d()) {
            return false;
        }
        if (f12 <= this.f58269x7 || f12 >= r5 + this.f58265t7.m109761c()) {
            return false;
        }
        return true;
    }

    /* renamed from: C4 */
    private boolean m61509C4(float f11, float f12) {
        if (f11 > this.f58240B7 && f11 < r0 + AbstractC11531v0.m62330u2().getIntrinsicWidth()) {
            if (f12 > this.f58241C7 && f12 < r3 + AbstractC11531v0.m62330u2().getIntrinsicHeight()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D4 */
    private boolean m61510D4(float f11, float f12) {
        return this.f58249K7.contains(f11, f12);
    }

    /* renamed from: E4 */
    private boolean m61511E4() {
        if (this.f58260o7 && this.f57263B.m95110d8()) {
            return true;
        }
        return false;
    }

    /* renamed from: H4 */
    private void m61512H4() {
        try {
            C25630b m143282P0 = C28644j.m143233Y().m143282P0(((C17949b1) this.f57263B.m94929K2()).m95397g());
            if (m143282P0.m132399G()) {
                if (!C20024r.m103941j() && !C7853b.m40052a0().m40133i0()) {
                    if (this.f58264s7.mo62022A(m143282P0.m132435m(), this.f57263B.m95029V3())) {
                        this.f58267v7 = false;
                        this.f58264s7.mo62029k();
                        return;
                    } else {
                        this.f58267v7 = true;
                        this.f58264s7.mo62029k();
                        this.f58264s7.mo62023a(m143282P0.m132435m(), this.f57263B.m95029V3());
                        ((C11501m2) this.f58208b7.get(0)).m62017P();
                        return;
                    }
                }
                PushToTalkControl.C16482c.m87894a();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: M4 */
    private boolean m61513M4(C17945a0 c17945a0) {
        boolean z11;
        Map map = (Map) this.f58259U7.mo150728A().get(c17945a0.mo95039W2());
        if (map == null) {
            return false;
        }
        boolean containsKey = map.containsKey(Long.valueOf(c17945a0.m95029V3().m41045i()));
        if (c17945a0.m95294x3() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c17945a0.m95294x3() != 1) {
            map.remove(Long.valueOf(c17945a0.m95029V3().m41045i()));
        }
        if (!containsKey || !z11) {
            return false;
        }
        return true;
    }

    /* renamed from: N4 */
    private void m61514N4(String str) {
        Iterator it = this.f58208b7.iterator();
        while (it.hasNext()) {
            ((C11501m2) it.next()).m62018R(str);
        }
    }

    /* renamed from: O4 */
    private void m61515O4(boolean z11, C25630b c25630b) {
        int i11;
        ((C21272r) C21272r.Companion.m122672a()).m110181j(2);
        if (C28644j.m143233Y().m143312x0(c25630b.m132432j())) {
            i11 = 7;
        } else if (z11) {
            i11 = 6;
        } else {
            i11 = -1;
        }
        if (i11 != -1) {
            C21270p.m110079C().m110152Z(2, i11, i11 + "_1", c25630b.m132432j());
        }
    }

    private int getItemHeight() {
        return ((C11501m2) this.f58208b7.get(0)).mo61918k();
    }

    private int getItemWidth() {
        return ((C11501m2) this.f58208b7.get(0)).mo61923q();
    }

    private int getRowTotalWidth() {
        int i11;
        C28771c c28771c = this.f57257A;
        if (c28771c != null) {
            i11 = c28771c.m143959s();
        } else {
            i11 = 0;
        }
        return (getItemWidth() * i11) + ((i11 - 1) * getItemMargin());
    }

    public static int getStickerSpacing() {
        return f58225X7;
    }

    private int getTopMarginForQuote() {
        if (this.f57526t2) {
            return f58224W7;
        }
        return 0;
    }

    /* renamed from: r4 */
    private boolean m61516r4(C25630b c25630b) {
        if (getDelegate().mo62101s4() != 3 && !this.f57259A1 && !getDelegate().mo62086i0() && C3255n.m16562n().m16581z(c25630b, this.f58243E7)) {
            return true;
        }
        return false;
    }

    /* renamed from: s4 */
    private void m61517s4() {
        if (m61511E4() && this.f58262q7 != null && getDelegate().mo62101s4() != 3 && this.f58266u7) {
            m61520y4();
            this.f58265t7.m109765h(this.f57263B.m95032V6());
            boolean mo62022A = this.f58264s7.mo62022A(this.f58262q7.m132435m(), this.f57263B.m95029V3());
            this.f58267v7 = mo62022A;
            if (mo62022A) {
                this.f58265t7.m109767j();
            } else {
                this.f58265t7.m109768k();
            }
        }
    }

    /* renamed from: v4 */
    public static void m61518v4() {
        f58238k8 = true;
    }

    /* renamed from: w4 */
    private int m61519w4(boolean z11) {
        if (z11) {
            return f58233f8 + f58230c8;
        }
        return 0;
    }

    /* renamed from: y4 */
    private void m61520y4() {
        m61521z4(getContext());
        if (this.f58265t7 == null) {
            C21197a c21197a = new C21197a(this);
            this.f58265t7 = c21197a;
            c21197a.m109766i(120L);
            this.f58265t7.m109763e(f58226Y7, 3);
            this.f58265t7.m109764g(this.f58268w7, this.f58269x7);
        }
    }

    /* renamed from: z4 */
    public static void m61521z4(Context context) {
        List list = f58226Y7;
        if (list == null || list.size() <= 0) {
            ArrayList arrayList = new ArrayList();
            f58226Y7 = arrayList;
            arrayList.add(AbstractC23136l9.m118665N(context, AbstractC16803z.anim_stickervoice_right_1));
            f58226Y7.add(AbstractC23136l9.m118665N(context, AbstractC16803z.anim_stickervoice_right_2));
            f58226Y7.add(AbstractC23136l9.m118665N(context, AbstractC16803z.anim_stickervoice_right_3));
            f58226Y7.add(AbstractC23136l9.m118665N(context, AbstractC16803z.anim_stickervoice_right_4));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f57265B1 = false;
        this.f58257S7 = false;
        this.f58270y7 = false;
        this.f58242D7 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: B2 */
    public C28227x3 mo60949B2(boolean z11, int i11, C28227x3 c28227x3) {
        C28227x3 mo60949B2 = super.mo60949B2(z11, i11, c28227x3);
        if (m61511E4()) {
            if (this.f58271z7) {
                int i12 = mo60949B2.f131648a;
                int intrinsicWidth = AbstractC11531v0.m62330u2().getIntrinsicWidth();
                int i13 = ChatRow.f57203M5;
                mo60949B2.f131648a = Math.max(i12, intrinsicWidth + i13);
                mo60949B2.f131649b = Math.max(mo60949B2.f131649b, AbstractC11531v0.m62330u2().getIntrinsicHeight() + i13);
            }
            if (this.f58244F7) {
                if (this.f58246H7 == null) {
                    this.f58246H7 = new C13804v0(this);
                }
                int i14 = mo60949B2.f131648a;
                int m77064c = this.f58246H7.m77064c();
                int i15 = ChatRow.f57203M5;
                mo60949B2.f131648a = i14 + m77064c + i15;
                mo60949B2.f131649b = Math.max(mo60949B2.f131649b, this.f58246H7.m77063b() + i15);
            }
            mo60949B2.f131648a = Math.max(mo60949B2.f131648a, C21197a.f103346n + (ChatRow.f57203M5 * 2));
        }
        return mo60949B2;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        if (!this.f57526t2 && !this.f57319K1) {
            c28227x3.f131648a = getRowTotalWidth();
            c28227x3.f131649b = getItemHeight();
        } else {
            c28227x3.f131648a = f58223V7;
            c28227x3.f131649b = getItemHeight() + getTopMarginForQuote();
            if (!m60986L1()) {
                c28227x3.f131649b += (ChatRow.f57189F5 * 2) + ChatRow.f57241p6;
            }
        }
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        C17949b1 c17949b1;
        C25630b m95397g;
        super.mo60953C3(c17945a0, c28769a, z11);
        if (this.f58204X6.size() == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f58260o7 = z12;
        if (!m61511E4() || (m95397g = (c17949b1 = (C17949b1) c17945a0.m94929K2()).m95397g()) == null) {
            return;
        }
        this.f58261p7 = C28644j.m143233Y().m143306o0(m95397g.m132429g());
        C25630b m143290W = C28644j.m143233Y().m143290W(m95397g.m132429g() + "");
        this.f58262q7 = m143290W;
        if (m143290W.m132425e() > 0 && AbstractC23309i.m122610yb()) {
            this.f58243E7 = true;
            if (!this.f58245G7) {
                this.f58244F7 = C26674y.m136865t().m136882x(this.f58262q7.m132425e() + "", c17945a0.m95029V3().m41044h());
            }
        }
        C29675a mo150746j = this.f58259U7.mo150746j();
        if (getDelegate().mo62101s4() == 1 && c17945a0.m94987Q7() && ((!c17945a0.m95170j6() || (AbstractC0924m0.m3685b9() && AbstractC0924m0.m3715c9())) && mo150746j != null && mo150746j.m147602c(this.f58262q7.m132429g(), getDelegate().mo62102t4()))) {
            this.f58256R7 = c17949b1.m95401k();
        }
        if (this.f58256R7 != null) {
            m61507A4();
        }
        this.f57271C1 = mo61481X3();
        if (!this.f58239A7) {
            this.f58271z7 = m61516r4(this.f58262q7);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: F4 */
    public void mo61497o4(C11501m2 c11501m2, C17945a0 c17945a0) {
        if (c17945a0 != null && c17945a0.m95110d8()) {
            C25630b m143282P0 = C28644j.m143233Y().m143282P0(((C17949b1) c17945a0.m94929K2()).m95397g());
            if (m143282P0.m132425e() > 0) {
                if (getDelegate().mo62073a()) {
                    getDelegate().mo62068V3(c17945a0, m143282P0.m132425e(), true, true, true);
                    return;
                }
                return;
            }
            if (!C3255n.m16560k() && m143282P0.m132399G() && (C20024r.m103941j() || C7853b.m40052a0().m40133i0())) {
                PushToTalkControl.C16482c.m87894a();
                return;
            }
            if (C3255n.m16560k() && !m143282P0.m132395C()) {
                boolean m16580x = C3255n.m16562n().m16580x(m143282P0.m132427f());
                boolean m16581z = C3255n.m16562n().m16581z(m143282P0, false);
                if (getDelegate().mo62101s4() == 2) {
                    if (m16581z) {
                        this.f58264s7.mo62024b(m143282P0.m132432j());
                        return;
                    }
                    return;
                } else {
                    if (m16581z && !m16580x) {
                        this.f58264s7.mo62024b(m143282P0.m132432j());
                        return;
                    }
                    if (!C28644j.m143233Y().m143312x0(m143282P0.m132427f()) && !m16580x) {
                        if (C3255n.m16562n().m16579w(m143282P0.m132427f())) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sticker_popup_cant_download));
                            return;
                        }
                        return;
                    } else {
                        this.f58264s7.mo62025c(m143282P0.m132427f());
                        m61515O4(m16580x, m143282P0);
                        return;
                    }
                }
            }
            if (m143282P0.m132399G()) {
                if (this.f58264s7.mo62022A(m143282P0.m132435m(), c17945a0.m95029V3())) {
                    this.f58267v7 = false;
                    this.f58264s7.mo62029k();
                } else {
                    this.f58267v7 = true;
                    this.f58264s7.mo62029k();
                    this.f58264s7.mo62023a(m143282P0.m132435m(), c17945a0.m95029V3());
                }
            }
            ((C11501m2) this.f58208b7.get(this.f58219m7)).m62017P();
        }
    }

    /* renamed from: G4 */
    public void m61523G4() {
        C29676b c29676b = this.f58256R7;
        if (c29676b != null && this.f57263B != null) {
            this.f58264s7.mo62026d(c29676b);
        }
    }

    /* renamed from: I4 */
    public void m61524I4(C17945a0 c17945a0, int i11) {
        if (i11 > 0 && getDelegate().mo62073a() && m61513M4(c17945a0)) {
            getDelegate().mo62068V3(c17945a0, i11, false, true, false);
        }
    }

    /* renamed from: J4 */
    public void m61525J4(int i11, int i12) {
        this.f58247I7 = i11;
        this.f58248J7 = i12;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: K4 */
    public void mo61498p4(C11501m2 c11501m2, C17945a0 c17945a0, int i11) {
        c11501m2.m62019S(c17945a0, getDelegate().mo62101s4());
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: L4 */
    public void mo61499q4(C11501m2 c11501m2, C17945a0 c17945a0, int i11, int i12) {
        boolean z11;
        Pair m118396a = AbstractC23080g8.m118396a(getContext(), getDelegate().mo62071Y3());
        if (getTotalItemInRow() == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        c11501m2.m62021U(c17945a0, z11, ((Integer) m118396a.first).intValue(), ((Integer) m118396a.second).intValue());
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N */
    public boolean mo60993N() {
        if (super.mo60993N() && !this.f58271z7) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: N3 */
    protected boolean mo60996N3() {
        if (m61511E4() && this.f57526t2 && this.f58256R7 == null) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O0 */
    public int mo60998O0(boolean z11, boolean z12, boolean z13, boolean z14) {
        int i11;
        int mo60998O0 = super.mo60998O0(z11, z12, z13, z14);
        if (!this.f57526t2 && !this.f57319K1) {
            i11 = 0;
        } else {
            i11 = 2;
        }
        return mo60998O0 | i11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Q2 */
    public void mo61009Q2() {
        int i11;
        super.mo61009Q2();
        if (getDelegate().mo62101s4() == 3) {
            if (this.f57263B.m95032V6()) {
                i11 = (this.f58247I7 - getTotalItemInRow()) + 1;
            } else {
                i11 = this.f58247I7;
            }
            this.f58263r7 = i11 * (getItemWidth() + f58225X7);
            return;
        }
        this.f58263r7 = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: T0 */
    public int mo61022T0(int i11, int i12, int i13) {
        if (m61511E4()) {
            return (((getTopMarginForQuote() + this.f57288F0) + this.f57294G0) - i13) / 2;
        }
        return super.mo61022T0(i11, i12, i13);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: U3 */
    public boolean mo61478U3() {
        if (this.f58204X6.size() > 1 && m61530x4()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: V3 */
    protected boolean mo61479V3() {
        C28771c c28771c = this.f57257A;
        if (c28771c != null && c28771c.m143958r() == 3) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: W3 */
    public boolean mo61480W3(int i11) {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y */
    public boolean mo61034Y(boolean z11, int i11) {
        List m143950j = this.f57257A.m143950j();
        for (int i12 = 0; i12 < m143950j.size(); i12++) {
            C17945a0 c17945a0 = (C17945a0) m143950j.get(i12);
            if (!z11 || !c17945a0.m95315z7()) {
                if (!z11 && c17945a0.m95305y7()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return super.mo61034Y(z11, i11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        for (int size = this.f58204X6.size() - 1; size >= 0; size--) {
            C17945a0 c17945a02 = (C17945a0) this.f58204X6.get(size);
            if (!this.f57281E) {
                if (getDelegate().mo62096o4()) {
                    c17945a02.m95035Va(false);
                } else {
                    c17945a02.m95024Ua(false);
                }
            }
            ((C11501m2) this.f58208b7.get(size)).m62015N();
        }
        m61517s4();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: Y3 */
    public boolean mo61482Y3() {
        return false;
    }

    @Override // bd0.C2770a.a
    /* renamed from: a */
    public boolean mo13318a() {
        return !getDelegate().mo62077c();
    }

    @Override // bd0.C2770a.a
    /* renamed from: b */
    public boolean mo13319b() {
        return this.f57263B.m95032V6();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: b3 */
    public void mo61044b3(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61044b3(c17945a0, c28769a);
        this.f58239A7 = false;
        this.f58245G7 = false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        C25630b m95397g;
        boolean z11;
        if (super.mo61046c0(c17945a0, c28769a)) {
            return true;
        }
        boolean z12 = false;
        if (m61511E4() && (m95397g = ((C17949b1) c17945a0.m94929K2()).m95397g()) != null) {
            if (!this.f58261p7 && C28644j.m143233Y().m143306o0(m95397g.m132429g())) {
                return true;
            }
            boolean m61516r4 = m61516r4(m95397g);
            if (m61516r4 != this.f58271z7) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f58239A7 = true;
            this.f58271z7 = m61516r4;
            if (z11) {
                return true;
            }
            if (m95397g.m132425e() > 0 && AbstractC23309i.m122610yb()) {
                boolean m136882x = C26674y.m136865t().m136882x(m95397g.m132425e() + "", c17945a0.m95029V3().m41044h());
                if (m136882x != this.f58244F7) {
                    z12 = true;
                }
                this.f58245G7 = true;
                this.f58244F7 = m136882x;
            }
        }
        return z12;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c2 */
    public void mo61048c2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        int i16 = this.f58263r7;
        int i17 = i11 + i16;
        int i18 = i13 + i16;
        if (m61511E4() && this.f58256R7 != null) {
            int i19 = f58232e8;
            int i21 = i12 + i19;
            int i22 = this.f58254P7 + i17;
            int i23 = this.f58255Q7 + i21;
            this.f58249K7.set(i17, i21, i22, i23);
            int i24 = f58231d8 / 2;
            this.f58250L7.set(i17 + i24, i21 + i24, i22 - i24, i23 - i24);
            this.f58251M7.set(r8 + i24, r2 + i24, r4 - i24, r5 - i24);
            if (this.f58258T7) {
                RectF rectF = this.f58249K7;
                float height = rectF.top + (rectF.height() / 2.0f);
                int i25 = f58234g8;
                int i26 = (int) (height - (i25 / 2));
                int i27 = (int) (this.f58249K7.right - f58228a8);
                this.f58252N7.set(i27 - f58233f8, i26, i27, i25 + i26);
            }
            i15 = i12 + this.f58255Q7 + i19;
        } else {
            i15 = i12;
        }
        super.mo61048c2(i17, i15, i18, i14, z11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: c4 */
    public List mo61486c4(C28771c c28771c) {
        return c28771c.m143957q();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: e2 */
    public void mo61055e2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15 = this.f58263r7;
        super.mo61055e2(i11 + i15, i12, i13 + i15, i14, z11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: e3 */
    protected void mo61056e3() {
        getDelegate().mo62092l4(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: f2 */
    public int mo61058f2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        C13804v0 c13804v0;
        int i16;
        int mo61058f2 = super.mo61058f2(i11, i12, i13, i14, z11);
        if (m61511E4()) {
            int i17 = ChatRow.f57203M5;
            int i18 = mo61058f2 + (i17 / 2);
            if (this.f58271z7) {
                if (z11) {
                    this.f58240B7 = (i17 / 2) + i11;
                } else {
                    this.f58240B7 = (i13 - AbstractC11531v0.m62330u2().getIntrinsicWidth()) - (i17 / 2);
                }
                this.f58241C7 = i18;
            }
            if (this.f58244F7 && (c13804v0 = this.f58246H7) != null) {
                if (z11) {
                    i16 = (i13 - (i17 / 2)) - c13804v0.m77064c();
                } else {
                    i16 = i11 + (i17 / 2);
                }
                this.f58246H7.m77067f(i16, ((i12 + i14) - this.f58246H7.m77063b()) / 2);
            }
            mo61058f2 = i18 + AbstractC11531v0.m62330u2().getIntrinsicHeight() + i17;
            if (z11) {
                i15 = i11 + i17;
            } else {
                i15 = (i13 - C21197a.f103346n) - i17;
            }
            this.f58268w7 = i15;
            int topMarginForQuote = this.f57288F0 + getTopMarginForQuote();
            this.f58269x7 = topMarginForQuote;
            C21197a c21197a = this.f58265t7;
            if (c21197a != null) {
                c21197a.m109764g(this.f58268w7, topMarginForQuote);
            }
        }
        return mo61058f2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    public void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        if (m61511E4() && (this.f57526t2 || this.f57319K1)) {
            i15 = ((i13 - i11) / 2) - (getItemWidth() / 2);
        } else {
            i15 = 0;
        }
        super.mo61063g2(i11 + i15, i12 + getTopMarginForQuote(), i13 - i15, i14, z11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    protected int getBackgroundTopRegionHeight() {
        if (this.f57526t2 || this.f57319K1) {
            return this.f57389W;
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        if (!this.f57526t2 && !this.f57319K1) {
            return Math.max(AbstractC23136l9.m118683W(getContext()) - AbstractC23136l9.m118742r(60.0f), AbstractC11531v0.m62231a3());
        }
        return f58223V7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingLeft() {
        if (this.f57526t2 || this.f57319K1) {
            return ChatRow.f57203M5;
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubblePaddingRight() {
        if (this.f57526t2 || this.f57319K1) {
            return ChatRow.f57203M5;
        }
        return 0;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    public List<C17945a0> getCurrentListMessageBusiness() {
        return this.f58205Y6;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingBottom() {
        return AbstractC23222t7.f112556e;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        if (!this.f57526t2 && !this.f57319K1) {
            return AbstractC23222t7.f112556e;
        }
        return ChatRow.f57201L5;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    protected List<C17945a0> getGroupMsgToCheckSelection() {
        return this.f58204X6;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    public int getItemMargin() {
        return f58225X7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public String getMsgContentTalkText() {
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_reply_msg_sticker);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getSelectionCheckBoxTop() {
        int i11;
        int top = getTop();
        if (this.f57447g1) {
            i11 = this.f57441f1;
        } else {
            i11 = this.f57288F0;
        }
        return top + i11;
    }

    int getTotalItemInRow() {
        if (this.f58248J7 <= 0) {
            this.f58248J7 = this.f57257A.m143959s();
        }
        return this.f58248J7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:            if (r0 == false) goto L53;     */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: i3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo61072i3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        if (m61511E4()) {
            if (i11 != 0) {
                if (i11 == 1 && this.f58257S7 && m61510D4(f11, f12)) {
                    InterfaceC11505n2 interfaceC11505n2 = this.f58264s7;
                    if (interfaceC11505n2 != null && this.f57263B != null) {
                        interfaceC11505n2.mo62026d(this.f58256R7);
                    }
                }
            } else {
                if (this.f58256R7 != null && m61510D4(f11, f12)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f58257S7 = z11;
            }
            return true;
        }
        if (!super.mo61072i3(motionEvent, i11, f11, f12)) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: i4 */
    protected void mo61492i4(ViewGroup viewGroup) {
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: k3 */
    public boolean mo61079k3(MotionEvent motionEvent, int i11, float f11, float f12) {
        boolean z11;
        boolean z12;
        boolean z13;
        if (m61511E4()) {
            if (i11 != 0) {
                if (i11 == 1) {
                    if (this.f58270y7 && m61508B4(f11, f12)) {
                        m61512H4();
                    } else if (this.f58242D7 && m61509C4(f11, f12)) {
                        InterfaceC11505n2 interfaceC11505n2 = this.f58264s7;
                        if (interfaceC11505n2 != null) {
                            interfaceC11505n2.mo62028f(this);
                        }
                    }
                    z13 = true;
                }
                z13 = false;
            } else {
                if (this.f58266u7 && m61508B4(f11, f12)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f58270y7 = z11;
                if (this.f58271z7 && m61509C4(f11, f12)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f58242D7 = z12;
                z13 = z11 | z12;
            }
            invalidate();
            if (z13) {
                return true;
            }
        }
        if (super.mo61079k3(motionEvent, i11, f11, f12)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.ChatRowBase
    /* renamed from: n */
    public void mo61088n() {
        if (this.f58257S7) {
            m61523G4();
        } else {
            super.mo61088n();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: n4 */
    protected void mo61496n4() {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator it = this.f58208b7.iterator();
        while (it.hasNext()) {
            ((C11501m2) it.next()).m62012G();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            for (int i11 = 0; i11 < this.f58208b7.size(); i11++) {
                ((C11501m2) this.f58208b7.get(i11)).m62016O();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: p0 */
    public void mo61098p0(Canvas canvas) {
        super.mo61098p0(canvas);
        if (m61511E4() && this.f58256R7 != null && this.f58253O7 != null) {
            float height = this.f58249K7.height() / 2.0f;
            canvas.drawRoundRect(this.f58250L7, height, height, f58235h8);
            canvas.drawRoundRect(this.f58251M7, height, height, f58237j8);
            canvas.save();
            RectF rectF = this.f58249K7;
            canvas.translate(rectF.left + f58228a8, rectF.top + f58229b8);
            this.f58253O7.draw(canvas);
            canvas.restore();
            if (this.f58258T7) {
                AbstractC11531v0.m62305p2().setBounds(this.f58252N7);
                AbstractC11531v0.m62305p2().draw(canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: s0 */
    public void mo61109s0(Canvas canvas) {
        C13804v0 c13804v0;
        C21197a c21197a;
        if (((C11501m2) this.f58208b7.get(0)).m62014I()) {
            return;
        }
        super.mo61109s0(canvas);
        if (!m61511E4()) {
            return;
        }
        if (this.f58266u7 && (c21197a = this.f58265t7) != null) {
            c21197a.m109760b(canvas);
        }
        if (this.f58271z7) {
            if (this.f58242D7) {
                AbstractC28236y3.m142204o(AbstractC11531v0.m62335v2(), this.f58240B7, this.f58241C7);
                AbstractC11531v0.m62335v2().draw(canvas);
            } else {
                AbstractC28236y3.m142204o(AbstractC11531v0.m62330u2(), this.f58240B7, this.f58241C7);
                AbstractC11531v0.m62330u2().draw(canvas);
            }
        }
        if (this.f58243E7 && this.f58244F7 && (c13804v0 = this.f58246H7) != null) {
            c13804v0.m77062a(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public void setMessage(C28771c c28771c) {
        this.f57257A = c28771c;
        setMessage(c28771c.m143954n());
    }

    public void setStickerDelegate(InterfaceC11505n2 interfaceC11505n2) {
        this.f58264s7 = interfaceC11505n2;
        for (int i11 = 0; i11 < this.f58208b7.size(); i11++) {
            ((C11501m2) this.f58208b7.get(i11)).m62020T(interfaceC11505n2);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t1 */
    protected boolean mo61112t1() {
        return this.f57526t2 || this.f57319K1;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems
    /* renamed from: t4 */
    public C11501m2 mo61483Z3() {
        return new C11501m2(this);
    }

    /* renamed from: u4 */
    public void m61529u4(boolean z11) {
        this.f58266u7 = z11;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiItems, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58266u7 = false;
        if (!this.f58239A7) {
            this.f58271z7 = false;
        }
        this.f58242D7 = false;
        this.f58256R7 = null;
        this.f58267v7 = false;
        this.f58261p7 = false;
        this.f58262q7 = null;
        if (!this.f58245G7) {
            this.f58244F7 = false;
        }
        this.f58243E7 = false;
        this.f58240B7 = 0;
        this.f58241C7 = 0;
        if (getDelegate().mo62101s4() != 3) {
            this.f58248J7 = 0;
            this.f58247I7 = 0;
        }
    }

    /* renamed from: x4 */
    protected boolean m61530x4() {
        ArrayList arrayList = this.f58204X6;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = this.f58204X6.iterator();
            while (it.hasNext()) {
                if (getDelegate().mo62079c4(((C17945a0) it.next()).m95029V3()).f133329y) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: y2 */
    public C28227x3 mo61128y2(int i11, int i12, int i13, C28227x3 c28227x3) {
        C28227x3 mo61128y2 = super.mo61128y2(i11, i12, i13, c28227x3);
        if (m61511E4() && this.f58256R7 != null) {
            StaticLayout m119625l = AbstractC23214t.m119625l(this.f58256R7.m147607e(), f58236i8, (i13 - (f58228a8 * 2)) - m61519w4(!this.f58258T7), 1);
            this.f58253O7 = m119625l;
            this.f58254P7 = (int) ((r7 * 2) + m119625l.getLineWidth(0) + m61519w4(this.f58258T7));
            this.f58255Q7 = (f58229b8 * 2) + this.f58253O7.getHeight();
            mo61128y2.f131648a = Math.max(mo61128y2.f131648a, i11);
            mo61128y2.f131649b += this.f58255Q7 + f58232e8;
        }
        return mo61128y2;
    }
}
