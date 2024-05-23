package ja0;

import ai.InterfaceC0861a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C16974f;
import ea0.C18333g1;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ia0.AbstractC20484a;
import kotlin.NoWhenBranchMatchedException;
import l30.AbstractC22055v0;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.C23013a7;
import me0.C23212s8;
import p133ek.AbstractC18458a;
import p266jg.AbstractC21244b;
import p354n3.C23528a;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29080l;
import p716zh.C32058p1;
import q80.C25182u;

/* renamed from: ja0.l0 */
/* loaded from: classes6.dex */
public abstract class AbstractC21170l0 extends AbstractC20484a {

    /* renamed from: J */
    private final InterfaceC18319c f103277J;

    /* renamed from: K */
    private final ColorStateList f103278K;

    /* renamed from: L */
    private final ColorStateList f103279L;

    /* renamed from: M */
    private final int f103280M;

    /* renamed from: N */
    private final int f103281N;

    /* renamed from: O */
    private final int f103282O;

    /* renamed from: P */
    private AbstractC29069a.o f103283P;

    /* renamed from: Q */
    private final boolean f103284Q;

    /* renamed from: R */
    private ValueAnimator f103285R;

    /* renamed from: ja0.l0$a */
    /* loaded from: classes6.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ C25182u f103286p;

        /* renamed from: q */
        final /* synthetic */ AbstractC21170l0 f103287q;

        /* renamed from: r */
        final /* synthetic */ AbstractC29069a.o f103288r;

