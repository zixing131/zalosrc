package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TimePicker;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import me0.C23212s8;
import p649xl.C30055td;
import p716zh.C32009lb;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class TimeRangePickerBottomSheetView extends BottomSheetZaloViewWithAnim implements View.OnClickListener, InterfaceC0733x {
    public static final C15167a Companion = new C15167a(null);

    /* renamed from: W0 */
    private final InterfaceC24854k f78301W0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C32009lb.class), new C15180n(new C15179m(this)), C15168b.f78303q);

    /* renamed from: X0 */
    private C30055td f78302X0;

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$a */
    /* loaded from: classes6.dex */
    public static final class C15167a {
        private C15167a() {
        }

        public /* synthetic */ C15167a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$b */
    /* loaded from: classes6.dex */
    static final class C15168b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C15168b f78303q = new C15168b();

        C15168b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C32009lb.a();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$c */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15169c extends C19071q implements InterfaceC18505l {
        C15169c(Object obj) {
            super(1, obj, TimeRangePickerBottomSheetView.class, "setTitle", "setTitle(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m85134h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((TimeRangePickerBottomSheetView) this.f94922q).m85118HM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m85134h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$d */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15170d extends C19071q implements InterfaceC18505l {
        C15170d(Object obj) {
            super(1, obj, TimeRangePickerBottomSheetView.class, "focusStartTime", "focusStartTime(Z)V", 0);
        }

        /* renamed from: h */
        public final void m85135h(boolean z11) {
            ((TimeRangePickerBottomSheetView) this.f94922q).m85131yM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m85135h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$e */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15171e extends C19071q implements InterfaceC18505l {
        C15171e(Object obj) {
            super(1, obj, TimeRangePickerBottomSheetView.class, "focusEndTime", "focusEndTime(Z)V", 0);
        }

        /* renamed from: h */
        public final void m85136h(boolean z11) {
            ((TimeRangePickerBottomSheetView) this.f94922q).m85130xM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m85136h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$f */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15172f extends C19071q implements InterfaceC18505l {
        C15172f(Object obj) {
            super(1, obj, TimeRangePickerBottomSheetView.class, "changeDoneItemStatus", "changeDoneItemStatus(Z)V", 0);
        }

        /* renamed from: h */
        public final void m85137h(boolean z11) {
            ((TimeRangePickerBottomSheetView) this.f94922q).m85129wM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m85137h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$g */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15173g extends C19071q implements InterfaceC18505l {
        C15173g(Object obj) {
            super(1, obj, TimeRangePickerBottomSheetView.class, "setDoneItemLoading", "setDoneItemLoading(Z)V", 0);
        }

        /* renamed from: h */
        public final void m85138h(boolean z11) {
            ((TimeRangePickerBottomSheetView) this.f94922q).m85114DM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m85138h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$h */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15174h extends C19071q implements InterfaceC18505l {
        C15174h(Object obj) {
            super(1, obj, TimeRangePickerBottomSheetView.class, "setFocusTime", "setFocusTime(Lkotlin/Pair;)V", 0);
        }

        /* renamed from: h */
        public final void m85139h(C24860q c24860q) {
            AbstractC19074t.m100208f(c24860q, "p0");
            ((TimeRangePickerBottomSheetView) this.f94922q).m85116FM(c24860q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m85139h((C24860q) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$i */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15175i extends C19071q implements InterfaceC18505l {
        C15175i(Object obj) {
            super(1, obj, TimeRangePickerBottomSheetView.class, "setStartTimeText", "setStartTimeText(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m85140h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((TimeRangePickerBottomSheetView) this.f94922q).m85117GM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m85140h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$j */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15176j extends C19071q implements InterfaceC18505l {
        C15176j(Object obj) {
            super(1, obj, TimeRangePickerBottomSheetView.class, "setEndTimeText", "setEndTimeText(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m85141h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((TimeRangePickerBottomSheetView) this.f94922q).m85115EM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m85141h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$k */
    /* loaded from: classes6.dex */
    /* synthetic */ class C15177k extends C19071q implements InterfaceC18505l {
        C15177k(Object obj) {
            super(1, obj, TimeRangePickerBottomSheetView.class, "returnTimeRange", "returnTimeRange(Lkotlin/Pair;)V", 0);
        }

        /* renamed from: h */
        public final void m85142h(C24860q c24860q) {
            AbstractC19074t.m100208f(c24860q, "p0");
            ((TimeRangePickerBottomSheetView) this.f94922q).m85113CM(c24860q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m85142h((C24860q) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$l */
    /* loaded from: classes6.dex */
    static final class C15178l implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f78304p;

        C15178l(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f78304p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f78304p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f78304p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$m */
    /* loaded from: classes6.dex */
    public static final class C15179m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f78305q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15179m(ZaloView zaloView) {
            super(0);
            this.f78305q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f78305q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimeRangePickerBottomSheetView$n */
    /* loaded from: classes6.dex */
    public static final class C15180n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f78306q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15180n(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f78306q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f78306q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: AM */
    private final void m85111AM() {
        m78540jM(0);
        this.f72454M0.setCanOverTranslateMaxY(true);
        m78539iM(true);
        C30055td c30055td = this.f78302X0;
        C30055td c30055td2 = null;
        if (c30055td == null) {
            AbstractC19074t.m100223u("binding");
            c30055td = null;
        }
        c30055td.f139505v.setOnClickListener(this);
        C30055td c30055td3 = this.f78302X0;
        if (c30055td3 == null) {
            AbstractC19074t.m100223u("binding");
            c30055td3 = null;
        }
        c30055td3.f139504u.setOnClickListener(this);
        C30055td c30055td4 = this.f78302X0;
        if (c30055td4 == null) {
            AbstractC19074t.m100223u("binding");
            c30055td4 = null;
        }
        c30055td4.f139502s.setIs24HourView(Boolean.TRUE);
        C30055td c30055td5 = this.f78302X0;
        if (c30055td5 == null) {
            AbstractC19074t.m100223u("binding");
            c30055td5 = null;
        }
        c30055td5.f139502s.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() { // from class: com.zing.zalo.ui.zviews.mr0
            @Override // android.widget.TimePicker.OnTimeChangedListener
            public final void onTimeChanged(TimePicker timePicker, int i11, int i12) {
                TimeRangePickerBottomSheetView.m85112BM(TimeRangePickerBottomSheetView.this, timePicker, i11, i12);
            }
        });
        C30055td c30055td6 = this.f78302X0;
        if (c30055td6 == null) {
            AbstractC19074t.m100223u("binding");
            c30055td6 = null;
        }
        c30055td6.f139500q.setIdTracking("time_range_btn_done");
        C30055td c30055td7 = this.f78302X0;
        if (c30055td7 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30055td2 = c30055td7;
        }
        c30055td2.f139500q.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m85112BM(TimeRangePickerBottomSheetView timeRangePickerBottomSheetView, TimePicker timePicker, int i11, int i12) {
        AbstractC19074t.m100208f(timeRangePickerBottomSheetView, "this$0");
        timeRangePickerBottomSheetView.m85132zM().m154315V(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public final void m85113CM(C24860q c24860q) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_START_TIME", ((Number) c24860q.m129215c()).longValue());
        intent.putExtra("EXTRA_END_TIME", ((Number) c24860q.m129216d()).longValue());
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.mo50035CK(-1, intent);
        }
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public final void m85114DM(boolean z11) {
        C30055td c30055td = this.f78302X0;
        if (c30055td == null) {
            AbstractC19074t.m100223u("binding");
            c30055td = null;
        }
        c30055td.f139500q.m90547h(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public final void m85115EM(String str) {
        C30055td c30055td = this.f78302X0;
        if (c30055td == null) {
            AbstractC19074t.m100223u("binding");
            c30055td = null;
        }
        c30055td.f139504u.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final void m85116FM(C24860q c24860q) {
        C30055td c30055td = null;
        if (Build.VERSION.SDK_INT >= 23) {
            C30055td c30055td2 = this.f78302X0;
            if (c30055td2 == null) {
                AbstractC19074t.m100223u("binding");
                c30055td2 = null;
            }
            c30055td2.f139502s.setHour(((Number) c24860q.m129215c()).intValue());
            C30055td c30055td3 = this.f78302X0;
            if (c30055td3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30055td = c30055td3;
            }
            c30055td.f139502s.setMinute(((Number) c24860q.m129216d()).intValue());
            return;
        }
        C30055td c30055td4 = this.f78302X0;
        if (c30055td4 == null) {
            AbstractC19074t.m100223u("binding");
            c30055td4 = null;
        }
        c30055td4.f139502s.setCurrentHour((Integer) c24860q.m129215c());
        C30055td c30055td5 = this.f78302X0;
        if (c30055td5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30055td = c30055td5;
        }
        c30055td.f139502s.setCurrentMinute((Integer) c24860q.m129216d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public final void m85117GM(String str) {
        C30055td c30055td = this.f78302X0;
        if (c30055td == null) {
            AbstractC19074t.m100223u("binding");
            c30055td = null;
        }
        c30055td.f139505v.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public final void m85118HM(String str) {
        C30055td c30055td = this.f78302X0;
        if (c30055td == null) {
            AbstractC19074t.m100223u("binding");
            c30055td = null;
        }
        c30055td.f139506w.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public final void m85129wM(boolean z11) {
        C30055td c30055td = this.f78302X0;
        if (c30055td == null) {
            AbstractC19074t.m100223u("binding");
            c30055td = null;
        }
        c30055td.f139500q.getButton().setEnabled(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public final void m85130xM(boolean z11) {
        int i11;
        int i12;
        C30055td c30055td = this.f78302X0;
        C30055td c30055td2 = null;
        if (c30055td == null) {
            AbstractC19074t.m100223u("binding");
            c30055td = null;
        }
        RobotoTextView robotoTextView = c30055td.f139504u;
        Context context = getContext();
        if (z11) {
            i11 = AbstractC2807a.text_01;
        } else {
            i11 = AbstractC2807a.text_02;
        }
        robotoTextView.setTextColor(C23212s8.m119607o(context, i11));
        C30055td c30055td3 = this.f78302X0;
        if (c30055td3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30055td2 = c30055td3;
        }
        RobotoTextView robotoTextView2 = c30055td2.f139504u;
        if (z11) {
            i12 = AbstractC16803z.frame_469_active;
        } else {
            i12 = AbstractC16803z.frame_469_inactive;
        }
        robotoTextView2.setBackgroundResource(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public final void m85131yM(boolean z11) {
        int i11;
        int i12;
        C30055td c30055td = this.f78302X0;
        C30055td c30055td2 = null;
        if (c30055td == null) {
            AbstractC19074t.m100223u("binding");
            c30055td = null;
        }
        RobotoTextView robotoTextView = c30055td.f139505v;
        Context context = getContext();
        if (z11) {
            i11 = AbstractC2807a.text_01;
        } else {
            i11 = AbstractC2807a.text_02;
        }
        robotoTextView.setTextColor(C23212s8.m119607o(context, i11));
        C30055td c30055td3 = this.f78302X0;
        if (c30055td3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30055td2 = c30055td3;
        }
        RobotoTextView robotoTextView2 = c30055td2.f139505v;
        if (z11) {
            i12 = AbstractC16803z.frame_469_active;
        } else {
            i12 = AbstractC16803z.frame_469_inactive;
        }
        robotoTextView2.setBackgroundResource(i12);
    }

    /* renamed from: zM */
    private final C32009lb m85132zM() {
        return (C32009lb) this.f78301W0.getValue();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m85132zM().m154320a0().m9219j(this, new C15178l(new C15169c(this)));
        m85132zM().m154309P().m9219j(this, new C15178l(new C15170d(this)));
        m85132zM().m154308O().m9219j(this, new C15178l(new C15171e(this)));
        m85132zM().m154307M().m9219j(this, new C15178l(new C15172f(this)));
        m85132zM().m154319Z().m9219j(this, new C15178l(new C15173g(this)));
        m85132zM().m154310Q().m9219j(this, new C15178l(new C15174h(this)));
        m85132zM().m154318Y().m9219j(this, new C15178l(new C15175i(this)));
        m85132zM().m154317X().m9219j(this, new C15178l(new C15176j(this)));
        m85132zM().m154316W().m9219j(this, new C15178l(new C15177k(this)));
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C30055td c30055td = this.f78302X0;
        if (c30055td == null) {
            AbstractC19074t.m100223u("binding");
            c30055td = null;
        }
        TimePicker timePicker = c30055td.f139502s;
        AbstractC19074t.m100207e(timePicker, "timePicker");
        return timePicker;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        int height = this.f72455N0.getHeight();
        C30055td c30055td = this.f78302X0;
        if (c30055td == null) {
            AbstractC19074t.m100223u("binding");
            c30055td = null;
        }
        return (height - c30055td.f139501r.getHeight()) - this.f72456O0.getHeight();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C30055td m148545c = C30055td.m148545c(LayoutInflater.from(getContext()), linearLayout, true);
        AbstractC19074t.m100207e(m148545c, "inflate(...)");
        this.f78302X0 = m148545c;
        m85111AM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        this.f72454M0.setMinTranslationY(mo37128eM() * 1.0f);
        this.f72454M0.f68982p = mo37128eM() * 1.0f;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "TimeRangePickerBottomSheetView";
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.tv_start_time;
        if (num != null && num.intValue() == i11) {
            m85132zM().m154314U();
            return;
        }
        int i12 = AbstractC6918a0.tv_end_time;
        if (num != null && num.intValue() == i12) {
            m85132zM().m154313T();
            return;
        }
        int i13 = AbstractC6918a0.btn_done;
        if (num != null && num.intValue() == i13) {
            m85132zM().m154312S();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m85132zM().m154311R(m92642L3());
    }
}
