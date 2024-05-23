package com.zing.zalo.p077ui.group.leavegroup;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.AbstractC2379w;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7120k7;
import com.zing.zalo.p077ui.group.leavegroup.C11922b;
import com.zing.zalo.p077ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.EnumC16952b0;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import di0.EnumC17943b;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import f70.C18810l;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p227i3.C20215s;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p649xl.C30032s7;
import p649xl.C30042t0;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import ui0.C27276c;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class LeaveGroupConfirmViewBottomSheet extends BottomSheet implements InterfaceC18319c, C23744a.c {

    /* renamed from: b1 */
    private final InterfaceC24854k f62026b1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C11922b.class), new C11917j(new C11916i(this)), new C11920m());

    /* renamed from: c1 */
    private C30042t0 f62027c1;

    /* renamed from: d1 */
    private C30032s7 f62028d1;

    /* renamed from: e1 */
    private final InterfaceC24854k f62029e1;

    /* renamed from: f1 */
    private final InterfaceC24854k f62030f1;

    /* renamed from: g1 */
    private C16972e0 f62031g1;

    /* renamed from: h1 */
    private final InterfaceC24854k f62032h1;

    /* renamed from: i1 */
    private final InterfaceC24854k f62033i1;

    /* renamed from: j1 */
    private boolean f62034j1;

    /* renamed from: k1 */
    private boolean f62035k1;

    /* renamed from: l1 */
    private final InterfaceC24854k f62036l1;

    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$a */
    /* loaded from: classes5.dex */
    static final class C11908a extends AbstractC19075u implements InterfaceC18494a {
        C11908a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7120k7 mo12V4() {
            return new C7120k7(LeaveGroupConfirmViewBottomSheet.this.m66244qM().m66315f0());
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$b */
    /* loaded from: classes5.dex */
    static final class C11909b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$b$a */
        /* loaded from: classes5.dex */
        public static final class a implements Animator.AnimatorListener {

            /* renamed from: p */
            final /* synthetic */ LeaveGroupConfirmViewBottomSheet f62039p;

            a(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet) {
                this.f62039p = leaveGroupConfirmViewBottomSheet;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                AbstractC19074t.m100208f(animator, "animation");
                LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet = this.f62039p;
                leaveGroupConfirmViewBottomSheet.m66216QM(leaveGroupConfirmViewBottomSheet.m66244qM().m66308W());
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animation");
                LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet = this.f62039p;
                leaveGroupConfirmViewBottomSheet.m66216QM(leaveGroupConfirmViewBottomSheet.m66244qM().m66308W());
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                AbstractC19074t.m100208f(animator, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                AbstractC19074t.m100208f(animator, "animation");
                C30042t0 c30042t0 = this.f62039p.f62027c1;
                C30032s7 c30032s7 = null;
                if (c30042t0 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30042t0 = null;
                }
                c30042t0.f139357q.setVisibility(0);
                C30042t0 c30042t02 = this.f62039p.f62027c1;
                if (c30042t02 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30042t02 = null;
                }
                c30042t02.f139366z.setVisibility(0);
                C30032s7 c30032s72 = this.f62039p.f62028d1;
                if (c30032s72 == null) {
                    AbstractC19074t.m100223u("btnContainer");
                    c30032s72 = null;
                }
                c30032s72.f139304u.setVisibility(0);
                C30032s7 c30032s73 = this.f62039p.f62028d1;
                if (c30032s73 == null) {
                    AbstractC19074t.m100223u("btnContainer");
                } else {
                    c30032s7 = c30032s73;
                }
                c30032s7.f139305v.setVisibility(0);
            }
        }

        C11909b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m66260c(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(leaveGroupConfirmViewBottomSheet, "this$0");
            AbstractC19074t.m100208f(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            leaveGroupConfirmViewBottomSheet.m66251yM(((Integer) animatedValue).intValue());
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ValueAnimator mo12V4() {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, AbstractC23136l9.m118722k0());
            final LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet = LeaveGroupConfirmViewBottomSheet.this;
            ofInt.setDuration(300L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.group.leavegroup.a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LeaveGroupConfirmViewBottomSheet.C11909b.m66260c(LeaveGroupConfirmViewBottomSheet.this, valueAnimator);
                }
            });
            ofInt.addListener(new a(leaveGroupConfirmViewBottomSheet));
            return ofInt;
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$c */
    /* loaded from: classes5.dex */
    public static final class C11910c extends ClickableSpan {

        /* renamed from: p */
        final /* synthetic */ InterfaceC18505l f62040p;

        /* renamed from: q */
        final /* synthetic */ LeaveGroupConfirmViewBottomSheet f62041q;

        C11910c(InterfaceC18505l interfaceC18505l, LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet) {
            this.f62040p = interfaceC18505l;
            this.f62041q = leaveGroupConfirmViewBottomSheet;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            AbstractC19074t.m100208f(view, "widget");
            this.f62040p.mo205i9(view);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            AbstractC19074t.m100208f(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setColor(C23212s8.m119607o(this.f62041q.getContext(), AbstractC2807a.link_01));
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$d */
    /* loaded from: classes5.dex */
    public static final class C11911d implements KeyboardFrameLayout.InterfaceC13508a {
        C11911d() {
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: y1 */
        public void mo37136y1(int i11) {
            BottomSheet.m90498HL(LeaveGroupConfirmViewBottomSheet.this, false, 0, false, 4, null);
        }

        @Override // com.zing.zalo.p077ui.widget.KeyboardFrameLayout.InterfaceC13508a
        /* renamed from: z3 */
        public void mo37138z3(int i11) {
            LeaveGroupConfirmViewBottomSheet.this.m90509GL(true, i11, true);
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$e */
    /* loaded from: classes5.dex */
    static final class C11912e extends AbstractC19075u implements InterfaceC18494a {
        C11912e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Switch mo12V4() {
            Context m92689tK = LeaveGroupConfirmViewBottomSheet.this.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            return new Switch(m92689tK);
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$f */
    /* loaded from: classes5.dex */
    public static final class C11913f implements TextWatcher {
        C11913f() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AbstractC19074t.m100208f(editable, C20215s.f99966b);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(charSequence, C20215s.f99966b);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            AbstractC19074t.m100208f(charSequence, C20215s.f99966b);
            LeaveGroupConfirmViewBottomSheet.this.m66244qM().m66331z0(charSequence.toString());
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$g */
    /* loaded from: classes5.dex */
    static final class C11914g extends AbstractC19075u implements InterfaceC18494a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$g$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ LeaveGroupConfirmViewBottomSheet f62046q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet) {
                super(1);
                this.f62046q = leaveGroupConfirmViewBottomSheet;
            }

            /* renamed from: a */
            public final void m66264a(View view) {
                AbstractC19074t.m100208f(view, "it");
                C11922b.m66282D0(this.f62046q.m66244qM(), false, false, 3, null);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m66264a((View) obj);
                return C24848g0.f119245a;
            }
        }

        C11914g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClickableSpan mo12V4() {
            LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet = LeaveGroupConfirmViewBottomSheet.this;
            return leaveGroupConfirmViewBottomSheet.m66235hM(new a(leaveGroupConfirmViewBottomSheet));
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$h */
    /* loaded from: classes5.dex */
    static final class C11915h extends AbstractC19075u implements InterfaceC18494a {
        C11915h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Switch mo12V4() {
            Context m92689tK = LeaveGroupConfirmViewBottomSheet.this.m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            return new Switch(m92689tK);
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$i */
    /* loaded from: classes5.dex */
    public static final class C11916i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f62048q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11916i(ZaloView zaloView) {
            super(0);
            this.f62048q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f62048q;
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$j */
    /* loaded from: classes5.dex */
    public static final class C11917j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f62049q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11917j(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f62049q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f62049q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$k */
    /* loaded from: classes5.dex */
    public static final class C11918k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f62050t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$k$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f62052t;

            /* renamed from: u */
            final /* synthetic */ LeaveGroupConfirmViewBottomSheet f62053u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$k$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32759a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ LeaveGroupConfirmViewBottomSheet f62054p;

                C32759a(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet) {
                    this.f62054p = leaveGroupConfirmViewBottomSheet;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(C11922b.b bVar, Continuation continuation) {
                    int i11;
                    if (AbstractC19074t.m100204b(bVar, C11922b.b.a.f62085a)) {
                        this.f62054p.close();
                    } else if (bVar instanceof C11922b.b.d) {
                        C11922b.b.d dVar = (C11922b.b.d) bVar;
                        this.f62054p.m66214PM(dVar.m66338b(), dVar.m66339c());
                        C30042t0 c30042t0 = this.f62054p.f62027c1;
                        if (c30042t0 == null) {
                            AbstractC19074t.m100223u("binding");
                            c30042t0 = null;
                        }
                        Button button = c30042t0.f139359s;
                        if (dVar.m66337a()) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        button.setVisibility(i11);
                    } else if (AbstractC19074t.m100204b(bVar, C11922b.b.c.f62090a)) {
                        this.f62054p.m66202JM();
                    } else if (bVar instanceof C11922b.b.C32761b) {
                        C11922b.b.C32761b c32761b = (C11922b.b.C32761b) bVar;
                        this.f62054p.m66234gM(c32761b.m66333a(), c32761b.m66334b(), c32761b.m66336d(), c32761b.m66335c());
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet, Continuation continuation) {
                super(2, continuation);
                this.f62053u = leaveGroupConfirmViewBottomSheet;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f62053u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f62052t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow m66310Y = this.f62053u.m66244qM().m66310Y();
                    C32759a c32759a = new C32759a(this.f62053u);
                    this.f62052t = 1;
                    if (m66310Y.mo97893a(c32759a, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C11918k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11918k(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f62050t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w m92657cJ = LeaveGroupConfirmViewBottomSheet.this.m92657cJ();
                AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(LeaveGroupConfirmViewBottomSheet.this, null);
                this.f62050t = 1;
                if (RepeatOnLifecycleKt.m9234b(m92657cJ, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11918k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$l */
    /* loaded from: classes5.dex */
    public static final class C11919l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f62055t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$l$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f62057t;

            /* renamed from: u */
            final /* synthetic */ LeaveGroupConfirmViewBottomSheet f62058u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$l$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32760a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ LeaveGroupConfirmViewBottomSheet f62059p;

                C32760a(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet) {
                    this.f62059p = leaveGroupConfirmViewBottomSheet;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(C11922b.c cVar, Continuation continuation) {
                    C30032s7 c30032s7 = null;
                    if (cVar instanceof C11922b.c.d) {
                        C30042t0 c30042t0 = this.f62059p.f62027c1;
                        if (c30042t0 == null) {
                            AbstractC19074t.m100223u("binding");
                            c30042t0 = null;
                        }
                        c30042t0.f139358r.setVisibility(0);
                        C30042t0 c30042t02 = this.f62059p.f62027c1;
                        if (c30042t02 == null) {
                            AbstractC19074t.m100223u("binding");
                            c30042t02 = null;
                        }
                        c30042t02.f139355A.setVisibility(8);
                        if (this.f62059p.f62034j1) {
                            C30042t0 c30042t03 = this.f62059p.f62027c1;
                            if (c30042t03 == null) {
                                AbstractC19074t.m100223u("binding");
                                c30042t03 = null;
                            }
                            c30042t03.f139360t.setVisibility(8);
                            this.f62059p.m66236iM().m36300N(((C11922b.c.d) cVar).m66342b(), true);
                        }
                    } else if (cVar instanceof C11922b.c.a) {
                        this.f62059p.m66200IM(((C11922b.c.a) cVar).m66340a());
                    } else if (cVar instanceof C11922b.c.b) {
                        C30042t0 c30042t04 = this.f62059p.f62027c1;
                        if (c30042t04 == null) {
                            AbstractC19074t.m100223u("binding");
                            c30042t04 = null;
                        }
                        c30042t04.f139360t.setVisibility(0);
                        C30042t0 c30042t05 = this.f62059p.f62027c1;
                        if (c30042t05 == null) {
                            AbstractC19074t.m100223u("binding");
                            c30042t05 = null;
                        }
                        c30042t05.f139358r.setVisibility(8);
                        C30042t0 c30042t06 = this.f62059p.f62027c1;
                        if (c30042t06 == null) {
                            AbstractC19074t.m100223u("binding");
                            c30042t06 = null;
                        }
                        c30042t06.f139355A.setVisibility(8);
                    }
                    C30032s7 c30032s72 = this.f62059p.f62028d1;
                    if (c30032s72 == null) {
                        AbstractC19074t.m100223u("btnContainer");
                    } else {
                        c30032s7 = c30032s72;
                    }
                    c30032s7.f139303t.setEnabled(this.f62059p.m66244qM().m66314c0());
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet, Continuation continuation) {
                super(2, continuation);
                this.f62058u = leaveGroupConfirmViewBottomSheet;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f62058u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f62057t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    StateFlow m66312a0 = this.f62058u.m66244qM().m66312a0();
                    C32760a c32760a = new C32760a(this.f62058u);
                    this.f62057t = 1;
                    if (m66312a0.mo97893a(c32760a, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        C11919l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11919l(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f62055t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w m92657cJ = LeaveGroupConfirmViewBottomSheet.this.m92657cJ();
                AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(LeaveGroupConfirmViewBottomSheet.this, null);
                this.f62055t = 1;
                if (RepeatOnLifecycleKt.m9234b(m92657cJ, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11919l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewBottomSheet$m */
    /* loaded from: classes5.dex */
    static final class C11920m extends AbstractC19075u implements InterfaceC18494a {
        C11920m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            String str;
            String string;
            Bundle m92642L3 = LeaveGroupConfirmViewBottomSheet.this.m92642L3();
            String str2 = "";
            if (m92642L3 == null || (str = m92642L3.getString("extra_group_id")) == null) {
                str = "";
            }
            Bundle m92642L32 = LeaveGroupConfirmViewBottomSheet.this.m92642L3();
            if (m92642L32 != null && (string = m92642L32.getString("STR_EXTRA_SILENTLY_LEAVE_GROUP_SOURCE")) != null) {
                str2 = string;
            }
            return new C18810l(str, str2);
        }
    }

    public LeaveGroupConfirmViewBottomSheet() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        m129210a = AbstractC24856m.m129210a(new C11915h());
        this.f62029e1 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C11912e());
        this.f62030f1 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C11914g());
        this.f62032h1 = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new C11908a());
        this.f62033i1 = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new C11909b());
        this.f62036l1 = m129210a5;
    }

    /* renamed from: AM */
    private final void m66191AM() {
        C30042t0 c30042t0 = this.f62027c1;
        C30032s7 c30032s7 = null;
        if (c30042t0 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t0 = null;
        }
        c30042t0.f139365y.getEditText().addTextChangedListener(new C11913f());
        C30032s7 c30032s72 = this.f62028d1;
        if (c30032s72 == null) {
            AbstractC19074t.m100223u("btnContainer");
            c30032s72 = null;
        }
        c30032s72.f139303t.setOnClickListener(new View.OnClickListener() { // from class: f70.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LeaveGroupConfirmViewBottomSheet.m66192BM(LeaveGroupConfirmViewBottomSheet.this, view);
            }
        });
        C30042t0 c30042t02 = this.f62027c1;
        if (c30042t02 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t02 = null;
        }
        c30042t02.f139359s.setOnClickListener(new View.OnClickListener() { // from class: f70.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LeaveGroupConfirmViewBottomSheet.m66193CM(LeaveGroupConfirmViewBottomSheet.this, view);
            }
        });
        C30032s7 c30032s73 = this.f62028d1;
        if (c30032s73 == null) {
            AbstractC19074t.m100223u("btnContainer");
            c30032s73 = null;
        }
        c30032s73.f139300q.setOnClickListener(new View.OnClickListener() { // from class: f70.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LeaveGroupConfirmViewBottomSheet.m66194DM(LeaveGroupConfirmViewBottomSheet.this, view);
            }
        });
        C30032s7 c30032s74 = this.f62028d1;
        if (c30032s74 == null) {
            AbstractC19074t.m100223u("btnContainer");
            c30032s74 = null;
        }
        c30032s74.f139301r.setOnClickListener(new View.OnClickListener() { // from class: f70.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LeaveGroupConfirmViewBottomSheet.m66195EM(LeaveGroupConfirmViewBottomSheet.this, view);
            }
        });
        C30032s7 c30032s75 = this.f62028d1;
        if (c30032s75 == null) {
            AbstractC19074t.m100223u("btnContainer");
        } else {
            c30032s7 = c30032s75;
        }
        c30032s7.f139302s.setOnClickListener(new View.OnClickListener() { // from class: f70.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LeaveGroupConfirmViewBottomSheet.m66196FM(LeaveGroupConfirmViewBottomSheet.this, view);
            }
        });
        m66241nM().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f70.j
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                LeaveGroupConfirmViewBottomSheet.m66197GM(LeaveGroupConfirmViewBottomSheet.this, compoundButton, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m66192BM(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet, View view) {
        AbstractC19074t.m100208f(leaveGroupConfirmViewBottomSheet, "this$0");
        leaveGroupConfirmViewBottomSheet.m66244qM().m66328w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m66193CM(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet, View view) {
        AbstractC19074t.m100208f(leaveGroupConfirmViewBottomSheet, "this$0");
        leaveGroupConfirmViewBottomSheet.m66244qM().m66323r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m66194DM(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet, View view) {
        AbstractC19074t.m100208f(leaveGroupConfirmViewBottomSheet, "this$0");
        leaveGroupConfirmViewBottomSheet.close();
        leaveGroupConfirmViewBottomSheet.m66244qM().m66319k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m66195EM(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet, View view) {
        AbstractC19074t.m100208f(leaveGroupConfirmViewBottomSheet, "this$0");
        leaveGroupConfirmViewBottomSheet.close();
        leaveGroupConfirmViewBottomSheet.m66244qM().m66320l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m66196FM(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet, View view) {
        AbstractC19074t.m100208f(leaveGroupConfirmViewBottomSheet, "this$0");
        leaveGroupConfirmViewBottomSheet.m66244qM().m66324s0(leaveGroupConfirmViewBottomSheet.m66241nM().isChecked(), leaveGroupConfirmViewBottomSheet.m66239lM().isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m66197GM(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(leaveGroupConfirmViewBottomSheet, "this$0");
        leaveGroupConfirmViewBottomSheet.m66244qM().m66329x0(z11);
    }

    /* renamed from: HM */
    private final int m66198HM() {
        return AbstractC23136l9.m118722k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public final void m66200IM(int i11) {
        C30042t0 c30042t0 = this.f62027c1;
        C30042t0 c30042t02 = null;
        if (c30042t0 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t0 = null;
        }
        c30042t0.f139358r.setVisibility(8);
        C30042t0 c30042t03 = this.f62027c1;
        if (c30042t03 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t03 = null;
        }
        c30042t03.f139355A.setVisibility(0);
        C30042t0 c30042t04 = this.f62027c1;
        if (c30042t04 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t04 = null;
        }
        c30042t04.f139360t.setVisibility(8);
        C30042t0 c30042t05 = this.f62027c1;
        if (c30042t05 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t05 = null;
        }
        c30042t05.f139355A.setMovementMethod(LinkMovementMethod.getInstance());
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    C30042t0 c30042t06 = this.f62027c1;
                    if (c30042t06 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c30042t02 = c30042t06;
                    }
                    RobotoTextView robotoTextView = c30042t02.f139355A;
                    String m92652XI = m92652XI(AbstractC8020f0.str_leave_group_get_members_failed);
                    AbstractC19074t.m100207e(m92652XI, "getString(...)");
                    robotoTextView.setText(m66238kM(m92652XI));
                    return;
                }
                return;
            }
            C30042t0 c30042t07 = this.f62027c1;
            if (c30042t07 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30042t02 = c30042t07;
            }
            RobotoTextView robotoTextView2 = c30042t02.f139355A;
            String m92652XI2 = m92652XI(AbstractC8020f0.str_leave_group_get_members_failed_no_network);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            robotoTextView2.setText(m66238kM(m92652XI2));
            return;
        }
        C30042t0 c30042t08 = this.f62027c1;
        if (c30042t08 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30042t02 = c30042t08;
        }
        c30042t02.f139355A.setText(m92652XI(AbstractC8020f0.str_leave_group_select_owner_search_no_results));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public final void m66202JM() {
        int i11;
        int i12;
        int i13;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a aVar = new C16972e0.a(m92689tK);
        aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
        if (m66244qM().m66316g0()) {
            i11 = AbstractC8020f0.str_leave_community_selected_new_owner_leaved_title;
        } else {
            i11 = AbstractC8020f0.str_leave_group_selected_new_owner_leaved_title;
        }
        aVar.m90917A(i11);
        if (m66244qM().m66316g0()) {
            i12 = AbstractC8020f0.str_leave_community_selected_new_owner_leaved_desc;
        } else {
            i12 = AbstractC8020f0.str_leave_group_selected_new_owner_leaved_desc;
        }
        String m92652XI = m92652XI(i12);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        aVar.m90949z(m92652XI);
        aVar.m90921E(true);
        aVar.m90922F(true);
        aVar.m90945v(AbstractC2814h.ButtonMedium_TertiaryDanger);
        String m92652XI2 = m92652XI(AbstractC8020f0.str_leave_group_selected_new_owner_leaved_continue);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        aVar.m90943t(m92652XI2, new InterfaceC17463d.d() { // from class: f70.b
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                LeaveGroupConfirmViewBottomSheet.m66204KM(LeaveGroupConfirmViewBottomSheet.this, interfaceC17463d, i14);
            }
        });
        aVar.m90935l(AbstractC2814h.ButtonMedium_TertiaryNeutral);
        if (m66244qM().m66316g0()) {
            i13 = AbstractC8020f0.str_leave_community_selected_new_owner_leaved_reselect;
        } else {
            i13 = AbstractC8020f0.str_leave_group_selected_new_owner_leaved_reselect;
        }
        String m92652XI3 = m92652XI(i13);
        AbstractC19074t.m100207e(m92652XI3, "getString(...)");
        aVar.m90934k(m92652XI3, new InterfaceC17463d.d() { // from class: f70.c
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                LeaveGroupConfirmViewBottomSheet.m66206LM(LeaveGroupConfirmViewBottomSheet.this, interfaceC17463d, i14);
            }
        });
        this.f62031g1 = aVar.m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public static final void m66204KM(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(leaveGroupConfirmViewBottomSheet, "this$0");
        leaveGroupConfirmViewBottomSheet.m66244qM().m66326u0(leaveGroupConfirmViewBottomSheet.m66241nM().isChecked(), leaveGroupConfirmViewBottomSheet.m66239lM().isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m66206LM(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(leaveGroupConfirmViewBottomSheet, "this$0");
        leaveGroupConfirmViewBottomSheet.m66244qM().m66330y0();
    }

    /* renamed from: MM */
    private final void m66208MM() {
        InterfaceC1801w m92657cJ = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(m92657cJ), null, null, new C11918k(null), 3, null);
    }

    /* renamed from: NM */
    private final void m66210NM() {
        InterfaceC1801w m92657cJ = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(m92657cJ), null, null, new C11919l(null), 3, null);
    }

    /* renamed from: OM */
    private final void m66212OM() {
        m66208MM();
        m66210NM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public final void m66214PM(C11922b.d dVar, boolean z11) {
        if (z11) {
            C30042t0 c30042t0 = null;
            if (dVar == C11922b.d.f62099q) {
                C30042t0 c30042t02 = this.f62027c1;
                if (c30042t02 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30042t0 = c30042t02;
                }
                LinearLayout linearLayout = c30042t0.f139357q;
                AbstractC19074t.m100207e(linearLayout, "confirmLeaveContainer");
                if (linearLayout.getVisibility() == 0 && !m66237jM().isRunning()) {
                    m66216QM(dVar);
                    return;
                } else if (m66232eM()) {
                    m66237jM().start();
                    this.f62035k1 = false;
                    return;
                } else {
                    this.f62035k1 = true;
                    m90510YK(EnumC17943b.DEFAULT);
                    return;
                }
            }
            C30042t0 c30042t03 = this.f62027c1;
            if (c30042t03 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30042t0 = c30042t03;
            }
            KeyboardFrameLayout keyboardFrameLayout = c30042t0.f139366z;
            AbstractC19074t.m100207e(keyboardFrameLayout, "selectOwnerContainer");
            if (keyboardFrameLayout.getVisibility() == 0 && !m66237jM().isRunning()) {
                m66216QM(dVar);
                return;
            } else {
                m66237jM().reverse();
                return;
            }
        }
        m66216QM(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public final void m66216QM(C11922b.d dVar) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12 = true;
        int i14 = 0;
        if (dVar == C11922b.d.f62099q) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m90516fL() == EnumC17017m.HUG_CONTENT || (z11 && !m66248vM())) {
            z12 = false;
        }
        if (z12 != m90511aL()) {
            m90522qL(z12);
        }
        C30042t0 c30042t0 = this.f62027c1;
        C30032s7 c30032s7 = null;
        if (c30042t0 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t0 = null;
        }
        LinearLayout linearLayout = c30042t0.f139357q;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        C30042t0 c30042t02 = this.f62027c1;
        if (c30042t02 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t02 = null;
        }
        KeyboardFrameLayout keyboardFrameLayout = c30042t02.f139366z;
        if (!z11) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        keyboardFrameLayout.setVisibility(i12);
        C30032s7 c30032s72 = this.f62028d1;
        if (c30032s72 == null) {
            AbstractC19074t.m100223u("btnContainer");
            c30032s72 = null;
        }
        LinearLayout linearLayout2 = c30032s72.f139304u;
        if (z11) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        linearLayout2.setVisibility(i13);
        C30032s7 c30032s73 = this.f62028d1;
        if (c30032s73 == null) {
            AbstractC19074t.m100223u("btnContainer");
            c30032s73 = null;
        }
        LinearLayout linearLayout3 = c30032s73.f139305v;
        if (z11) {
            i14 = 8;
        }
        linearLayout3.setVisibility(i14);
        if (z11) {
            C30042t0 c30042t03 = this.f62027c1;
            if (c30042t03 == null) {
                AbstractC19074t.m100223u("binding");
                c30042t03 = null;
            }
            c30042t03.f139357q.setTranslationX(0.0f);
            C30032s7 c30032s74 = this.f62028d1;
            if (c30032s74 == null) {
                AbstractC19074t.m100223u("btnContainer");
                c30032s74 = null;
            }
            c30032s74.f139304u.setTranslationX(0.0f);
            m66233fM();
            m66244qM().m66321p0();
            AbstractC19444a.m101695c(new Runnable() { // from class: f70.d
                @Override // java.lang.Runnable
                public final void run() {
                    LeaveGroupConfirmViewBottomSheet.m66218RM(LeaveGroupConfirmViewBottomSheet.this);
                }
            });
        } else {
            C30042t0 c30042t04 = this.f62027c1;
            if (c30042t04 == null) {
                AbstractC19074t.m100223u("binding");
                c30042t04 = null;
            }
            c30042t04.f139366z.setTranslationX(0.0f);
            C30032s7 c30032s75 = this.f62028d1;
            if (c30032s75 == null) {
                AbstractC19074t.m100223u("btnContainer");
                c30032s75 = null;
            }
            c30032s75.f139305v.setTranslationX(0.0f);
            m66244qM().m66322q0();
        }
        if (m66244qM().m66316g0()) {
            C30032s7 c30032s76 = this.f62028d1;
            if (c30032s76 == null) {
                AbstractC19074t.m100223u("btnContainer");
            } else {
                c30032s7 = c30032s76;
            }
            c30032s7.f139302s.setText(AbstractC8020f0.str_button_leave_community);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public static final void m66218RM(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet) {
        AbstractC19074t.m100208f(leaveGroupConfirmViewBottomSheet, "this$0");
        if (leaveGroupConfirmViewBottomSheet.m90511aL() && !leaveGroupConfirmViewBottomSheet.m66249wM()) {
            leaveGroupConfirmViewBottomSheet.m90510YK(EnumC17943b.EXPAND);
        }
    }

    /* renamed from: SM */
    private final void m66220SM() {
        C23744a.Companion.m124119a().m124117e(this, 27);
    }

    /* renamed from: eM */
    private final boolean m66232eM() {
        if (!m66248vM() && m66247uM()) {
            return false;
        }
        return true;
    }

    /* renamed from: fM */
    private final void m66233fM() {
        C30042t0 c30042t0 = this.f62027c1;
        if (c30042t0 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t0 = null;
        }
        c30042t0.f139365y.getEditText().setText("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public final void m66234gM(String str, String str2, boolean z11, boolean z12) {
        ZaloView m92650VI;
        Intent intent = new Intent();
        if (str2 != null) {
            intent.putExtra("EXTRA_SELECTED_UID", str2);
        }
        intent.putExtra("extra_group_id", str);
        intent.putExtra("BOL_EXTRA_PREVENT_ADD_GROUP", z12);
        intent.putExtra("BOL_EXTRA_SILENTLY_LEAVE_GROUP", z11);
        if ((m92650VI() instanceof LeaveGroupConfirmView) && (m92650VI = m92650VI()) != null) {
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public final ClickableSpan m66235hM(InterfaceC18505l interfaceC18505l) {
        return new C11910c(interfaceC18505l, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public final C7120k7 m66236iM() {
        return (C7120k7) this.f62033i1.getValue();
    }

    /* renamed from: jM */
    private final ValueAnimator m66237jM() {
        return (ValueAnimator) this.f62036l1.getValue();
    }

    /* renamed from: kM */
    private final Spannable m66238kM(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m92652XI(AbstractC8020f0.str_leave_group_get_members_retry));
        spannableStringBuilder.setSpan(m66240mM(), length, spannableStringBuilder.length(), 17);
        SpannableString valueOf = SpannableString.valueOf(spannableStringBuilder);
        AbstractC19074t.m100207e(valueOf, "valueOf(this)");
        return valueOf;
    }

    /* renamed from: lM */
    private final Switch m66239lM() {
        return (Switch) this.f62030f1.getValue();
    }

    /* renamed from: mM */
    private final ClickableSpan m66240mM() {
        return (ClickableSpan) this.f62032h1.getValue();
    }

    /* renamed from: nM */
    private final Switch m66241nM() {
        return (Switch) this.f62029e1.getValue();
    }

    /* renamed from: oM */
    private final String m66242oM() {
        int i11;
        if (!m66244qM().m66316g0() && m66244qM().m66317h0()) {
            String m92652XI = m92652XI(AbstractC8020f0.str_leave_group_silently_desc);
            AbstractC19074t.m100205c(m92652XI);
            return m92652XI;
        }
        if (m66244qM().m66316g0()) {
            i11 = AbstractC8020f0.str_leave_community_silently_setting_desc_member;
        } else {
            i11 = AbstractC8020f0.str_leave_group_silently_setting_desc_member;
        }
        String m92652XI2 = m92652XI(i11);
        AbstractC19074t.m100205c(m92652XI2);
        return m92652XI2;
    }

    /* renamed from: pM */
    private final String m66243pM() {
        if (m66244qM().m66305I0()) {
            String m92652XI = m92652XI(AbstractC8020f0.str_leave_group_silently_setting_title);
            AbstractC19074t.m100205c(m92652XI);
            return m92652XI;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public final C11922b m66244qM() {
        return (C11922b) this.f62026b1.getValue();
    }

    /* renamed from: rM */
    private final void m66245rM() {
        int i11;
        C30042t0 c30042t0 = null;
        if (m66244qM().m66316g0()) {
            C30042t0 c30042t02 = this.f62027c1;
            if (c30042t02 == null) {
                AbstractC19074t.m100223u("binding");
                c30042t02 = null;
            }
            c30042t02.f139362v.setText(AbstractC8020f0.str_leave_community_title);
        }
        C30042t0 c30042t03 = this.f62027c1;
        if (c30042t03 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t03 = null;
        }
        ListItem listItem = c30042t03.f139364x;
        listItem.setTitle(m66243pM());
        listItem.setSubtitle(m66242oM());
        listItem.setSubtitleMaxLine(2);
        if (m66244qM().m66305I0()) {
            listItem.m90589e(m66241nM());
        }
        EnumC16952b0 enumC16952b0 = EnumC16952b0.CENTER;
        listItem.setTrailingGravity(enumC16952b0);
        listItem.m90592m(false);
        Context context = listItem.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        int m139649b = C27276c.m139649b(context, 16);
        Context context2 = listItem.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        listItem.setPadding(0, m139649b, 0, C27276c.m139649b(context2, 16));
        C30042t0 c30042t04 = this.f62027c1;
        if (c30042t04 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30042t0 = c30042t04;
        }
        ListItem listItem2 = c30042t0.f139363w;
        if (m66244qM().m66316g0()) {
            i11 = AbstractC8020f0.str_leave_community_prevent_add_setting_title;
        } else {
            i11 = AbstractC8020f0.str_leave_group_prevent_add_setting_title;
        }
        String m92652XI = m92652XI(i11);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        listItem2.setTitle(m92652XI);
        String m92652XI2 = m92652XI(AbstractC8020f0.str_leave_group_prevent_add_setting_desc);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        listItem2.setSubtitle(m92652XI2);
        listItem2.setTitleMaxLine(3);
        listItem2.setSubtitleMaxLine(2);
        listItem2.m90589e(m66239lM());
        listItem2.setTrailingGravity(enumC16952b0);
        listItem2.m90592m(false);
        Context context3 = listItem2.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        int m139649b2 = C27276c.m139649b(context3, 16);
        Context context4 = listItem2.getContext();
        AbstractC19074t.m100207e(context4, "getContext(...)");
        listItem2.setPadding(0, m139649b2, 0, C27276c.m139649b(context4, 16));
    }

    /* renamed from: sM */
    private final void m66246sM() {
        C30042t0 c30042t0 = this.f62027c1;
        C30042t0 c30042t02 = null;
        if (c30042t0 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t0 = null;
        }
        c30042t0.f139358r.setLayoutManager(new LinearLayoutManager(getContext()));
        C30042t0 c30042t03 = this.f62027c1;
        if (c30042t03 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t03 = null;
        }
        c30042t03.f139358r.setAdapter(m66236iM());
        C30042t0 c30042t04 = this.f62027c1;
        if (c30042t04 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t04 = null;
        }
        c30042t04.f139358r.setItemAnimator(null);
        C30042t0 c30042t05 = this.f62027c1;
        if (c30042t05 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t05 = null;
        }
        c30042t05.f139365y.m90619J(true);
        C30042t0 c30042t06 = this.f62027c1;
        if (c30042t06 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30042t02 = c30042t06;
        }
        c30042t02.f139366z.setOnKeyboardListener(new C11911d());
        m66236iM().m36299M(this);
    }

    /* renamed from: uM */
    private final boolean m66247uM() {
        if (m90513cL() == EnumC17943b.EXPAND) {
            return true;
        }
        return false;
    }

    /* renamed from: vM */
    private final boolean m66248vM() {
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            return m92676n2.mo35567d1();
        }
        return false;
    }

    /* renamed from: wM */
    private final boolean m66249wM() {
        Rect rect = new Rect();
        C30042t0 c30042t0 = this.f62027c1;
        C30032s7 c30032s7 = null;
        if (c30042t0 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t0 = null;
        }
        if (!c30042t0.f139363w.getGlobalVisibleRect(rect)) {
            return false;
        }
        Rect rect2 = new Rect();
        C30032s7 c30032s72 = this.f62028d1;
        if (c30032s72 == null) {
            AbstractC19074t.m100223u("btnContainer");
        } else {
            c30032s7 = c30032s72;
        }
        if (c30032s7.f139304u.getGlobalVisibleRect(rect2) && rect.bottom >= rect2.top) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m66250xM(LeaveGroupConfirmViewBottomSheet leaveGroupConfirmViewBottomSheet) {
        AbstractC19074t.m100208f(leaveGroupConfirmViewBottomSheet, "this$0");
        if (leaveGroupConfirmViewBottomSheet.m66244qM().m66312a0().getValue() instanceof C11922b.c.d) {
            C30042t0 c30042t0 = leaveGroupConfirmViewBottomSheet.f62027c1;
            C30042t0 c30042t02 = null;
            if (c30042t0 == null) {
                AbstractC19074t.m100223u("binding");
                c30042t0 = null;
            }
            c30042t0.f139360t.setVisibility(8);
            C30042t0 c30042t03 = leaveGroupConfirmViewBottomSheet.f62027c1;
            if (c30042t03 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30042t02 = c30042t03;
            }
            c30042t02.f139358r.setVisibility(0);
            C7120k7 m66236iM = leaveGroupConfirmViewBottomSheet.m66236iM();
            Object value = leaveGroupConfirmViewBottomSheet.m66244qM().m66312a0().getValue();
            AbstractC19074t.m100206d(value, "null cannot be cast to non-null type com.zing.zalo.ui.group.leavegroup.LeaveGroupConfirmViewModel.UiState.Shown");
            m66236iM.m36300N(((C11922b.c.d) value).m66342b(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public final void m66251yM(int i11) {
        C30042t0 c30042t0 = this.f62027c1;
        C30032s7 c30032s7 = null;
        if (c30042t0 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t0 = null;
        }
        float f11 = i11;
        c30042t0.f139357q.setTranslationX(m66198HM() - f11);
        C30032s7 c30032s72 = this.f62028d1;
        if (c30032s72 == null) {
            AbstractC19074t.m100223u("btnContainer");
            c30032s72 = null;
        }
        c30032s72.f139304u.setTranslationX(m66198HM() - f11);
        C30042t0 c30042t02 = this.f62027c1;
        if (c30042t02 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t02 = null;
        }
        float f12 = -f11;
        c30042t02.f139366z.setTranslationX(f12);
        C30032s7 c30032s73 = this.f62028d1;
        if (c30032s73 == null) {
            AbstractC19074t.m100223u("btnContainer");
        } else {
            c30032s7 = c30032s73;
        }
        c30032s7.f139305v.setTranslationX(f12);
    }

    /* renamed from: zM */
    private final void m66252zM() {
        C23744a.Companion.m124119a().m124115b(this, 27);
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        C30042t0 c30042t0 = null;
        if (m90518hL() == null) {
            return null;
        }
        BottomSheetLayout m90518hL = m90518hL();
        AbstractC19074t.m100205c(m90518hL);
        float translationY = m90518hL.getTranslationY();
        BottomSheetLayout m90518hL2 = m90518hL();
        AbstractC19074t.m100205c(m90518hL2);
        if (translationY != m90518hL2.getMinTranslationY()) {
            return null;
        }
        C30042t0 c30042t02 = this.f62027c1;
        if (c30042t02 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t02 = null;
        }
        if (!c30042t02.f139358r.canScrollVertically(1)) {
            C30042t0 c30042t03 = this.f62027c1;
            if (c30042t03 == null) {
                AbstractC19074t.m100223u("binding");
                c30042t03 = null;
            }
            if (!c30042t03.f139358r.canScrollVertically(-1)) {
                return null;
            }
        }
        C30042t0 c30042t04 = this.f62027c1;
        if (c30042t04 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30042t0 = c30042t04;
        }
        return c30042t0.f139358r;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m66220SM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        Bundle m92642L3;
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null && (m92642L3 = m92650VI.m92642L3()) != null) {
            m92642L3.putString("search_text", m66244qM().m66309X());
            m92642L3.putString("new_owner", m66244qM().m66313b0());
            m92642L3.putBoolean("silent_opt", m66241nM().isChecked());
            m92642L3.putBoolean("prevent_add", m66239lM().isChecked());
            m92642L3.putInt("display_mode", m66244qM().m66308W().ordinal());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String str;
        boolean z11;
        AbstractC19074t.m100208f(view, "view");
        C11922b m66244qM = m66244qM();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("new_owner");
        } else {
            str = null;
        }
        if (str == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        C11922b.m66282D0(m66244qM, false, z11, 1, null);
        m66212OM();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    public void close() {
        C16972e0 c16972e0 = this.f62031g1;
        if (c16972e0 != null && c16972e0.m92868m()) {
            c16972e0.dismiss();
        }
        AbstractC2379w.m12430d(m92656bJ());
        super.close();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: e2 */
    public void mo66253e2(boolean z11, float f11) {
        if (z11) {
            AbstractC2379w.m12430d(m92656bJ());
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30042t0 m148506c = C30042t0.m148506c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148506c, "inflate(...)");
        this.f62027c1 = m148506c;
        C30032s7 m148486c = C30032s7.m148486c(layoutInflater, linearLayout, false);
        AbstractC19074t.m100207e(m148486c, "inflate(...)");
        this.f62028d1 = m148486c;
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(AbstractC2379w.m12428b());
        }
        C30042t0 c30042t0 = null;
        if (m66244qM().m66316g0()) {
            C30042t0 c30042t02 = this.f62027c1;
            if (c30042t02 == null) {
                AbstractC19074t.m100223u("binding");
                c30042t02 = null;
            }
            c30042t02.f139361u.setText(AbstractC8020f0.str_leave_community_select_owner_title);
        }
        m66246sM();
        m66245rM();
        if (m66244qM().m66306R()) {
            m90533zL(EnumC17017m.DETENTS);
            m90524sL(0.6f);
        } else {
            m90533zL(EnumC17017m.HUG_CONTENT);
        }
        BottomSheetLayout m90518hL = m90518hL();
        if (m90518hL != null) {
            m90518hL.setNestedScrollingEnabled(true);
        }
        C30032s7 c30032s7 = this.f62028d1;
        if (c30032s7 == null) {
            AbstractC19074t.m100223u("btnContainer");
            c30032s7 = null;
        }
        FrameLayout root = c30032s7.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        C24848g0 c24848g0 = C24848g0.f119245a;
        m90526uL(root, layoutParams);
        m66191AM();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            m66244qM().m66304F0(m92642L3.getString("new_owner"), Integer.valueOf(m92642L3.getInt("display_mode", -1)));
            String string = m92642L3.getString("search_text");
            if (string != null) {
                C30042t0 c30042t03 = this.f62027c1;
                if (c30042t03 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30042t0 = c30042t03;
                }
                c30042t0.f139365y.getEditText().setText(string);
            }
            m66241nM().m90686i(m92642L3.getBoolean("silent_opt"), false);
            m66239lM().m90686i(m92642L3.getBoolean("prevent_add"), false);
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: mL */
    public void mo66254mL() {
        C30042t0 c30042t0 = this.f62027c1;
        C30032s7 c30032s7 = null;
        if (c30042t0 == null) {
            AbstractC19074t.m100223u("binding");
            c30042t0 = null;
        }
        FrameLayout root = c30042t0.getRoot();
        C30032s7 c30032s72 = this.f62028d1;
        if (c30032s72 == null) {
            AbstractC19074t.m100223u("btnContainer");
        } else {
            c30032s7 = c30032s72;
        }
        FrameLayout root2 = c30032s7.getRoot();
        root2.measure(View.MeasureSpec.makeMeasureSpec(AbstractC23136l9.m118722k0(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AbstractC23136l9.m118713h0(), Integer.MIN_VALUE));
        root.setPadding(0, 0, 0, root2.getMeasuredHeight());
        super.mo66254mL();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: nL */
    public void mo66255nL() {
        this.f62034j1 = true;
        AbstractC2379w.m12430d(m92656bJ());
        AbstractC19444a.m101694b(new Runnable() { // from class: f70.k
            @Override // java.lang.Runnable
            public final void run() {
                LeaveGroupConfirmViewBottomSheet.m66250xM(LeaveGroupConfirmViewBottomSheet.this);
            }
        }, 0L);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && m66244qM().m66327v0()) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m66252zM();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: st */
    public void mo66256st(float f11) {
        super.mo66256st(f11);
        if (this.f62035k1 && !m66247uM()) {
            this.f62035k1 = false;
            m66214PM(m66244qM().m66308W(), true);
        }
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: tM, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "p1");
        if (AbstractC19074t.m100204b(c18316b.m97246b(), "ACTION_MEMBER_ITEM_CLICKED")) {
            if (c18316b.m97245a() instanceof String) {
                m66244qM().m66302A0((String) c18316b.m97245a());
            }
            return null;
        }
        return c18316b;
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 27) {
            m66244qM().m66325t0(Arrays.copyOf(objArr, objArr.length));
        }
    }
}
