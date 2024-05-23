package com.zing.zalo.p077ui.call.settingringtone.presenter.ringtonesystemsource;

import android.graphics.Rect;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bp0.AbstractC3103o;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionNoNetwork;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.AbstractC11208a;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import com.zing.zalo.p077ui.call.settingringtone.presenter.ringtonesystemsource.C11233a;
import com.zing.zalo.p077ui.call.settingringtone.presenter.ringtonesystemsource.SystemRingtonesBottomSheet;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.zview.AbstractC17454d;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import m50.C22868a;
import m50.C22869b;
import me0.AbstractC23136l9;
import n50.C23571e;
import n50.InterfaceC23567a;
import p205hc.C19965d;
import p50.AbstractC24655g;
import p50.C24658j;
import p649xl.C30103wa;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class SystemRingtonesBottomSheet extends BottomSheetZaloViewWithAnim implements C22868a.a {

    /* renamed from: W0 */
    private C30103wa f56499W0;

    /* renamed from: X0 */
    private final InterfaceC24854k f56500X0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C11233a.class), new C11228e(new C11227d(this)), C11232i.f56515q);

    /* renamed from: Y0 */
    private C22869b f56501Y0;

    /* renamed from: Z0 */
    private MediaPlayer f56502Z0;

    /* renamed from: a1 */
    private final AudioManager.OnAudioFocusChangeListener f56503a1;

    /* renamed from: b1 */
    private final AudioAttributes f56504b1;

    /* renamed from: c1 */
    private AudioFocusRequest f56505c1;

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.SystemRingtonesBottomSheet$a */
    /* loaded from: classes5.dex */
    public static final class C11224a extends RecyclerView.AbstractC1887n {
        C11224a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            rect.set(AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(4.0f), AbstractC23136l9.m118742r(8.0f), AbstractC23136l9.m118742r(4.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.SystemRingtonesBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C11225b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56506t;

        /* renamed from: v */
        final /* synthetic */ AbstractC11208a.b f56508v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11225b(AbstractC11208a.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f56508v = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C11225b(this.f56508v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            MediaPlayer mediaPlayer;
            AbstractC28298d.m142578e();
            if (this.f56506t == 0) {
                AbstractC24862s.m129228b(obj);
                try {
                    MediaPlayer mediaPlayer2 = SystemRingtonesBottomSheet.this.f56502Z0;
                    if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = SystemRingtonesBottomSheet.this.f56502Z0) != null) {
                        mediaPlayer.stop();
                    }
                    MediaPlayer mediaPlayer3 = SystemRingtonesBottomSheet.this.f56502Z0;
                    if (mediaPlayer3 != null) {
                        mediaPlayer3.release();
                    }
                    SystemRingtonesBottomSheet.this.m58912zM();
                    SystemRingtonesBottomSheet systemRingtonesBottomSheet = SystemRingtonesBottomSheet.this;
                    MediaPlayer create = MediaPlayer.create(systemRingtonesBottomSheet.getContext(), this.f56508v.m58747c());
                    create.setLooping(false);
                    systemRingtonesBottomSheet.f56502Z0 = create;
                    MediaPlayer mediaPlayer4 = SystemRingtonesBottomSheet.this.f56502Z0;
                    if (mediaPlayer4 != null) {
                        mediaPlayer4.start();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11225b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.SystemRingtonesBottomSheet$c */
    /* loaded from: classes5.dex */
    public static final class C11226c implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f56509p;

        C11226c(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f56509p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f56509p;
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
            this.f56509p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.SystemRingtonesBottomSheet$d */
    /* loaded from: classes5.dex */
    public static final class C11227d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f56510q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11227d(ZaloView zaloView) {
            super(0);
            this.f56510q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f56510q;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.SystemRingtonesBottomSheet$e */
    /* loaded from: classes5.dex */
    public static final class C11228e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f56511q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11228e(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f56511q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f56511q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.SystemRingtonesBottomSheet$f */
    /* loaded from: classes5.dex */
    public static final class C11229f extends AbstractC19075u implements InterfaceC18505l {
        C11229f() {
            super(1);
        }

        /* renamed from: a */
        public final void m58916a(List list) {
            C22869b c22869b = SystemRingtonesBottomSheet.this.f56501Y0;
            if (c22869b == null) {
                AbstractC19074t.m100223u("adapter");
                c22869b = null;
            }
            AbstractC19074t.m100205c(list);
            c22869b.m117556P(list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58916a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.SystemRingtonesBottomSheet$g */
    /* loaded from: classes5.dex */
    public static final class C11230g extends AbstractC19075u implements InterfaceC18505l {
        C11230g() {
            super(1);
        }

        /* renamed from: a */
        public final void m58917a(C11233a.b bVar) {
            AbstractC19074t.m100208f(bVar, "it");
            C22869b c22869b = SystemRingtonesBottomSheet.this.f56501Y0;
            if (c22869b == null) {
                AbstractC19074t.m100223u("adapter");
                c22869b = null;
            }
            c22869b.m117557Q(bVar.m58932a());
            if (!(bVar instanceof C11233a.b.C32749b)) {
                if (bVar instanceof C11233a.b.c) {
                    SystemRingtonesBottomSheet.this.mo59032jx(AbstractC8020f0.str_call_ringtone_updated);
                } else if (bVar instanceof C11233a.b.a) {
                    if (AbstractC19074t.m100204b(((C11233a.b.a) bVar).m58933b(), ExceptionNoNetwork.f56345p)) {
                        SystemRingtonesBottomSheet.this.mo59032jx(AbstractC8020f0.str_call_no_internet);
                    } else {
                        SystemRingtonesBottomSheet.this.mo59032jx(AbstractC8020f0.str_call_ringtone_general_error);
                    }
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58917a((C11233a.b) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.SystemRingtonesBottomSheet$h */
    /* loaded from: classes5.dex */
    public static final class C11231h extends AbstractC19075u implements InterfaceC18505l {
        C11231h() {
            super(1);
        }

        /* renamed from: a */
        public final void m58918a(AbstractC11208a.b bVar) {
            AbstractC19074t.m100208f(bVar, "it");
            SystemRingtonesBottomSheet.this.m58911yM(bVar);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58918a((AbstractC11208a.b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.ringtonesystemsource.SystemRingtonesBottomSheet$i */
    /* loaded from: classes5.dex */
    static final class C11232i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11232i f56515q = new C11232i();

        C11232i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C24658j();
        }
    }

    public SystemRingtonesBottomSheet() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = new AudioManager.OnAudioFocusChangeListener() { // from class: p50.i
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i11) {
                SystemRingtonesBottomSheet.m58910xM(SystemRingtonesBottomSheet.this, i11);
            }
        };
        this.f56503a1 = onAudioFocusChangeListener2;
        AudioAttributes build2 = new AudioAttributes.Builder().setUsage(2).build();
        this.f56504b1 = build2;
        m78539iM(true);
        if (Build.VERSION.SDK_INT >= 26) {
            audioAttributes = AbstractC24655g.m128195a(2).setAudioAttributes(build2);
            acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(true);
            onAudioFocusChangeListener = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(onAudioFocusChangeListener2);
            build = onAudioFocusChangeListener.build();
            AbstractC19074t.m100207e(build, "build(...)");
            this.f56505c1 = build;
        }
    }

    /* renamed from: AM */
    private final void m58898AM() {
        m58907uM().m58928S().m9219j(this, new C11226c(new C11229f()));
        m58907uM().m58929T().m9219j(this, new C19965d(new C11230g()));
        m58907uM().m58927R().m9219j(this, new C19965d(new C11231h()));
    }

    /* renamed from: oM */
    private final void m58901oM() {
        try {
            Object systemService = MainApplication.Companion.m35500c().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            if (AbstractC3103o.m15619h(26)) {
                AudioFocusRequest audioFocusRequest = this.f56505c1;
                if (audioFocusRequest == null) {
                    AbstractC19074t.m100223u("audioFocusRequest");
                    audioFocusRequest = null;
                }
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
                return;
            }
            audioManager.abandonAudioFocus(this.f56503a1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uM */
    private final C11233a m58907uM() {
        return (C11233a) this.f56500X0.getValue();
    }

    /* renamed from: vM */
    private final void m58908vM() {
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        bottomSheetLayout.setPadding(0, AbstractC23136l9.m118737p0() + ((int) bottomSheetLayout.getResources().getDimension(AbstractC17454d.action_bar_default_height)), 0, 0);
        bottomSheetLayout.setEnableScrollY(true);
        bottomSheetLayout.setEnableToggleWHenClickNoConsume(false);
        bottomSheetLayout.setCanOverTranslateMaxY(true);
        m78539iM(false);
        bottomSheetLayout.setMaxTranslationY(mo37128eM());
        bottomSheetLayout.setMinTranslationY(mo37128eM());
        bottomSheetLayout.setMinimized(true);
        bottomSheetLayout.setOnTouchListener(new View.OnTouchListener() { // from class: p50.h
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m58909wM;
                m58909wM = SystemRingtonesBottomSheet.m58909wM(SystemRingtonesBottomSheet.this, view, motionEvent);
                return m58909wM;
            }
        });
        C30103wa c30103wa = this.f56499W0;
        C22869b c22869b = null;
        if (c30103wa == null) {
            AbstractC19074t.m100223u("binding");
            c30103wa = null;
        }
        c30103wa.f139811u.setLayoutManager(new LinearLayoutManager(getContext()));
        C30103wa c30103wa2 = this.f56499W0;
        if (c30103wa2 == null) {
            AbstractC19074t.m100223u("binding");
            c30103wa2 = null;
        }
        c30103wa2.f139811u.m9816A(new C11224a());
        C22869b c22869b2 = new C22869b();
        c22869b2.m117555O(this);
        this.f56501Y0 = c22869b2;
        C30103wa c30103wa3 = this.f56499W0;
        if (c30103wa3 == null) {
            AbstractC19074t.m100223u("binding");
            c30103wa3 = null;
        }
        RecyclerView recyclerView = c30103wa3.f139811u;
        C22869b c22869b3 = this.f56501Y0;
        if (c22869b3 == null) {
            AbstractC19074t.m100223u("adapter");
        } else {
            c22869b = c22869b3;
        }
        recyclerView.setAdapter(c22869b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static final boolean m58909wM(SystemRingtonesBottomSheet systemRingtonesBottomSheet, View view, MotionEvent motionEvent) {
        AbstractC19074t.m100208f(systemRingtonesBottomSheet, "this$0");
        if (motionEvent.getAction() == 1) {
            float y11 = motionEvent.getY();
            C30103wa c30103wa = systemRingtonesBottomSheet.f56499W0;
            if (c30103wa == null) {
                AbstractC19074t.m100223u("binding");
                c30103wa = null;
            }
            if (y11 < c30103wa.f139810t.getY()) {
                systemRingtonesBottomSheet.close();
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m58910xM(SystemRingtonesBottomSheet systemRingtonesBottomSheet, int i11) {
        AbstractC19074t.m100208f(systemRingtonesBottomSheet, "this$0");
        if (i11 == -3 || i11 == -2 || i11 == -1) {
            try {
                MediaPlayer mediaPlayer = systemRingtonesBottomSheet.f56502Z0;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    systemRingtonesBottomSheet.f56502Z0 = null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public final Job m58911yM(AbstractC11208a.b bVar) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(this), Dispatchers.m112680b(), null, new C11225b(bVar, null), 2, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public final void m58912zM() {
        try {
            Object systemService = MainApplication.Companion.m35500c().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            if (AbstractC3103o.m15619h(26)) {
                AudioFocusRequest audioFocusRequest = this.f56505c1;
                if (audioFocusRequest == null) {
                    AbstractC19074t.m100223u("audioFocusRequest");
                    audioFocusRequest = null;
                }
                audioManager.requestAudioFocus(audioFocusRequest);
                return;
            }
            audioManager.requestAudioFocus(this.f56503a1, 3, 2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C30103wa c30103wa = this.f56499W0;
        if (c30103wa == null) {
            AbstractC19074t.m100223u("binding");
            c30103wa = null;
        }
        LinearLayout linearLayout = c30103wa.f139807q;
        AbstractC19074t.m100207e(linearLayout, "bottomSheetContainer");
        return linearLayout;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        MediaPlayer mediaPlayer = this.f56502Z0;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            m58901oM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: X0 */
    public boolean mo37120X0(float f11, boolean z11, float f12) {
        if (f11 > AbstractC23136l9.m118742r(100.0f)) {
            close();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m58907uM().m58930V();
        m58898AM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return 0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C30103wa m148659c = C30103wa.m148659c(LayoutInflater.from(getContext()), this.f72454M0, true);
        AbstractC19074t.m100207e(m148659c, "inflate(...)");
        this.f56499W0 = m148659c;
        C30103wa c30103wa = null;
        if (m148659c == null) {
            AbstractC19074t.m100223u("binding");
            m148659c = null;
        }
        this.f72455N0 = m148659c.f139807q;
        C30103wa c30103wa2 = this.f56499W0;
        if (c30103wa2 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30103wa = c30103wa2;
        }
        this.f72456O0 = c30103wa.f139809s;
        m58908vM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingSystemRingtoneView";
    }

    @Override // n50.InterfaceC23568b
    /* renamed from: i5 */
    public void mo58771i5(InterfaceC23567a interfaceC23567a) {
        AbstractC19074t.m100208f(interfaceC23567a, "event");
        if (interfaceC23567a instanceof RingtoneData.C11207d) {
            m58907uM().m58931W(((RingtoneData.C11207d) interfaceC23567a).m58744a());
        }
    }

    @Override // com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell.RingtoneEmptyContentViewCell.InterfaceC11246a
    /* renamed from: ze */
    public void mo58775ze(C23571e c23571e) {
        AbstractC19074t.m100208f(c23571e, "emptyContentData");
    }
}
