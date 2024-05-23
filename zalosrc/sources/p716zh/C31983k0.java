package p716zh;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0943w;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import b40.C2526d;
import b40.C2546u;
import c30.C3255n;
import cg.AbstractC3460h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.picker.file.FileSelectView;
import com.zing.zalo.productcatalog.utils.AbstractC9183a;
import com.zing.zalo.uicontrol.AbstractPushToTalkControl;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import d60.C17800i;
import dj.C17945a0;
import dj.C17949b1;
import dj.C17961f1;
import dj.C17964g1;
import dj.C17969i0;
import dj.C17976k1;
import dj.C17978l0;
import dj.C17979l1;
import dj.C17981m0;
import dj.C17988o1;
import dj.C17990p0;
import dj.C17993q0;
import dj.C17997r1;
import dj.C18002t0;
import dj.C18009w0;
import dj.C18013y0;
import eg0.C18427b;
import fi.C18953k;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import hm0.InterfaceC20098e;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import im.C20612c;
import im.C20614e;
import im.C20620k;
import im.C20621l;
import im.C20625p;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import me0.AbstractC23009a3;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23067f6;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23184q2;
import me0.AbstractC23227u1;
import me0.AbstractC23238v2;
import me0.AbstractC23254w8;
import me0.C23055e5;
import me0.C23283z7;
import mg.C23288a;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import nh0.C23793c;
import nh0.InterfaceC23792b;
import org.json.JSONObject;
import p019aj.C0872f;
import p056cj.C3535c;
import p056cj.C3538f;
import p105dn.EnumC18030a;
import p185gc.AbstractC19378b;
import p239ih.C20551a;
import p239ih.C20556f;
import p268ji.C21272r;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p348mi.C23307g;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p394oj.C24280f;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p485rj.C25809a;
import p485rj.C25810b;
import p485rj.C25811c;
import p559uv.C27373c;
import p611wj.C29058f;
import p684yk.InterfaceC31005a;
import p716zh.C31983k0;
import su.C26388b;
import th.AbstractC26689j;
import tj.C26713e;
import tv.AbstractC26897a;
import ve.AbstractC27985d;
import vg.C28020b3;
import vg.C28203u6;
import xd0.C29585a;
import xd0.C29597m;
import xd0.C29599o;
import xd0.C29602r;
import yd0.C30912e;

/* renamed from: zh.k0 */
/* loaded from: classes3.dex */
public class C31983k0 {

    /* renamed from: s */
    private static final String f147043s = "k0";

    /* renamed from: a */
    private final ChatView f147044a;

    /* renamed from: b */
    private final InterfaceC23792b f147045b;

    /* renamed from: c */
    private final C0872f f147046c;

    /* renamed from: d */
    private final InterfaceC31005a f147047d;

    /* renamed from: e */
    private final C18953k f147048e;

    /* renamed from: f */
    private final C29599o f147049f;

    /* renamed from: g */
    private final C30912e f147050g;

    /* renamed from: h */
    private C3535c f147051h;

    /* renamed from: n */
    private String f147057n;

    /* renamed from: r */
    private C17945a0 f147061r;

    /* renamed from: i */
    private EnumC18030a f147052i = EnumC18030a.SINGLE_USER;

    /* renamed from: j */
    private long f147053j = 0;

    /* renamed from: k */
    private long f147054k = 0;

    /* renamed from: l */
    private boolean f147055l = false;

    /* renamed from: m */
    private boolean f147056m = false;

    /* renamed from: o */
    public boolean f147058o = false;

    /* renamed from: p */
    public int f147059p = 0;

    /* renamed from: q */
    boolean f147060q = false;

