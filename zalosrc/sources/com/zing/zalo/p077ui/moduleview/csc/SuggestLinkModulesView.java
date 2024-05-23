package com.zing.zalo.p077ui.moduleview.csc;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import hd0.C20003a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import me0.ViewOnTouchListenerC23157n8;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p716zh.C32098s;

/* loaded from: classes6.dex */
public class SuggestLinkModulesView extends ModulesView implements C16719g.c {

    /* renamed from: d0 */
    private static final int f64704d0;

    /* renamed from: e0 */
    private static final int f64705e0;

    /* renamed from: f0 */
    private static final int f64706f0;

    /* renamed from: g0 */
    private static final int f64707g0;

    /* renamed from: h0 */
    private static final int f64708h0;

    /* renamed from: i0 */
    private static final int f64709i0;

    /* renamed from: j0 */
    private static final int f64710j0;

    /* renamed from: k0 */
    private static final int f64711k0;

    /* renamed from: l0 */
    private static final int f64712l0;

    /* renamed from: m0 */
    private static final int f64713m0;

    /* renamed from: n0 */
    private static final int f64714n0;

    /* renamed from: o0 */
    private static final int f64715o0;

    /* renamed from: p0 */
    private static final int f64716p0;

    /* renamed from: q0 */
    private static final int f64717q0;

    /* renamed from: r0 */
    private static final int f64718r0;

    /* renamed from: K */
    C21693c f64719K;

    /* renamed from: L */
    C21693c f64720L;

    /* renamed from: M */
    C21693c f64721M;

    /* renamed from: N */
    C22126c0 f64722N;

    /* renamed from: O */
    C22126c0 f64723O;

    /* renamed from: P */
    C22126c0 f64724P;

    /* renamed from: Q */
    C21693c f64725Q;

    /* renamed from: R */
    C21693c f64726R;

    /* renamed from: S */
    C16719g f64727S;

    /* renamed from: T */
    C22126c0 f64728T;

    /* renamed from: U */
    C23528a f64729U;

    /* renamed from: V */
    C3977j f64730V;

    /* renamed from: W */
    C3977j f64731W;

    /* renamed from: a0 */
    ChatAttachmentContainer.C11728c f64732a0;

    /* renamed from: b0 */
    ViewOnTouchListenerC23157n8 f64733b0;

    /* renamed from: c0 */
    private InterfaceC12415c f64734c0;

    /* renamed from: com.zing.zalo.ui.moduleview.csc.SuggestLinkModulesView$a */
    /* loaded from: classes6.dex */
    class C12413a extends C22126c0 {
        C12413a(Context context) {
            super(context);
        }

