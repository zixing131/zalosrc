package com.zing.zalo.p077ui.chat.detail;

import a30.C0107f;
import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import ag0.C0810d;
import am.AbstractC0939u;
import am.C0943w;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC1801w;
import androidx.recyclerview.widget.LinearLayoutManager;
import b40.C2526d;
import be0.C2779d;
import be0.C2780e;
import be0.C2784i;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.media.download.AbstractC9003a;
import com.zing.zalo.media.download.AbstractC9010h;
import com.zing.zalo.p077ui.chat.AbstractC11316a;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.p077ui.chat.C11603g0;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.chat.detail.ChatDetailsView;
import com.zing.zalo.p077ui.widget.recyclerview.TouchListView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalocore.CoreUtility;
import cu.AbstractC17574a;
import dj.C17945a0;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import hu.AbstractC20130d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23009a3;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23238v2;
import me0.AbstractC23258x2;
import mm0.AbstractC23350e;
import p056cj.C3535c;
import p105dn.EnumC18030a;
import p142ey.C18644n;
import p175g0.AbstractC19182e;
import p185gc.AbstractC19378b;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p405ov.C24561c;
import p461qu.AbstractC25495a;
import p511sw.C26393b;
import p559uv.C27373c;
import p656xs.C30202c;
import p716zh.C31948ha;
import p716zh.C31967j;
import p716zh.C31973j5;
import p716zh.C31986k3;
import th.AbstractC26689j;
import vg.AbstractC28054e7;

