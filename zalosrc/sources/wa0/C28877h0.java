package wa0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import au.C2357l;
import bi0.AbstractC2807a;
import com.zing.p058v4.view.AbstractC6881a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.toolstorage.detail.VoiceViewerItem;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.slider.ZdsSlider;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import dh0.C17933b;
import dj.C17945a0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import nl.C23870a;
import p019aj.C0876j;
import p164fn.C19028b;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p396ol.C24302e;
import p396ol.EnumC24298a;
import p396ol.InterfaceC24301d;
import p487rl.C25821b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import ui0.C27280g;
import vg.AbstractC28054e7;
import vm0.AbstractC28298d;
import wa0.C28877h0;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: wa0.h0 */
/* loaded from: classes6.dex */
public final class C28877h0 extends AbstractC6881a {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private int f133705t;

    /* renamed from: r */
    private ArrayList f133703r = new ArrayList();

    /* renamed from: s */
    private SparseArray f133704s = new SparseArray();

    /* renamed from: u */
    private c f133706u = c.f133728r;

    /* renamed from: v */
    private Handler f133707v = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: wa0.g0
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean m144306F;
            m144306F = C28877h0.m144306F(C28877h0.this, message);
            return m144306F;
        }
    });

    /* renamed from: wa0.h0$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wa0.h0$b */
    /* loaded from: classes6.dex */
    public final class b {

        /* renamed from: a */
        private View f133708a;

        /* renamed from: b */
        private ZdsSlider f133709b;

        /* renamed from: c */
        private ImageView f133710c;

        /* renamed from: d */
        private int f133711d;

        /* renamed from: e */
        private int f133712e;

        /* renamed from: f */
        private boolean f133713f;

        /* renamed from: g */
        private final c f133714g;

        /* renamed from: h */
        private final C33021b f133715h;

        /* renamed from: i */
        final /* synthetic */ C28877h0 f133716i;

        /* renamed from: wa0.h0$b$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f133717a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.f133726p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.f133727q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.f133728r.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f133717a = iArr;
            }
        }

        /* renamed from: wa0.h0$b$b, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C33021b implements C7853b.d {

            /* renamed from: b */
            final /* synthetic */ C28877h0 f133719b;

            C33021b(C28877h0 c28877h0) {
                this.f133719b = c28877h0;
            }

            @Override // com.zing.zalo.common.C7853b.d
            /* renamed from: a */
            public void mo40156a(String str, int i11) {
                if (!b.this.f133713f) {
                    if (b.this.f133712e < i11) {
                        b.this.f133712e = i11;
                    }
                    Handler handler = this.f133719b.f133707v;
                    Message message = new Message();
                    b bVar = b.this;
                    message.what = 2;
                    message.arg1 = bVar.f133712e;
                    handler.sendMessage(message);
                }
            }

            @Override // com.zing.zalo.common.C7853b.d
            /* renamed from: b */
            public void mo40157b(String str, String str2) {
            }

            @Override // com.zing.zalo.common.C7853b.d
            /* renamed from: c */
            public void mo40158c(String str, int i11) {
                if (!b.this.f133713f) {
                    if (b.this.f133711d < i11) {
                        b.this.f133711d = i11;
                    }
                    Handler handler = this.f133719b.f133707v;
                    Message message = new Message();
                    b bVar = b.this;
                    message.what = 1;
                    message.arg1 = bVar.f133711d;
                    handler.sendMessage(message);
                }
            }

            @Override // com.zing.zalo.common.C7853b.d
            public void onAudioFocusChange(int i11) {
            }
        }

        /* renamed from: wa0.h0$b$c */
        /* loaded from: classes6.dex */
        public static final class c extends AbstractC28054e7 {

            /* renamed from: a */
            final /* synthetic */ C28877h0 f133720a;

            c(C28877h0 c28877h0) {
                this.f133720a = c28877h0;
            }

            @Override // vg.AbstractC28054e7
            /* renamed from: b */
            public void mo64468b() {
                super.mo64468b();
                Handler handler = this.f133720a.f133707v;
                Message message = new Message();
                message.what = 3;
                message.obj = c.f133727q;
                handler.sendMessage(message);
            }

            @Override // vg.AbstractC28054e7
            /* renamed from: c */
            public void mo16497c() {
                super.mo16497c();
                Handler handler = this.f133720a.f133707v;
                Message message = new Message();
                message.what = 3;
                message.obj = c.f133726p;
                handler.sendMessage(message);
            }

            @Override // vg.AbstractC28054e7
            /* renamed from: d */
            public void mo141529d() {
                super.mo141529d();
                Handler handler = this.f133720a.f133707v;
                Message message = new Message();
                message.what = 3;
                message.obj = c.f133726p;
                handler.sendMessage(message);
            }

            @Override // vg.AbstractC28054e7
            /* renamed from: e */
            public void mo16498e() {
                super.mo16498e();
                Handler handler = this.f133720a.f133707v;
                Message message = new Message();
                message.what = 3;
                message.obj = c.f133728r;
                handler.sendMessage(message);
            }
        }

        /* renamed from: wa0.h0$b$d */
        /* loaded from: classes6.dex */
        public static final class d implements ZdsSlider.InterfaceC17047c {

            /* renamed from: a */
            private int f133721a;

            /* renamed from: c */
            final /* synthetic */ C28877h0 f133723c;

            /* renamed from: d */
            final /* synthetic */ VoiceViewerItem f133724d;

            /* renamed from: e */
            final /* synthetic */ int f133725e;

            d(C28877h0 c28877h0, VoiceViewerItem voiceViewerItem, int i11) {
                this.f133723c = c28877h0;
                this.f133724d = voiceViewerItem;
                this.f133725e = i11;
            }

            @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
            /* renamed from: a */
            public void mo45797a() {
                if (this.f133723c.m144311D() == c.f133728r) {
                    b.this.m144325o(this.f133724d, true);
                }
                C7853b.Companion.m40150a().m40116Y0(this.f133721a);
                b.this.f133713f = false;
            }

            @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
            /* renamed from: b */
            public void mo45798b(float f11) {
                if (b.this.f133713f) {
                    this.f133721a = (int) ((this.f133725e * f11) / 100);
                    b.this.m144332l().m91246m(ZdsSlider.EnumC17049e.TEXT, C2357l.f9883a.m12352b(this.f133721a, false));
                    b.this.f133712e = (int) f11;
                    b.this.f133711d = this.f133721a;
                }
            }

            @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
            /* renamed from: c */
            public void mo45799c() {
                b.this.f133713f = true;
            }
        }

        public b(C28877h0 c28877h0, View view) {
            AbstractC19074t.m100208f(view, "view");
            this.f133716i = c28877h0;
            this.f133708a = view;
            this.f133711d = -1;
            this.f133712e = -1;
            View findViewById = view.findViewById(AbstractC6918a0.slider_duration);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f133709b = (ZdsSlider) findViewById;
            View findViewById2 = view.findViewById(AbstractC6918a0.btn_play);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            this.f133710c = (ImageView) findViewById2;
            this.f133714g = new c(c28877h0);
            this.f133715h = new C33021b(c28877h0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public final void m144325o(VoiceViewerItem voiceViewerItem, boolean z11) {
            String m75062d;
            if (this.f133716i.m144311D() == c.f133728r) {
                if (!z11) {
                    this.f133712e = -1;
                    this.f133711d = -1;
                }
                if (voiceViewerItem != null && (m75062d = voiceViewerItem.m75062d()) != null) {
                    C7853b.a aVar = C7853b.Companion;
                    aVar.m40150a().m40094E0(m75062d, this.f133711d, this.f133714g, true, true);
                    this.f133709b.m91247n(ZdsSlider.EnumC17051g.TEXT, C2357l.f9883a.m12352b(aVar.m40150a().m40114X(m75062d), false));
                }
                C7853b.Companion.m40150a().m40127f1(this.f133715h);
                return;
            }
            C7853b.Companion.m40150a().m40111V0();
        }

        /* renamed from: p */
        static /* synthetic */ void m144326p(b bVar, VoiceViewerItem voiceViewerItem, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            bVar.m144325o(voiceViewerItem, z11);
        }

        /* renamed from: q */
        private final void m144327q(final VoiceViewerItem voiceViewerItem, int i11) {
            ZdsSlider zdsSlider = this.f133709b;
            zdsSlider.setSliderType(ZdsSlider.EnumC17052h.SINGLE_THUMB_SLIDER);
            zdsSlider.m91245l(0.0f, 100.0f);
            int m40114X = C7853b.Companion.m40150a().m40114X(voiceViewerItem.m75062d());
            this.f133709b.m91247n(ZdsSlider.EnumC17051g.TEXT, C2357l.f9883a.m12352b(m40114X, false));
            this.f133709b.setListener(new d(this.f133716i, voiceViewerItem, m40114X));
            ImageView imageView = this.f133710c;
            final C28877h0 c28877h0 = this.f133716i;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: wa0.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C28877h0.b.m144328r(C28877h0.this, this, voiceViewerItem, view);
                }
            });
            if (this.f133716i.f133705t == i11) {
                m144326p(this, voiceViewerItem, false, 2, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public static final void m144328r(C28877h0 c28877h0, b bVar, VoiceViewerItem voiceViewerItem, View view) {
            AbstractC19074t.m100208f(c28877h0, "this$0");
            AbstractC19074t.m100208f(bVar, "this$1");
            AbstractC19074t.m100208f(voiceViewerItem, "$voiceViewerItem");
            int i11 = a.f133717a[c28877h0.m144311D().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        m144326p(bVar, voiceViewerItem, false, 2, null);
                        return;
                    }
                    return;
                }
                C7853b.Companion.m40150a().m40111V0();
                return;
            }
            C7853b.Companion.m40150a().m40090A0();
        }

        /* renamed from: i */
        public final ImageView m144329i() {
            return this.f133710c;
        }

        /* renamed from: j */
        public final Drawable m144330j(c cVar, Context context) {
            AbstractC19074t.m100208f(cVar, "voiceState");
            AbstractC19074t.m100208f(context, "context");
            if (cVar == c.f133726p) {
                return C27280g.m139660c(context, AbstractC23322a.zds_ic_pause_line_24, AbstractC2807a.icon_01);
            }
            return C27280g.m139660c(context, AbstractC23322a.zds_ic_play_line_24, AbstractC2807a.icon_01);
        }

        /* renamed from: k */
        public final View m144331k() {
            return this.f133708a;
        }

        /* renamed from: l */
        public final ZdsSlider m144332l() {
            return this.f133709b;
        }

        /* renamed from: m */
        public final void m144333m(VoiceViewerItem voiceViewerItem, int i11) {
            if (voiceViewerItem != null) {
                m144327q(voiceViewerItem, i11);
            }
        }

        /* renamed from: n */
        public final void m144334n(int i11) {
            VoiceViewerItem m144305C = this.f133716i.m144305C(i11);
            this.f133716i.m144316J(c.f133728r);
            m144326p(this, m144305C, false, 2, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: wa0.h0$c */
    /* loaded from: classes6.dex */
    public static final class c {

        /* renamed from: p */
        public static final c f133726p = new c("PLAYING", 0);

        /* renamed from: q */
        public static final c f133727q = new c("PAUSE", 1);

        /* renamed from: r */
        public static final c f133728r = new c("STOP", 2);

        /* renamed from: s */
        private static final /* synthetic */ c[] f133729s;

        /* renamed from: t */
        private static final /* synthetic */ InterfaceC30165a f133730t;

        static {
            c[] m144335b = m144335b();
            f133729s = m144335b;
            f133730t = AbstractC30166b.m148796a(m144335b);
        }

        private c(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ c[] m144335b() {
            return new c[]{f133726p, f133727q, f133728r};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f133729s.clone();
        }
    }

    /* renamed from: wa0.h0$d */
    /* loaded from: classes6.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f133731t;

        /* renamed from: u */
        final /* synthetic */ boolean f133732u;

        /* renamed from: v */
        final /* synthetic */ C28877h0 f133733v;

        /* renamed from: w */
        final /* synthetic */ int f133734w;

        /* renamed from: wa0.h0$d$a */
        /* loaded from: classes6.dex */
        public static final class a implements InterfaceC24301d {

            /* renamed from: a */
            final /* synthetic */ C25821b f133735a;

            /* renamed from: b */
            final /* synthetic */ C28877h0 f133736b;

            /* renamed from: c */
            final /* synthetic */ int f133737c;

            a(C25821b c25821b, C28877h0 c28877h0, int i11) {
                this.f133735a = c25821b;
                this.f133736b = c28877h0;
                this.f133737c = i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: i */
            public static final void m144339i(C25821b c25821b, String str, C28877h0 c28877h0, int i11) {
                AbstractC19074t.m100208f(c25821b, "$cloudMediaItem");
                AbstractC19074t.m100208f(str, "$path");
                AbstractC19074t.m100208f(c28877h0, "this$0");
                C23744a.Companion.m124119a().m124116d(210, c25821b.m133146i(), str, Boolean.TRUE);
                ((VoiceViewerItem) c28877h0.f133703r.get(i11)).m75068k(str);
                c28877h0.m144314H(i11);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: j */
            public static final void m144340j() {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_unable_to_access_this_item));
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: a */
            public void mo66919a(String str, long j11) {
                AbstractC19074t.m100208f(str, "downloadId");
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: b */
            public boolean mo66920b() {
                return true;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: c */
            public EnumC24298a mo66921c() {
                return EnumC24298a.f117298q;
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: d */
            public void mo66922d(String str, int i11, String str2) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "errorMessage");
                AbstractC19444a.m101697e(new Runnable() { // from class: wa0.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28877h0.d.a.m144340j();
                    }
                });
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: e */
            public void mo66923e(String str, final String str2) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(str2, "path");
                final C25821b c25821b = this.f133735a;
                final C28877h0 c28877h0 = this.f133736b;
                final int i11 = this.f133737c;
                AbstractC19444a.m101697e(new Runnable() { // from class: wa0.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28877h0.d.a.m144339i(C25821b.this, str2, c28877h0, i11);
                    }
                });
            }

            @Override // p396ol.InterfaceC24301d
            /* renamed from: h */
            public int mo66924h() {
                return InterfaceC24301d.a.m126884a(this);
            }
        }

        /* renamed from: wa0.h0$d$b */
        /* loaded from: classes6.dex */
        public static final class b implements C17945a0.x {

            /* renamed from: p */
            final /* synthetic */ C17945a0 f133738p;

            /* renamed from: q */
            final /* synthetic */ C28877h0 f133739q;

            /* renamed from: r */
            final /* synthetic */ int f133740r;

            b(C17945a0 c17945a0, C28877h0 c28877h0, int i11) {
                this.f133738p = c17945a0;
                this.f133739q = c28877h0;
                this.f133740r = i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: b */
            public static final void m144342b(C17945a0 c17945a0, String str, C28877h0 c28877h0, int i11) {
                AbstractC19074t.m100208f(c28877h0, "this$0");
                C23744a.Companion.m124119a().m124116d(210, c17945a0.m95029V3(), str, Boolean.FALSE);
                VoiceViewerItem voiceViewerItem = (VoiceViewerItem) c28877h0.f133703r.get(i11);
                if (str == null) {
                    str = "";
                }
                voiceViewerItem.m75068k(str);
                c28877h0.m144314H(i11);
            }

            @Override // dj.C17945a0.x
            /* renamed from: G */
            public void mo61268G(int i11, MessageId messageId) {
            }

            @Override // dj.C17945a0.x
            /* renamed from: H */
            public void mo61269H(MessageId messageId, boolean z11) {
            }

            @Override // dj.C17945a0.x
            /* renamed from: m */
            public void mo61273m(int i11, MessageId messageId) {
            }

            @Override // dj.C17945a0.x
            /* renamed from: s */
            public void mo61274s(MessageId messageId, final String str, boolean z11) {
                final C17945a0 c17945a0 = this.f133738p;
                final C28877h0 c28877h0 = this.f133739q;
                final int i11 = this.f133740r;
                AbstractC19444a.m101697e(new Runnable() { // from class: wa0.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28877h0.d.b.m144342b(C17945a0.this, str, c28877h0, i11);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: wa0.h0$d$c */
        /* loaded from: classes6.dex */
        public static final class c extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f133741t;

            c(Continuation continuation) {
                super(2, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new c(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f133741t == 0) {
                    AbstractC24862s.m129228b(obj);
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_zcloud_unable_to_access_this_item));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z11, C28877h0 c28877h0, int i11, Continuation continuation) {
            super(2, continuation);
            this.f133732u = z11;
            this.f133733v = c28877h0;
            this.f133734w = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f133732u, this.f133733v, this.f133734w, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            MessageId messageId;
            MessageId m75063e;
            C25821b c25821b;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f133731t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    c25821b = (C25821b) obj;
                    if (c25821b != null) {
                        return C24848g0.f119245a;
                    }
                    C24302e.Companion.m126919j().m126908q(c25821b, new a(c25821b, this.f133733v, this.f133734w));
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (this.f133732u) {
                    C23870a m120679j2 = AbstractC23306f.m120679j2();
                    VoiceViewerItem m144305C = this.f133733v.m144305C(this.f133734w);
                    if (m144305C != null && (m75063e = m144305C.m75063e()) != null) {
                        this.f133731t = 1;
                        obj = m120679j2.m124794V(m75063e, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c25821b = (C25821b) obj;
                        if (c25821b != null) {
                        }
                    } else {
                        return C24848g0.f119245a;
                    }
                } else {
                    C0876j m120584H0 = AbstractC23306f.m120584H0();
                    VoiceViewerItem m144305C2 = this.f133733v.m144305C(this.f133734w);
                    if (m144305C2 != null) {
                        messageId = m144305C2.m75063e();
                    } else {
                        messageId = null;
                    }
                    C17945a0 m2635r = m120584H0.m2635r(messageId);
                    if (m2635r != null) {
                        m2635r.m94859Bb(new b(m2635r, this.f133733v, this.f133734w));
                        m2635r.m94891Fa(true);
                        m2635r.m94980Pb(C19028b.a.m100098b(C19028b.Companion, C19028b.b.f94843p, true, false, 4, null), true);
                    } else {
                        MainCoroutineDispatcher m112681c = Dispatchers.m112681c();
                        c cVar = new c(null);
                        this.f133731t = 2;
                        if (BuildersKt.m112534g(m112681c, cVar, this) == m142578e) {
                            return m142578e;
                        }
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: B */
    private final b m144304B(int i11) {
        return (b) this.f133704s.get(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final VoiceViewerItem m144305C(int i11) {
        if (this.f133703r.size() >= i11 && i11 >= 0) {
            return (VoiceViewerItem) this.f133703r.get(i11);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final boolean m144306F(C28877h0 c28877h0, Message message) {
        ZdsSlider m144332l;
        ZdsSlider m144332l2;
        ImageView m144329i;
        AbstractC19074t.m100208f(c28877h0, "this$0");
        AbstractC19074t.m100208f(message, "message");
        int i11 = message.what;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    b m144304B = c28877h0.m144304B(c28877h0.f133705t);
                    Object obj = message.obj;
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.ui.toolstorage.detail.ToolStorageVoiceViewerAdapter.VoiceState");
                    c cVar = (c) obj;
                    c28877h0.f133706u = cVar;
                    if (m144304B != null && (m144329i = m144304B.m144329i()) != null) {
                        Context context = m144304B.m144331k().getContext();
                        AbstractC19074t.m100207e(context, "getContext(...)");
                        m144329i.setImageDrawable(m144304B.m144330j(cVar, context));
                    }
                }
            } else {
                b m144304B2 = c28877h0.m144304B(c28877h0.f133705t);
                if (m144304B2 != null && (m144332l2 = m144304B2.m144332l()) != null) {
                    m144332l2.setSliderValue(message.arg1);
                }
            }
        } else {
            b m144304B3 = c28877h0.m144304B(c28877h0.f133705t);
            if (m144304B3 != null && (m144332l = m144304B3.m144332l()) != null) {
                m144332l.m91246m(ZdsSlider.EnumC17049e.TEXT, C2357l.f9883a.m12352b(message.arg1, false));
            }
        }
        return false;
    }

    /* renamed from: D */
    public final c m144311D() {
        return this.f133706u;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public View mo35339k(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "container");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.voice_pager_view, viewGroup, false);
        AbstractC19074t.m100205c(inflate);
        b bVar = new b(this, inflate);
        bVar.m144333m(m144305C(i11), i11);
        viewGroup.addView(bVar.m144331k());
        this.f133704s.put(i11, bVar);
        return bVar.m144331k();
    }

    /* renamed from: G */
    public final void m144313G(int i11, boolean z11) {
        BuildersKt__Builders_commonKt.m112540d(C17933b.f90533a.m94579d(), null, null, new d(z11, this, i11, null), 3, null);
    }

    /* renamed from: H */
    public final void m144314H(int i11) {
        this.f133705t = i11;
        b m144304B = m144304B(i11);
        if (m144304B == null) {
            return;
        }
        m144304B.m144334n(i11);
    }

    /* renamed from: I */
    public final void m144315I(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "voiceList");
        this.f133703r.clear();
        this.f133703r.addAll(arrayList);
        mo35341m();
    }

    /* renamed from: J */
    public final void m144316J(c cVar) {
        AbstractC19074t.m100208f(cVar, "<set-?>");
        this.f133706u = cVar;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: d */
    public void mo35332d(ViewGroup viewGroup, int i11, Object obj) {
        AbstractC19074t.m100208f(viewGroup, "container");
        AbstractC19074t.m100208f(obj, "object");
        viewGroup.removeView((View) obj);
        this.f133704s.remove(i11);
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f133703r.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: h */
    public int mo35336h(Object obj) {
        AbstractC19074t.m100208f(obj, "object");
        return -2;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: l */
    public boolean mo35340l(View view, Object obj) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(obj, "object");
        return AbstractC19074t.m100204b(view, obj);
    }
}
