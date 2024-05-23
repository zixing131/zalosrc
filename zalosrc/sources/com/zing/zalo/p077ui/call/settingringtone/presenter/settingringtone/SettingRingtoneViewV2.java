package com.zing.zalo.p077ui.call.settingringtone.presenter.settingringtone;

import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import bp0.AbstractC3103o;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8012e0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import com.zing.zalo.p077ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2;
import com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell.RingtoneViewCell;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import me0.AbstractC23136l9;
import n50.InterfaceC23567a;
import n50.InterfaceC23568b;
import p205hc.C19965d;
import p348mi.AbstractC23304d;
import p361nb.C23648e;
import p50.AbstractC24655g;
import p542ub.InterfaceC27218a;
import p649xl.C29983pb;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import q50.C25132a;
import q50.C25133b;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class SettingRingtoneViewV2 extends SlidableZaloView implements View.OnClickListener, InterfaceC23568b {
    public static final C11234a Companion = new C11234a(null);

    /* renamed from: P0 */
    private final InterfaceC24854k f56536P0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C25132a.class), new C11243j(new C11242i(this)), C11244k.f56555q);

    /* renamed from: Q0 */
    private C29983pb f56537Q0;

    /* renamed from: R0 */
    private RingtoneViewCell f56538R0;

    /* renamed from: S0 */
    private MediaPlayer f56539S0;

    /* renamed from: T0 */
    private final AudioManager.OnAudioFocusChangeListener f56540T0;

    /* renamed from: U0 */
    private final AudioAttributes f56541U0;

    /* renamed from: V0 */
    private AudioFocusRequest f56542V0;

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2$a */
    /* loaded from: classes5.dex */
    public static final class C11234a {
        private C11234a() {
        }

        public /* synthetic */ C11234a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2$b */
    /* loaded from: classes5.dex */
    public static final class C11235b extends AbstractC19075u implements InterfaceC18505l {
        C11235b() {
            super(1);
        }

        /* renamed from: a */
        public final void m58967a(int i11) {
            if (i11 == 1) {
                SettingRingtoneViewV2.this.m58962vM();
            } else if (i11 == 2) {
                SettingRingtoneViewV2.this.m58963wM();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58967a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2$c */
    /* loaded from: classes5.dex */
    public static final class C11236c extends AbstractC19075u implements InterfaceC18505l {
        C11236c() {
            super(1);
        }

        /* renamed from: a */
        public final void m58968a(boolean z11) {
            SettingRingtoneViewV2.this.m58944FM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58968a(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2$d */
    /* loaded from: classes5.dex */
    public static final class C11237d extends AbstractC19075u implements InterfaceC18505l {
        C11237d() {
            super(1);
        }

        /* renamed from: a */
        public final void m58969a(RingtoneData ringtoneData) {
            C29983pb c29983pb = null;
            if (ringtoneData != null) {
                C29983pb c29983pb2 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29983pb2 = null;
                }
                c29983pb2.f139018s.setVisibility(0);
                RingtoneViewCell ringtoneViewCell = SettingRingtoneViewV2.this.f56538R0;
                if (ringtoneViewCell == null) {
                    AbstractC19074t.m100223u("selectedMP3RingtoneView");
                    ringtoneViewCell = null;
                }
                ringtoneViewCell.setListener(SettingRingtoneViewV2.this);
                RingtoneViewCell ringtoneViewCell2 = SettingRingtoneViewV2.this.f56538R0;
                if (ringtoneViewCell2 == null) {
                    AbstractC19074t.m100223u("selectedMP3RingtoneView");
                    ringtoneViewCell2 = null;
                }
                ringtoneViewCell2.m59007b0(ringtoneData, true);
                C29983pb c29983pb3 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb3 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29983pb = c29983pb3;
                }
                c29983pb.f139012D.setVisibility(8);
                return;
            }
            C29983pb c29983pb4 = SettingRingtoneViewV2.this.f56537Q0;
            if (c29983pb4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29983pb = c29983pb4;
            }
            c29983pb.f139012D.setVisibility(0);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58969a((RingtoneData) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2$e */
    /* loaded from: classes5.dex */
    public static final class C11238e extends AbstractC19075u implements InterfaceC18505l {
        C11238e() {
            super(1);
        }

        /* renamed from: a */
        public final void m58970a(Integer num) {
            C29983pb c29983pb = null;
            if (num != null && num.intValue() == 0) {
                C29983pb c29983pb2 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29983pb2 = null;
                }
                c29983pb2.f139023x.setChecked(true);
                C29983pb c29983pb3 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb3 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29983pb3 = null;
                }
                c29983pb3.f139025z.setChecked(false);
                C29983pb c29983pb4 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb4 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29983pb = c29983pb4;
                }
                c29983pb.f139024y.setChecked(false);
            } else if (num != null && num.intValue() == 3) {
                C29983pb c29983pb5 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb5 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29983pb5 = null;
                }
                c29983pb5.f139023x.setChecked(false);
                C29983pb c29983pb6 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb6 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29983pb6 = null;
                }
                c29983pb6.f139025z.setChecked(false);
                C29983pb c29983pb7 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb7 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29983pb = c29983pb7;
                }
                c29983pb.f139024y.setChecked(true);
            } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
                C29983pb c29983pb8 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb8 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29983pb8 = null;
                }
                c29983pb8.f139023x.setChecked(false);
                C29983pb c29983pb9 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb9 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29983pb9 = null;
                }
                c29983pb9.f139025z.setChecked(true);
                C29983pb c29983pb10 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb10 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29983pb = c29983pb10;
                }
                c29983pb.f139024y.setChecked(false);
            } else {
                C29983pb c29983pb11 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb11 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29983pb11 = null;
                }
                c29983pb11.f139023x.setChecked(false);
                C29983pb c29983pb12 = SettingRingtoneViewV2.this.f56537Q0;
                if (c29983pb12 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29983pb = c29983pb12;
                }
                c29983pb.f139024y.setChecked(false);
            }
            SettingRingtoneViewV2 settingRingtoneViewV2 = SettingRingtoneViewV2.this;
            AbstractC19074t.m100205c(num);
            settingRingtoneViewV2.m58945GM(num.intValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58970a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2$f */
    /* loaded from: classes5.dex */
    public static final class C11239f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C11239f f56547q = new C11239f();

        C11239f() {
            super(1);
        }

        /* renamed from: a */
        public final void m58971a(String str) {
            AbstractC19074t.m100208f(str, "it");
            ToastUtils.showMess(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m58971a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2$g */
    /* loaded from: classes5.dex */
    public static final class C11240g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f56548t;

        /* renamed from: u */
        private /* synthetic */ Object f56549u;

        /* renamed from: v */
        final /* synthetic */ boolean f56550v;

        /* renamed from: w */
        final /* synthetic */ SettingRingtoneViewV2 f56551w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11240g(boolean z11, SettingRingtoneViewV2 settingRingtoneViewV2, Continuation continuation) {
            super(2, continuation);
            this.f56550v = z11;
            this.f56551w = settingRingtoneViewV2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public static final void m58973t(SettingRingtoneViewV2 settingRingtoneViewV2, MediaPlayer mediaPlayer) {
            settingRingtoneViewV2.m58949iM();
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C11240g c11240g = new C11240g(this.f56550v, this.f56551w, continuation);
            c11240g.f56549u = obj;
            return c11240g;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            MediaPlayer mediaPlayer;
            AbstractC28298d.m142578e();
            if (this.f56548t == 0) {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f56549u;
                boolean z11 = this.f56550v;
                final SettingRingtoneViewV2 settingRingtoneViewV2 = this.f56551w;
                synchronized (coroutineScope) {
                    try {
                        try {
                            if (z11) {
                                MediaPlayer mediaPlayer2 = settingRingtoneViewV2.f56539S0;
                                if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = settingRingtoneViewV2.f56539S0) != null) {
                                    mediaPlayer.stop();
                                }
                                MediaPlayer mediaPlayer3 = settingRingtoneViewV2.f56539S0;
                                if (mediaPlayer3 != null) {
                                    mediaPlayer3.release();
                                }
                                settingRingtoneViewV2.m58946HM();
                                settingRingtoneViewV2.f56539S0 = MediaPlayer.create(settingRingtoneViewV2.m92689tK(), AbstractC8012e0.zalo_ringtone);
                                MediaPlayer mediaPlayer4 = settingRingtoneViewV2.f56539S0;
                                if (mediaPlayer4 != null) {
                                    mediaPlayer4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.zing.zalo.ui.call.settingringtone.presenter.settingringtone.a
                                        @Override // android.media.MediaPlayer.OnCompletionListener
                                        public final void onCompletion(MediaPlayer mediaPlayer5) {
                                            SettingRingtoneViewV2.C11240g.m58973t(SettingRingtoneViewV2.this, mediaPlayer5);
                                        }
                                    });
                                }
                                MediaPlayer mediaPlayer5 = settingRingtoneViewV2.f56539S0;
                                if (mediaPlayer5 != null) {
                                    mediaPlayer5.start();
                                }
                            } else {
                                MediaPlayer mediaPlayer6 = settingRingtoneViewV2.f56539S0;
                                if (mediaPlayer6 != null && mediaPlayer6.isPlaying()) {
                                    MediaPlayer mediaPlayer7 = settingRingtoneViewV2.f56539S0;
                                    if (mediaPlayer7 != null) {
                                        mediaPlayer7.stop();
                                    }
                                    settingRingtoneViewV2.m58949iM();
                                }
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C11240g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2$h */
    /* loaded from: classes5.dex */
    public static final class C11241h implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f56552p;

        C11241h(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f56552p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f56552p;
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
            this.f56552p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2$i */
    /* loaded from: classes5.dex */
    public static final class C11242i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f56553q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11242i(ZaloView zaloView) {
            super(0);
            this.f56553q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f56553q;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2$j */
    /* loaded from: classes5.dex */
    public static final class C11243j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f56554q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11243j(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f56554q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f56554q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.settingringtone.SettingRingtoneViewV2$k */
    /* loaded from: classes5.dex */
    static final class C11244k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11244k f56555q = new C11244k();

        C11244k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C25133b();
        }
    }

    public SettingRingtoneViewV2() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = new AudioManager.OnAudioFocusChangeListener() { // from class: q50.c
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i11) {
                SettingRingtoneViewV2.m58965yM(SettingRingtoneViewV2.this, i11);
            }
        };
        this.f56540T0 = onAudioFocusChangeListener2;
        AudioAttributes build2 = new AudioAttributes.Builder().setUsage(2).build();
        this.f56541U0 = build2;
        if (Build.VERSION.SDK_INT >= 26) {
            audioAttributes = AbstractC24655g.m128195a(2).setAudioAttributes(build2);
            acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(true);
            onAudioFocusChangeListener = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(onAudioFocusChangeListener2);
            build = onAudioFocusChangeListener.build();
            AbstractC19074t.m100207e(build, "build(...)");
            this.f56542V0 = build;
        }
    }

    /* renamed from: AM */
    private final void m58939AM() {
        m58961uM().m130268t0().m9219j(this, new C19965d(new C11236c()));
    }

    /* renamed from: BM */
    private final void m58940BM() {
        m58961uM().m130271y0().m9219j(this, new C11241h(new C11237d()));
        m58961uM().m130269u0().m9219j(this, new C11241h(new C11238e()));
    }

    /* renamed from: CM */
    private final void m58941CM() {
        m58961uM().m130270x0().m9219j(this, new C19965d(C11239f.f56547q));
    }

    /* renamed from: DM */
    private final void m58942DM() {
        m58940BM();
        m58966zM();
        m58939AM();
        m58941CM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m58943EM(SettingRingtoneViewV2 settingRingtoneViewV2) {
        AbstractC19074t.m100208f(settingRingtoneViewV2, "this$0");
        settingRingtoneViewV2.m58961uM().m130260B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final Job m58944FM(boolean z11) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new C11240g(z11, this, null), 3, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public final void m58945GM(int i11) {
        C29983pb c29983pb = null;
        if (i11 != 1) {
            if (i11 != 2) {
                C29983pb c29983pb2 = this.f56537Q0;
                if (c29983pb2 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29983pb = c29983pb2;
                }
                c29983pb.f139011C.setVisibility(8);
                return;
            }
            C29983pb c29983pb3 = this.f56537Q0;
            if (c29983pb3 == null) {
                AbstractC19074t.m100223u("binding");
                c29983pb3 = null;
            }
            c29983pb3.f139011C.setText(m58960tM());
            C29983pb c29983pb4 = this.f56537Q0;
            if (c29983pb4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29983pb = c29983pb4;
            }
            c29983pb.f139011C.setVisibility(0);
            return;
        }
        C29983pb c29983pb5 = this.f56537Q0;
        if (c29983pb5 == null) {
            AbstractC19074t.m100223u("binding");
            c29983pb5 = null;
        }
        c29983pb5.f139011C.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_base_on_system_ringtone));
        C29983pb c29983pb6 = this.f56537Q0;
        if (c29983pb6 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29983pb = c29983pb6;
        }
        c29983pb.f139011C.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public final void m58946HM() {
        try {
            Object systemService = MainApplication.Companion.m35500c().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            if (AbstractC3103o.m15619h(26)) {
                AudioFocusRequest audioFocusRequest = this.f56542V0;
                if (audioFocusRequest == null) {
                    AbstractC19074t.m100223u("audioFocusRequest");
                    audioFocusRequest = null;
                }
                audioManager.requestAudioFocus(audioFocusRequest);
                return;
            }
            audioManager.requestAudioFocus(this.f56540T0, 3, 2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public final void m58949iM() {
        try {
            Object systemService = MainApplication.Companion.m35500c().getSystemService("audio");
            AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            if (AbstractC3103o.m15619h(26)) {
                AudioFocusRequest audioFocusRequest = this.f56542V0;
                if (audioFocusRequest == null) {
                    AbstractC19074t.m100223u("audioFocusRequest");
                    audioFocusRequest = null;
                }
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
                return;
            }
            audioManager.abandonAudioFocus(this.f56540T0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: tM */
    private final String m58960tM() {
        try {
            Uri parse = Uri.parse(AbstractC0924m0.m3713c7());
            if (parse == null) {
                return "";
            }
            return RingtoneManager.getRingtone(getContext(), parse).getTitle(getContext());
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: uM */
    private final C25132a m58961uM() {
        return (C25132a) this.f56536P0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public final void m58962vM() {
        C17487o0 mo35579p;
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 14);
            C24848g0 c24848g0 = C24848g0.f119245a;
            mo35579p.m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1001, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public final void m58963wM() {
        C17487o0 mo35579p;
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 17);
            C24848g0 c24848g0 = C24848g0.f119245a;
            mo35579p.m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1001, 1, true);
        }
    }

    /* renamed from: xM */
    private final void m58964xM(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i11;
        int i12;
        int i13 = 0;
        C29983pb m148371c = C29983pb.m148371c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148371c, "inflate(...)");
        this.f56537Q0 = m148371c;
        RingtoneViewCell ringtoneViewCell = new RingtoneViewCell(m92689tK());
        ringtoneViewCell.setBackgroundResource(AbstractC16803z.bg_call_setting_layout_selected_mp3_ringtone);
        ringtoneViewCell.setPadding(AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(6.0f), AbstractC23136l9.m118742r(6.0f));
        this.f56538R0 = ringtoneViewCell;
        C29983pb c29983pb = this.f56537Q0;
        C29983pb c29983pb2 = null;
        if (c29983pb == null) {
            AbstractC19074t.m100223u("binding");
            c29983pb = null;
        }
        LinearLayout linearLayout = c29983pb.f139018s;
        RingtoneViewCell ringtoneViewCell2 = this.f56538R0;
        if (ringtoneViewCell2 == null) {
            AbstractC19074t.m100223u("selectedMP3RingtoneView");
            ringtoneViewCell2 = null;
        }
        linearLayout.addView(ringtoneViewCell2);
        C29983pb c29983pb3 = this.f56537Q0;
        if (c29983pb3 == null) {
            AbstractC19074t.m100223u("binding");
            c29983pb3 = null;
        }
        RobotoTextView robotoTextView = c29983pb3.f139016q;
        if (AbstractC23304d.f113335U1) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        C29983pb c29983pb4 = this.f56537Q0;
        if (c29983pb4 == null) {
            AbstractC19074t.m100223u("binding");
            c29983pb4 = null;
        }
        RelativeLayout relativeLayout = c29983pb4.f139020u;
        if (AbstractC23304d.f113339V1) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        relativeLayout.setVisibility(i12);
        C29983pb c29983pb5 = this.f56537Q0;
        if (c29983pb5 == null) {
            AbstractC19074t.m100223u("binding");
            c29983pb5 = null;
        }
        View view = c29983pb5.f139019t;
        if (!AbstractC23304d.f113339V1) {
            i13 = 8;
        }
        view.setVisibility(i13);
        C29983pb c29983pb6 = this.f56537Q0;
        if (c29983pb6 == null) {
            AbstractC19074t.m100223u("binding");
            c29983pb6 = null;
        }
        c29983pb6.f139022w.setOnClickListener(this);
        C29983pb c29983pb7 = this.f56537Q0;
        if (c29983pb7 == null) {
            AbstractC19074t.m100223u("binding");
            c29983pb7 = null;
        }
        c29983pb7.f139021v.setOnClickListener(this);
        C29983pb c29983pb8 = this.f56537Q0;
        if (c29983pb8 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29983pb2 = c29983pb8;
        }
        c29983pb2.f139020u.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m58965yM(SettingRingtoneViewV2 settingRingtoneViewV2, int i11) {
        AbstractC19074t.m100208f(settingRingtoneViewV2, "this$0");
        if (i11 == -3 || i11 == -2 || i11 == -1) {
            try {
                MediaPlayer mediaPlayer = settingRingtoneViewV2.f56539S0;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    settingRingtoneViewV2.f56539S0 = null;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zM */
    private final void m58966zM() {
        m58961uM().m130267r0().m9219j(this, new C19965d(new C11235b()));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m58964xM(layoutInflater, viewGroup);
        C29983pb c29983pb = this.f56537Q0;
        if (c29983pb == null) {
            AbstractC19074t.m100223u("binding");
            c29983pb = null;
        }
        LinearLayout root = c29983pb.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        MediaPlayer mediaPlayer = this.f56539S0;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            m58949iM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m58961uM().m130263G0();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String str;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m58942DM();
        m58961uM().m130260B0();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 == null || (str = m92642L3.getString("SOURCE_OPEN_SETTING_RING_TONE_SCREEN")) == null) {
            str = "";
        }
        C0815e1.m2075D().m2100V(new C23648e(28, "setting_call", 1, "call_setting_ringtone_view", str, "2"), false);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingRingtoneViewV2";
    }

    @Override // n50.InterfaceC23568b
    /* renamed from: i5 */
    public void mo58771i5(InterfaceC23567a interfaceC23567a) {
        AbstractC19074t.m100208f(interfaceC23567a, "event");
        if (interfaceC23567a instanceof RingtoneData.C11204a) {
            m58961uM().m130261E0();
        } else if (interfaceC23567a instanceof RingtoneData.C11206c) {
            m58961uM().m130262F0();
        } else if (interfaceC23567a instanceof RingtoneData.C11205b) {
            m58961uM().m130262F0();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1001) {
            this.f72827B0.postDelayed(new Runnable() { // from class: q50.d
                @Override // java.lang.Runnable
                public final void run() {
                    SettingRingtoneViewV2.m58943EM(SettingRingtoneViewV2.this);
                }
            }, 100L);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.ll_select_ringtone_zing;
        if (num != null && num.intValue() == i11) {
            m58961uM().m130266m0();
            return;
        }
        int i12 = AbstractC6918a0.ll_select_ringtone_zalo;
        if (num != null && num.intValue() == i12) {
            m58961uM().m130264k0();
            return;
        }
        int i13 = AbstractC6918a0.ll_same_as_system;
        if (num != null && num.intValue() == i13) {
            m58961uM().m130265l0();
        }
    }
}