/* loaded from: classes5.dex */
public class ChatDetailsView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: i1 */
    private static final String f59752i1 = "ChatDetailsView";

    /* renamed from: P0 */
    private C11603g0 f59753P0;

    /* renamed from: Q0 */
    private TouchListView f59754Q0;

    /* renamed from: R0 */
    private C23528a f59755R0;

    /* renamed from: S0 */
    private MessageId f59756S0;

    /* renamed from: T0 */
    private String f59757T0;

    /* renamed from: V0 */
    private View f59759V0;

    /* renamed from: W0 */
    private C3535c f59760W0;

    /* renamed from: X0 */
    private ChatView f59761X0;

    /* renamed from: Y0 */
    private EnumC18030a f59762Y0;

    /* renamed from: Z0 */
    private InterfaceC11577h f59763Z0;

    /* renamed from: b1 */
    private View f59765b1;

    /* renamed from: f1 */
    AbstractC9010h.a f59769f1;

    /* renamed from: g1 */
    boolean f59770g1;

    /* renamed from: U0 */
    private boolean f59758U0 = false;

    /* renamed from: a1 */
    private String f59764a1 = "";

    /* renamed from: c1 */
    private final AtomicBoolean f59766c1 = new AtomicBoolean(false);

    /* renamed from: d1 */
    private final AtomicBoolean f59767d1 = new AtomicBoolean(false);

    /* renamed from: e1 */
    private final Handler f59768e1 = new HandlerC11570a(Looper.getMainLooper());

    /* renamed from: h1 */
    boolean f59771h1 = false;

    /* renamed from: com.zing.zalo.ui.chat.detail.ChatDetailsView$a */
    /* loaded from: classes5.dex */
    class HandlerC11570a extends Handler {
        HandlerC11570a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0) {
                try {
                    ChatDetailsView.this.m62778eN();
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            super.handleMessage(message);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.detail.ChatDetailsView$b */
    /* loaded from: classes5.dex */
    class C11571b implements AbstractC11316a.a {
        C11571b() {
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: A */
        public boolean mo60394A(String str, MessageId messageId) {
            try {
                return ChatDetailsView.this.m62804KM(str, messageId);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return false;
            }
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: O0 */
        public void mo60395O0(int i11, String str, MessageId messageId) {
            try {
                ChatDetailsView.this.m62808TM(i11, str, messageId);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: P0 */
        public void mo60396P0(ChatRow chatRow) {
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: Q0 */
        public void mo60397Q0() {
            ChatDetailsView.this.m62814aN();
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: R0 */
        public boolean mo60398R0() {
            if (ChatDetailsView.this.f59762Y0 == EnumC18030a.SINGLE_PAGE) {
                return true;
            }
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: S */
        public boolean mo60399S(C17945a0 c17945a0) {
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: S0 */
        public boolean mo60400S0(String str) {
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: T0 */
        public void mo60401T0() {
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: h0 */
        public boolean mo60402h0(C17945a0 c17945a0) {
            return false;
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: i0 */
        public void mo60403i0() {
            AbstractC23034c6.m118184v0(ChatDetailsView.this, AbstractC23034c6.f112036m, 0);
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: j */
        public void mo60404j(C7853b.b bVar) {
            C31967j.m153687a().m153693g(bVar);
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: k */
        public void mo60405k() {
            ChatDetailsView.this.m62815bN();
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: m */
        public void mo60406m(C7853b.d dVar) {
            C31967j.m153687a().m153694h(dVar);
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: o */
        public void mo60407o() {
        }

        @Override // com.zing.zalo.p077ui.chat.AbstractC11316a.a
        /* renamed from: z */
        public boolean mo60408z(C17945a0 c17945a0) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.detail.ChatDetailsView$c */
    /* loaded from: classes5.dex */
    public class C11572c implements AbstractC19378b.a {
        C11572c() {
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(C2784i.b bVar) {
            if (bVar.m13413a() != null) {
                ChatDetailsView.this.m62775VM(bVar.m13413a());
            }
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: b */
        public void mo1004b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.detail.ChatDetailsView$d */
    /* loaded from: classes5.dex */
    public class C11573d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f59775a;

        C11573d(C17945a0 c17945a0) {
            this.f59775a = c17945a0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int i11;
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f59775a);
                if (this.f59775a.m95032V6()) {
                    if (this.f59775a.m94847A6()) {
                        ChatDetailsView.this.m62797yM(arrayList, this.f59775a.mo95039W2());
                        C31973j5 m4472f = C0943w.m4462l().m4472f(this.f59775a.m94853B3());
                        if (m4472f != null && m4472f.m153747Y()) {
                            ChatDetailsView.this.m62798zM(arrayList, this.f59775a);
                        } else if (m4472f == null || !C30202c.f140315a.m148952c(m4472f) || m4472f.m153742T() || !m4472f.m153768k0()) {
                            ChatDetailsView.this.m62796xM(arrayList, this.f59775a);
                        } else {
                            ChatDetailsView.this.m62760AM(arrayList, this.f59775a);
                        }
                    } else {
                        ChatDetailsView.this.f59766c1.set(!AbstractC23309i.m121490Ud());
                        if (ChatDetailsView.this.f59766c1.get()) {
                            ChatDetailsView.this.m62797yM(arrayList, this.f59775a.mo95039W2());
                            arrayList.add(new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", this.f59775a.mo95039W2(), CoreUtility.f89233i), -3).m95365a());
                        }
                    }
                }
                C31986k3 c31986k3 = C31986k3.f147083a;
                if (c31986k3.m154105P1(this.f59775a.mo95039W2()) && c31986k3.m154110T1()) {
                    if (((C17945a0) arrayList.get(arrayList.size() - 1)).m95041W4() != -8) {
                        ChatDetailsView.this.m62797yM(arrayList, this.f59775a.mo95039W2());
                    }
                    MessageId m41036c = MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", this.f59775a.mo95039W2(), CoreUtility.f89233i);
                    if (this.f59775a.m95170j6()) {
                        i11 = -6;
                    } else {
                        i11 = -7;
                    }
                    arrayList.add(new C17945a0.w(m41036c, i11).m95365a());
                }
                ChatDetailsView.this.m62776ZM(arrayList);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.detail.ChatDetailsView$e */
    /* loaded from: classes5.dex */
    public class C11574e extends AbstractC28054e7 {

        /* renamed from: a */
        final /* synthetic */ MessageId f59777a;

        C11574e(MessageId messageId) {
            this.f59777a = messageId;
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: a */
        public void mo16496a(int i11) {
            ChatDetailsView.this.m62815bN();
            C0107f.m476a().m478c(this.f59777a, 0);
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: e */
        public void mo16498e() {
            ChatDetailsView.this.m62815bN();
            C0107f.m476a().m478c(this.f59777a, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.detail.ChatDetailsView$f */
    /* loaded from: classes5.dex */
    public class C11575f implements AbstractC9003a.a {
        C11575f() {
        }

        @Override // com.zing.zalo.media.download.AbstractC9003a.a
        /* renamed from: a */
        public void mo48123a(int i11) {
            String unused = ChatDetailsView.f59752i1;
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122776f(ChatDetailsView.f59752i1, e11);
            }
            if (ChatDetailsView.this.f59761X0 != null && !ChatDetailsView.this.f59761X0.mo60294yp() && ChatDetailsView.this.f59761X0.mo59727Ly()) {
                ChatDetailsView.this.f59770g1 = true;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.video_download_msg_fail));
                ChatDetailsView.this.m62818iv();
                ChatDetailsView.this.f59771h1 = false;
            }
        }

        @Override // com.zing.zalo.media.download.InterfaceC9009g
        /* renamed from: b */
        public void mo48147b(int i11) {
        }

        @Override // com.zing.zalo.media.download.AbstractC9003a.a
        /* renamed from: c */
        public void mo48124c() {
            String unused = ChatDetailsView.f59752i1;
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122776f(ChatDetailsView.f59752i1, e11);
            }
            if (ChatDetailsView.this.f59761X0 != null && !ChatDetailsView.this.f59761X0.mo60294yp() && ChatDetailsView.this.f59761X0.mo59727Ly()) {
                if (ChatDetailsView.this.f59769f1.m48161h()) {
                    AbstractC23152n3.m118997G0(ChatDetailsView.this.m92648SI(), ChatDetailsView.this.f59769f1.m48158e());
                }
                ChatDetailsView.this.m62818iv();
                ChatDetailsView.this.f59771h1 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.detail.ChatDetailsView$g */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C11576g {

        /* renamed from: a */
        static final /* synthetic */ int[] f59780a;

        static {
            int[] iArr = new int[EnumC18030a.values().length];
            f59780a = iArr;
            try {
                iArr[EnumC18030a.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59780a[EnumC18030a.SINGLE_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59780a[EnumC18030a.SINGLE_USER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.detail.ChatDetailsView$h */
    /* loaded from: classes5.dex */
    public interface InterfaceC11577h {
        /* renamed from: C1 */
        void mo59586C1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public void m62760AM(List list, C17945a0 c17945a0) {
        list.add(new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", c17945a0.mo95039W2(), CoreUtility.f89233i), -4).m95365a());
    }

    /* renamed from: BM */
    private void m62761BM() {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: a60.a
            @Override // java.lang.Runnable
            public final void run() {
                ChatDetailsView.this.m62769NM();
            }
        });
    }

    /* renamed from: DM */
    private void m62762DM(final MessageId messageId, final C17945a0 c17945a0) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: a60.b
            @Override // java.lang.Runnable
            public final void run() {
                ChatDetailsView.m62770OM(C17945a0.this, messageId);
            }
        });
    }

    /* renamed from: EM */
    private void m62763EM(C3535c c3535c) {
        C17945a0 c17945a0;
        if (c3535c == null) {
            return;
        }
        try {
            this.f59753P0.m64563k2(c3535c);
            this.f59753P0.m64561h2();
            C26393b m136076v = c3535c.m136076v();
            if (m136076v != null) {
                c17945a0 = (C17945a0) m136076v.m136005e();
            } else {
                c17945a0 = null;
            }
            if (c17945a0 != null) {
                m62816dN(c17945a0);
                return;
            }
            ChatView chatView = this.f59761X0;
            if (chatView != null) {
                chatView.mo60122my(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: FM */
    private C17945a0 m62764FM() {
        C26393b m136076v;
        C3535c c3535c = this.f59760W0;
        if (c3535c == null || (m136076v = c3535c.m136076v()) == null) {
            return null;
        }
        return (C17945a0) m136076v.m136005e();
    }

    /* renamed from: JM */
    private boolean m62765JM() {
        C3535c m2634q;
        if (TextUtils.isEmpty(this.f59757T0) || this.f59756S0 == null || !C11318b.m60507e().m60520o(this.f59757T0) || (m2634q = AbstractC23306f.m120584H0().m2634q(this.f59757T0)) == null || this.f59762Y0 == null) {
            return false;
        }
        try {
            C3535c c3535c = new C3535c(m2634q.m17971y0());
            this.f59760W0 = c3535c;
            m62817fN(c3535c, this.f59762Y0);
            synchronized (m2634q) {
                try {
                    C26393b m136076v = m2634q.m136076v();
                    if (m136076v != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= m136076v.m136016p()) {
                                break;
                            }
                            C17945a0 c17945a0 = (C17945a0) m136076v.m136006f(i11);
                            if (c17945a0.m95135f9(this.f59756S0)) {
                                this.f59760W0.m17966s0(c17945a0);
                                AbstractC23306f.m120635Y0().m101501b(new C2784i.a(c17945a0.mo95039W2(), c17945a0), new C11572c());
                                break;
                            }
                            i11++;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            m62763EM(this.f59760W0);
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f59752i1, e11);
            return false;
        }
    }

    /* renamed from: K7 */
    private C27373c m62766K7() {
        try {
            C17945a0 m62764FM = m62764FM();
            if (m62764FM != null && m62764FM.m95306y8()) {
                return AbstractC19646n0.m102936U0(m62764FM);
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public /* synthetic */ void m62767LM() {
        this.f59753P0.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public /* synthetic */ void m62768MM() {
        ChatView chatView = this.f59761X0;
        if (chatView != null) {
            chatView.invalidateOptionsMenu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public /* synthetic */ void m62769NM() {
        boolean z11;
        boolean z12;
        C17945a0 m62764FM = m62764FM();
        if (m62764FM == null) {
            return;
        }
        boolean m94847A6 = m62764FM.m94847A6();
        C31973j5 m4472f = C0943w.m4462l().m4472f(m62764FM.m94853B3());
        boolean z13 = false;
        if (m4472f != null && C30202c.f140315a.m148952c(m4472f) && this.f59767d1.get() != m4472f.m153768k0()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m94847A6 && !this.f59767d1.get() && this.f59766c1.get() == AbstractC23309i.m121490Ud()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m62764FM.m95219o8() || m62764FM.m95091b6()) {
            z13 = true;
        }
        if (!z11 && !z12 && !z13) {
            AbstractC19444a.m101695c(new Runnable() { // from class: a60.d
                @Override // java.lang.Runnable
                public final void run() {
                    ChatDetailsView.this.m62767LM();
                }
            });
        } else {
            m62814aN();
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: a60.e
            @Override // java.lang.Runnable
            public final void run() {
                ChatDetailsView.this.m62768MM();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public static /* synthetic */ void m62770OM(C17945a0 c17945a0, MessageId messageId) {
        try {
            String str = f59752i1;
            C24561c.m127942b(str, "Detail of msg: " + c17945a0);
            if (AbstractC23306f.m120633X1().m89807v() && AbstractC23306f.m120691m2().m2466q()) {
                C24561c.m127942b(str, "Detail of Cloud Item: " + AbstractC23306f.m120679j2().m124795W(messageId));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f59752i1, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public /* synthetic */ void m62771PM(String str, C17945a0 c17945a0) {
        String str2;
        try {
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                m62813YM(str, c17945a0.m95041W4());
                return;
            }
            C23528a c23528a = this.f59755R0;
            String str3 = "";
            if (c23528a != null && c23528a.m123603i(str) != null) {
                str3 = this.f59755R0.m123603i(str).getAbsolutePath();
            }
            if (str3.length() > 0) {
                try {
                    File file = new File(str3);
                    if (file.exists()) {
                        int m62801GM = m62801GM(file);
                        if (m62801GM == -1) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.photo_unsupport_type_msg));
                            this.f59758U0 = false;
                            return;
                        }
                        if (m62801GM != 1) {
                            if (m62801GM == 2) {
                                str2 = ".png";
                            } else {
                                throw new IllegalArgumentException("Invalid photo type: " + m62801GM);
                            }
                        } else {
                            str2 = ".jpg";
                        }
                        String str4 = AbstractC20130d.m104874i0() + str3.substring(str3.lastIndexOf(47) + 1) + str2;
                        File file2 = new File(str3);
                        File file3 = new File(str4);
                        if (file2.exists() && !file3.exists()) {
                            FileInputStream fileInputStream = new FileInputStream(file2);
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            FileChannel channel = fileInputStream.getChannel();
                            fileOutputStream.getChannel().transferFrom(channel, 0L, channel.size());
                            fileInputStream.close();
                            fileOutputStream.close();
                        }
                        if (file3.exists()) {
                            m62813YM(str4, c17945a0.m95041W4());
                            return;
                        } else {
                            m62813YM(str3, c17945a0.m95041W4());
                            return;
                        }
                    }
                    this.f59758U0 = false;
                    return;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    this.f59758U0 = false;
                    return;
                }
            }
            this.f59758U0 = false;
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
            this.f59758U0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public /* synthetic */ void m62772QM() {
        this.f59753P0.m64563k2(this.f59760W0);
        this.f59753P0.m64561h2();
    }

    /* renamed from: RM */
    private void m62773RM(C17945a0 c17945a0) {
        C0810d.m2053b(new C11573d(c17945a0));
    }

    /* renamed from: SM */
    public static ChatDetailsView m62774SM(String str, MessageId messageId, EnumC18030a enumC18030a, String str2, String str3) {
        ChatDetailsView chatDetailsView = new ChatDetailsView();
        Bundle bundle = new Bundle();
        bundle.putString("thread_id", str);
        bundle.putParcelable("chat_content_id", messageId);
        bundle.putSerializable("chat_mode", enumC18030a);
        bundle.putString("STR_SOURCE_START_VIEW", str2);
        bundle.putString("STR_LOG_CHAT_TYPE", str3);
        chatDetailsView.mo60305zK(bundle);
        return chatDetailsView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public void m62775VM(C17945a0 c17945a0) {
        if (c17945a0 == null) {
            return;
        }
        try {
            if (!c17945a0.m95135f9(this.f59756S0)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("refreshMsgDetailInfo(): messageId ");
                sb2.append(c17945a0.m95029V3());
                sb2.append(" is invalid");
                return;
            }
            if (this.f59760W0.m17971y0().m41013q() || !this.f59760W0.m17971y0().m41015u()) {
                m62773RM(c17945a0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f59752i1, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZM */
    public void m62776ZM(List list) {
        this.f59760W0.m136061d0(list);
        mo70710wy(new Runnable() { // from class: a60.f
            @Override // java.lang.Runnable
            public final void run() {
                ChatDetailsView.this.m62772QM();
            }
        });
    }

    /* renamed from: cN */
    private void m62777cN() {
        if (!C31948ha.m153587d().m153595i() && !C31948ha.m153587d().m153596j() && C31967j.m153687a().m153688b()) {
            m62815bN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eN */
    public void m62778eN() {
        try {
            C11603g0 c11603g0 = this.f59753P0;
            if (c11603g0 != null) {
                c11603g0.m64561h2();
            }
            m62775VM(m62764FM());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public void m62796xM(List list, C17945a0 c17945a0) {
        float f11;
        String m94853B3 = c17945a0.m94853B3();
        HashSet hashSet = new HashSet(((C2780e.b) AbstractC23306f.m120649c0().m101509a(new C2780e.a(m94853B3, c17945a0.m95029V3()))).m13396a());
        HashSet hashSet2 = new HashSet(((C2779d.b) AbstractC23306f.m120645b0().m101509a(new C2779d.a(m94853B3, c17945a0.m95029V3()))).m13392a());
        this.f59766c1.set(!AbstractC23309i.m121490Ud());
        if (this.f59766c1.get()) {
            hashSet2.addAll(hashSet);
            hashSet.clear();
        } else {
            hashSet2.removeAll(hashSet);
        }
        ArrayList arrayList = new ArrayList(hashSet);
        ArrayList arrayList2 = new ArrayList(hashSet2);
        if (this.f59766c1.get()) {
            C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", c17945a0.mo95039W2(), CoreUtility.f89233i), -2).m95382r(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.seen_message_state)).m95365a();
            m95365a.m95317za(AbstractC23136l9.m118742r(10.0f));
            list.add(m95365a);
            list.add(new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", c17945a0.mo95039W2(), CoreUtility.f89233i), -3).m95365a());
        } else if (!arrayList.isEmpty()) {
            C17945a0 m95365a2 = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", c17945a0.mo95039W2(), CoreUtility.f89233i), -2).m95382r(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.seen_message_state) + " (" + arrayList.size() + ")").m95365a();
            m95365a2.m94951M9();
            m95365a2.m95317za(AbstractC23136l9.m118742r(10.0f));
            list.add(m95365a2);
            for (List list2 : AbstractC17574a.m93595b(arrayList, 4)) {
                C17945a0 m95365a3 = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", c17945a0.mo95039W2(), CoreUtility.f89233i), -1).m95365a();
                m95365a3.m94951M9();
                m95365a3.m94850Aa(list2);
                list.add(m95365a3);
            }
        }
        if (!arrayList2.isEmpty()) {
            C17945a0 m95365a4 = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", c17945a0.mo95039W2(), CoreUtility.f89233i), -2).m95382r(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.receive_message_state) + " (" + arrayList2.size() + ")").m95365a();
            m95365a4.m94951M9();
            if (!arrayList.isEmpty()) {
                f11 = 30.0f;
            } else {
                f11 = 10.0f;
            }
            m95365a4.m95317za(AbstractC23136l9.m118742r(f11));
            list.add(m95365a4);
            for (List list3 : AbstractC17574a.m93595b(arrayList2, 4)) {
                C17945a0 m95365a5 = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", c17945a0.mo95039W2(), CoreUtility.f89233i), -1).m95365a();
                m95365a5.m94951M9();
                m95365a5.m94850Aa(list3);
                list.add(m95365a5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public void m62797yM(List list, String str) {
        list.add(new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, CoreUtility.f89233i), -8).m95365a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public void m62798zM(List list, C17945a0 c17945a0) {
        list.add(new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", c17945a0.mo95039W2(), CoreUtility.f89233i), -5).m95365a());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                if (m92642L3.containsKey("chat_content_id")) {
                    this.f59756S0 = (MessageId) m92642L3.getParcelable("chat_content_id");
                }
                if (m92642L3.containsKey("thread_id")) {
                    this.f59757T0 = m92642L3.getString("thread_id");
                }
                if (m92642L3.containsKey("chat_mode")) {
                    this.f59762Y0 = (EnumC18030a) m92642L3.getSerializable("chat_mode");
                }
                this.f59764a1 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: CM */
    void m62799CM() {
        try {
            if (this.f59771h1) {
                return;
            }
            this.f59771h1 = true;
            C27373c m62766K7 = m62766K7();
            if (m62766K7 != null) {
                AbstractC9010h.a aVar = this.f59769f1;
                if (aVar == null) {
                    m62800G0();
                    AbstractC9010h.a m48150c = AbstractC9010h.m48150c(m62766K7.m140220E(), new C11575f());
                    this.f59769f1 = m48150c;
                    if (m48150c.m48161h()) {
                        AbstractC23152n3.m118997G0(m92648SI(), this.f59769f1.m48158e());
                        this.f59771h1 = false;
                        m62818iv();
                        return;
                    }
                    return;
                }
                if (aVar.m48161h()) {
                    AbstractC23152n3.m118997G0(m92648SI(), this.f59769f1.m48158e());
                    this.f59771h1 = false;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Video info is null");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f59771h1 = false;
            m62818iv();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        C17945a0 m62764FM;
        try {
            actionBarMenu.removeAllViews();
            if (this.f59760W0 != null && (m62764FM = m62764FM()) != null) {
                int m95041W4 = m62764FM.m95041W4();
                if (m95041W4 != 2 && m95041W4 != 3 && m95041W4 != 4) {
                    if (m95041W4 == 19) {
                        actionBarMenu.m92738e(0, AbstractC19182e.abc_ic_menu_overflow_material).m92774j(AbstractC23136l9.m118724l(actionBarMenu.getContext(), 1, AbstractC8020f0.str_menu_photo_share_other_apps));
                    }
                } else if (!TextUtils.isEmpty(m62764FM.m94983Q3()) && AbstractC23041d2.m118194A(m62764FM.m94983Q3())) {
                    actionBarMenu.m92738e(0, AbstractC19182e.abc_ic_menu_overflow_material).m92774j(AbstractC23136l9.m118724l(actionBarMenu.getContext(), 0, AbstractC8020f0.str_menu_photo_share_other_apps));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: G0 */
    void m62800G0() {
        mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.chat_details_view, viewGroup, false);
        this.f59765b1 = inflate;
        TouchListView touchListView = (TouchListView) inflate.findViewById(AbstractC6918a0.chatline_list);
        this.f59754Q0 = touchListView;
        touchListView.setLayoutManager(new LinearLayoutManager(m92648SI(), 1, false));
        inflate.findViewById(AbstractC6918a0.chat_details_fragment_root).setOnClickListener(this);
        View findViewById = inflate.findViewById(AbstractC6918a0.chat_details_share_row);
        this.f59759V0 = findViewById;
        findViewById.setOnClickListener(this);
        m92637BK(true);
        return inflate;
    }

    /* renamed from: GM */
    int m62801GM(File file) {
        FileInputStream fileInputStream = null;
        try {
            try {
                if (file != null) {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = fileInputStream2.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        if (AbstractC23258x2.m119953l(byteArrayOutputStream.toByteArray())) {
                            try {
                                fileInputStream2.close();
                                return 2;
                            } catch (Exception e11) {
                                e11.printStackTrace();
                                return 2;
                            }
                        }
                        if (AbstractC23258x2.m119951j(byteArrayOutputStream.toByteArray())) {
                            try {
                                fileInputStream2.close();
                                return 1;
                            } catch (Exception e12) {
                                e12.printStackTrace();
                                return 1;
                            }
                        }
                        try {
                            fileInputStream2.close();
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                        return -1;
                    } catch (Exception e14) {
                        e = e14;
                        fileInputStream = fileInputStream2;
                        AbstractC23350e.m122778h(e);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e15) {
                                e15.printStackTrace();
                            }
                        }
                        return -1;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e16) {
                                e16.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                throw new IllegalArgumentException("Invalid file (null)");
            } catch (Exception e17) {
                e = e17;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: HM */
    public String m62802HM() {
        ChatView chatView = this.f59761X0;
        if (chatView != null) {
            return chatView.m60004fQ();
        }
        return "0";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        this.f59753P0.m64554V1();
    }

    /* renamed from: IM */
    public MessageId m62803IM() {
        return this.f59756S0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        m62818iv();
        super.mo40200KJ();
        m62777cN();
    }

    /* renamed from: KM */
    public boolean m62804KM(String str, MessageId messageId) {
        return C31967j.m153687a().m153691e(str, messageId);
    }

    /* renamed from: Kn */
    void m62805Kn(int i11) {
        TextView subtitleTextView;
        Drawable drawable;
        try {
            ActionBar m92646QI = m92646QI();
            if (m92646QI != null && (subtitleTextView = m92646QI.getSubtitleTextView()) != null) {
                if (i11 > 0) {
                    drawable = AbstractC23136l9.m118665N(m92646QI.getContext(), i11);
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    subtitleTextView.setCompoundDrawables(drawable, null, null, null);
                    subtitleTextView.setCompoundDrawablePadding(AbstractC23136l9.m118742r(5.0f));
                    return;
                }
                subtitleTextView.setCompoundDrawables(null, null, null, null);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: N7 */
    public void mo59740N7(boolean z11) {
        if (!z11) {
            this.f88756W = 0;
            if (m92650VI() instanceof ChatView) {
                ((ChatView) m92650VI()).mo60122my(false);
            }
        }
        this.f77813M0 = false;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Ps */
    public void mo62806Ps() {
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 16908332) {
                        m62777cN();
                        InterfaceC11577h interfaceC11577h = this.f59763Z0;
                        if (interfaceC11577h != null) {
                            interfaceC11577h.mo59586C1();
                        }
                        return true;
                    }
                    return false;
                }
                m62799CM();
                return true;
            }
            C17945a0 m62764FM = m62764FM();
            if (m62764FM != null) {
                m62812XM(m62764FM);
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f59753P0.m64556Z1();
    }

    /* renamed from: S1 */
    public void m62807S1() {
        C3535c c3535c = this.f59760W0;
        if (c3535c != null) {
            m62763EM(c3535c);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                this.f88760a0.setTitle("");
                this.f88760a0.setSubtitle("");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: TM */
    public void m62808TM(int i11, String str, MessageId messageId) {
        m62810UM(i11, str, messageId, 0);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Tf */
    public View mo62809Tf() {
        ChatView chatView = this.f59761X0;
        if (chatView != null) {
            return chatView.f56793R1.f60408d;
        }
        return null;
    }

    /* renamed from: UM */
    public void m62810UM(int i11, String str, MessageId messageId, int i12) {
        try {
            C31967j.m153687a().m153692f(i11, str, messageId, i12, new C11574e(messageId), AbstractC23309i.m121977hc());
            AbstractC23059e9.m118319H(m92676n2(), true);
        } catch (Exception e11) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_alertcantOpenfile));
            AbstractC23350e.m122776f(f59752i1, e11);
        }
        m62814aN();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        this.f59753P0.m64558c2();
    }

    /* renamed from: WM */
    void m62811WM(int i11) {
    }

    /* renamed from: XM */
    void m62812XM(final C17945a0 c17945a0) {
        try {
            if (!this.f59758U0 && c17945a0 != null) {
                if (!AbstractC23238v2.m119727l()) {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_sdcard));
                    return;
                }
                final String m94983Q3 = c17945a0.m94983Q3();
                if (!AbstractC23041d2.m118194A(m94983Q3)) {
                    return;
                }
                this.f59758U0 = true;
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: a60.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatDetailsView.this.m62771PM(m94983Q3, c17945a0);
                    }
                });
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f59758U0 = false;
        }
    }

    /* renamed from: YM */
    void m62813YM(String str, int i11) {
        FileOutputStream fileOutputStream;
        String str2 = str;
        this.f59758U0 = true;
        try {
            if (!new File(str2).exists()) {
                ToastUtils.m89266n(AbstractC8020f0.download_photo_not_cached_message, new Object[0]);
            } else if (i11 == 2) {
                String str3 = AbstractC20130d.m104874i0() + System.currentTimeMillis() + ".jpg";
                try {
                    fileOutputStream = new FileOutputStream(str3);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                try {
                    if (AbstractC23041d2.m118221t(str2, false).contains("png")) {
                        Bitmap m117966q = AbstractC23009a3.m117966q(str);
                        Bitmap createBitmap = Bitmap.createBitmap(m117966q.getWidth(), m117966q.getHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap.eraseColor(-1);
                        new Canvas(createBitmap).drawBitmap(m117966q, 0.0f, 0.0f, new Paint(4));
                        createBitmap.compress(Bitmap.CompressFormat.JPEG, AbstractC26689j.m137103l(), fileOutputStream);
                        fileOutputStream.flush();
                        try {
                            if (!m117966q.isRecycled()) {
                                m117966q.recycle();
                            }
                            if (!createBitmap.isRecycled()) {
                                createBitmap.recycle();
                            }
                            str2 = str3;
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = str3;
                            Throwable th3 = th;
                            try {
                                fileOutputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    fileOutputStream.close();
                    Intent intent = new Intent("android.intent.action.SEND");
                    Uri parse = Uri.parse("file://" + str2);
                    intent.setType("image/jpeg");
                    intent.putExtra("android.intent.extra.STREAM", parse);
                    intent.putExtra("bol_share_in_app", true);
                    m92641HK(Intent.createChooser(intent, "Share image using"));
                } catch (Throwable th5) {
                    th = th5;
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.SEND");
                Uri parse2 = Uri.parse("file://" + str2);
                intent2.setType("image/png");
                intent2.putExtra("android.intent.extra.STREAM", parse2);
                intent2.putExtra("bol_share_in_app", true);
                m92641HK(Intent.createChooser(intent2, "Share image using"));
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f(f59752i1, e12);
            ToastUtils.m89266n(AbstractC8020f0.error_general, new Object[0]);
        }
        this.f59758U0 = false;
    }

    /* renamed from: aN */
    public void m62814aN() {
        try {
            if (m92674mJ()) {
                this.f59768e1.sendEmptyMessageDelayed(0, 100L);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f59752i1, e11);
        }
    }

    /* renamed from: bN */
    public void m62815bN() {
        try {
            C31967j.m153687a().m153695i();
            AbstractC23059e9.m118319H(m92676n2(), false);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f59752i1, e11);
        }
        m62814aN();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /* renamed from: dN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m62816dN(C17945a0 c17945a0) {
        boolean z11;
        int i11 = 0;
        if (c17945a0 != null) {
            try {
                if (c17945a0.m94954N0()) {
                    z11 = true;
                    View view = this.f59759V0;
                    if (z11) {
                        i11 = 8;
                    }
                    view.setVisibility(i11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        z11 = false;
        View view2 = this.f59759V0;
        if (z11) {
        }
        view2.setVisibility(i11);
    }

    /* renamed from: fN */
    void m62817fN(C3535c c3535c, EnumC18030a enumC18030a) {
        int m153732O;
        int i11;
        if (c3535c == null) {
            return;
        }
        try {
            ActionBar m92646QI = m92646QI();
            if (m92646QI == null) {
                return;
            }
            TextView titleTextView = m92646QI.getTitleTextView();
            TextView subtitleTextView = m92646QI.getSubtitleTextView();
            titleTextView.setVisibility(0);
            subtitleTextView.setVisibility(0);
            Conversation m17971y0 = c3535c.m17971y0();
            String m40999b = c3535c.m17971y0().m40999b(true, false);
            int i12 = C11576g.f59780a[enumC18030a.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        titleTextView.setText(m40999b);
                        if (C18644n.m98531l().m98558u(m17971y0.f42893q)) {
                            String m119285r0 = AbstractC23160o0.m119285r0(m17971y0.f42893q);
                            if (!TextUtils.isEmpty(m119285r0)) {
                                subtitleTextView.setText(m119285r0);
                            } else {
                                subtitleTextView.setVisibility(8);
                            }
                        } else {
                            subtitleTextView.setVisibility(8);
                        }
                        m62811WM(-1);
                        return;
                    }
                    throw new IllegalArgumentException("updateContactInfo: Invalid chat mode");
                }
                titleTextView.setText(m40999b);
                subtitleTextView.setVisibility(8);
                ContactProfile m153138j = C21927m.m114302u().m114357s().m153138j(m17971y0.f42893q);
                if (!AbstractC25495a.m132086k(m17971y0.f42893q) && (m153138j == null || (!ContactProfile.m40345C0(m153138j.f42447v0) && !ContactProfile.m40345C0(m153138j.f42352K0)))) {
                    m62811WM(-1);
                    return;
                }
                m62811WM(AbstractC16803z.verified_followed);
                return;
            }
            String str = "";
            if (m40999b == null) {
                m40999b = "";
            }
            titleTextView.setText(m40999b);
            String[] split = c3535c.m17944I0().split("_");
            if (split.length > 0) {
                str = split[split.length - 1];
            }
            C31973j5 m4472f = C0943w.m4462l().m4472f(str);
            if (m4472f == null) {
                m153732O = 0;
            } else {
                m153732O = m4472f.m153732O();
            }
            if (m153732O > 0) {
                if (m153732O > 1) {
                    i11 = AbstractC8020f0.str_chat_info_num_member_groups;
                } else {
                    i11 = AbstractC8020f0.str_chat_info_num_member_group;
                }
                subtitleTextView.setText(String.format(AbstractC23136l9.m118743r0(i11), Integer.valueOf(m153732O)));
            } else {
                subtitleTextView.setVisibility(8);
            }
            m62805Kn(AbstractC16803z.icn_header_group_white);
            m62811WM(-1);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f59752i1;
    }

    /* renamed from: iv */
    void m62818iv() {
        mo49315c4();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C26393b c26393b;
        int i11;
        try {
            int id2 = view.getId();
            if (id2 != AbstractC6918a0.chat_details_fragment_root && id2 == AbstractC6918a0.chat_details_share_row) {
                C3535c c3535c = this.f59760W0;
                if (c3535c != null) {
                    c26393b = c3535c.m136076v();
                } else {
                    c26393b = null;
                }
                if (c26393b != null && c26393b.m136016p() > 0) {
                    C17945a0 c17945a0 = (C17945a0) c26393b.m136006f(0);
                    int i12 = 8;
                    if (c17945a0.m94871D7()) {
                        i11 = 8;
                    } else if (c17945a0.m95306y8()) {
                        i11 = 9;
                    } else if (c17945a0.m95276v6()) {
                        i11 = 4;
                    } else {
                        i11 = -1;
                    }
                    if (!c17945a0.m94847A6()) {
                        i12 = 6;
                    }
                    AbstractC19646n0.m102966d0(m92676n2(), c17945a0, false, i11, new TrackingSource(i12).m40686z(), "", m62802HM(), -1);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (this.f59753P0.m64555W1(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            m62777cN();
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f59753P0.m64557a2();
        m62761BM();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: qG */
    public View mo62819qG() {
        return this.f59765b1;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f59755R0 = new C23528a(m92648SI());
        C11603g0 c11603g0 = new C11603g0(this.f59761X0, this.f59755R0, 2, AbstractC23306f.m120579F1());
        this.f59753P0 = c11603g0;
        c11603g0.m60474F0(new C11571b());
        this.f59754Q0.setAdapter(this.f59753P0);
        if (!m62765JM()) {
            finish();
            return;
        }
        C17945a0 m17970x0 = this.f59760W0.m17970x0(this.f59756S0);
        C2526d.f10270a.m12684J(m17970x0, -1, this.f59764a1, m62802HM());
        m62762DM(this.f59756S0, m17970x0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        InterfaceC1801w m92650VI = m92650VI();
        if (m92650VI instanceof ChatView) {
            this.f59761X0 = (ChatView) m92650VI;
        }
        if (m92650VI instanceof InterfaceC11577h) {
            this.f59763Z0 = (InterfaceC11577h) m92650VI;
        }
    }
}