        public a(C25182u c25182u, AbstractC21170l0 abstractC21170l0, AbstractC29069a.o oVar) {
            this.f103286p = c25182u;
            this.f103287q = abstractC21170l0;
            this.f103288r = oVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f103286p.m130356y1().mo44614b1(8);
            this.f103287q.f103285R = null;
            this.f103286p.m130356y1().m111959G1(this.f103288r.m145202i());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }
    }

    /* renamed from: ja0.l0$b */
    /* loaded from: classes6.dex */
    public static final class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            AbstractC21170l0.this.f103285R = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }
    }

    /* renamed from: ja0.l0$c */
    /* loaded from: classes6.dex */
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ C25182u f103290p;

        /* renamed from: q */
        final /* synthetic */ AbstractC29069a.o f103291q;

        public c(C25182u c25182u, AbstractC29069a.o oVar) {
            this.f103290p = c25182u;
            this.f103291q = oVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f103290p.m130356y1().m111959G1(this.f103291q.m145202i());
            this.f103290p.m130356y1().m89132a1(-AbstractC23136l9.m118742r(7.0f));
            this.f103290p.m130356y1().mo44614b1(0);
        }
    }

    public /* synthetic */ AbstractC21170l0(ViewGroup viewGroup, C23528a c23528a, InterfaceC18319c interfaceC18319c, AbstractC19060k abstractC19060k) {
        this(viewGroup, c23528a, interfaceC18319c);
    }

    /* renamed from: A0 */
    private final void m109687A0(C25182u c25182u, AbstractC29069a.p pVar) {
        int i11;
        ColorStateList colorStateList;
        if (AbstractC19074t.m100204b(pVar, AbstractC29069a.p.d.f134718a) || AbstractC19074t.m100204b(pVar, AbstractC29069a.p.c.f134717a)) {
            c25182u.m130350s1().mo44614b1(8);
            c25182u.m130351t1().mo44614b1(8);
            c25182u.m130342B1().mo44614b1(8);
            return;
        }
        if (pVar instanceof AbstractC29069a.p.g) {
            c25182u.m130350s1().mo111926w1(((AbstractC29069a.p.g) pVar).m145209a());
            c25182u.m130350s1().mo44614b1(0);
            c25182u.m130351t1().mo44614b1(8);
            c25182u.m130342B1().mo44614b1(8);
            return;
        }
        if (pVar instanceof AbstractC29069a.p.h) {
            c25182u.m130350s1().mo44614b1(0);
            c25182u.m130351t1().mo44614b1(0);
            AbstractC29069a.p.h hVar = (AbstractC29069a.p.h) pVar;
            c25182u.m130350s1().mo111926w1(hVar.m145210a().m145209a());
            c25182u.m130350s1().mo111926w1(hVar.m145211b().m145209a());
            c25182u.m130342B1().mo44614b1(8);
            return;
        }
        if (pVar instanceof AbstractC29069a.p.j) {
            AbstractC29069a.p.j jVar = (AbstractC29069a.p.j) pVar;
            c25182u.m130342B1().m111958F1(jVar.m145212a());
            C22126c0 m130342B1 = c25182u.m130342B1();
            if (jVar.m145213b()) {
                i11 = AbstractC16803z.bg_btn_type1_medium;
            } else {
                i11 = AbstractC16803z.bg_btn_type2_medium;
            }
            m130342B1.m89087B0(i11);
            C22126c0 m130342B12 = c25182u.m130342B1();
            if (jVar.m145213b()) {
                colorStateList = this.f103278K;
            } else {
                colorStateList = this.f103279L;
            }
            m130342B12.m111963K1(colorStateList);
            c25182u.m130350s1().mo44614b1(8);
            c25182u.m130351t1().mo44614b1(8);
            c25182u.m130342B1().mo44614b1(0);
        }
    }

    /* renamed from: B0 */
    private final void m109688B0(C25182u c25182u, float f11) {
        c25182u.m130356y1().mo111964L1(AbstractC23136l9.m118742r(f11));
    }

    /* renamed from: C0 */
    private final void m109689C0(C25182u c25182u, AbstractC29069a.o oVar) {
        boolean z11;
        String str;
        int m119607o;
        AbstractC29069a.w m145203j = oVar.m145203j();
        if (AbstractC19074t.m100204b(m145203j, AbstractC29069a.w.d.f134784a)) {
            z11 = false;
        } else {
            z11 = true;
            if (AbstractC19074t.m100204b(m145203j, AbstractC29069a.w.b.f134783a)) {
                c25182u.m130357z1().m89087B0(AbstractC16803z.ic_ads_tag_bg);
                C22126c0 m130341A1 = c25182u.m130341A1();
                if (AbstractC19074t.m100204b("vi", AbstractC18458a.f93019a)) {
                    str = "QC";
                } else {
                    str = "AD";
                }
                m130341A1.m111959G1(str);
                c25182u.m130341A1().m111962J1(c25182u.m130343C1());
                c25182u.m130341A1().mo111964L1(AbstractC23136l9.m118742r(11.0f));
                C16718f m89106L = c25182u.m130341A1().m89106L();
                int i11 = this.f103280M;
                int i12 = this.f103282O;
                m89106L.m89032P(i11, i12, i11, i12);
            } else if (m145203j instanceof AbstractC29069a.w.c) {
                c25182u.m130357z1().m89087B0(AbstractC16803z.bg_label_business_account);
                c25182u.m130341A1().m111959G1(((AbstractC29069a.w.c) oVar.m145203j()).m145228a());
                c25182u.m130341A1().m111962J1(AbstractC23136l9.m118641B(c25182u.m130341A1().getContext(), AbstractC2808b.f150822b70));
                c25182u.m130341A1().mo111964L1(AbstractC23136l9.m118742r(10.0f));
                C16718f m89106L2 = c25182u.m130341A1().m89106L();
                int i13 = this.f103281N;
                m89106L2.m89032P(i13, 0, i13, 0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        c25182u.m130345E1(z11);
        if (oVar.m145206m() != AbstractC29069a.y.f134789q) {
            c25182u.m130354w1().mo44614b1(8);
            C16974f m90981q1 = c25182u.m130355x1().m90981q1();
            if (m90981q1 != null) {
                if (oVar.m145206m() == AbstractC29069a.y.f134790r) {
                    m119607o = C23212s8.m119607o(m90981q1.m90953c(), AbstractC2807a.badge_background_red);
                } else {
                    m119607o = C23212s8.m119607o(m90981q1.m90953c(), AbstractC2807a.chat_tab_chat_badge_mute);
                }
                m90981q1.m90965o(m119607o);
            } else {
                m90981q1 = null;
            }
            if (m90981q1 != null) {
                c25182u.m130355x1().m90983u1(m90981q1);
                c25182u.m130355x1().mo44614b1(0);
            } else {
                c25182u.m130355x1().mo44614b1(8);
            }
        } else {
            c25182u.m130355x1().mo44614b1(8);
            if (oVar.m145205l() != null && oVar.m145204k() > 0) {
                c25182u.m130354w1().m111959G1(oVar.m145205l());
                c25182u.m130354w1().m89087B0(oVar.m145204k());
                c25182u.m130354w1().mo44614b1(0);
            } else {
                c25182u.m130354w1().mo44614b1(8);
            }
        }
        if (oVar.m145197d() > 0) {
            c25182u.m130346o1().mo111926w1(oVar.m145197d());
            c25182u.m130346o1().mo44614b1(0);
        } else {
            c25182u.m130346o1().mo44614b1(8);
        }
    }

    /* renamed from: D0 */
    private final void m109690D0(C25182u c25182u, String str) {
        ((C25182u) m106522i0()).m130349r1().m115427A1(AbstractC22055v0.m115162v(((C25182u) m106522i0()).getContext()));
        ((C25182u) m106522i0()).m130349r1().m115429C1(AbstractC22055v0.m115116F(str, AbstractC21244b.m110054d(((C25182u) m106522i0()).getContext())), AbstractC22055v0.m115115E(str, AbstractC21244b.m110054d(((C25182u) m106522i0()).getContext())));
        ((C25182u) m106522i0()).m130349r1().m115442z1(AbstractC22055v0.m115112B(str));
        if (AbstractC22055v0.m115114D(str, AbstractC21244b.m110054d(((C25182u) m106522i0()).getContext()))) {
            c25182u.m130349r1().mo89109M0(new C16719g.c() { // from class: ja0.e0
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    AbstractC21170l0.m109691E0(AbstractC21170l0.this, c16719g);
                }
            });
        } else {
            c25182u.m130349r1().mo89109M0(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public static final void m109691E0(AbstractC21170l0 abstractC21170l0, C16719g c16719g) {
        AbstractC19074t.m100208f(abstractC21170l0, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC21170l0.f103277J;
        if (interfaceC18319c != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F0 */
    public static final void m109692F0(AbstractC21170l0 abstractC21170l0, C16719g c16719g) {
        AbstractC19074t.m100208f(abstractC21170l0, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC21170l0.f103277J;
        if (interfaceC18319c != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G0 */
    public static final void m109693G0(AbstractC21170l0 abstractC21170l0, C16719g c16719g) {
        AbstractC29069a.p pVar;
        AbstractC19074t.m100208f(abstractC21170l0, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC21170l0.f103277J;
        if (interfaceC18319c != null) {
            AbstractC29069a.o oVar = abstractC21170l0.f103283P;
            if (oVar != null) {
                pVar = oVar.m145195b();
            } else {
                pVar = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public static final void m109694H0(AbstractC21170l0 abstractC21170l0, C16719g c16719g) {
        AbstractC29069a.p pVar;
        AbstractC19074t.m100208f(abstractC21170l0, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC21170l0.f103277J;
        if (interfaceC18319c != null) {
            AbstractC29069a.o oVar = abstractC21170l0.f103283P;
            if (oVar != null) {
                pVar = oVar.m145195b();
            } else {
                pVar = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public static final void m109695I0(AbstractC21170l0 abstractC21170l0, C16719g c16719g) {
        AbstractC29069a.p pVar;
        AbstractC19074t.m100208f(abstractC21170l0, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC21170l0.f103277J;
        if (interfaceC18319c != null) {
            AbstractC29069a.o oVar = abstractC21170l0.f103283P;
            if (oVar != null) {
                pVar = oVar.m145195b();
            } else {
                pVar = null;
            }
        }
    }

    /* renamed from: t0 */
    public static /* synthetic */ void m109705t0(AbstractC21170l0 abstractC21170l0, AbstractC29069a.o oVar, AbstractC29080l abstractC29080l, int[] iArr, Object obj, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 8) != 0) {
                obj = null;
            }
            abstractC21170l0.m109712s0(oVar, abstractC29080l, iArr, obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    /* renamed from: u0 */
    private final void m109706u0(C25182u c25182u, String str, String str2, String str3, C32058p1 c32058p1, int[] iArr) {
        boolean z11;
        C22129e m130349r1 = c25182u.m130349r1();
        boolean z12 = false;
        if (iArr[0] == 0 && iArr[1] == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        m130349r1.f108954r1 = z11;
        C22129e m130349r12 = c25182u.m130349r1();
        if (iArr[0] != 0) {
            z12 = true;
        }
        m130349r12.f108931U0 = z12;
        if (c32058p1 != null) {
            c25182u.m130349r1().m115437u1(c32058p1.m154671e());
        } else {
            c25182u.m130349r1().m115435s1(str, str2, str3);
        }
    }

    /* renamed from: v0 */
    private final void m109707v0(C25182u c25182u, final AbstractC29069a.o oVar) {
        if (C23013a7.f111966a.m117999i(oVar.m145200g(), 1)) {
            c25182u.m89111N0(new C16719g.d() { // from class: ja0.d0
                @Override // com.zing.zalo.uidrawing.C16719g.d
                /* renamed from: f */
                public final void mo942f(C16719g c16719g) {
                    AbstractC21170l0.m109708w0(AbstractC21170l0.this, oVar, c16719g);
                }
            });
        } else {
            c25182u.m89111N0(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m109708w0(AbstractC21170l0 abstractC21170l0, AbstractC29069a.o oVar, C16719g c16719g) {
        AbstractC19074t.m100208f(abstractC21170l0, "this$0");
        AbstractC19074t.m100208f(oVar, "$data");
        InterfaceC18319c interfaceC18319c = abstractC21170l0.f103277J;
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: x0 */
    private final void m109709x0(final C25182u c25182u, AbstractC29069a.o oVar, int[] iArr) {
        boolean z11;
        ContactProfile contactProfile;
        int i11;
        ContactProfile contactProfile2;
        c25182u.m130353v1().m111959G1(oVar.m145201h());
        C22126c0 m130348q1 = c25182u.m130348q1();
        if (m130348q1 != null) {
            float mo2479d = oVar.m145198e().mo2479d();
            InterfaceC0861a m145198e = oVar.m145198e();
            Integer num = null;
            if (m145198e instanceof ContactProfile) {
                contactProfile = (ContactProfile) m145198e;
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                i11 = contactProfile.f42390X;
            } else {
                i11 = -1;
            }
            int mo2481g = oVar.m145198e().mo2481g();
            InterfaceC0861a m145198e2 = oVar.m145198e();
            if (m145198e2 instanceof ContactProfile) {
                contactProfile2 = (ContactProfile) m145198e2;
            } else {
                contactProfile2 = null;
            }
            if (contactProfile2 != null) {
                num = Integer.valueOf(contactProfile2.f42352K0);
            }
            m130348q1.m111959G1("priority=" + mo2479d + ", chatIndex=" + i11 + ", bonus=" + mo2481g + ", type=" + num + "\"}");
        }
        if (AbstractC19074t.m100204b(c25182u.m130356y1().m111973m1(), oVar.m145202i())) {
            return;
        }
        int i12 = 8;
        if (this.f103284Q && iArr[0] == 0) {
            CharSequence m145202i = oVar.m145202i();
            boolean z12 = true;
            if (m145202i != null && m145202i.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (c25182u.m130356y1().m89136d0() != 8) {
                z12 = false;
            }
            if (z11 != z12) {
                if (c25182u.m130356y1().m89136d0() == 0) {
                    ValueAnimator valueAnimator = this.f103285R;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, -AbstractC23136l9.m118742r(7.0f));
                    ofInt.setDuration(200L);
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ja0.j0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            AbstractC21170l0.m109710y0(C25182u.this, valueAnimator2);
                        }
                    });
                    AbstractC19074t.m100205c(ofInt);
                    ofInt.addListener(new a(c25182u, this, oVar));
                    ofInt.start();
                    this.f103285R = ofInt;
                    return;
                }
                ValueAnimator valueAnimator2 = this.f103285R;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator ofInt2 = ValueAnimator.ofInt(-AbstractC23136l9.m118742r(7.0f), 0);
                ofInt2.setDuration(200L);
                ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ja0.k0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        AbstractC21170l0.m109711z0(C25182u.this, valueAnimator3);
                    }
                });
                AbstractC19074t.m100205c(ofInt2);
                ofInt2.addListener(new c(c25182u, oVar));
                ofInt2.addListener(new b());
                ofInt2.start();
                this.f103285R = ofInt2;
                return;
            }
        }
        C22126c0 m130356y1 = c25182u.m130356y1();
        c25182u.m130356y1().m111959G1(oVar.m145202i());
        m130356y1.m89132a1(0);
        CharSequence m145202i2 = oVar.m145202i();
        if (m145202i2 != null && m145202i2.length() != 0) {
            i12 = 0;
        }
        m130356y1.mo44614b1(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m109710y0(C25182u c25182u, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c25182u, "$this_bindNameAndSubName");
        AbstractC19074t.m100208f(valueAnimator, "value");
        C22126c0 m130356y1 = c25182u.m130356y1();
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        m130356y1.m89132a1(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m109711z0(C25182u c25182u, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c25182u, "$this_bindNameAndSubName");
        AbstractC19074t.m100208f(valueAnimator, "value");
        C22126c0 m130356y1 = c25182u.m130356y1();
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        m130356y1.m89132a1(((Integer) animatedValue).intValue());
    }

    /* renamed from: s0 */
    public final void m109712s0(AbstractC29069a.o oVar, AbstractC29080l abstractC29080l, int[] iArr, Object obj) {
        float f11;
        AbstractC19074t.m100208f(oVar, "data");
        AbstractC19074t.m100208f(iArr, "scrollStateTrack");
        this.f103283P = oVar;
        C25182u c25182u = (C25182u) m106522i0();
        if (obj == null || AbstractC19074t.m100204b(obj, "PAYLOAD_SCROLL_STATE_CHANGED") || AbstractC19074t.m100204b(obj, "UserStoryChanged")) {
            String mo2478b = oVar.m145198e().mo2478b();
            AbstractC19074t.m100207e(mo2478b, "getUid(...)");
            m109690D0(c25182u, mo2478b);
        }
        if (obj == null || AbstractC19074t.m100204b(obj, "PAYLOAD_SCROLL_STATE_CHANGED") || AbstractC19074t.m100204b(obj, "UserStoryChanged")) {
            String mo2478b2 = oVar.m145198e().mo2478b();
            AbstractC19074t.m100207e(mo2478b2, "getUid(...)");
            String m145196c = oVar.m145196c();
            String mo2475c = oVar.m145198e().mo2475c();
            AbstractC19074t.m100207e(mo2475c, "getDpn(...)");
            m109706u0(c25182u, mo2478b2, m145196c, mo2475c, oVar.m145199f(), iArr);
        }
        if (obj == null) {
            if (!AbstractC29069a.Companion.m145171a(oVar.m145200g(), 8388608)) {
                f11 = 14.0f;
            } else {
                f11 = 13.0f;
            }
            m109688B0(c25182u, f11);
            m109709x0(c25182u, oVar, iArr);
            m109687A0(c25182u, oVar.m145195b());
            m109689C0(c25182u, oVar);
            m109707v0(c25182u, oVar);
            C18333g1.f92667a.m97293j(c25182u.m130347p1(), c25182u.m130352u1(), oVar, abstractC29080l);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AbstractC21170l0(ViewGroup viewGroup, C23528a c23528a, InterfaceC18319c interfaceC18319c) {
        super(viewGroup, new C25182u(r1, c23528a));
        Context context = viewGroup.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        this.f103277J = interfaceC18319c;
        this.f103278K = AbstractC23136l9.m118643C(AbstractC16801x.bg_btn_type1_text);
        this.f103279L = AbstractC23136l9.m118645D(viewGroup.getContext(), AbstractC16801x.bg_btn_type2_text);
        this.f103280M = AbstractC23136l9.m118742r(5.0f);
        this.f103281N = AbstractC23136l9.m118742r(4.0f);
        this.f103282O = AbstractC23136l9.m118742r(2.0f);
        ((C25182u) m106522i0()).m89119T().setId(AbstractC6918a0.btn_search_result);
        C25182u c25182u = (C25182u) m106522i0();
        c25182u.mo89109M0(new C16719g.c() { // from class: ja0.f0
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                AbstractC21170l0.m109692F0(AbstractC21170l0.this, c16719g);
            }
        });
        c25182u.m130350s1().mo89109M0(new C16719g.c() { // from class: ja0.g0
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                AbstractC21170l0.m109693G0(AbstractC21170l0.this, c16719g);
            }
        });
        c25182u.m130351t1().mo89109M0(new C16719g.c() { // from class: ja0.h0
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                AbstractC21170l0.m109694H0(AbstractC21170l0.this, c16719g);
            }
        });
        c25182u.m130342B1().mo89109M0(new C16719g.c() { // from class: ja0.i0
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                AbstractC21170l0.m109695I0(AbstractC21170l0.this, c16719g);
            }
        });
    }
}