        @Override // kd0.C21697g, com.zing.zalo.uidrawing.C16719g
        /* renamed from: q0 */
        public void mo44180q0(int i11, int i12, int i13, int i14) {
            int i15;
            try {
                C22126c0 c22126c0 = SuggestLinkModulesView.this.f64723O;
                int i16 = 0;
                if (c22126c0 != null && c22126c0.m89144k0() && SuggestLinkModulesView.this.f64723O.m111975o1() != null) {
                    i15 = SuggestLinkModulesView.this.f64723O.m111975o1().getLineCount();
                } else {
                    i15 = 0;
                }
                int i17 = 2 - i15;
                if (i17 > 0) {
                    i16 = i17;
                }
                m111953A1(i16);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            super.mo44180q0(i11, i12, i13, i14);
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.csc.SuggestLinkModulesView$b */
    /* loaded from: classes6.dex */
    class C12414b extends ViewOnTouchListenerC23157n8.c {
        C12414b() {
        }

        @Override // me0.ViewOnTouchListenerC23157n8.c
        /* renamed from: b */
        public void mo65453b() {
            if (SuggestLinkModulesView.this.f64734c0 != null) {
                SuggestLinkModulesView.this.f64734c0.mo64870b(SuggestLinkModulesView.this);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.csc.SuggestLinkModulesView$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC12415c {
        /* renamed from: a */
        void mo64869a(SuggestLinkModulesView suggestLinkModulesView, ChatAttachmentContainer.C11728c c11728c);

        /* renamed from: b */
        void mo64870b(SuggestLinkModulesView suggestLinkModulesView);
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(6.0f);
        f64704d0 = m118742r;
        f64705e0 = AbstractC23136l9.m118742r(10.0f);
        f64706f0 = AbstractC23136l9.m118742r(54.0f);
        f64707g0 = m118742r;
        f64708h0 = AbstractC23136l9.m118742r(6.0f);
        f64709i0 = AbstractC23136l9.m118742r(26.0f);
        f64710j0 = AbstractC23136l9.m118742r(14.0f);
        f64711k0 = AbstractC23136l9.m118742r(2.0f);
        f64712l0 = AbstractC23136l9.m118742r(36.0f);
        f64713m0 = AbstractC23136l9.m118742r(10.0f);
        f64714n0 = AbstractC23136l9.m118742r(12.0f);
        f64715o0 = AbstractC23136l9.m118742r(4.0f);
        f64716p0 = AbstractC23136l9.m118742r(14.0f);
        f64717q0 = AbstractC23136l9.m118742r(0.5f);
        f64718r0 = AbstractC23136l9.m118742r(12.0f);
    }

    public SuggestLinkModulesView(Context context) {
        super(context);
        this.f64729U = new C23528a(context);
        this.f64730V = new C3977j(context);
        this.f64731W = new C3977j(context);
        AbstractC23136l9.m118696b1(this, C23212s8.m119609q(context, AbstractC16781w.suggest_link_bg));
        int i11 = f64705e0;
        setPadding(i11, i11, i11, 0);
        int m119607o = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        int m119607o2 = C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor);
        int m119607o3 = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        int m118641B = AbstractC23136l9.m118641B(context, AbstractC16801x.clear_blue);
        C21693c c21693c = new C21693c(context);
        this.f64719K = c21693c;
        c21693c.mo111927x1(f64708h0);
        this.f64719K.m111929z1(5);
        C16718f m89106L = this.f64719K.m89106L();
        int i12 = f64706f0;
        C16718f m89028L = m89106L.m89028L(i12, i12);
        int i13 = f64707g0;
        m89028L.m89035S(i13);
        C21693c c21693c2 = new C21693c(context);
        this.f64720L = c21693c2;
        c21693c2.mo111926w1(AbstractC16803z.icn_csc_play_icon);
        C16718f m89106L2 = this.f64720L.m89106L();
        int i14 = f64709i0;
        m89106L2.m89028L(i14, i14).m89069v(this.f64719K).m89070w(this.f64719K);
        C21693c c21693c3 = new C21693c(context);
        this.f64725Q = c21693c3;
        c21693c3.mo111925v1(AbstractC23136l9.m118665N(context, AbstractC16803z.stencils_ic_head_close_black));
        C16718f m89106L3 = this.f64725Q.m89106L();
        int i15 = f64712l0;
        m89106L3.m89028L(i15, i15).m89041Y(f64713m0).m89032P(0, -i11, -i11, 0).m89017A(Boolean.TRUE);
        this.f64725Q.mo89109M0(this);
        C21693c c21693c4 = new C21693c(context);
        this.f64721M = c21693c4;
        c21693c4.mo111927x1(f64711k0);
        C16718f m89106L4 = this.f64721M.m89106L();
        int i16 = f64710j0;
        m89106L4.m89028L(i16, i16).m89035S(f64715o0).m89054h0(this.f64719K).m89020D(this.f64719K).m89070w(this.f64722N);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64722N = c22126c0;
        c22126c0.m111962J1(m119607o3);
        this.f64722N.mo111964L1(f64714n0);
        this.f64722N.m111953A1(1);
        C22126c0 c22126c02 = this.f64722N;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c02.m111980v1(truncateAt);
        this.f64722N.m111982x1(false);
        this.f64722N.m89106L().m89054h0(this.f64721M).m89049e0(this.f64725Q);
        C22126c0 c22126c03 = new C22126c0(context);
        this.f64723O = c22126c03;
        int i17 = f64716p0;
        c22126c03.mo111964L1(i17);
        this.f64723O.m111962J1(m119607o);
        this.f64723O.mo111965M1(1);
        this.f64723O.m111953A1(2);
        this.f64723O.m111980v1(truncateAt);
        this.f64723O.m89106L().m89054h0(this.f64719K).m89023G(this.f64722N);
        C12413a c12413a = new C12413a(context);
        this.f64724P = c12413a;
        c12413a.mo111964L1(i17);
        this.f64724P.m111962J1(m119607o);
        this.f64724P.mo111965M1(0);
        this.f64724P.m111980v1(truncateAt);
        this.f64724P.m89106L().m89054h0(this.f64719K).m89023G(this.f64723O);
        C21693c c21693c5 = new C21693c(context);
        this.f64726R = c21693c5;
        c21693c5.m111929z1(5);
        this.f64726R.mo111925v1(AbstractC11531v0.m62201T1());
        this.f64726R.m89106L().m89023G(this.f64724P).m89054h0(this.f64719K).m89036T(f64704d0);
        C16719g c16719g = new C16719g(context);
        this.f64727S = c16719g;
        c16719g.mo89161z0(m119607o2);
        this.f64727S.m89106L().m89028L(-1, f64717q0).m89036T(i13).m89024H(new C20003a(this.f64719K, this.f64726R));
        C22126c0 c22126c04 = new C22126c0(context);
        this.f64728T = c22126c04;
        c22126c04.mo111965M1(1);
        this.f64728T.m111959G1(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_send_btn_title_suggest_copied_link));
        this.f64728T.m111979u1(true);
        this.f64728T.mo111964L1(f64718r0);
        this.f64728T.m111962J1(m118641B);
        this.f64728T.m111961I1(Layout.Alignment.ALIGN_CENTER);
        this.f64728T.m89106L().m89028L(-1, -2).m89023G(this.f64727S).m89032P(-i11, 0, -i11, 0).m89041Y(i11);
        this.f64728T.mo89109M0(this);
        mo69681L(this.f64719K);
        mo69681L(this.f64720L);
        mo69681L(this.f64725Q);
        mo69681L(this.f64721M);
        mo69681L(this.f64722N);
        mo69681L(this.f64723O);
        mo69681L(this.f64724P);
        mo69681L(this.f64726R);
        mo69681L(this.f64727S);
        mo69681L(this.f64728T);
        this.f64733b0 = new ViewOnTouchListenerC23157n8(new C12414b());
    }

    /* renamed from: W */
    public void m69744W(ChatAttachmentContainer.C11728c c11728c) {
        try {
            if (c11728c != this.f64732a0) {
                this.f64732a0 = c11728c;
                if (c11728c != null && c11728c.m65330h() == 3 && this.f64732a0.m65328f() != null && this.f64732a0.m65328f().f91251B != null) {
                    C32098s c32098s = this.f64732a0.m65328f().f91251B;
                    if (!TextUtils.isEmpty(this.f64732a0.m65328f().f91013r)) {
                        this.f64719K.mo44614b1(0);
                        AbstractC23268y2.m120033g(this.f64729U, this.f64731W, this.f64719K, this.f64732a0.m65328f().f91013r, C23278z2.m120136k0(), false);
                        int i11 = c32098s.f147956f;
                        if (i11 != 4 && i11 != 2) {
                            this.f64720L.mo44614b1(8);
                        }
                        this.f64720L.mo44614b1(0);
                    } else {
                        this.f64719K.mo111924u1(null);
                        this.f64719K.mo44614b1(8);
                        this.f64720L.mo44614b1(8);
                    }
                    if (!TextUtils.isEmpty(c32098s.f147953c)) {
                        this.f64723O.m111959G1(c32098s.f147953c);
                        this.f64723O.mo44614b1(0);
                    } else {
                        this.f64723O.mo44614b1(8);
                    }
                    if (!TextUtils.isEmpty(this.f64732a0.m65328f().f91015t)) {
                        this.f64724P.m111959G1(this.f64732a0.m65328f().f91015t);
                        this.f64724P.mo44614b1(0);
                    } else {
                        this.f64724P.mo44614b1(8);
                    }
                    if (c32098s.f147956f == 6) {
                        this.f64726R.mo44614b1(0);
                        this.f64719K.mo44614b1(8);
                        this.f64720L.mo44614b1(8);
                        this.f64723O.mo44614b1(8);
                        this.f64724P.mo44614b1(8);
                    } else {
                        this.f64726R.mo44614b1(8);
                    }
                    if (!TextUtils.isEmpty(c32098s.f147952b)) {
                        this.f64722N.m111959G1(c32098s.f147952b);
                        this.f64722N.mo44614b1(0);
                        if (!TextUtils.isEmpty(c32098s.f147973w)) {
                            this.f64721M.mo44614b1(0);
                            this.f64722N.m89106L().m89070w(this.f64721M);
                            AbstractC23268y2.m120033g(this.f64729U, this.f64730V, this.f64721M, c32098s.f147973w, C23278z2.m120146o0(), false);
                            return;
                        } else {
                            this.f64721M.mo44614b1(8);
                            this.f64722N.m89106L().m89070w(null);
                            return;
                        }
                    }
                    this.f64721M.mo111924u1(null);
                    this.f64722N.mo44614b1(8);
                    this.f64721M.mo44614b1(8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.uidrawing.ModulesView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // com.zing.zalo.uidrawing.ModulesView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f64733b0.onTouch(this, motionEvent)) {
            super.onTouchEvent(motionEvent);
            return true;
        }
        return true;
    }

    public void setSuggestLinkActionListener(InterfaceC12415c interfaceC12415c) {
        this.f64734c0 = interfaceC12415c;
    }

    @Override // com.zing.zalo.uidrawing.C16719g.c
    /* renamed from: y */
    public void mo929y(C16719g c16719g) {
        InterfaceC12415c interfaceC12415c;
        if (c16719g == this.f64725Q) {
            InterfaceC12415c interfaceC12415c2 = this.f64734c0;
            if (interfaceC12415c2 != null) {
                interfaceC12415c2.mo64870b(this);
                return;
            }
            return;
        }
        if (c16719g == this.f64728T && (interfaceC12415c = this.f64734c0) != null) {
            interfaceC12415c.mo64869a(this, this.f64732a0);
        }
    }
}