    /* renamed from: zh.k0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f147062a;

        a(C17945a0 c17945a0) {
            this.f147062a = c17945a0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            if (((C29585a.b) AbstractC23306f.m120644b().m101509a(new C29585a.a(this.f147062a))) != null) {
                ChatView chatView = C31983k0.this.f147044a;
                ChatView chatView2 = C31983k0.this.f147044a;
                Objects.requireNonNull(chatView2);
                chatView.mo70710wy(new Runnable() { // from class: zh.j0
                    public /* synthetic */ RunnableC31968j0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ChatView.this.mo59806Rh();
                    }
                });
            }
        }

        @Override // am.AbstractC0939u
        /* renamed from: b */
        public boolean mo4459b() {
            return true;
        }
    }

    /* renamed from: zh.k0$b */
    /* loaded from: classes3.dex */
    public class b implements AbstractC19378b.a {
        b() {
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: a */
        public void onSuccess(C29597m.b bVar) {
            C17945a0 m147093a = bVar.m147093a();
            C31983k0.this.m153911i0();
            C31983k0.this.f147044a.m60020gQ().mo60548Cn(false);
            C31983k0.this.f147044a.m60020gQ().mo60779pa(m147093a.m95029V3(), m147093a.mo95039W2());
            C31983k0.this.f147044a.m60020gQ().mo60832x4(false);
            C31983k0.this.f147044a.m60020gQ().mo60582Il();
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: b */
        public void mo1004b() {
        }
    }

    /* renamed from: zh.k0$c */
    /* loaded from: classes3.dex */
    public class c implements AbstractC19378b.a {

        /* renamed from: a */
        final /* synthetic */ C3535c f147065a;

        /* renamed from: b */
        final /* synthetic */ C17945a0 f147066b;

        c(C3535c c3535c, C17945a0 c17945a0) {
            this.f147065a = c3535c;
            this.f147066b = c17945a0;
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: a */
        public void onSuccess(C29599o.b bVar) {
        }

        @Override // p185gc.AbstractC19378b.a
        /* renamed from: b */
        public void mo1004b() {
            C31983k0.this.m153863e0(this.f147065a.m17944I0(), this.f147066b, C30912e.c.a.f142555a);
        }
    }

    /* renamed from: zh.k0$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f147068a;

        /* renamed from: b */
        final /* synthetic */ List f147069b;

        /* renamed from: c */
        final /* synthetic */ int f147070c;

        d(C17945a0 c17945a0, List list, int i11) {
            this.f147068a = c17945a0;
            this.f147069b = list;
            this.f147070c = i11;
        }

        /* renamed from: d */
        public /* synthetic */ void m153936d(C17945a0 c17945a0, List list, int i11) {
            try {
                AbstractC23306f.m120603N1().m101508a(new C29602r.b(c17945a0, false, ""));
                C31983k0.this.m153845Q0(list, i11 + 1);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                String m92652XI = C31983k0.this.f147044a.m92652XI(AbstractC8020f0.str_undo_error);
                if (c20096c != null) {
                    int m104491c = c20096c.m104491c();
                    if (m104491c != -105) {
                        if (m104491c == 50001) {
                            m92652XI = C31983k0.this.f147044a.m92652XI(AbstractC8020f0.undo_msg_error_network);
                        }
                    } else {
                        m92652XI = C31983k0.this.f147044a.m92652XI(AbstractC8020f0.undo_msg_error_receiver_not_support);
                    }
                }
                if (!C31983k0.this.f147044a.mo60294yp()) {
                    C31983k0.this.f147044a.mo49315c4();
                    if (C31983k0.this.f147044a.m92672lJ()) {
                        ToastUtils.showMess(m92652XI);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C23288a.f113033a.mo13474a(new C18427b(this.f147068a.mo95039W2(), new Runnable() { // from class: zh.l0

                /* renamed from: q */
                public final /* synthetic */ C17945a0 f147238q;

                /* renamed from: r */
                public final /* synthetic */ List f147239r;

                /* renamed from: s */
                public final /* synthetic */ int f147240s;

                public /* synthetic */ RunnableC31998l0(C17945a0 c17945a0, List list, int i11) {
                    r2 = c17945a0;
                    r3 = list;
                    r4 = i11;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31983k0.d.this.m153936d(r2, r3, r4);
                }
            }));
        }
    }

    /* renamed from: zh.k0$e */
    /* loaded from: classes3.dex */
    public class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f147072a;

        /* renamed from: b */
        final /* synthetic */ String f147073b;

        e(String str, String str2) {
            this.f147072a = str;
            this.f147073b = str2;
        }

        /* renamed from: d */
        public /* synthetic */ void m153938d(String str, C20096c c20096c) {
            boolean z11;
            try {
                C31983k0.this.f147044a.mo49315c4();
                C31973j5 m4472f = C0943w.f3447a.m4472f(str);
                if (m4472f != null && m4472f.m153747Y()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC23161o1.m119321f(c20096c, z11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C31983k0.this.f147060q = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19444a.m101695c(new Runnable() { // from class: zh.m0

                /* renamed from: q */
                public final /* synthetic */ String f147330q;

                /* renamed from: r */
                public final /* synthetic */ C20096c f147331r;

                public /* synthetic */ RunnableC32013m0(String str, C20096c c20096c2) {
                    r2 = str;
                    r3 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31983k0.e.this.m153938d(r2, r3);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            int i11;
            try {
                AbstractC23306f.m120584H0().m2629l(this.f147073b);
                C31973j5 m4472f = C0943w.f3447a.m4472f(this.f147072a);
                if (m4472f != null) {
                    z11 = m4472f.m153747Y();
                } else {
                    z11 = false;
                }
                AbstractC23184q2.m119446d(this.f147072a, this.f147073b);
                AbstractC23184q2.m119438C(this.f147072a);
                C19669z.f97569Q.set(false);
                C31983k0.this.m153865f0();
                if (z11) {
                    i11 = AbstractC8020f0.str_leave_community_success_toast;
                } else {
                    i11 = AbstractC8020f0.str_leave_group_success_toast;
                }
                C23283z7.m120377j(C31983k0.this.f147044a.m92676n2(), i11, 0, Integer.valueOf(AbstractC23136l9.m118742r(150.0f)));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: zh.k0$f */
    /* loaded from: classes3.dex */
    public class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f147075a;

        f(String str) {
            this.f147075a = str;
        }

        /* renamed from: d */
        public /* synthetic */ void m153940d(C20096c c20096c) {
            try {
                C31983k0.this.f147044a.mo49315c4();
                if (c20096c != null) {
                    ToastUtils.showMess(c20096c.m104492d());
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19444a.m101695c(new Runnable() { // from class: zh.n0

                /* renamed from: q */
                public final /* synthetic */ C20096c f147484q;

                public /* synthetic */ RunnableC32028n0(C20096c c20096c2) {
                    r2 = c20096c2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31983k0.f.this.m153940d(r2);
                }
            });
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                AbstractC23184q2.m119447e(this.f147075a);
                C31983k0.this.m153865f0();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: zh.k0$g */
    /* loaded from: classes3.dex */
    public interface g {
        /* renamed from: a */
        void mo153090a();
    }

    public C31983k0(ChatView chatView, InterfaceC23792b interfaceC23792b, C0872f c0872f, InterfaceC31005a interfaceC31005a, C29599o c29599o, C30912e c30912e, C18953k c18953k) {
        this.f147044a = chatView;
        this.f147045b = interfaceC23792b;
        this.f147046c = c0872f;
        this.f147047d = interfaceC31005a;
        this.f147048e = c18953k;
        this.f147049f = c29599o;
        this.f147050g = c30912e;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m153840N(C3535c c3535c, EnumC18030a enumC18030a, Uri uri, String str, File file, WeakReference weakReference, g gVar) {
        Throwable th2;
        BufferedOutputStream bufferedOutputStream;
        ParcelFileDescriptor openFileDescriptor;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream;
        ChatView chatView = (ChatView) weakReference.get();
        long mo124319c = C23793c.m124316k().mo124319c();
        if (chatView == null) {
            gVar.mo153090a();
            return;
        }
        if (!AbstractC23238v2.m119727l()) {
            if (chatView.m92672lJ()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.sd_card_not_available));
            }
            gVar.mo153090a();
            return;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream2 = null;
        try {
            openFileDescriptor = chatView.getContext().getContentResolver().openFileDescriptor(uri, "r");
            autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            } catch (Exception e11) {
                e = e11;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th2 = th3;
                bufferedOutputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th2 = th4;
            bufferedOutputStream = null;
        }
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = autoCloseInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                }
                bufferedOutputStream.close();
                try {
                    autoCloseInputStream.close();
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                } catch (Exception e13) {
                    AbstractC20110a.m104539h(e13);
                }
                long mo124319c2 = C23793c.m124316k().mo124319c() - mo124319c;
                ChatView chatView2 = (ChatView) weakReference.get();
                try {
                    String absolutePath = file.getAbsolutePath();
                    if (!TextUtils.isEmpty(absolutePath) && chatView2 != null) {
                        m153914l0(c3535c, enumC18030a, absolutePath, str, mo124319c2);
                    }
                    try {
                        autoCloseInputStream.close();
                    } catch (Exception e14) {
                        AbstractC20110a.m104539h(e14);
                    }
                    try {
                        bufferedOutputStream.close();
                    } catch (Exception e15) {
                        AbstractC20110a.m104539h(e15);
                    }
                    gVar.mo153090a();
                } catch (Exception e16) {
                    e = e16;
                    chatView = chatView2;
                    autoCloseInputStream2 = autoCloseInputStream;
                    try {
                        AbstractC20110a.m104539h(e);
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    try {
                        m153880t(chatView, e);
                        if (autoCloseInputStream2 != null) {
                            try {
                                autoCloseInputStream2.close();
                            } catch (Exception e17) {
                                AbstractC20110a.m104539h(e17);
                            }
                        }
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Exception e18) {
                                AbstractC20110a.m104539h(e18);
                            }
                        }
                        gVar.mo153090a();
                    } catch (Throwable th6) {
                        th = th6;
                        th2 = th;
                        if (autoCloseInputStream2 != null) {
                        }
                        if (bufferedOutputStream != null) {
                        }
                        gVar.mo153090a();
                        throw th2;
                    }
                }
            } catch (Exception e19) {
                e = e19;
            }
        } catch (Throwable th7) {
            th2 = th7;
            autoCloseInputStream2 = autoCloseInputStream;
            if (autoCloseInputStream2 != null) {
                try {
                    autoCloseInputStream2.close();
                } catch (Exception e21) {
                    AbstractC20110a.m104539h(e21);
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (Exception e22) {
                    AbstractC20110a.m104539h(e22);
                }
            }
            gVar.mo153090a();
            throw th2;
        }
    }

    /* renamed from: A0 */
    private void m153835A0(C3535c c3535c, EnumC18030a enumC18030a, String str, int i11, C17969i0 c17969i0, C17976k1 c17976k1) {
        m153932z0(c3535c, enumC18030a, str, i11, c17969i0, null, null, c17976k1, null);
    }

    /* renamed from: B */
    private void m153836B(C3535c c3535c, EnumC18030a enumC18030a, Uri uri, String str, WeakReference weakReference, AtomicInteger atomicInteger, g gVar, String str2) {
        File file = new File(AbstractC20130d.m104825D(), str2);
        if (file.exists() && file.length() > 0) {
            String absolutePath = file.getAbsolutePath();
            if (!TextUtils.isEmpty(absolutePath)) {
                m153914l0(c3535c, enumC18030a, absolutePath, str, 0L);
                return;
            }
            return;
        }
        file.delete();
        atomicInteger.incrementAndGet();
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.x

            /* renamed from: q */
            public final /* synthetic */ C3535c f148305q;

            /* renamed from: r */
            public final /* synthetic */ EnumC18030a f148306r;

            /* renamed from: s */
            public final /* synthetic */ Uri f148307s;

            /* renamed from: t */
            public final /* synthetic */ String f148308t;

            /* renamed from: u */
            public final /* synthetic */ File f148309u;

            /* renamed from: v */
            public final /* synthetic */ WeakReference f148310v;

            /* renamed from: w */
            public final /* synthetic */ C31983k0.g f148311w;

            public /* synthetic */ RunnableC32168x(C3535c c3535c2, EnumC18030a enumC18030a2, Uri uri2, String str3, File file2, WeakReference weakReference2, C31983k0.g gVar2) {
                r2 = c3535c2;
                r3 = enumC18030a2;
                r4 = uri2;
                r5 = str3;
                r6 = file2;
                r7 = weakReference2;
                r8 = gVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31983k0.this.m153840N(r2, r3, r4, r5, r6, r7, r8);
            }
        });
    }

    /* renamed from: C */
    public synchronized void m153842O(C3535c c3535c, EnumC18030a enumC18030a, Uri uri, String str, WeakReference weakReference, g gVar) {
        File file;
        try {
            String m118220s = AbstractC23041d2.m118220s(str);
            String m118199F = AbstractC23041d2.m118199F(str);
            int i11 = 1;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m118199F);
                sb2.append("_");
                int i12 = i11 + 1;
                sb2.append(i11);
                sb2.append(m118220s);
                file = new File(AbstractC20130d.m104825D(), sb2.toString());
                if (!file.exists() || file.length() <= 0) {
                    break;
                } else {
                    i11 = i12;
                }
            }
            file.delete();
            m153840N(c3535c, enumC18030a, uri, str, file, weakReference, gVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: I0 */
    private void m153838I0(C17945a0 c17945a0, String str) {
        this.f147044a.m60020gQ().mo60548Cn(true);
        c17945a0.m95271ub(false);
        c17945a0.m95007S9();
        this.f147049f.m101500a(new C29599o.a(str, c17945a0, true, "chat_send"));
    }

    /* renamed from: J */
    private void m153839J(C3535c c3535c, EnumC18030a enumC18030a, Uri uri, String str, WeakReference weakReference, AtomicInteger atomicInteger, g gVar, String str2) {
        if (!str2.isEmpty()) {
            m153836B(c3535c, enumC18030a, uri, str, weakReference, atomicInteger, gVar, str2);
        } else {
            atomicInteger.incrementAndGet();
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.g0

                /* renamed from: q */
                public final /* synthetic */ C3535c f146654q;

                /* renamed from: r */
                public final /* synthetic */ EnumC18030a f146655r;

                /* renamed from: s */
                public final /* synthetic */ Uri f146656s;

                /* renamed from: t */
                public final /* synthetic */ String f146657t;

                /* renamed from: u */
                public final /* synthetic */ WeakReference f146658u;

                /* renamed from: v */
                public final /* synthetic */ C31983k0.g f146659v;

                public /* synthetic */ RunnableC31923g0(C3535c c3535c2, EnumC18030a enumC18030a2, Uri uri2, String str3, WeakReference weakReference2, C31983k0.g gVar2) {
                    r2 = c3535c2;
                    r3 = enumC18030a2;
                    r4 = uri2;
                    r5 = str3;
                    r6 = weakReference2;
                    r7 = gVar2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31983k0.this.m153842O(r2, r3, r4, r5, r6, r7);
                }
            });
        }
    }

    /* renamed from: N0 */
    private boolean m153841N0(String str) {
        if (C28203u6.f131407a.m141819r(str)) {
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cannot_perform_action));
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public /* synthetic */ void m153843P(C17945a0 c17945a0) {
        try {
            if (c17945a0.m95041W4() != 0) {
                this.f147044a.m60020gQ().mo60596Kn(false);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: Q */
    public /* synthetic */ void m153844Q() {
        try {
            this.f147044a.mo49315c4();
            if (!this.f147044a.m92681pJ()) {
                this.f147044a.mo60018gH(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:9:0x0002, B:13:0x000c, B:14:0x001d, B:16:0x002a, B:18:0x0031, B:20:0x0038, B:24:0x0043, B:26:0x0049, B:30:0x0052, B:32:0x0067, B:34:0x007b, B:2:0x0080, B:4:0x0088), top: B:8:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0067 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:9:0x0002, B:13:0x000c, B:14:0x001d, B:16:0x002a, B:18:0x0031, B:20:0x0038, B:24:0x0043, B:26:0x0049, B:30:0x0052, B:32:0x0067, B:34:0x007b, B:2:0x0080, B:4:0x0088), top: B:8:0x0002 }] */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m153845Q0(List list, int i11) {
        boolean z11;
        if (list != null) {
            try {
                if (list.size() > i11 && i11 >= 0) {
                    if (i11 == 0) {
                        ChatView chatView = this.f147044a;
                        Objects.requireNonNull(chatView);
                        AbstractC19444a.m101697e(new Runnable() { // from class: zh.u
                            public /* synthetic */ RunnableC32126u() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ChatView.this.mo59643G0();
                            }
                        });
                    }
                    C17945a0 c17945a0 = (C17945a0) list.get(i11);
                    if (!c17945a0.m95180k8() && c17945a0.m95089b4() != 3 && c17945a0.m95089b4() != 2 && c17945a0.m95089b4() != 4) {
                        z11 = false;
                        if (!c17945a0.m95219o8() && !c17945a0.m95091b6()) {
                            if (!z11) {
                                C0766k c0766k = new C0766k();
                                c0766k.mo1704o8(new d(c17945a0, list, i11));
                                c0766k.mo1474L4(c17945a0.mo95039W2(), c17945a0);
                                return;
                            }
                            C23288a.f113033a.mo13474a(new C18427b(c17945a0.mo95039W2(), new Runnable() { // from class: zh.v

                                /* renamed from: q */
                                public final /* synthetic */ C17945a0 f148231q;

                                /* renamed from: r */
                                public final /* synthetic */ List f148232r;

                                /* renamed from: s */
                                public final /* synthetic */ int f148233s;

                                public /* synthetic */ RunnableC32140v(C17945a0 c17945a02, List list2, int i112) {
                                    r2 = c17945a02;
                                    r3 = list2;
                                    r4 = i112;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C31983k0.this.m153857a0(r2, r3, r4);
                                }
                            }));
                            return;
                        }
                        m153845Q0(list2, i112 + 1);
                        return;
                    }
                    z11 = true;
                    if (!c17945a02.m95219o8()) {
                        if (!z11) {
                        }
                    }
                    m153845Q0(list2, i112 + 1);
                    return;
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        if (!this.f147044a.mo60294yp()) {
            ChatView chatView2 = this.f147044a;
            Objects.requireNonNull(chatView2);
            AbstractC19444a.m101697e(new Runnable() { // from class: zh.w
                public /* synthetic */ RunnableC32154w() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatView.this.mo49315c4();
                }
            });
        }
    }

    /* renamed from: R */
    public static /* synthetic */ void m153846R() {
        C23744a.m124114c().m124116d(69, new Object[0]);
    }

    /* renamed from: S */
    public /* synthetic */ void m153847S(String str, int i11, String str2, C3535c c3535c, EnumC18030a enumC18030a, C7907e c7907e, C17979l1 c17979l1) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str)) {
                if (!AbstractC23254w8.m119859g(str) && !AbstractC23041d2.m118194A(str)) {
                    return;
                }
                if (!C20551a.m106806a(str)) {
                    ToastUtils.m89273u();
                    return;
                }
                C23307g m118367a = AbstractC23067f6.m118367a(str);
                C17976k1 c17976k1 = new C17976k1(new C20612c(0, i11, C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107363n(str).m107350a()).m107293q());
                C17981m0 c17981m0 = new C17981m0(str2, "", "", m118367a.f113474a, m118367a.f113475b);
                c17981m0.m95628i();
                m153878s(c3535c, enumC18030a, str, 2, c17981m0, c7907e, c17979l1, c17976k1, null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: T */
    public /* synthetic */ void m153848T(AtomicInteger atomicInteger) {
        if (atomicInteger.get() > 0 && atomicInteger.decrementAndGet() == 0) {
            this.f147044a.mo49315c4();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:7|8|9|(1:219)(1:13)|14|(29:96|(1:98)(1:218)|99|(4:101|(2:103|(1:105))(1:113)|106|(2:110|(1:112)))|114|(2:118|(4:(1:123)(1:126)|124|125|25))|(3:128|(1:130)(3:199|(6:201|(1:203)|204|(1:215)(1:208)|(1:214)(1:212)|213)|216)|131)(1:217)|132|133|(1:135)(2:193|(1:198)(1:197))|(1:137)(1:192)|138|(2:140|(1:142))|143|(1:145)(1:191)|(1:147)|148|(1:190)|150|(12:152|153|154|155|156|157|158|159|160|161|162|163)(1:189)|164|165|(1:167)|168|169|(1:171)|172|173|174)(2:(10:29|30|(1:92)|32|33|(1:35)(1:91)|36|37|(1:90)(2:43|(16:45|(1:47)|48|49|(1:51)|52|(2:54|55)(6:78|79|80|81|(2:84|85)|83)|56|57|58|(1:60)(1:73)|61|(1:63)|64|65|66)(1:89))|67)(1:18)|19)|20|21|22|24|25|5) */
    /* JADX WARN: Can't wrap try/catch for region: R(29:96|(1:98)(1:218)|99|(4:101|(2:103|(1:105))(1:113)|106|(2:110|(1:112)))|114|(2:118|(4:(1:123)(1:126)|124|125|25))|(3:128|(1:130)(3:199|(6:201|(1:203)|204|(1:215)(1:208)|(1:214)(1:212)|213)|216)|131)(1:217)|132|133|(1:135)(2:193|(1:198)(1:197))|(1:137)(1:192)|138|(2:140|(1:142))|143|(1:145)(1:191)|(1:147)|148|(1:190)|150|(12:152|153|154|155|156|157|158|159|160|161|162|163)(1:189)|164|165|(1:167)|168|169|(1:171)|172|173|174) */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0564, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x056e, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x056f, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m153849U(List list, int i11, C3535c c3535c, EnumC18030a enumC18030a, C17997r1 c17997r1, int i12) {
        int i13;
        long j11;
        MediaItem mediaItem;
        boolean z11;
        boolean z12;
        C17976k1 c17976k1;
        C17979l1 c17979l1;
        C27373c c27373c;
        int i14;
        long j12;
        C17961f1 c17961f1;
        C17976k1 c17976k12;
        int i15;
        long j13;
        String mo41081Q;
        long j14;
        C17976k1 c17976k13;
        int size = list.size();
        long currentTimeMillis = System.currentTimeMillis();
        ?? r15 = 1;
        if (size > 1) {
            C2526d.f10270a.m12702a(currentTimeMillis, new C32080q9(currentTimeMillis, size));
        }
        int i16 = 0;
        while (i16 < list.size()) {
            try {
                mediaItem = (MediaItem) list.get(i16);
                z11 = mediaItem instanceof VideoItem;
                z12 = mediaItem != null && mediaItem.m41163p0();
            } catch (Exception e11) {
                e = e11;
                i13 = i16;
                j11 = currentTimeMillis;
            }
            if (z11 || z12) {
                int i17 = i16;
                long j15 = currentTimeMillis;
                C27373c c27373c2 = z11 ? (C27373c) ((VideoItem) mediaItem).m41217x1() : null;
                if (c27373c2 == null) {
                    c27373c2 = new C27373c();
                    c27373c2.m140250e0(mediaItem.mo41081Q());
                    c27373c2.f128949V = z12;
                    if (z11) {
                        c27373c2.f128942O = false;
                        c27373c2.f128943P = false;
                        c27373c2.f128944Q = false;
                        AbstractC26897a.m138622h(c27373c2);
                        if (c27373c2.m140255i() == 0) {
                            c27373c2.m140226K(AbstractC3460h.m17442j(c27373c2.m140220E()));
                        }
                    } else {
                        AbstractC26897a.m138619e(c27373c2);
                    }
                    mediaItem.m41099E0("");
                    if (z11 && AbstractC23309i.m121905fg()) {
                        VideoItem videoItem = (VideoItem) mediaItem;
                        boolean m41166q0 = mediaItem.m41166q0();
                        if (videoItem.m41205A1()) {
                            VideoBlendingParam videoBlendingParam = new VideoBlendingParam();
                            videoBlendingParam.f48277q = mediaItem.mo41081Q();
                            videoBlendingParam.f48264P = 0;
                            videoBlendingParam.f48265Q = (int) AbstractC3460h.m17436d(videoItem.mo41081Q(), m41166q0 ? 1 : 0, AbstractC26689j.m137108q(m41166q0 ? 1 : 0) * 8388608);
                            videoBlendingParam.f48280t = "";
                            videoBlendingParam.f48258J = true;
                            videoBlendingParam.f48250B = c27373c2.m140265s();
                            videoBlendingParam.f48274Z = AbstractC26689j.m137106o(m41166q0 ? 1 : 0);
                            videoBlendingParam.f48275a0 = AbstractC26689j.m137088O(m41166q0 ? 1 : 0);
                            videoBlendingParam.f48284x = AbstractC26689j.m137106o(m41166q0 ? 1 : 0).m40328a();
                            c27373c2.f128947T = videoBlendingParam;
                            c27373c2.m140226K(videoBlendingParam.f48265Q);
                        }
                    }
                }
                if (c27373c2.m140220E() != null && c27373c2.m140220E().length() > 0) {
                    C20556f c20556f = new C20556f(c27373c2.m140220E());
                    if (!c20556f.m106830b() || c20556f.m106845r() == -1) {
                        ToastUtils.m89266n(z12 ? AbstractC8020f0.str_invalid_gif : AbstractC8020f0.str_invalid_video, new Object[0]);
                        i13 = i17;
                        j11 = j15;
                        i16 = i13 + 1;
                        currentTimeMillis = j11;
                        r15 = 1;
                    }
                }
                if (z11) {
                    if (!TextUtils.isEmpty(mediaItem.m41175w())) {
                        mediaItem.m41099E0(C20614e.m107306d(mediaItem.m41175w(), i11));
                        c17976k12 = new C17976k1(mediaItem.m41175w());
                    } else {
                        C20612c c20612c = new C20612c(0, i11, C20620k.m107330a().m107370u(c27373c2.m140221F()).m107356g(c27373c2.m140272z()).m107357h(c27373c2.m140258l()).m107358i(c27373c2.m140259m()).m107352c(c27373c2.m140251f()).m107363n(c27373c2.m140220E()).m107353d("mp4").m107359j(mediaItem.m41121S()).m107364o(((VideoItem) mediaItem).m41213t1() / 1000).m107350a());
                        VideoBlendingParam videoBlendingParam2 = c27373c2.f128947T;
                        if (videoBlendingParam2 != null) {
                            int i18 = videoBlendingParam2.f48265Q;
                            if (i18 != 0) {
                                int i19 = videoBlendingParam2.f48264P;
                                c20612c.m107275Q(new C20625p(i19 / 1000, (i19 + i18) / 1000));
                            }
                            c20612c.m107272N(!((VideoItem) mediaItem).m41205A1() && (videoBlendingParam2.f48258J || (videoBlendingParam2.f48260L && !videoBlendingParam2.f48259K)));
                        }
                        c20612c.m107273O(C17961f1.m95440W(mediaItem.m41166q0()));
                        c17976k12 = new C17976k1(c20612c.m107293q(), c20612c);
                    }
                    c17976k1 = c17976k12;
                } else {
                    c17976k1 = null;
                }
                C27373c m140242a = c27373c2.m140242a();
                String m140268v = m140242a.m140268v();
                if (TextUtils.isEmpty(m140268v)) {
                    m140242a.m140237V(AbstractC27985d.m140996m(AbstractC23352g.m122788d(m140242a.m140220E() + new C20556f(c27373c2.m140220E()).m106845r())));
                } else {
                    File file = new File(m140268v);
                    if (file.exists() && file.length() > 0) {
                        File file2 = new File(file.getParent(), "SEND_" + file.getName());
                        AbstractC23238v2.m119718c(file, file2);
                        m140242a.m140237V(file2.getPath());
                    } else {
                        m140242a.m140237V(AbstractC27985d.m140996m(AbstractC23352g.m122788d(m140242a.m140220E())));
                    }
                }
                if (z11) {
                    m140242a.m140236U(((VideoItem) mediaItem).m41212s1());
                } else {
                    m140242a.m140236U(mediaItem.mo41083a0());
                }
                VideoBlendingParam videoBlendingParam3 = m140242a.f128947T;
                if (videoBlendingParam3 != null) {
                    String str = videoBlendingParam3.f48279s;
                    if (!TextUtils.isEmpty(str)) {
                        File file3 = new File(str);
                        File file4 = new File(file3.getParent(), "SEND_" + file3.getName());
                        AbstractC23238v2.m119718c(file3, file4);
                        m140242a.f128947T.f48279s = file4.getPath();
                    }
                }
                if (m140242a.f128948U > 0) {
                    c17979l1 = new C17979l1();
                    c17979l1.f91060c = m140242a.f128948U;
                } else {
                    c17979l1 = null;
                }
                if (z12) {
                    c17979l1 = new C17979l1();
                    c17979l1.f91060c = ZAbstractBase.ZVU_BLEND_GEN_THUMB;
                }
                C17979l1 c17979l12 = c17979l1;
                String m41100F = TextUtils.isEmpty(mediaItem.m41100F()) ? "" : mediaItem.m41100F();
                if (size > 1) {
                    try {
                        c27373c = m140242a;
                        c17961f1 = new C17961f1(m41100F, 0, "", "", "", "", C17961f1.m95438A(m140242a, true, j15, size, i17, mediaItem.m41165q(), mediaItem.m41156m()), c27373c);
                        j12 = j15;
                        try {
                            c17961f1.m95474d0(j12);
                            c17961f1.m95475e0(size);
                            i14 = i17;
                        } catch (Exception e12) {
                            e = e12;
                            i14 = i17;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        i14 = i17;
                        j12 = j15;
                    }
                    try {
                        c17961f1.m95480h0(i14);
                        try {
                            c17961f1.m95467U(true);
                        } catch (Exception e14) {
                            e = e14;
                            i13 = i14;
                            j11 = j12;
                            e.printStackTrace();
                            Thread.sleep(20L);
                            i16 = i13 + 1;
                            currentTimeMillis = j11;
                            r15 = 1;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        i13 = i14;
                        j11 = j12;
                        e.printStackTrace();
                        Thread.sleep(20L);
                        i16 = i13 + 1;
                        currentTimeMillis = j11;
                        r15 = 1;
                    }
                } else {
                    c27373c = m140242a;
                    i14 = i17;
                    j12 = j15;
                    c17961f1 = new C17961f1(m41100F, 0, "", "", "", "", C17961f1.m95438A(c27373c, false, 0L, 0, 0, mediaItem.m41165q(), mediaItem.m41156m()), c27373c);
                }
                C17961f1 c17961f12 = c17961f1;
                if (mediaItem.m41165q() != -1) {
                    c17961f12.m95468Y(mediaItem.m41156m());
                    c17961f12.m95469Z(mediaItem.m41165q());
                }
                c17961f12.m95476f0(mediaItem.m41166q0());
                i13 = i14;
                j11 = j12;
                m153932z0(c3535c, enumC18030a, c27373c.m140220E(), 19, c17961f12, null, c17979l12, c17976k1, i14 == 0 ? c17997r1 : null);
            } else if (mediaItem != null) {
                try {
                    String m41100F2 = mediaItem.m41100F() != null ? mediaItem.m41100F() : "";
                    if (!TextUtils.isEmpty(mediaItem.m41113N())) {
                        mo41081Q = mediaItem.m41113N();
                    } else {
                        mo41081Q = mediaItem.mo41081Q();
                    }
                    String str2 = mo41081Q;
                    if (TextUtils.isEmpty(str2) || !(AbstractC23254w8.m119859g(str2) || AbstractC23041d2.m118194A(str2))) {
                        i15 = i16;
                        j13 = currentTimeMillis;
                    } else if (C20551a.m106806a(str2)) {
                        C23307g m118367a = AbstractC23067f6.m118367a(str2);
                        C18009w0 c18009w0 = new C18009w0(m41100F2, "", "", "", m118367a.f113474a, m118367a.f113475b);
                        c18009w0.m95773j0(mediaItem.m41150j0());
                        if (size > r15) {
                            c18009w0.m95754T(currentTimeMillis);
                            c18009w0.m95755U(size);
                            c18009w0.m95760Z(i16);
                            c18009w0.m95746K(r15);
                        }
                        if (mediaItem.m41165q() != -1) {
                            c18009w0.m95747M(mediaItem.m41156m());
                            c18009w0.m95748N(mediaItem.m41165q());
                        }
                        c18009w0.m95751Q(mediaItem.m41104I());
                        c18009w0.m95778m0();
                        if (!TextUtils.isEmpty(mediaItem.m41175w())) {
                            mediaItem.m41099E0(C20614e.m107306d(mediaItem.m41175w(), i12));
                            c17976k13 = new C17976k1(mediaItem.m41175w());
                            j14 = currentTimeMillis;
                        } else {
                            j14 = currentTimeMillis;
                            C20612c c20612c2 = new C20612c(0, i12, C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107357h(m118367a.f113476c).m107358i(m118367a.f113477d).m107352c(m118367a.f113478e).m107363n(str2).m107353d(AbstractC23041d2.m118216o(str2)).m107359j(mediaItem.m41121S()).m107355f(m118367a.f113481h).m107360k(AbstractC23009a3.m117960k(str2)).m107350a());
                            c20612c2.m107266H(mediaItem.m41166q0());
                            if (i12 == 14) {
                                try {
                                    c20612c2.m107267I(new C20621l(this.f147044a.m60020gQ().mo60834x7(), this.f147044a.m60020gQ().mo60636Rn()));
                                } catch (Exception e16) {
                                    e = e16;
                                    i13 = i16;
                                    j11 = j14;
                                    e.printStackTrace();
                                    Thread.sleep(20L);
                                    i16 = i13 + 1;
                                    currentTimeMillis = j11;
                                    r15 = 1;
                                }
                            }
                            c17976k13 = new C17976k1(c20612c2.m107293q());
                        }
                        try {
                            i15 = i16;
                            j13 = j14;
                            try {
                                m153878s(c3535c, enumC18030a, str2, mediaItem.m41166q0() ? 4 : 3, c18009w0, null, null, c17976k13, i16 == 0 ? c17997r1 : null);
                            } catch (Exception e17) {
                                e = e17;
                                i13 = i15;
                                j11 = j13;
                                e.printStackTrace();
                                Thread.sleep(20L);
                                i16 = i13 + 1;
                                currentTimeMillis = j11;
                                r15 = 1;
                            }
                        } catch (Exception e18) {
                            e = e18;
                            i15 = i16;
                            j13 = j14;
                            i13 = i15;
                            j11 = j13;
                            e.printStackTrace();
                            Thread.sleep(20L);
                            i16 = i13 + 1;
                            currentTimeMillis = j11;
                            r15 = 1;
                        }
                    } else {
                        i15 = i16;
                        j13 = currentTimeMillis;
                        ToastUtils.m89273u();
                    }
                    i13 = i15;
                    j11 = j13;
                } catch (Exception e19) {
                    e = e19;
                    i15 = i16;
                    j13 = currentTimeMillis;
                }
            } else {
                i13 = i16;
                j11 = currentTimeMillis;
            }
            Thread.sleep(20L);
            i16 = i13 + 1;
            currentTimeMillis = j11;
            r15 = 1;
        }
    }

    /* renamed from: U0 */
    private void m153850U0(int i11) {
        C21272r c21272r = (C21272r) C21272r.Companion.m122672a();
        if (c21272r.m110178g()) {
            c21272r.m110175d().m122679g();
            if (i11 == 14 || i11 == 13 || i11 == 15) {
                c21272r.m110176e();
            }
        }
    }

    /* renamed from: V */
    public /* synthetic */ void m153851V(String str, String str2, String str3, int i11, boolean z11, C3535c c3535c, EnumC18030a enumC18030a, C7907e c7907e, C17979l1 c17979l1, C17997r1 c17997r1) {
        String m107306d;
        int i12;
        try {
            if (!TextUtils.isEmpty(str) && AbstractC23041d2.m118194A(str)) {
                if (C20551a.m106806a(str)) {
                    C23307g m118367a = AbstractC23067f6.m118367a(str);
                    C18009w0 c18009w0 = new C18009w0(str2, "", "", "", m118367a.f113474a, m118367a.f113475b);
                    c18009w0.m95778m0();
                    if (TextUtils.isEmpty(str3)) {
                        m107306d = new C20612c(0, i11, C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107357h(m118367a.f113476c).m107358i(m118367a.f113477d).m107352c(m118367a.f113478e).m107363n(str).m107353d(AbstractC23041d2.m118216o(str)).m107355f(m118367a.f113481h).m107360k(AbstractC23009a3.m117960k(str)).m107350a()).m107293q();
                    } else {
                        m107306d = C20614e.m107306d(str3, i11);
                    }
                    C17976k1 c17976k1 = new C17976k1(m107306d);
                    if (z11) {
                        i12 = 4;
                    } else {
                        i12 = 3;
                    }
                    m153878s(c3535c, enumC18030a, str, i12, c18009w0, c7907e, c17979l1, c17976k1, c17997r1);
                    return;
                }
                ToastUtils.m89273u();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W */
    public /* synthetic */ void m153852W(String str, String str2, int i11, C3535c c3535c, EnumC18030a enumC18030a, C17997r1 c17997r1) {
        String str3;
        try {
            if (!TextUtils.isEmpty(str) && AbstractC23041d2.m118194A(str)) {
                if (C20551a.m106806a(str)) {
                    C23307g m118367a = AbstractC23067f6.m118367a(str);
                    C18009w0 c18009w0 = new C18009w0(m118367a.f113474a, m118367a.f113475b);
                    c18009w0.m95778m0();
                    if (TextUtils.isEmpty(str2)) {
                        str3 = new C20612c(0, i11, C20620k.m107330a().m107370u(m118367a.f113474a).m107356g(m118367a.f113475b).m107363n(str).m107350a()).m107293q();
                    } else {
                        str3 = str2;
                    }
                    C17976k1 c17976k1 = new C17976k1(str3);
                    C17979l1 c17979l1 = new C17979l1();
                    c17979l1.f91060c = 3;
                    m153878s(c3535c, enumC18030a, str, 31, c18009w0, null, c17979l1, c17976k1, c17997r1);
                    return;
                }
                ToastUtils.m89273u();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: X */
    public /* synthetic */ void m153853X(C29058f c29058f, C25811c c25811c, C32024mb c32024mb, int i11, String str, C17997r1 c17997r1, boolean z11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2 = "";
        try {
            C25810b m145130b = c29058f.m145130b();
            String str3 = m145130b.f123105a;
            C18009w0 c18009w0 = new C18009w0("", str3, str3, "", m145130b.f123106b, m145130b.f123107c);
            C24280f m145134f = c29058f.m145134f();
            if (c25811c != null) {
                i12 = c25811c.m133095g();
            } else {
                i12 = -1;
            }
            c18009w0.m95775k0(m145134f, i12);
            c18009w0.m95751Q(c29058f.m145129a());
            if (c25811c != null) {
                c18009w0.m95759Y(c25811c.m133095g());
                c18009w0.m95764d0(c25811c.m133094f());
                c18009w0.m95763c0(c25811c.m133093e());
            }
            if (c32024mb != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("source", c32024mb.m154402h());
                if (!TextUtils.isEmpty(c32024mb.m154401g()) && c32024mb.m154401g().length() > 30) {
                    jSONObject.put("keyword", c32024mb.m154401g().substring(0, 30));
                } else {
                    jSONObject.put("keyword", c32024mb.m154401g());
                }
                if (c32024mb.m154402h() == 1) {
                    if (c32024mb.m154400f() >= 0) {
                        jSONObject.put("send_position", c32024mb.m154400f() + 1);
                    }
                    if (c32024mb.m154399e() >= 0) {
                        jSONObject.put("max_visible_position", c32024mb.m154399e() + 1);
                    }
                    if (c32024mb.m154405k() >= 0) {
                        jSONObject.put("total_list", c32024mb.m154405k());
                    }
                    if (c32024mb.m154406l() != -1) {
                        jSONObject.put("version_keyword", c32024mb.m154406l());
                    }
                    if (c32024mb.m154395a() > 0) {
                        jSONObject.put("hint_to_send_duration", c32024mb.m154395a());
                    }
                    if (c32024mb.m154404j() > 0) {
                        jSONObject.put("suggest_type", c32024mb.m154404j());
                    }
                }
                jSONObject.put("contentID", c32024mb.m154397c());
                jSONObject.put("send_method", c32024mb.m154407m());
                c18009w0.m95766f0(jSONObject.toString());
                int m154402h = c32024mb.m154402h();
                if (m154402h == 7 || m154402h == 15) {
                    m153850U0(m154402h);
                }
            }
            c18009w0.m95778m0();
            C17979l1 c17979l1 = new C17979l1();
            c17979l1.f91060c = 3;
            c17979l1.f91062e = i11;
            c17979l1.f91063f = str;
            Conversation m17971y0 = this.f147051h.m17971y0();
            C17945a0.w m95364P = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", m17971y0.f42893q, CoreUtility.f89233i), 31).m95382r(m145130b.f123105a).m95368d(c18009w0).m95351C(c17997r1).m95385u(c17979l1).m95363O(m145130b.f123105a).m95364P(m145130b.f123105a);
            C20620k m107350a = C20620k.m107330a().m107370u(m145130b.f123106b).m107356g(m145130b.f123107c).m107350a();
            if (c29058f.m145131c() != null) {
                i13 = 52;
            } else {
                i13 = 20;
            }
            m95364P.m95384t(new C17976k1(new C20612c(0, i13, m107350a).m107293q()));
            C17945a0 m95365a = m95364P.m95365a();
            m95365a.m94951M9();
            m153879s0(AbstractC23306f.m120584H0().m2639v(m17971y0), m95365a, true);
            if (z11) {
                if (c29058f.m145132d() != null) {
                    str2 = c29058f.m145132d().f123105a;
                }
                String str4 = str2;
                String str5 = m145130b.f123105a;
                int i17 = m145130b.f123106b;
                int i18 = m145130b.f123107c;
                String m145129a = c29058f.m145129a();
                C24280f m145134f2 = c29058f.m145134f();
                if (c25811c != null) {
                    i14 = c25811c.m133095g();
                } else {
                    i14 = -1;
                }
                if (c25811c != null) {
                    i15 = c25811c.m133094f();
                } else {
                    i15 = -1;
                }
                if (c25811c != null) {
                    i16 = c25811c.m133093e();
                } else {
                    i16 = -1;
                }
                C3255n.m16562n().m16576s(new C25811c(str4, str5, i17, i18, m145129a, m145134f2, i14, i15, i16));
            }
            this.f147048e.m99388K0(c29058f.m145129a());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Y */
    public /* synthetic */ void m153854Y(List list, boolean z11) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                if (inviteContactProfile != null) {
                    JSONObject jSONObject = new JSONObject();
                    if (z11) {
                        jSONObject.put("phone", inviteContactProfile.f42455y);
                    }
                    C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", this.f147051h.m17944I0(), CoreUtility.f89233i), 12).m95382r(inviteContactProfile.m40383Q(true, false)).m95368d(new C18013y0(inviteContactProfile.f42437s, 0, inviteContactProfile.f42446v, AbstractC23306f.m120583H().m110204g().m116324p(), jSONObject.toString(), "recommened.user", inviteContactProfile.f42434r)).m95365a();
                    m95365a.m94951M9();
                    m153879s0(this.f147051h, m95365a, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            try {
                Thread.sleep(10L);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: Z */
    public /* synthetic */ void m153855Z(List list, String str) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m153920r0((String) it.next(), str, null, null, null, false, true, null);
                Thread.sleep(10L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a0 */
    public /* synthetic */ void m153857a0(C17945a0 c17945a0, List list, int i11) {
        AbstractC23306f.m120603N1().m101508a(new C29602r.b(c17945a0, false, ""));
        new C0766k().mo1474L4(c17945a0.mo95039W2(), c17945a0);
        m153845Q0(list, i11 + 1);
    }

    /* renamed from: d0 */
    private void m153861d0(C17945a0 c17945a0, boolean z11) {
        if (z11) {
            this.f147044a.m60020gQ().mo60548Cn(true);
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: zh.c0

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f146340q;

            public /* synthetic */ RunnableC31863c0(C17945a0 c17945a02) {
                r2 = c17945a02;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31983k0.this.m153843P(r2);
            }
        });
    }

    /* renamed from: e0 */
    public void m153863e0(String str, C17945a0 c17945a0, C30912e.c cVar) {
        this.f147050g.m101500a(new C30912e.d(str, c17945a0, "chat_send", cVar));
    }

    /* renamed from: f0 */
    public void m153865f0() {
        AbstractC19444a.m101695c(new Runnable() { // from class: zh.h0
            public /* synthetic */ RunnableC31938h0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31983k0.this.m153844Q();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0059, code lost:            if (r20 != 4) goto L114;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x005f, code lost:            if (android.text.TextUtils.isEmpty(r19) == false) goto L114;     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:4:0x000a, B:6:0x0012, B:11:0x001e, B:19:0x0040, B:21:0x0044, B:23:0x004c, B:28:0x006a, B:30:0x0070, B:33:0x007a, B:35:0x0082, B:38:0x0086, B:40:0x008c, B:41:0x00dd, B:43:0x011e, B:44:0x0131, B:52:0x014f, B:55:0x0099, B:57:0x009d, B:58:0x00a4, B:60:0x00aa, B:62:0x00b0, B:64:0x00b9, B:70:0x005b), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008c A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:4:0x000a, B:6:0x0012, B:11:0x001e, B:19:0x0040, B:21:0x0044, B:23:0x004c, B:28:0x006a, B:30:0x0070, B:33:0x007a, B:35:0x0082, B:38:0x0086, B:40:0x008c, B:41:0x00dd, B:43:0x011e, B:44:0x0131, B:52:0x014f, B:55:0x0099, B:57:0x009d, B:58:0x00a4, B:60:0x00aa, B:62:0x00b0, B:64:0x00b9, B:70:0x005b), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:4:0x000a, B:6:0x0012, B:11:0x001e, B:19:0x0040, B:21:0x0044, B:23:0x004c, B:28:0x006a, B:30:0x0070, B:33:0x007a, B:35:0x0082, B:38:0x0086, B:40:0x008c, B:41:0x00dd, B:43:0x011e, B:44:0x0131, B:52:0x014f, B:55:0x0099, B:57:0x009d, B:58:0x00a4, B:60:0x00aa, B:62:0x00b0, B:64:0x00b9, B:70:0x005b), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m153878s(C3535c c3535c, EnumC18030a enumC18030a, String str, int i11, C17969i0 c17969i0, C7907e c7907e, C17979l1 c17979l1, C17976k1 c17976k1, C17997r1 c17997r1) {
        String str2;
        boolean z11;
        String str3;
        if (c3535c != null) {
            try {
                if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(c3535c.m17944I0()) || m153841N0(c3535c.m17944I0())) {
                    return;
                }
                if (i11 != 18 && i11 != 22 && i11 != 29) {
                    if (i11 == 19 && (c17969i0 instanceof C17961f1)) {
                        ((C17961f1) c17969i0).m95504u();
                        if (c17979l1 != null && c17979l1.f91060c == 1003) {
                            str2 = "";
                            z11 = false;
                            if (!z11 && !C20551a.m106806a(str2)) {
                                if (this.f147044a.m92672lJ()) {
                                    if (i11 == 19) {
                                        ToastUtils.m89266n(AbstractC8020f0.str_support_file_video, new Object[0]);
                                        return;
                                    } else {
                                        ToastUtils.m89273u();
                                        return;
                                    }
                                }
                                return;
                            }
                            Conversation m17971y0 = c3535c.m17971y0();
                            if (i11 == 29) {
                                str3 = MainApplication.getAppContext().getString(AbstractC8020f0.chat_theme_changed_by_me);
                            } else if (i11 == 22) {
                                if (!(c17969i0 instanceof C17990p0)) {
                                    str3 = "";
                                } else {
                                    str3 = ((C17990p0) c17969i0).f91011p;
                                }
                                if (str3.isEmpty() && !TextUtils.isEmpty(str2)) {
                                    String[] split = str2.split("/");
                                    if (split.length > 0) {
                                        str3 = MainApplication.getAppContext().getString(AbstractC8020f0.str_type_msg_file) + " " + split[split.length - 1];
                                    }
                                }
                            } else {
                                str3 = str2;
                            }
                            C17945a0.w m95379o = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", m17971y0.f42893q, CoreUtility.f89233i), i11).m95382r(str3).m95368d(c17969i0).m95381q(c7907e).m95351C(c17997r1).m95385u(c17979l1).m95384t(c17976k1).m95386v(1).m95379o(str2);
                            if (AbstractC19656s0.m103053B(i11)) {
                                m95379o.m95353E(new C32094r9());
                                m95379o.m95357I(C23793c.m124316k().mo124319c());
                            }
                            C17945a0 m95365a = m95379o.m95365a();
                            m95365a.m94951M9();
                            m153879s0(AbstractC23306f.m120584H0().m2639v(m17971y0), m95365a, true);
                            if (i11 != 3 || i11 == 4 || i11 == 19 || i11 == 12 || i11 == 22) {
                                m153909g0();
                            }
                            return;
                        }
                    } else if (i11 != 3) {
                    }
                    str2 = str;
                    z11 = true;
                    if (!z11) {
                    }
                    Conversation m17971y02 = c3535c.m17971y0();
                    if (i11 == 29) {
                    }
                    C17945a0.w m95379o2 = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", m17971y02.f42893q, CoreUtility.f89233i), i11).m95382r(str3).m95368d(c17969i0).m95381q(c7907e).m95351C(c17997r1).m95385u(c17979l1).m95384t(c17976k1).m95386v(1).m95379o(str2);
                    if (AbstractC19656s0.m103053B(i11)) {
                    }
                    C17945a0 m95365a2 = m95379o2.m95365a();
                    m95365a2.m94951M9();
                    m153879s0(AbstractC23306f.m120584H0().m2639v(m17971y02), m95365a2, true);
                    if (i11 != 3) {
                    }
                    m153909g0();
                }
                str2 = str;
                z11 = false;
                if (!z11) {
                }
                Conversation m17971y022 = c3535c.m17971y0();
                if (i11 == 29) {
                }
                C17945a0.w m95379o22 = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", m17971y022.f42893q, CoreUtility.f89233i), i11).m95382r(str3).m95368d(c17969i0).m95381q(c7907e).m95351C(c17997r1).m95385u(c17979l1).m95384t(c17976k1).m95386v(1).m95379o(str2);
                if (AbstractC19656s0.m103053B(i11)) {
                }
                C17945a0 m95365a22 = m95379o22.m95365a();
                m95365a22.m94951M9();
                m153879s0(AbstractC23306f.m120584H0().m2639v(m17971y022), m95365a22, true);
                if (i11 != 3) {
                }
                m153909g0();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: s0 */
    private void m153879s0(C3535c c3535c, C17945a0 c17945a0, boolean z11) {
        m153861d0(c17945a0, z11);
        m153863e0(c3535c.m17944I0(), c17945a0, C30912e.c.b.f142556a);
        this.f147049f.m101501b(new C29599o.a(c3535c.m17944I0(), c17945a0, true, "chat_send"), new c(c3535c, c17945a0));
    }

    /* renamed from: t */
    private void m153880t(ChatView chatView, Exception exc) {
        if (!AbstractC23034c6.m118121G()) {
            AbstractC23034c6.m118184v0(chatView, AbstractC23034c6.f112029f, 109);
            return;
        }
        if (chatView.m92674mJ() && !chatView.m92681pJ() && C23055e5.m118272g(true)) {
            if (!AbstractC23227u1.m119701a(exc) && (!(exc instanceof IOException) || AbstractC23238v2.m119726k())) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
            } else {
                ToastUtils.m89266n(AbstractC8020f0.str_error_full_sdcard_more_descriptive, new Object[0]);
            }
        }
    }

    /* renamed from: v */
    private void m153881v(C17945a0 c17945a0, String str, int i11) {
        if (c17945a0.m95089b4() == 0) {
            m153927x(c17945a0.m94983Q3(), i11);
            return;
        }
        if (c17945a0.m95062Y4() != null) {
            if (c17945a0.m95062Y4().m13376e() > 0 && c17945a0.m95062Y4().m13378g()) {
                C17969i0 m94929K2 = c17945a0.m94929K2();
                if (m94929K2 instanceof C17964g1) {
                    C17964g1 c17964g1 = (C17964g1) m94929K2;
                    c17964g1.m95544w(i11);
                    c17964g1.m95529J();
                }
                m153838I0(c17945a0, str);
                this.f147044a.m60020gQ().mo60582Il();
                return;
            }
            c17945a0.m95062Y4().m13375d();
            m153927x(c17945a0.m94983Q3(), i11);
            return;
        }
        m153927x(c17945a0.m94983Q3(), i11);
    }

    /* renamed from: B0 */
    public void m153882B0(C18013y0 c18013y0) {
        String str;
        String str2;
        if (c18013y0 != null) {
            try {
                if ("recommened.user".equals(c18013y0.f91016u)) {
                    C17978l0 c17978l0 = c18013y0.f91253D;
                    this.f147044a.m60020gQ().mo60548Cn(true);
                    if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(this.f147051h.m17944I0()) || m153841N0(this.f147051h.m17944I0())) {
                        return;
                    }
                    m153911i0();
                    m153910h0();
                    JSONObject jSONObject = new JSONObject();
                    if (c17978l0 == null) {
                        str = "";
                    } else {
                        str = c17978l0.f91053a;
                    }
                    jSONObject.put("phone", str);
                    if (c17978l0 == null) {
                        str2 = "";
                    } else {
                        str2 = c17978l0.f91053a;
                    }
                    C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", this.f147051h.m17944I0(), CoreUtility.f89233i), 12).m95382r(AbstractC21935u.m114540g(str2, c18013y0.f91017v, c18013y0.f91011p, true)).m95368d(c18013y0).m95365a();
                    m95365a.m94951M9();
                    m153879s0(this.f147051h, m95365a, true);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: C0 */
    public void m153883C0(List list, boolean z11) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    this.f147044a.m60020gQ().mo60548Cn(true);
                    if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(this.f147051h.m17944I0()) || m153841N0(this.f147051h.m17944I0())) {
                        return;
                    }
                    m153911i0();
                    m153910h0();
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.f0

                        /* renamed from: q */
                        public final /* synthetic */ List f146607q;

                        /* renamed from: r */
                        public final /* synthetic */ boolean f146608r;

                        public /* synthetic */ RunnableC31908f0(List list2, boolean z112) {
                            r2 = list2;
                            r3 = z112;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C31983k0.this.m153854Y(r2, r3);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: D */
    public void m153884D(C17969i0 c17969i0, int i11) {
        try {
            m153886E();
            if (c17969i0 == null || !ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(this.f147051h.m17944I0()) || m153841N0(this.f147051h.m17944I0())) {
                return;
            }
            String m17944I0 = m153888F().m17944I0();
            this.f147044a.m60020gQ().mo60548Cn(true);
            m153911i0();
            m153910h0();
            C17945a0.w m95368d = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", m17944I0, CoreUtility.f89233i), i11).m95368d(c17969i0);
            if (AbstractC19656s0.m103053B(i11)) {
                m95368d.m95353E(new C32094r9());
                m95368d.m95357I(C23793c.m124316k().mo124319c());
            }
            C17945a0 m95365a = m95368d.m95365a();
            m95365a.m94951M9();
            m153879s0(this.f147051h, m95365a, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D0 */
    public void m153885D0(String str, List list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    this.f147044a.m60020gQ().mo60548Cn(true);
                    if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(this.f147051h.m17944I0()) || m153841N0(this.f147051h.m17944I0())) {
                        return;
                    }
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.t

                        /* renamed from: q */
                        public final /* synthetic */ List f148041q;

                        /* renamed from: r */
                        public final /* synthetic */ String f148042r;

                        public /* synthetic */ RunnableC32112t(List list2, String str2) {
                            r2 = list2;
                            r3 = str2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C31983k0.this.m153855Z(r2, r3);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: E */
    public EnumC18030a m153886E() {
        C3535c c3535c = this.f147051h;
        if (c3535c != null && AbstractC25495a.m132078c(c3535c.m17944I0())) {
            return EnumC18030a.SINGLE_USER;
        }
        EnumC18030a enumC18030a = this.f147052i;
        if (enumC18030a == EnumC18030a.SINGLE_USER && this.f147058o) {
            return EnumC18030a.SINGLE_PAGE;
        }
        return enumC18030a;
    }

    /* renamed from: E0 */
    public void m153887E0(C25630b c25630b, C17997r1 c17997r1, boolean z11, C32024mb c32024mb, int i11, int i12, String str) {
        C17979l1 c17979l1;
        if (c25630b != null) {
            try {
                if (!c25630b.m132400H() || !ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(this.f147051h.m17944I0()) || m153841N0(this.f147051h.m17944I0())) {
                    return;
                }
                this.f147044a.m60020gQ().mo60548Cn(true);
                m153911i0();
                m153910h0();
                if (i12 != -1 && !TextUtils.isEmpty(str)) {
                    c17979l1 = new C17979l1();
                    c17979l1.f91062e = i12;
                    c17979l1.f91063f = str;
                } else {
                    c17979l1 = null;
                }
                C17945a0 m94704Q1 = C17945a0.m94704Q1(c25630b, c17997r1, this.f147051h.m17944I0());
                if (c32024mb != null) {
                    ((C17949b1) m94704Q1.m94929K2()).m95406q(c32024mb);
                    int m154402h = c32024mb.m154402h();
                    if (m154402h == 4 || m154402h == 5 || m154402h == 6 || m154402h == 7 || m154402h == 13) {
                        m153850U0(m154402h);
                    }
                }
                m94704Q1.m95307ya(i11);
                m94704Q1.m94989Qa(c17979l1);
                AbstractC19646n0.m102931S1(m94704Q1);
                m153879s0(this.f147051h, m94704Q1, true);
                C28020b3.f130648a.m141187P(m94704Q1.m95029V3().m41044h());
                AbstractC23306f.m120644b().m101509a(new C29585a.a(m94704Q1));
                if (z11) {
                    C3255n.m16562n().m16578v(c25630b);
                }
                this.f147048e.m99394O0(c25630b.m132429g());
                if (c17997r1 != null && c17997r1.m95687d() == 31) {
                    C2546u.f10363a.m12824k(c17997r1.m95689f());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: F */
    public C3535c m153888F() {
        return this.f147051h;
    }

    /* renamed from: F0 */
    public void m153889F0(C3535c c3535c, EnumC18030a enumC18030a, String str, C3538f c3538f) {
        try {
            if (!TextUtils.isEmpty(str) && !AbstractC23041d2.m118194A(str)) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.error_file_notexist));
            } else {
                m153835A0(c3535c, enumC18030a, str, 29, AbstractC19656s0.m103075r(c3538f), null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: G */
    public String m153890G() {
        return this.f147057n;
    }

    /* renamed from: G0 */
    public void m153891G0(C27373c c27373c, String str, C17997r1 c17997r1) {
        m153893H0(c27373c, false, str, c17997r1);
    }

    /* renamed from: H */
    long m153892H() {
        try {
            List m17941F0 = this.f147051h.m17941F0();
            for (int size = m17941F0.size() - 1; size >= 0; size--) {
                C17945a0 c17945a0 = (C17945a0) m17941F0.get(size);
                if (!c17945a0.m95032V6()) {
                    return c17945a0.m94974P4();
                }
            }
            return 0L;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: H0 */
    public void m153893H0(C27373c c27373c, boolean z11, String str, C17997r1 c17997r1) {
        C17976k1 c17976k1;
        String m140253g;
        if (c27373c == null) {
            return;
        }
        try {
            C17979l1 c17979l1 = null;
            if (!TextUtils.isEmpty(str)) {
                c17976k1 = new C17976k1(str);
            } else {
                c17976k1 = null;
            }
            C27373c m140242a = c27373c.m140242a();
            String m140268v = m140242a.m140268v();
            if (TextUtils.isEmpty(m140268v)) {
                m140242a.m140237V(AbstractC27985d.m140996m(AbstractC23352g.m122788d(m140242a.m140220E() + m140242a.m140256j())));
            } else {
                File file = new File(m140268v);
                if (file.exists() && file.length() > 0) {
                    File file2 = new File(file.getParent(), "SEND_" + file.getName());
                    AbstractC23238v2.m119718c(file, file2);
                    m140242a.m140237V(file2.getPath());
                } else {
                    m140242a.m140237V(AbstractC27985d.m140996m(AbstractC23352g.m122788d(m140242a.m140220E())));
                }
            }
            VideoBlendingParam videoBlendingParam = m140242a.f128947T;
            if (videoBlendingParam != null) {
                String str2 = videoBlendingParam.f48279s;
                if (!TextUtils.isEmpty(str2)) {
                    File file3 = new File(str2);
                    File file4 = new File(file3.getParent(), "SEND_" + file3.getName());
                    AbstractC23238v2.m119718c(file3, file4);
                    m140242a.f128947T.f48279s = file4.getPath();
                }
            }
            if (m140242a.f128948U > 0) {
                c17979l1 = new C17979l1();
                c17979l1.f91060c = m140242a.f128948U;
            }
            C17979l1 c17979l12 = c17979l1;
            String m140220E = m140242a.m140220E();
            if (m140242a.f128943P || AbstractC23041d2.m118194A(m140220E)) {
                C3535c m153888F = m153888F();
                EnumC18030a m153886E = m153886E();
                if (TextUtils.isEmpty(m140242a.m140253g())) {
                    m140253g = "";
                } else {
                    m140253g = m140242a.m140253g();
                }
                C17961f1 c17961f1 = new C17961f1(m140253g, 0, "", "", "", "", C17961f1.m95438A(m140242a, false, 0L, 0, 0, -1L, -1), m140242a);
                c17961f1.m95476f0(z11);
                m153932z0(m153888F, m153886E, m140220E, 19, c17961f1, null, c17979l12, c17976k1, c17997r1);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: I */
    public C17945a0 m153894I() {
        return this.f147061r;
    }

    /* renamed from: J0 */
    public void m153895J0(String str) {
        this.f147057n = str;
    }

    /* renamed from: K */
    public boolean m153896K() {
        return this.f147055l;
    }

    /* renamed from: K0 */
    public void m153897K0(boolean z11) {
        this.f147055l = z11;
    }

    /* renamed from: L */
    public boolean m153898L() {
        return this.f147056m;
    }

    /* renamed from: L0 */
    public void m153899L0(boolean z11) {
        this.f147056m = z11;
    }

    /* renamed from: M */
    public boolean m153900M() {
        return this.f147060q;
    }

    /* renamed from: M0 */
    public void m153901M0(boolean z11) {
        this.f147060q = z11;
    }

    /* renamed from: O0 */
    public void m153902O0(C17945a0 c17945a0) {
        m153903P0(Collections.singletonList(c17945a0));
    }

    /* renamed from: P0 */
    public void m153903P0(List list) {
        m153845Q0(list, 0);
    }

    /* renamed from: R0 */
    public void m153904R0(C3535c c3535c) {
        this.f147051h = c3535c;
        if (c3535c.m17971y0().m41013q()) {
            this.f147052i = EnumC18030a.GROUP;
        } else {
            this.f147052i = EnumC18030a.SINGLE_USER;
        }
        this.f147058o = AbstractC21935u.m114518H(this.f147051h.m17944I0());
    }

    /* renamed from: S0 */
    public void m153905S0(C17945a0 c17945a0) {
        try {
            C23055e5.m118272g(true);
            AbstractC23306f.m120674i1().m101501b(new C29597m.a(this.f147051h, c17945a0), new b());
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f147043s, e11);
        }
    }

    /* renamed from: T0 */
    public void m153906T0(byte[] bArr, boolean z11) {
        C17945a0 c17945a0 = this.f147061r;
        if (c17945a0 != null && c17945a0.m95062Y4() != null) {
            if (z11) {
                this.f147061r.m95062Y4().m13374c(bArr, this.f147061r.m95062Y4().m13377f() + bArr.length, this.f147061r.m95062Y4().m13376e() + 1);
                return;
            }
            this.f147061r.m95062Y4().m13373b(bArr);
        }
    }

    /* renamed from: b0 */
    public void m153907b0(String str, String str2, String str3, boolean z11, boolean z12) {
        try {
            if (this.f147060q) {
                return;
            }
            this.f147060q = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new e(str, str2));
            this.f147044a.mo59643G0();
            c0766k.mo1496Na(str, str3, z11, z12);
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f147043s, e11);
            this.f147044a.mo49315c4();
        }
    }

    /* renamed from: c0 */
    public void m153908c0(String str, boolean z11, boolean z12, InterfaceC20098e interfaceC20098e) {
        try {
            if (ContactProfile.m40346R0(CoreUtility.f89233i) && ContactProfile.m40346R0(this.f147051h.m17944I0())) {
                if (!C20551a.m106806a(str)) {
                    if (this.f147044a.m92672lJ()) {
                        ToastUtils.showMess(this.f147044a.m92652XI(AbstractC8020f0.str_support_file));
                    }
                } else {
                    C17945a0 m94773k9 = C17945a0.m94773k9(str, this.f147051h.m17944I0());
                    m94773k9.m95271ub(true);
                    m94773k9.m95058Xb(z11, z12, interfaceC20098e);
                    this.f147061r = m94773k9;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f147043s, e11);
        }
    }

    /* renamed from: g0 */
    void m153909g0() {
        AbstractC19444a.m101694b(new Runnable() { // from class: zh.e0
            @Override // java.lang.Runnable
            public final void run() {
                C31983k0.m153846R();
            }
        }, 500L);
    }

    /* renamed from: h0 */
    void m153910h0() {
        this.f147044a.m59623ET();
    }

    /* renamed from: i0 */
    public void m153911i0() {
        this.f147053j = 0L;
        this.f147054k = System.currentTimeMillis();
    }

    /* renamed from: j0 */
    public void m153912j0() {
        if (this.f147061r != null) {
            this.f147061r = null;
        }
    }

    /* renamed from: k0 */
    public void m153913k0(String str, String str2, C7907e c7907e, C17979l1 c17979l1, int i11) {
        this.f147044a.m60020gQ().mo60548Cn(true);
        m153911i0();
        m153910h0();
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.z

            /* renamed from: q */
            public final /* synthetic */ String f148485q;

            /* renamed from: r */
            public final /* synthetic */ int f148486r;

            /* renamed from: s */
            public final /* synthetic */ String f148487s;

            /* renamed from: t */
            public final /* synthetic */ C3535c f148488t;

            /* renamed from: u */
            public final /* synthetic */ EnumC18030a f148489u;

            /* renamed from: v */
            public final /* synthetic */ C7907e f148490v;

            /* renamed from: w */
            public final /* synthetic */ C17979l1 f148491w;

            public /* synthetic */ RunnableC32196z(String str22, int i112, String str3, C3535c c3535c, EnumC18030a enumC18030a, C7907e c7907e2, C17979l1 c17979l12) {
                r2 = str22;
                r3 = i112;
                r4 = str3;
                r5 = c3535c;
                r6 = enumC18030a;
                r7 = c7907e2;
                r8 = c17979l12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31983k0.this.m153847S(r2, r3, r4, r5, r6, r7, r8);
            }
        });
    }

    /* renamed from: l0 */
    public void m153914l0(C3535c c3535c, EnumC18030a enumC18030a, String str, String str2, long j11) {
        String str3;
        try {
            File file = new File(str);
            if (!file.exists()) {
                ToastUtils.showMess(MainApplication.getAppContext().getString(AbstractC8020f0.error_file_notexist));
                return;
            }
            long length = file.length();
            if (length > FileSelectView.f60686z1) {
                ToastUtils.showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_toast_upload_file_too_big, Integer.valueOf(AbstractC23309i.m121231Nd())));
                return;
            }
            if (length == 0) {
                ToastUtils.showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_err_upload_empty_file));
                return;
            }
            String name = file.getName();
            if (str2.equals("")) {
                str3 = name;
            } else {
                str3 = str2;
            }
            C17990p0 c17990p0 = new C17990p0(str3, 0, "", "", "", "", "");
            c17990p0.f91113B = length;
            c17990p0.f91115D = AbstractC23041d2.m118217p(name);
            c17990p0.f91127P = j11;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fileSize", c17990p0.f91113B);
            jSONObject.put("fileExt", c17990p0.f91115D);
            c17990p0.f91017v = jSONObject.toString();
            try {
                m153835A0(c3535c, enumC18030a, str, 22, c17990p0, new C17976k1(C20614e.m107305c(this.f147059p, true)));
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x001a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130 A[SYNTHETIC] */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m153915m0(List list) {
        Cursor m135983i;
        Cursor cursor;
        Throwable th2;
        String str;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        C31848b0 c31848b0 = new g() { // from class: zh.b0

            /* renamed from: b */
            public final /* synthetic */ AtomicInteger f146221b;

            public /* synthetic */ C31848b0(AtomicInteger atomicInteger2) {
                r2 = atomicInteger2;
            }

            @Override // p716zh.C31983k0.g
            /* renamed from: a */
            public final void mo153090a() {
                C31983k0.this.m153848T(r2);
            }
        };
        WeakReference weakReference = new WeakReference(this.f147044a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            try {
                m135983i = C26388b.m135983i(this.f147044a.getContext(), uri, null, null, null, null, null, false);
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            if (m135983i != null) {
                try {
                    if (m135983i.moveToFirst()) {
                        String string = m135983i.getString(m135983i.getColumnIndex("_display_name"));
                        int columnIndex = m135983i.getColumnIndex("_size");
                        if (!m135983i.isNull(columnIndex)) {
                            long j11 = m135983i.getLong(columnIndex);
                            if (j11 > 0) {
                                try {
                                    if (j11 >= FileSelectView.f60686z1) {
                                        ToastUtils.showMess(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_upload_file_limit), AbstractC23041d2.m118214m(Locale.ROOT, FileSelectView.f60686z1)));
                                        C2526d.f10270a.m12706c(j11, 0);
                                        m135983i.close();
                                        return;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    cursor = m135983i;
                                    if (cursor == null) {
                                    }
                                }
                            }
                            if (j11 == 0) {
                                ToastUtils.showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_err_upload_empty_file));
                                m135983i.close();
                                return;
                            }
                            String string2 = m135983i.getString(m135983i.getColumnIndex("document_id"));
                            if (string2.isEmpty()) {
                                str = "";
                            } else {
                                str = AbstractC23352g.m122788d(string2 + "_" + j11 + "_" + m135983i.getLong(m135983i.getColumnIndex("last_modified"))) + "_" + string;
                            }
                            cursor = m135983i;
                            try {
                                m153839J(this.f147051h, this.f147052i, uri, string, weakReference, atomicInteger2, c31848b0, str);
                            } catch (Throwable th4) {
                                th = th4;
                                th2 = th;
                                if (cursor == null) {
                                    try {
                                        cursor.close();
                                        throw th2;
                                    } catch (Throwable th5) {
                                        th2.addSuppressed(th5);
                                        throw th2;
                                    }
                                }
                                throw th2;
                            }
                        } else {
                            cursor = m135983i;
                        }
                        if (cursor == null) {
                            cursor.close();
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    cursor = m135983i;
                }
            }
            cursor = m135983i;
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_err_open_file_permission));
            if (cursor == null) {
            }
        }
        if (atomicInteger2.get() > 0) {
            this.f147044a.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_file_downloading));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0185 A[Catch: Exception -> 0x0188, TryCatch #1 {Exception -> 0x0188, blocks: (B:3:0x000a, B:5:0x0012, B:10:0x0020, B:13:0x002d, B:69:0x016e, B:71:0x0185, B:72:0x018a, B:74:0x01a8, B:75:0x01c1, B:81:0x016a), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8 A[Catch: Exception -> 0x0188, TryCatch #1 {Exception -> 0x0188, blocks: (B:3:0x000a, B:5:0x0012, B:10:0x0020, B:13:0x002d, B:69:0x016e, B:71:0x0185, B:72:0x018a, B:74:0x01a8, B:75:0x01c1, B:81:0x016a), top: B:2:0x000a }] */
    /* renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m153916n0(String str, String str2, String str3, String str4, String str5, int i11, int i12, C32024mb c32024mb, String str6, int i13, String str7, String str8, boolean z11, C17997r1 c17997r1) {
        JSONObject jSONObject;
        try {
            if (ContactProfile.m40346R0(CoreUtility.f89233i) && ContactProfile.m40346R0(this.f147051h.m17944I0()) && !m153841N0(this.f147051h.m17944I0())) {
                this.f147044a.m60020gQ().mo60548Cn(true);
                m153911i0();
                m153910h0();
                C17945a0 m94701P1 = C17945a0.m94701P1(str, 23, c17997r1);
                String str9 = "";
                try {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("width", i11);
                    } catch (Exception e11) {
                        e = e11;
                        e.printStackTrace();
                        C17993q0 c17993q0 = new C17993q0("", 0, str3, str2, "", "", str9);
                        if (!TextUtils.isEmpty(str6)) {
                        }
                        C17979l1 c17979l1 = new C17979l1();
                        c17979l1.f91062e = i13;
                        c17979l1.f91063f = str7;
                        m94701P1.m94882Eb(str2);
                        m94701P1.m95191la(c17993q0);
                        m94701P1.m94989Qa(c17979l1);
                        AbstractC19646n0.m102934T1(m94701P1, str8);
                        m153879s0(this.f147051h, m94701P1, true);
                        if (z11) {
                        }
                        this.f147048e.m99391M0(str8);
                    }
                } catch (Exception e12) {
                    e = e12;
                }
                try {
                    jSONObject.put("height", i12);
                    if (!TextUtils.isEmpty(str4)) {
                        jSONObject.put("hd", str4);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        jSONObject.put("small", str6);
                    }
                    if (c32024mb != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("source", c32024mb.m154402h());
                        if (c32024mb.m154402h() == 0) {
                            jSONObject2.put("subsource", c32024mb.m154403i());
                        }
                        if (!TextUtils.isEmpty(c32024mb.m154401g()) && c32024mb.m154401g().length() > 30) {
                            jSONObject2.put("keyword", c32024mb.m154401g().substring(0, 30));
                        } else {
                            jSONObject2.put("keyword", c32024mb.m154401g());
                        }
                        if (c32024mb.m154402h() == 1) {
                            if (c32024mb.m154400f() >= 0) {
                                jSONObject2.put("send_position", c32024mb.m154400f() + 1);
                            }
                            if (c32024mb.m154399e() >= 0) {
                                jSONObject2.put("max_visible_position", c32024mb.m154399e() + 1);
                            }
                            if (c32024mb.m154405k() >= 0) {
                                jSONObject2.put("total_list", c32024mb.m154405k());
                            }
                            if (c32024mb.m154406l() != -1) {
                                jSONObject2.put("version_keyword", c32024mb.m154406l());
                            }
                            if (c32024mb.m154395a() > 0) {
                                jSONObject2.put("hint_to_send_duration", c32024mb.m154395a());
                            }
                            if (c32024mb.m154404j() > 0) {
                                jSONObject2.put("suggest_type", c32024mb.m154404j());
                            }
                        }
                        jSONObject2.put("send_method", c32024mb.m154407m());
                        jSONObject.put("tracking", jSONObject2);
                        int m154402h = c32024mb.m154402h();
                        if (m154402h != 7) {
                            if (m154402h == 14) {
                            }
                        }
                        m153850U0(m154402h);
                    }
                    if (i13 != -1) {
                        jSONObject.put("source_type", i13);
                        jSONObject.put("source_action", str7);
                    }
                    jSONObject.put("contentId", str8);
                    str9 = jSONObject.toString();
                } catch (Exception e13) {
                    e = e13;
                    e.printStackTrace();
                    C17993q0 c17993q02 = new C17993q0("", 0, str3, str2, "", "", str9);
                    if (!TextUtils.isEmpty(str6)) {
                    }
                    C17979l1 c17979l12 = new C17979l1();
                    c17979l12.f91062e = i13;
                    c17979l12.f91063f = str7;
                    m94701P1.m94882Eb(str2);
                    m94701P1.m95191la(c17993q02);
                    m94701P1.m94989Qa(c17979l12);
                    AbstractC19646n0.m102934T1(m94701P1, str8);
                    m153879s0(this.f147051h, m94701P1, true);
                    if (z11) {
                    }
                    this.f147048e.m99391M0(str8);
                }
                C17993q0 c17993q022 = new C17993q0("", 0, str3, str2, "", "", str9);
                if (!TextUtils.isEmpty(str6)) {
                    c17993q022.f91136D = str6;
                }
                C17979l1 c17979l122 = new C17979l1();
                c17979l122.f91062e = i13;
                c17979l122.f91063f = str7;
                m94701P1.m94882Eb(str2);
                m94701P1.m95191la(c17993q022);
                m94701P1.m94989Qa(c17979l122);
                AbstractC19646n0.m102934T1(m94701P1, str8);
                m153879s0(this.f147051h, m94701P1, true);
                if (z11) {
                    C3255n.m16562n().m16575r(new C25809a(str3, str2, i11, i12, str6, str8));
                }
                this.f147048e.m99391M0(str8);
            }
        } catch (Exception e14) {
            e14.printStackTrace();
        }
    }

    /* renamed from: o0 */
    public void m153917o0(C18013y0 c18013y0, C7907e c7907e, C17979l1 c17979l1) {
        C26713e c26713e;
        String str = "";
        try {
            m153886E();
            if (c18013y0 == null || !ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(this.f147051h.m17944I0()) || m153841N0(this.f147051h.m17944I0())) {
                return;
            }
            this.f147044a.m60020gQ().mo60548Cn(true);
            m153911i0();
            m153910h0();
            C17945a0.w m95385u = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", this.f147051h.m17944I0(), CoreUtility.f89233i), 12).m95368d(c18013y0).m95381q(c7907e).m95385u(c17979l1);
            C32098s c32098s = c18013y0.f91251B;
            if (c32098s != null) {
                str = c32098s.m154934d();
            }
            C17945a0.w m95386v = m95385u.m95379o(str).m95386v(1);
            C32098s c32098s2 = c18013y0.f91251B;
            if (c32098s2 != null) {
                c26713e = c32098s2.f147968r;
            } else {
                c26713e = null;
            }
            C17945a0 m95365a = m95386v.m95383s(c26713e).m95365a();
            m95365a.m94951M9();
            C32098s c32098s3 = c18013y0.f91251B;
            if (c32098s3 != null && c32098s3.m154940j()) {
                AbstractC9183a.m49010r(m95365a);
            }
            m153879s0(this.f147051h, m95365a, true);
            m153909g0();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: p0 */
    public void m153918p0(C31868c5 c31868c5, String str, String str2, String str3, String str4, boolean z11) {
        m153835A0(m153888F(), m153886E(), "", 18, new C18002t0(str3, 0, "", "", str4, "", C18002t0.m95713g(c31868c5.m153170b(), c31868c5.m153169a(), str, str2, z11)), null);
    }

    /* renamed from: q0 */
    public void m153919q0(String str, String str2, C7907e c7907e, C17997r1 c17997r1, C17979l1 c17979l1, boolean z11) {
        m153920r0(str, str2, c7907e, c17997r1, c17979l1, z11, false, null);
    }

    /* renamed from: r0 */
    public void m153920r0(String str, String str2, C7907e c7907e, C17997r1 c17997r1, C17979l1 c17979l1, boolean z11, boolean z12, C17800i c17800i) {
        boolean z13;
        try {
            if (!ContactProfile.m40346R0(CoreUtility.f89233i) || !ContactProfile.m40346R0(str2) || m153841N0(this.f147051h.m17944I0())) {
                return;
            }
            if (!TextUtils.isEmpty(str.trim()) || c17997r1 != null) {
                m153911i0();
                m153910h0();
                if (!this.f147044a.m60020gQ().mo60532Ac()) {
                    this.f147044a.m60020gQ().mo60602M5();
                }
                if (z11) {
                    this.f147044a.mo60175qI();
                }
                if (this.f147044a.mo59878W5()) {
                    C2526d.f10270a.m12730w(C17988o1.a.f91108s, this.f147044a.f56793R1.f60438s.getQuickReplyGlobalMsgId());
                }
                boolean z14 = false;
                C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", this.f147051h.m17944I0(), CoreUtility.f89233i), 0).m95382r(str).m95381q(c7907e).m95351C(c17997r1).m95385u(c17979l1).m95386v(1).m95365a();
                m95365a.m94951M9();
                if (z12 && m95365a.f90744t2 != null) {
                    if (!m95365a.m95170j6()) {
                        if (c17979l1 == null) {
                            c17979l1 = new C17979l1();
                        }
                        c17979l1.f91067j = true;
                        m95365a.m94989Qa(c17979l1);
                    }
                } else {
                    if (c17979l1 == null) {
                        c17979l1 = new C17979l1();
                    }
                    c17979l1.f91067j = false;
                    m95365a.m94989Qa(c17979l1);
                }
                boolean m121258O3 = AbstractC23309i.m121258O3();
                int m121939gc = AbstractC23309i.m121939gc();
                if (m121258O3 && m121939gc != 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean m121221N3 = AbstractC23309i.m121221N3();
                int m121901fc = AbstractC23309i.m121901fc();
                if (m121221N3 && m121901fc != 1) {
                    z14 = true;
                }
                if (z13 || z14) {
                    m95365a.m95078a2(z13, z14);
                }
                AbstractC19646n0.m102931S1(m95365a);
                C0824j.m2153b(new a(m95365a));
                if (c17800i != null) {
                    m95365a.m94979Pa(new C17976k1(c17800i.m94038h()));
                }
                m153879s0(this.f147051h, m95365a, true);
                if (c17997r1 != null) {
                    if (c7907e != null && c7907e.m40861l() > 0) {
                        AbstractC23647d.m123906p("1000403");
                        AbstractC23647d.m123893c();
                    } else if (!TextUtils.isEmpty(str)) {
                        AbstractC23647d.m123906p("1000404");
                        AbstractC23647d.m123893c();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t0 */
    public void m153921t0(int i11, boolean z11) {
        int i12;
        try {
            if (System.currentTimeMillis() - this.f147053j >= 10000 && System.currentTimeMillis() - this.f147054k >= 3000 && this.f147045b.mo124314i() - m153892H() <= 3600000) {
                this.f147053j = System.currentTimeMillis();
                C0766k c0766k = new C0766k();
                if (this.f147051h.m17971y0().m41013q()) {
                    c0766k.mo1422E9(this.f147051h.m17944I0(), i11, this.f147044a.m60020gQ().mo60663X1());
                } else {
                    String m17944I0 = this.f147051h.m17944I0();
                    if (this.f147058o) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    c0766k.mo1573X7(m17944I0, i11, i12, z11);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u */
    public void m153922u(String str, int i11) {
        String str2;
        C17945a0 c17945a0 = this.f147061r;
        if (c17945a0 != null) {
            m153881v(c17945a0, str, i11);
            m153912j0();
        } else {
            AbstractPushToTalkControl abstractPushToTalkControl = this.f147044a.f56860i1;
            if (abstractPushToTalkControl == null) {
                str2 = "";
            } else {
                str2 = abstractPushToTalkControl.getFileRecordName();
            }
            if (!str2.equals("")) {
                m153927x(str2, i11);
            }
        }
        m153911i0();
        m153910h0();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: zh.d0.<init>(zh.k0, java.util.List, int, cj.c, dn.a, dj.r1, int):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: u0 */
    public void m153923u0(java.util.List r10, int r11, int r12, dj.C17997r1 r13) {
        /*
            r9 = this;
            dn.a r5 = r9.m153886E()
            r0 = 14
            if (r11 != r0) goto L10
            zh.o7 r0 = p716zh.C32050o7.m154655h()
            r0.m154659g()
            goto L17
        L10:
            zh.o7 r0 = p716zh.C32050o7.m154655h()
            r0.m154657c(r10)
        L17:
            if (r10 == 0) goto L49
            int r0 = r10.size()
            if (r0 <= 0) goto L49
            com.zing.zalo.ui.chat.ChatView r0 = r9.f147044a
            com.zing.zalo.ui.chat.c r0 = r0.m60020gQ()
            r1 = 1
            r0.mo60548Cn(r1)
            r9.m153911i0()
            r9.m153910h0()
            cj.c r4 = r9.m153888F()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r10)
            ag0.b1 r10 = ag0.AbstractC0837p0.m2225f()
            zh.d0 r8 = new zh.d0
            r0 = r8
            r1 = r9
            r3 = r12
            r6 = r13
            r7 = r11
            r0.<init>()
            r10.mo2040a(r8)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p716zh.C31983k0.m153923u0(java.util.List, int, int, dj.r1):void");
    }

    /* renamed from: v0 */
    public void m153924v0(String str, String str2, int i11, C17997r1 c17997r1) {
        m153926w0("", str, false, str2, null, null, i11, c17997r1);
    }

    /* renamed from: w */
    public void m153925w(String str) {
        m153927x(str, 0);
    }

    /* renamed from: w0 */
    public void m153926w0(String str, String str2, boolean z11, String str3, C7907e c7907e, C17979l1 c17979l1, int i11, C17997r1 c17997r1) {
        if (!TextUtils.isEmpty(str2)) {
            this.f147044a.m60020gQ().mo60548Cn(true);
            m153911i0();
            m153910h0();
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.a0

                /* renamed from: q */
                public final /* synthetic */ String f146096q;

                /* renamed from: r */
                public final /* synthetic */ String f146097r;

                /* renamed from: s */
                public final /* synthetic */ String f146098s;

                /* renamed from: t */
                public final /* synthetic */ int f146099t;

                /* renamed from: u */
                public final /* synthetic */ boolean f146100u;

                /* renamed from: v */
                public final /* synthetic */ C3535c f146101v;

                /* renamed from: w */
                public final /* synthetic */ EnumC18030a f146102w;

                /* renamed from: x */
                public final /* synthetic */ C7907e f146103x;

                /* renamed from: y */
                public final /* synthetic */ C17979l1 f146104y;

                /* renamed from: z */
                public final /* synthetic */ C17997r1 f146105z;

                public /* synthetic */ RunnableC31833a0(String str22, String str4, String str32, int i112, boolean z112, C3535c c3535c, EnumC18030a enumC18030a, C7907e c7907e2, C17979l1 c17979l12, C17997r1 c17997r12) {
                    r2 = str22;
                    r3 = str4;
                    r4 = str32;
                    r5 = i112;
                    r6 = z112;
                    r7 = c3535c;
                    r8 = enumC18030a;
                    r9 = c7907e2;
                    r10 = c17979l12;
                    r11 = c17997r12;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31983k0.this.m153851V(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
                }
            });
        }
    }

    /* renamed from: x */
    public void m153927x(String str, int i11) {
        AbstractPushToTalkControl abstractPushToTalkControl = this.f147044a.f56860i1;
        if (abstractPushToTalkControl != null && abstractPushToTalkControl.getMaxAmplitudeRecorder() <= 0) {
            this.f147044a.m59853UT(true);
            this.f147044a.mo60240ul(ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422);
        } else {
            C17964g1 c17964g1 = new C17964g1("", 0, "", "", "", "", "");
            c17964g1.m95544w(i11);
            c17964g1.m95529J();
            m153835A0(m153888F(), m153886E(), str, 6, c17964g1, null);
        }
    }

    /* renamed from: x0 */
    public void m153928x0(String str, String str2, int i11, C17997r1 c17997r1) {
        if (!TextUtils.isEmpty(str)) {
            this.f147044a.m60020gQ().mo60548Cn(true);
            m153911i0();
            m153910h0();
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.i0

                /* renamed from: q */
                public final /* synthetic */ String f146848q;

                /* renamed from: r */
                public final /* synthetic */ String f146849r;

                /* renamed from: s */
                public final /* synthetic */ int f146850s;

                /* renamed from: t */
                public final /* synthetic */ C3535c f146851t;

                /* renamed from: u */
                public final /* synthetic */ EnumC18030a f146852u;

                /* renamed from: v */
                public final /* synthetic */ C17997r1 f146853v;

                public /* synthetic */ RunnableC31953i0(String str3, String str22, int i112, C3535c c3535c, EnumC18030a enumC18030a, C17997r1 c17997r12) {
                    r2 = str3;
                    r3 = str22;
                    r4 = i112;
                    r5 = c3535c;
                    r6 = enumC18030a;
                    r7 = c17997r12;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31983k0.this.m153852W(r2, r3, r4, r5, r6, r7);
                }
            });
        }
    }

    /* renamed from: y */
    public void m153929y() {
        try {
            C17945a0 c17945a0 = this.f147061r;
            if (c17945a0 != null && c17945a0.m95062Y4() != null) {
                this.f147061r.m94874Db(false);
                this.f147061r.m95062Y4().m13375d();
            }
            m153912j0();
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f147043s, e11);
        }
    }

    /* renamed from: y0 */
    public void m153930y0(C29058f c29058f, int i11, String str, boolean z11, C32024mb c32024mb, C17997r1 c17997r1, C25811c c25811c) {
        if (c29058f != null) {
            this.f147044a.m60020gQ().mo60548Cn(true);
            m153911i0();
            m153910h0();
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.y

                /* renamed from: q */
                public final /* synthetic */ C29058f f148400q;

                /* renamed from: r */
                public final /* synthetic */ C25811c f148401r;

                /* renamed from: s */
                public final /* synthetic */ C32024mb f148402s;

                /* renamed from: t */
                public final /* synthetic */ int f148403t;

                /* renamed from: u */
                public final /* synthetic */ String f148404u;

                /* renamed from: v */
                public final /* synthetic */ C17997r1 f148405v;

                /* renamed from: w */
                public final /* synthetic */ boolean f148406w;

                public /* synthetic */ RunnableC32182y(C29058f c29058f2, C25811c c25811c2, C32024mb c32024mb2, int i112, String str2, C17997r1 c17997r12, boolean z112) {
                    r2 = c29058f2;
                    r3 = c25811c2;
                    r4 = c32024mb2;
                    r5 = i112;
                    r6 = str2;
                    r7 = c17997r12;
                    r8 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C31983k0.this.m153853X(r2, r3, r4, r5, r6, r7, r8);
                }
            });
        }
    }

    /* renamed from: z */
    public void m153931z(String str) {
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new f(str));
            this.f147044a.mo59643G0();
            c0766k.mo1541T7(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f147044a.mo49315c4();
        }
    }

    /* renamed from: z0 */
    public void m153932z0(C3535c c3535c, EnumC18030a enumC18030a, String str, int i11, C17969i0 c17969i0, C7907e c7907e, C17979l1 c17979l1, C17976k1 c17976k1, C17997r1 c17997r1) {
        this.f147044a.m60020gQ().mo60548Cn(true);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sendRichMessage: ");
        sb2.append(str);
        m153911i0();
        m153910h0();
        m153878s(c3535c, enumC18030a, str, i11, c17969i0, c7907e, c17979l1, c17976k1, c17997r1);
    }
}
