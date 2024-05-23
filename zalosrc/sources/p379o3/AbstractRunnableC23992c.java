package p379o3;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Xml;
import android.webkit.URLUtil;
import com.androidquery.util.AbstractC3972e;
import com.androidquery.util.C3983p;
import com.androidquery.util.C3988u;
import com.androidquery.util.RunnableC3975h;
import com.androidquery.util.RunnableC3984q;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.NativeHttpDownload;
import com.zing.zalocore.connection.socket.RequestDownloadListener;
import fg0.ThreadFactoryC18930c;
import hm0.C20096c;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import lu.C22652b;
import me0.AbstractC23041d2;
import me0.AbstractC23228u2;
import me0.AbstractC23238v2;
import me0.AbstractC23254w8;
import me0.AbstractC23258x2;
import mm0.AbstractC23347b;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.xmlpull.v1.XmlPullParser;
import p141ex.C18626a;
import p141ex.RunnableC18629d;
import p248iy.AbstractC20887g;
import p379o3.AbstractRunnableC23992c;
import p406ow.C24574j;
import p471r3.C25630b;
import p502s3.C26117c;
import p620wt.AbstractC29237l;
import s00.AbstractC26080o;

/* renamed from: o3.c */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC23992c implements Runnable {

    /* renamed from: g0 */
    private static boolean f116110g0 = false;

    /* renamed from: h0 */
    private static int f116111h0 = 30000;

    /* renamed from: i0 */
    private static String f116112i0 = null;

    /* renamed from: j0 */
    private static int f116113j0 = 4;

    /* renamed from: k0 */
    private static int f116114k0 = 2;

    /* renamed from: l0 */
    private static boolean f116115l0 = true;

    /* renamed from: m0 */
    private static int f116116m0;

    /* renamed from: q0 */
    private static C18626a f116120q0;

    /* renamed from: r0 */
    private static C18626a f116121r0;

    /* renamed from: s0 */
    private static C18626a f116122s0;

    /* renamed from: t0 */
    private static C18626a f116123t0;

    /* renamed from: A */
    private File f116125A;

    /* renamed from: B */
    protected File f116126B;

    /* renamed from: C */
    protected C23995f f116127C;

    /* renamed from: F */
    protected boolean f116130F;

    /* renamed from: G */
    protected boolean f116131G;

    /* renamed from: H */
    protected boolean f116132H;

    /* renamed from: J */
    private long f116134J;

    /* renamed from: L */
    private WeakReference f116136L;

    /* renamed from: O */
    protected int f116139O;

    /* renamed from: R */
    private ContentResolver f116142R;

    /* renamed from: U */
    protected C25630b f116145U;

    /* renamed from: Z */
    private Runnable f116150Z;

    /* renamed from: a0 */
    private Runnable f116151a0;

    /* renamed from: d0 */
    private boolean f116154d0;

    /* renamed from: e0 */
    private boolean f116155e0;

    /* renamed from: f0 */
    private boolean f116156f0;

    /* renamed from: p */
    private Class f116157p;

    /* renamed from: q */
    private Reference f116158q;

    /* renamed from: r */
    private Object f116159r;

    /* renamed from: s */
    private String f116160s;

    /* renamed from: t */
    private WeakReference f116161t;

    /* renamed from: u */
    String f116162u;

    /* renamed from: v */
    private Map f116163v;

    /* renamed from: w */
    private Map f116164w;

    /* renamed from: x */
    private Map f116165x;

    /* renamed from: y */
    protected Object f116166y;

    /* renamed from: n0 */
    protected static final Map f116117n0 = new ConcurrentHashMap();

    /* renamed from: o0 */
    private static final Map f116118o0 = new ConcurrentHashMap();

    /* renamed from: p0 */
    private static final Class[] f116119p0 = {String.class, Object.class, C23995f.class};

    /* renamed from: u0 */
    private static int f116124u0 = 200;

    /* renamed from: z */
    protected int f116167z = 0;

    /* renamed from: D */
    protected int f116128D = 2;

    /* renamed from: E */
    protected boolean f116129E = false;

    /* renamed from: I */
    private int f116133I = 0;

    /* renamed from: K */
    private String f116135K = "UTF-8";

    /* renamed from: M */
    private int f116137M = 4;

    /* renamed from: N */
    protected int f116138N = 0;

    /* renamed from: P */
    private int f116140P = 0;

    /* renamed from: Q */
    private boolean f116141Q = true;

    /* renamed from: S */
    private boolean f116143S = false;

    /* renamed from: T */
    private int f116144T = 0;

    /* renamed from: V */
    private boolean f116146V = false;

    /* renamed from: W */
    private boolean f116147W = false;

    /* renamed from: X */
    protected AtomicBoolean f116148X = new AtomicBoolean(false);

    /* renamed from: Y */
    protected AtomicBoolean f116149Y = new AtomicBoolean(false);

    /* renamed from: b0 */
    private boolean f116152b0 = true;

    /* renamed from: c0 */
    private c f116153c0 = null;

    /* renamed from: o3.c$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Context f116168p;

        a(Context context) {
            this.f116168p = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractRunnableC23992c.this.m125639x1(this.f116168p);
            AbstractRunnableC23992c.f116118o0.remove(this);
        }
    }

    /* renamed from: o3.c$b */
    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Context f116170p;

        b(Context context) {
            this.f116170p = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractRunnableC23992c abstractRunnableC23992c = AbstractRunnableC23992c.this;
            AbstractC3972e.m18747D(abstractRunnableC23992c.mo125610h0(this.f116170p, abstractRunnableC23992c.f116167z), AbstractRunnableC23992c.this.f116162u);
            AbstractRunnableC23992c.f116118o0.remove(this);
        }
    }

    /* renamed from: o3.c$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: b */
        void mo65969b(String str);

        /* renamed from: c */
        void mo65970c(String str, int i11);

        /* renamed from: d */
        void mo65971d(String str, int i11);

        /* renamed from: e */
        void mo65972e(String str);

        /* renamed from: f */
        void mo65973f(String str);
    }

    /* renamed from: o3.c$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a */
        private static final NativeHttpDownload f116172a = NativeHttpDownload.m93195d(new NativeHttpDownload.InterfaceC17518a() { // from class: o3.d
            @Override // com.zing.zalocore.connection.socket.NativeHttpDownload.InterfaceC17518a
            /* renamed from: a */
            public final void mo93201a(boolean z11, boolean z12, int i11, int i12, int i13, long j11, long j12, long j13, byte[] bArr) {
                AbstractRunnableC23992c.d.m125645d(z11, z12, i11, i12, i13, j11, j12, j13, bArr);
            }
        });

        /* renamed from: o3.c$d$a */
        /* loaded from: classes2.dex */
        public class a extends RequestDownloadListener {

            /* renamed from: c */
            final /* synthetic */ AbstractRunnableC23992c f116173c;

            /* renamed from: d */
            final /* synthetic */ String f116174d;

            /* renamed from: e */
            final /* synthetic */ File f116175e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(AbstractRunnableC23992c abstractRunnableC23992c, AbstractRunnableC23992c abstractRunnableC23992c2, String str, File file) {
                super(abstractRunnableC23992c);
                this.f116173c = abstractRunnableC23992c2;
                this.f116174d = str;
                this.f116175e = file;
            }

            @Override // com.zing.zalocore.connection.socket.RequestDownloadListener
            public void onDownloadBufferComplete(int i11, int i12, byte[] bArr, int i13) {
                boolean z11;
                AbstractRunnableC23992c abstractRunnableC23992c = (AbstractRunnableC23992c) m93268a();
                if (abstractRunnableC23992c == null) {
                    this.f116173c.mo125589G(this.f116174d, -104);
                    return;
                }
                abstractRunnableC23992c.f116148X.set(false);
                C24574j.m127992c().m128000j();
                abstractRunnableC23992c.f116147W = false;
                AbstractRunnableC23992c.m125531M0("dlt End Download time: " + this.f116174d + " " + System.currentTimeMillis());
                if (i12 != 302 && i12 != 301 && i12 != 303) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (i12 >= 300 && z11) {
                    try {
                        if (!this.f116174d.contains("https://graph.facebook.com")) {
                            AbstractC3972e.m18794m("cleanCachedRedirect", abstractRunnableC23992c.f116162u);
                            abstractRunnableC23992c.mo125592I(abstractRunnableC23992c.f116162u);
                            abstractRunnableC23992c.f116127C.m125674y(i12);
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                if (z11 && ((i12 == 301 || i12 == 302) && !this.f116174d.contains("https://graph.facebook.com"))) {
                    AbstractC3972e.m18794m("cleanCachedRedirect", abstractRunnableC23992c.f116162u);
                    abstractRunnableC23992c.mo125592I(abstractRunnableC23992c.f116162u);
                    abstractRunnableC23992c.f116127C.m125674y(i12);
                }
                AbstractC3972e.m18794m("response", Integer.valueOf(i12));
                abstractRunnableC23992c.f116127C.m125652c(i12).m125670u("").m125655f(null).m125671v("").m125649C(new Date()).m125653d(bArr).m125656g(null).m125648B(0);
                try {
                    abstractRunnableC23992c.f116166y = abstractRunnableC23992c.mo125625q1(abstractRunnableC23992c.f116162u, bArr, abstractRunnableC23992c.f116127C);
                } catch (Exception e12) {
                    AbstractC3972e.m18796n(e12);
                }
                if (abstractRunnableC23992c.f116166y == null) {
                    AbstractRunnableC23992c.m125531M0("Result Null 1: " + this.f116174d);
                }
                if (abstractRunnableC23992c.f116166y == null && bArr != null) {
                    abstractRunnableC23992c.f116127C.m125652c(-103).m125670u("transform error");
                    AbstractRunnableC23992c.m125531M0("Result Null 2: " + this.f116174d);
                }
                AbstractRunnableC23992c.f116124u0 = abstractRunnableC23992c.f116127C.m125657h();
                abstractRunnableC23992c.m125546X0();
                if (AbstractRunnableC23992c.f116124u0 == 200) {
                    this.f116173c.mo125587F();
                } else {
                    this.f116173c.mo125589G(this.f116174d, AbstractRunnableC23992c.f116124u0);
                }
            }

            @Override // com.zing.zalocore.connection.socket.RequestDownloadListener
            public void onDownloadFail(C20096c c20096c) {
                super.onDownloadFail(c20096c);
            }

            /* JADX WARN: Code restructure failed: missing block: B:120:0x00c5, code lost:            if (r20.f116175e.length() < r10) goto L291;     */
            /* JADX WARN: Removed duplicated region for block: B:100:0x0134 A[Catch: Exception -> 0x0144, TryCatch #5 {Exception -> 0x0144, blocks: (B:30:0x0146, B:32:0x0151, B:36:0x0161, B:37:0x0165, B:98:0x012c, B:100:0x0134), top: B:97:0x012c }] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x019e  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x01b5  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0202  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0213  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x0219  */
            @Override // com.zing.zalocore.connection.socket.RequestDownloadListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onDownloadHttpComplete(int i11, int i12, byte[] bArr, int i13, boolean z11) {
                int i14;
                byte[] bArr2;
                int i15;
                int i16;
                File file;
                AbstractRunnableC23992c abstractRunnableC23992c = (AbstractRunnableC23992c) m93268a();
                if (abstractRunnableC23992c == null) {
                    this.f116173c.mo125589G(this.f116174d, -104);
                    return;
                }
                abstractRunnableC23992c.f116148X.set(false);
                C24574j.m127992c().m128000j();
                abstractRunnableC23992c.f116147W = false;
                if (i11 != -4 && i11 != 42) {
                    int i17 = i12;
                    if (i17 == 206) {
                        i17 = 200;
                    }
                    File file2 = this.f116175e == null ? new File(new String(bArr)) : null;
                    boolean z12 = i17 == 302 || i17 == 301 || i17 == 303;
                    try {
                        if (i17 >= 300) {
                            if (z12 && !this.f116174d.contains("https://graph.facebook.com")) {
                                AbstractC3972e.m18794m("cleanCachedRedirect", abstractRunnableC23992c.f116162u);
                                abstractRunnableC23992c.mo125592I(abstractRunnableC23992c.f116162u);
                                abstractRunnableC23992c.f116127C.m125674y(i17);
                            }
                            i14 = i17;
                            i16 = 0;
                            bArr2 = null;
                        } else {
                            try {
                                int max = Math.max(32, Math.min(65536, i13));
                                if (this.f116175e == null && file2.exists()) {
                                    bArr2 = AbstractC23238v2.m119724i(file2);
                                    i15 = i17;
                                } else {
                                    File file3 = this.f116175e;
                                    if (file3 != null) {
                                        try {
                                            if (file3.exists()) {
                                                if (this.f116175e.length() != 0) {
                                                    i15 = i17;
                                                } else {
                                                    i15 = i17;
                                                }
                                                try {
                                                    this.f116175e.delete();
                                                    bArr2 = null;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    i14 = i15;
                                                    bArr2 = null;
                                                    e.printStackTrace();
                                                    if (i11 == 0) {
                                                    }
                                                    AbstractRunnableC23992c.f116124u0 = abstractRunnableC23992c.f116127C.m125657h();
                                                    abstractRunnableC23992c.m125546X0();
                                                    if (file2 != null) {
                                                    }
                                                    if (AbstractRunnableC23992c.f116124u0 == 200) {
                                                    }
                                                }
                                            }
                                        } catch (Exception e12) {
                                            e = e12;
                                            i15 = i17;
                                        }
                                    }
                                    i15 = i17;
                                    bArr2 = null;
                                }
                                try {
                                    file = this.f116175e;
                                } catch (Exception e13) {
                                    try {
                                        e13.printStackTrace();
                                    } catch (Exception e14) {
                                        e = e14;
                                        i14 = i15;
                                        e.printStackTrace();
                                        if (i11 == 0) {
                                        }
                                        AbstractRunnableC23992c.f116124u0 = abstractRunnableC23992c.f116127C.m125657h();
                                        abstractRunnableC23992c.m125546X0();
                                        if (file2 != null) {
                                        }
                                        if (AbstractRunnableC23992c.f116124u0 == 200) {
                                        }
                                    }
                                }
                                if (file != null && !file.getAbsolutePath().endsWith(".apk") && !this.f116175e.getAbsolutePath().endsWith(".mp4") && !this.f116175e.getAbsolutePath().endsWith(".zip") && !AbstractC23258x2.m119957p(this.f116175e, false) && i13 != 0 && i13 != this.f116175e.length()) {
                                    this.f116175e.delete();
                                    i16 = -1001;
                                    i14 = i15;
                                    if (z12 && (i14 == 301 || i14 == 302)) {
                                        try {
                                            if (!this.f116174d.contains("https://graph.facebook.com")) {
                                                AbstractC3972e.m18794m("cleanCachedRedirect", abstractRunnableC23992c.f116162u);
                                                abstractRunnableC23992c.mo125592I(abstractRunnableC23992c.f116162u);
                                                abstractRunnableC23992c.f116127C.m125674y(i14);
                                            }
                                        } catch (Exception e15) {
                                            e = e15;
                                            e.printStackTrace();
                                            if (i11 == 0) {
                                                try {
                                                    abstractRunnableC23992c.f116166y = abstractRunnableC23992c.mo125625q1(abstractRunnableC23992c.f116162u, bArr2, abstractRunnableC23992c.f116127C);
                                                } catch (Exception e16) {
                                                    AbstractC3972e.m18796n(e16);
                                                }
                                                if (abstractRunnableC23992c.f116166y == null) {
                                                }
                                                if (abstractRunnableC23992c.f116166y == null) {
                                                    abstractRunnableC23992c.f116127C.m125652c(-103).m125670u("transform error");
                                                    AbstractRunnableC23992c.m125531M0("Result Null 2: " + this.f116174d);
                                                }
                                            }
                                            AbstractRunnableC23992c.f116124u0 = abstractRunnableC23992c.f116127C.m125657h();
                                            abstractRunnableC23992c.m125546X0();
                                            if (file2 != null) {
                                                file2.delete();
                                            }
                                            if (AbstractRunnableC23992c.f116124u0 == 200) {
                                            }
                                        }
                                    }
                                }
                                i16 = 0;
                                i14 = i15;
                                if (z12) {
                                    if (!this.f116174d.contains("https://graph.facebook.com")) {
                                    }
                                }
                            } catch (Exception e17) {
                                e = e17;
                                i14 = i17;
                                bArr2 = null;
                            }
                        }
                        AbstractC3972e.m18794m("response", Integer.valueOf(i14));
                        if (bArr2 != null) {
                            AbstractC3972e.m18794m(Integer.valueOf(bArr2.length), this.f116174d);
                        }
                        File file4 = (i11 == 0 && i14 == 200) ? this.f116175e : null;
                        abstractRunnableC23992c.f116127C.m125675z(false);
                        abstractRunnableC23992c.f116127C.m125652c(i14).m125670u("").m125655f(null).m125671v("").m125649C(new Date()).m125653d(bArr2).m125656g(file4).m125648B(i16);
                    } catch (Exception e18) {
                        e = e18;
                        i14 = i17;
                    }
                    if (i11 == 0 && i14 == 200) {
                        abstractRunnableC23992c.f116166y = abstractRunnableC23992c.mo125625q1(abstractRunnableC23992c.f116162u, bArr2, abstractRunnableC23992c.f116127C);
                        if (abstractRunnableC23992c.f116166y == null) {
                            AbstractRunnableC23992c.m125531M0("Result Null 1: " + this.f116174d);
                        }
                        if (abstractRunnableC23992c.f116166y == null && bArr2 != null) {
                            abstractRunnableC23992c.f116127C.m125652c(-103).m125670u("transform error");
                            AbstractRunnableC23992c.m125531M0("Result Null 2: " + this.f116174d);
                        }
                    }
                    AbstractRunnableC23992c.f116124u0 = abstractRunnableC23992c.f116127C.m125657h();
                    abstractRunnableC23992c.m125546X0();
                    if (file2 != null && file2.exists()) {
                        file2.delete();
                    }
                    if (AbstractRunnableC23992c.f116124u0 == 200) {
                        this.f116173c.mo125589G(this.f116174d, AbstractRunnableC23992c.f116124u0);
                        return;
                    } else {
                        this.f116173c.mo125587F();
                        return;
                    }
                }
                this.f116173c.mo125589G(this.f116174d, i11);
            }

            @Override // com.zing.zalocore.connection.socket.RequestDownloadListener
            public void onProgressUpdate(int i11) {
                this.f116173c.mo125591H(this.f116174d, i11);
            }
        }

        /* renamed from: b */
        static void m125643b(String str, int i11) {
            AbstractRunnableC23992c.m125531M0("Cancel: " + str);
            f116172a.m93197a(str, i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0079 A[Catch: Exception -> 0x005c, TryCatch #0 {Exception -> 0x005c, blocks: (B:3:0x004e, B:5:0x0056, B:7:0x005e, B:9:0x0065, B:13:0x0070, B:15:0x0079, B:17:0x0084, B:19:0x008a, B:20:0x0091), top: B:2:0x004e }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static void m125644c(String str, Map map, AbstractRunnableC23992c abstractRunnableC23992c) {
            boolean z11;
            boolean startsWith;
            Map map2;
            abstractRunnableC23992c.f116148X.set(true);
            abstractRunnableC23992c.f116127C.m125675z(true);
            String m18759P = AbstractC3972e.m18759P(str);
            C24574j.m127992c().m127999i();
            abstractRunnableC23992c.f116147W = true;
            AbstractRunnableC23992c.m125531M0(Thread.currentThread().getName() + "** Start Download time: " + abstractRunnableC23992c.f116138N + " " + m18759P + " " + System.currentTimeMillis());
            try {
                File m125573o0 = abstractRunnableC23992c.m125573o0();
                String str2 = "";
                if (m125573o0 != null) {
                    str2 = m125573o0.getPath();
                }
                String str3 = str2;
                if (abstractRunnableC23992c.f116144T != 0 && abstractRunnableC23992c.f116144T != 2) {
                    z11 = false;
                    startsWith = m18759P.startsWith("https");
                    if (map != null) {
                        map2 = new HashMap();
                    } else {
                        map2 = map;
                    }
                    if (startsWith && abstractRunnableC23992c.f116152b0) {
                        map2.putAll(AbstractC23228u2.m119703b());
                    }
                    f116172a.m93199c(m18759P, abstractRunnableC23992c.f116138N, str3, abstractRunnableC23992c.hashCode(), !abstractRunnableC23992c.f116130F, z11, true, startsWith, new a(abstractRunnableC23992c, abstractRunnableC23992c, m18759P, m125573o0), map2, abstractRunnableC23992c.f116128D, abstractRunnableC23992c.f116129E);
                }
                z11 = true;
                startsWith = m18759P.startsWith("https");
                if (map != null) {
                }
                if (startsWith) {
                    map2.putAll(AbstractC23228u2.m119703b());
                }
                f116172a.m93199c(m18759P, abstractRunnableC23992c.f116138N, str3, abstractRunnableC23992c.hashCode(), !abstractRunnableC23992c.f116130F, z11, true, startsWith, new a(abstractRunnableC23992c, abstractRunnableC23992c, m18759P, m125573o0), map2, abstractRunnableC23992c.f116128D, abstractRunnableC23992c.f116129E);
            } catch (Exception e11) {
                AbstractC3972e.m18796n(e11);
                e11.printStackTrace();
                abstractRunnableC23992c.m125546X0();
            }
        }

        /* renamed from: d */
        public static /* synthetic */ void m125645d(boolean z11, boolean z12, int i11, int i12, int i13, long j11, long j12, long j13, byte[] bArr) {
            AbstractC20887g.m109221H(z11, z12, i11, i12, i13, j11, new String(bArr), j12, j13);
            if (bArr.length > 0 && i12 > 0) {
                AbstractC20887g.m109231i(CoreUtility.f89233i, i11, new String(bArr), 0L, i12, CoreUtility.f89236l);
            }
        }

        /* renamed from: e */
        static boolean m125646e(String str) {
            AbstractRunnableC23992c.m125531M0("** Update Priority: " + str);
            return f116172a.m93200f(str);
        }
    }

    /* renamed from: A0 */
    private void m125516A0(String str, Map map, C23995f c23995f) {
        AbstractC3972e.m18794m("get", str);
        d.m125644c(m125544V0(str), map, this);
    }

    /* renamed from: A1 */
    private static void m125517A1(DataOutputStream dataOutputStream, String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof File) {
            FileInputStream fileInputStream = null;
            try {
                File file = (File) obj;
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    m125581y1(dataOutputStream, str, file.getName(), fileInputStream2);
                    try {
                        fileInputStream2.close();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (obj instanceof byte[]) {
            m125581y1(dataOutputStream, str, str, new ByteArrayInputStream((byte[]) obj));
        } else if (obj instanceof InputStream) {
            m125581y1(dataOutputStream, str, str, (InputStream) obj);
        } else {
            m125583z1(dataOutputStream, str, obj.toString());
        }
    }

    /* renamed from: B0 */
    private void m125518B0(String str, Map map, Map map2, C23995f c23995f) {
        String str2;
        AbstractC3972e.m18794m("multipart", str);
        URL url = new URL(str);
        C22652b.m117234a(url.toString());
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setConnectTimeout(f116111h0 * 4);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;charset=utf-8;boundary=*****");
        if (map != null) {
            for (String str3 : map.keySet()) {
                httpURLConnection.setRequestProperty(str3, (String) map.get(str3));
            }
        }
        String m125534O0 = m125534O0();
        if (m125534O0 != null) {
            httpURLConnection.setRequestProperty("Cookie", m125534O0);
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        for (Map.Entry entry : map2.entrySet()) {
            m125517A1(dataOutputStream, (String) entry.getKey(), entry.getValue());
        }
        dataOutputStream.writeBytes("--*****--\r\n");
        dataOutputStream.flush();
        dataOutputStream.close();
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        String contentEncoding = httpURLConnection.getContentEncoding();
        byte[] bArr = null;
        if (responseCode >= 200 && responseCode < 300) {
            str2 = null;
            bArr = m125574p1(contentEncoding, httpURLConnection.getInputStream());
        } else {
            str2 = new String(m125574p1(contentEncoding, httpURLConnection.getErrorStream()), StandardCharsets.UTF_8);
            AbstractC3972e.m18794m(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, str2);
        }
        AbstractC3972e.m18794m("response", Integer.valueOf(responseCode));
        if (bArr != null) {
            AbstractC3972e.m18794m(Integer.valueOf(bArr.length), str);
        }
        c23995f.m125652c(responseCode).m125670u(responseMessage).m125671v(str).m125649C(new Date()).m125653d(bArr).m125655f(str2);
    }

    /* renamed from: C0 */
    private void m125519C0(String str, Map map, Map map2, C23995f c23995f) {
        AbstractC3972e.m18794m("post", str);
        m125582z0(str, map, map2, c23995f);
    }

    /* renamed from: D */
    public static void m125520D() {
        C18626a c18626a = f116120q0;
        if (c18626a != null) {
            c18626a.shutdownNow();
            f116120q0 = null;
        }
        C23999j.m125718a2();
        f116118o0.clear();
    }

    /* renamed from: D0 */
    private void m125521D0(String str, Map map, Map map2, C23995f c23995f) {
        AbstractC3972e.m18794m("put", str);
        m125582z0(str, map, map2, c23995f);
    }

    /* renamed from: E0 */
    private boolean m125522E0() {
        WeakReference weakReference = this.f116136L;
        if (weakReference == null) {
            return true;
        }
        Activity activity = (Activity) weakReference.get();
        if (activity != null && !activity.isFinishing()) {
            return true;
        }
        return false;
    }

    /* renamed from: H0 */
    private static boolean m125523H0(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            AbstractC3972e.m18794m(entry.getKey(), value);
            if ((value instanceof File) || (value instanceof byte[]) || (value instanceof InputStream)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I0 */
    private static boolean m125524I0(BitmapFactory.Options options) {
        int i11;
        int i12 = options.inTargetDensity;
        if (i12 > 0 && (i11 = options.inDensity) > 0 && i12 != i11) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    private void m125525J() {
        this.f116158q = null;
        this.f116159r = null;
        this.f116161t = null;
        this.f116136L = null;
        this.f116153c0 = null;
    }

    /* renamed from: K */
    public static void m125526K() {
        f116118o0.clear();
    }

    /* renamed from: K0 */
    public /* synthetic */ void m125527K0(int i11) {
        d.m125643b(this.f116162u, i11);
    }

    /* renamed from: L */
    private void m125528L() {
        Bitmap mo125630t0;
        Bitmap thumbnail;
        m125531M0("content work: " + this.f116162u);
        if (TextUtils.isEmpty(this.f116162u)) {
            return;
        }
        if (this.f116162u.startsWith("content://")) {
            String[] split = this.f116162u.substring(10).split("&", 4);
            if (split.length > 0) {
                String str = null;
                String str2 = null;
                int i11 = -1;
                for (String str3 : split) {
                    try {
                        if (str3 != null) {
                            String[] split2 = str3.split("=");
                            if (split2.length == 2) {
                                if ("id".equals(split2[0])) {
                                    i11 = Integer.parseInt(split2[1]);
                                } else if ("data".equals(split2[0])) {
                                    str = split2[1];
                                } else if (ZinstantMetaConstant.IMPRESSION_META_TYPE.equals(split2[0])) {
                                    str2 = split2[1];
                                }
                            }
                        }
                    } catch (Exception e11) {
                        m125531M0(e11.toString());
                    }
                }
                try {
                    if (!TextUtils.isEmpty(str)) {
                        str = URLDecoder.decode(str, "UTF-8");
                    }
                } catch (Exception e12) {
                    m125531M0(e12.toString());
                }
                if (i11 > -1 && !TextUtils.isEmpty(str) && "video".equals(str2)) {
                    try {
                        AbstractC20110a.m104535d("getThumbnail from system: %d", Integer.valueOf(i11));
                        if ("video".equals(str2)) {
                            thumbnail = MediaStore.Video.Thumbnails.getThumbnail(this.f116142R, i11, 1, null);
                        } else {
                            thumbnail = MediaStore.Images.Thumbnails.getThumbnail(this.f116142R, i11, 3, null);
                        }
                        if (thumbnail != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            thumbnail.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            thumbnail.recycle();
                            this.f116127C.m125652c(200).m125670u(null).m125655f(null).m125671v(null).m125649C(new Date()).m125653d(byteArray);
                            this.f116166y = mo125625q1(this.f116162u, byteArray, this.f116127C);
                            f116124u0 = this.f116127C.m125657h();
                            this.f116127C.m125654e();
                        }
                    } catch (Exception e13) {
                        m125531M0(e13.toString());
                    }
                }
                if (this.f116166y == null && TextUtils.isEmpty(str)) {
                    AbstractC20110a.m104538g("AQuery careful with wrong cache of %s", this.f116162u);
                    str = this.f116162u;
                }
                if (this.f116166y == null && !TextUtils.isEmpty(str)) {
                    try {
                        AbstractC20110a.m104535d("genThumbnail: %s", str);
                        if ("video".equals(str2)) {
                            mo125630t0 = m125634v0(str);
                        } else {
                            mo125630t0 = mo125630t0(str);
                        }
                        if (mo125630t0 != null) {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            mo125630t0.compress(Bitmap.CompressFormat.JPEG, 90, byteArrayOutputStream2);
                            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                            byteArrayOutputStream2.close();
                            mo125630t0.recycle();
                            this.f116127C.m125652c(200).m125670u(null).m125655f(null).m125671v(null).m125649C(new Date()).m125653d(byteArray2);
                            this.f116166y = mo125625q1(this.f116162u, byteArray2, this.f116127C);
                            f116124u0 = this.f116127C.m125657h();
                            this.f116127C.m125654e();
                        }
                    } catch (Exception e14) {
                        m125531M0(e14.toString());
                    }
                }
            }
        }
        if (this.f116166y == null) {
            this.f116127C.m125652c(-104).m125670u("gen thumb error");
        }
    }

    /* renamed from: L0 */
    public /* synthetic */ void m125529L0(Object obj, boolean z11) {
        RunnableC3975h.m18829k(obj, this.f116162u, z11);
    }

    /* renamed from: M */
    private void m125530M(InputStream inputStream, OutputStream outputStream, String str, int i11) {
        Object obj;
        if ("gzip".equalsIgnoreCase(str)) {
            inputStream = new GZIPInputStream(inputStream);
        }
        WeakReference weakReference = this.f116161t;
        RunnableC3984q runnableC3984q = null;
        if (weakReference != null) {
            obj = weakReference.get();
        } else {
            obj = null;
        }
        if (obj != null) {
            runnableC3984q = new RunnableC3984q(obj);
        }
        AbstractC3972e.m18790k(inputStream, outputStream, i11, runnableC3984q);
    }

    /* renamed from: M0 */
    public static void m125531M0(String str) {
    }

    /* renamed from: N */
    private String m125532N(byte[] bArr, String str, C23995f c23995f) {
        String str2 = null;
        try {
            if (!"utf-8".equalsIgnoreCase(str)) {
                return new String(bArr, str);
            }
            Charset charset = StandardCharsets.UTF_8;
            String str3 = new String(bArr, charset);
            try {
                String m125566k0 = m125566k0(str3);
                AbstractC3972e.m18794m("parsing needed", m125566k0);
                if (m125566k0 != null && !"utf-8".equalsIgnoreCase(m125566k0)) {
                    AbstractC3972e.m18794m("correction needed", m125566k0);
                    String str4 = new String(bArr, m125566k0);
                    try {
                        c23995f.m125653d(str4.getBytes(charset));
                        return str4;
                    } catch (Exception e11) {
                        e = e11;
                        str2 = str4;
                        AbstractC3972e.m18779e0(e);
                        return str2;
                    }
                }
                return str3;
            } catch (Exception e12) {
                e = e12;
                str2 = str3;
            }
        } catch (Exception e13) {
            e = e13;
        }
    }

    /* renamed from: O */
    private HttpURLConnection m125533O(String str, Map map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setConnectTimeout(AbstractC3972e.m18755L(2));
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setInstanceFollowRedirects(true);
        if (map != null) {
            for (String str2 : map.keySet()) {
                httpURLConnection.setRequestProperty(str2, (String) map.get(str2));
            }
        }
        String str3 = f116112i0;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (f116115l0 && (map == null || !map.containsKey("Accept-Encoding"))) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        String m125534O0 = m125534O0();
        if (m125534O0 != null) {
            httpURLConnection.setRequestProperty("Cookie", m125534O0);
        }
        return httpURLConnection;
    }

    /* renamed from: O0 */
    private String m125534O0() {
        Map map = this.f116165x;
        if (map != null && map.size() != 0) {
            Iterator it = this.f116165x.keySet().iterator();
            StringBuilder sb2 = new StringBuilder();
            while (it.hasNext()) {
                String str = (String) it.next();
                String str2 = (String) this.f116165x.get(str);
                sb2.append(str);
                sb2.append("=");
                sb2.append(str2);
                if (it.hasNext()) {
                    sb2.append("; ");
                }
            }
            return sb2.toString();
        }
        return null;
    }

    /* renamed from: Q */
    private void m125535Q() {
        m125531M0("Storage work: " + this.f116162u);
        Object m125595P = m125595P(this.f116162u);
        this.f116166y = m125595P;
        if (m125595P != null) {
            this.f116127C.m125647A(2).m125654e();
        }
    }

    /* renamed from: R */
    public static void m125536R(Runnable runnable) {
        if (f116121r0 == null) {
            int i11 = f116114k0;
            C18626a c18626a = new C18626a(i11, i11, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            f116121r0 = c18626a;
            c18626a.setThreadFactory(new ThreadFactoryC18930c("AQ-local"));
            f116121r0.allowCoreThreadTimeOut(true);
        }
        m125531M0("executeLocal");
        f116121r0.m98433a(runnable, f116118o0);
    }

    /* renamed from: S */
    public static void m125537S(Runnable runnable) {
        if (f116121r0 == null) {
            int i11 = f116114k0;
            C18626a c18626a = new C18626a(i11, i11, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            f116121r0 = c18626a;
            c18626a.setThreadFactory(new ThreadFactoryC18930c("AQ-local"));
            f116121r0.allowCoreThreadTimeOut(true);
        }
        m125531M0("executeLocal");
        f116121r0.execute(runnable);
    }

    /* renamed from: S0 */
    private void m125538S0() {
        f116116m0++;
        String str = this.f116162u;
        Map map = this.f116163v;
        if (map == null && str.length() > 2000) {
            Uri parse = Uri.parse(str);
            String m125547Y = m125547Y(parse);
            map = m125545X(parse);
            str = m125547Y;
        }
        int i11 = this.f116137M;
        if (2 == i11) {
            m125579x0(str, this.f116164w, this.f116127C);
        } else if (3 == i11) {
            m125521D0(str, this.f116164w, map, this.f116127C);
        } else {
            if (1 == i11 && map == null) {
                map = new HashMap();
            }
            if (map == null) {
                m125516A0(str, this.f116164w, this.f116127C);
                return;
            } else if (m125523H0(map)) {
                m125518B0(str, this.f116164w, map, this.f116127C);
            } else {
                m125519C0(str, this.f116164w, map, this.f116127C);
            }
        }
        m125636w();
    }

    /* renamed from: T */
    public static void m125539T(Runnable runnable) {
        if (f116120q0 == null) {
            int i11 = f116113j0;
            C18626a c18626a = new C18626a(i11, i11, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            f116120q0 = c18626a;
            c18626a.setThreadFactory(new ThreadFactoryC18930c("AQ-network"));
            f116120q0.allowCoreThreadTimeOut(true);
        }
        m125531M0("executeNetwork");
        if (runnable instanceof C23999j) {
            f116120q0.m98433a(runnable, f116118o0);
        } else {
            f116120q0.execute(runnable);
        }
    }

    /* renamed from: T0 */
    private void m125540T0() {
        String str;
        if (this.f116162u == null) {
            this.f116127C.m125652c(-101).m125654e();
            m125636w();
            return;
        }
        m125531M0("Network work: " + this.f116162u);
        System.currentTimeMillis();
        int i11 = this.f116138N;
        if (i11 == 0) {
            if (this.f116140P == 0) {
                this.f116138N = 99999;
                this.f116140P = 99999;
                int i12 = this.f116144T;
                if (i12 == 1) {
                    this.f116138N = 26013;
                } else if (i12 == 3) {
                    this.f116138N = 99994;
                    this.f116140P = 99994;
                } else if (i12 == 2) {
                    this.f116138N = 99995;
                    this.f116140P = 99995;
                }
            }
        } else if (i11 >= 26000 && i11 <= 26020 && (str = this.f116162u) != null) {
            str.startsWith("https");
        }
        try {
            if (AbstractC20626a.m107393i(CoreUtility.getAppContext())) {
                m125531M0("network " + this.f116162u);
                m125538S0();
            } else {
                m125531M0("network unavailable " + this.f116162u);
                this.f116127C.m125652c(-101).m125670u("network unavailable");
                m125636w();
            }
        } catch (UnknownHostException | IOException | Exception unused) {
        }
        this.f116127C.m125654e();
    }

    /* renamed from: U */
    public static void m125541U(Runnable runnable) {
        if (f116123t0 == null) {
            C18626a c18626a = new C18626a(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            f116123t0 = c18626a;
            c18626a.setThreadFactory(new ThreadFactoryC18930c("AQ-stickerLocal"));
            f116123t0.allowCoreThreadTimeOut(true);
        }
        m125531M0("executeLocal");
        f116123t0.execute(runnable);
    }

    /* renamed from: U0 */
    private String m125542U0(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf("charset")) == -1) {
            return null;
        }
        return str.substring(indexOf + 7).replaceAll("[^\\w-]", "");
    }

    /* renamed from: V */
    public static void m125543V(Runnable runnable) {
        if (f116122s0 == null) {
            C18626a c18626a = new C18626a(2, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            f116122s0 = c18626a;
            c18626a.setThreadFactory(new ThreadFactoryC18930c("AQ-stickerNetwork"));
            f116122s0.allowCoreThreadTimeOut(true);
        }
        m125531M0("executeLocal");
        f116122s0.execute(runnable);
    }

    /* renamed from: V0 */
    private static String m125544V0(String str) {
        return str.replaceAll(" ", "%20").replaceAll("\\|", "%7C");
    }

    /* renamed from: X */
    private static Map m125545X(Uri uri) {
        HashMap hashMap = new HashMap();
        for (String str : uri.getQuery().split("&")) {
            String[] split = str.split("=");
            if (split.length >= 2) {
                hashMap.put(split[0], split[1]);
            } else if (split.length == 1) {
                hashMap.put(split[0], "");
            }
        }
        return hashMap;
    }

    /* renamed from: X0 */
    public void m125546X0() {
        this.f116127C.m125654e();
        m125531M0("** Post UI: " + this.f116162u);
        if (this.f116141Q) {
            AbstractC3972e.m18775c0(this);
        } else {
            m125572o();
        }
    }

    /* renamed from: Y */
    private static String m125547Y(Uri uri) {
        String str = uri.getScheme() + "://" + uri.getAuthority() + uri.getPath();
        String fragment = uri.getFragment();
        if (fragment != null) {
            return str + "#" + fragment;
        }
        return str;
    }

    /* renamed from: a1 */
    private void m125549a1(AbstractRunnableC23992c abstractRunnableC23992c) {
        if (!(abstractRunnableC23992c instanceof C23999j)) {
            return;
        }
        f116118o0.remove(abstractRunnableC23992c);
    }

    /* renamed from: b0 */
    private void m125551b0() {
        if (this.f116166y != null && this.f116130F) {
            m125531M0("filePut:" + this.f116162u);
            byte[] m125659j = this.f116127C.m125659j();
            if (m125659j != null) {
                try {
                    if (this.f116127C.m125666q() == 1) {
                        File mo125612i0 = mo125612i0();
                        if (!this.f116127C.m125663n()) {
                            m125605c0(this.f116162u, this.f116166y, mo125612i0, m125659j);
                        } else if (mo125612i0.exists()) {
                            mo125612i0.delete();
                        }
                    }
                } catch (Exception e11) {
                    AbstractC3972e.m18796n(e11);
                }
            }
            this.f116127C.m125653d(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:            if (r2.getQueue().remove(r1) != false) goto L50;     */
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m125552b1(Runnable runnable) {
        boolean z11;
        boolean z12 = false;
        if (runnable == null) {
            return false;
        }
        try {
            RunnableC18629d runnableC18629d = (RunnableC18629d) f116118o0.remove(runnable);
            if (runnableC18629d == null) {
                return false;
            }
            C18626a c18626a = f116120q0;
            if (c18626a != null && (runnable instanceof AbstractRunnableC23992c)) {
                z11 = c18626a.getQueue().remove(runnableC18629d);
            } else {
                z11 = false;
            }
            C18626a c18626a2 = f116121r0;
            if (c18626a2 != null) {
                if (!z11) {
                }
                z12 = true;
                return z12;
            }
            return z11;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return false;
        }
    }

    /* renamed from: c1 */
    private Object m125554c1() {
        return this;
    }

    /* renamed from: f1 */
    public static void m125558f1(int i11) {
        f116114k0 = Math.max(1, Math.min(25, i11));
        f116120q0 = null;
        f116121r0 = null;
        f116118o0.clear();
        AbstractC3972e.m18794m("setting local limit", Integer.valueOf(f116114k0));
    }

    /* renamed from: g1 */
    public static void m125560g1(int i11) {
        int i12 = f116113j0;
        int max = Math.max(1, Math.min(25, i11));
        f116113j0 = max;
        C18626a c18626a = f116120q0;
        if (c18626a != null) {
            try {
                if (i12 > max) {
                    c18626a.setMaximumPoolSize(max);
                    f116120q0.setCorePoolSize(f116113j0);
                } else {
                    c18626a.setCorePoolSize(max);
                    f116120q0.setMaximumPoolSize(f116113j0);
                }
            } catch (Exception unused) {
                f116120q0 = null;
                f116118o0.clear();
            }
        }
        AbstractC3972e.m18794m("setting network limit", Integer.valueOf(f116113j0));
    }

    /* renamed from: j1 */
    public static void m125564j1(int i11) {
        f116111h0 = i11;
    }

    /* renamed from: k0 */
    private String m125566k0(String str) {
        Matcher matcher = Pattern.compile("<meta [^>]*http-equiv[^>]*\"Content-Type\"[^>]*>", 2).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return m125542U0(matcher.group());
    }

    /* renamed from: l1 */
    public static void m125567l1(boolean z11) {
        f116110g0 = z11;
        AbstractC3972e.m18794m("setting okhttp", Boolean.valueOf(z11));
    }

    /* renamed from: m0 */
    public static int m125568m0() {
        return f116124u0;
    }

    /* renamed from: n */
    public static boolean m125569n(int i11, int i12, String str, BitmapFactory.Options options) {
        float f11;
        try {
            if (AbstractC3972e.m18765V() && i11 > 0 && i12 > 0) {
                if (m125524I0(options)) {
                    f11 = options.inTargetDensity / options.inDensity;
                } else {
                    f11 = 1.0f;
                }
                float f12 = options.inSampleSize;
                int ceil = (int) Math.ceil(i11 / f12);
                int ceil2 = (int) Math.ceil(i12 / f12);
                Bitmap m134457b = C26117c.m134454d().m134457b((int) Math.ceil(ceil * f11), (int) Math.ceil(ceil2 * f11), options.inPreferredConfig);
                if (m134457b != null && !m134457b.isRecycled()) {
                    options.inBitmap = m134457b;
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: n0 */
    private int m125570n0(ZVideoUtilMetadata zVideoUtilMetadata) {
        int i11;
        int i12;
        int i13;
        try {
            String metadata = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_WIDTH);
            if (!TextUtils.isEmpty(metadata)) {
                i11 = Integer.parseInt(metadata);
            } else {
                i11 = 0;
            }
            String metadata2 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_HEIGHT);
            if (!TextUtils.isEmpty(metadata2)) {
                i12 = Integer.parseInt(metadata2);
            } else {
                i12 = 0;
            }
            String metadata3 = zVideoUtilMetadata.getMetadata(ZVideoUtilMetadata.ZMETADATA_KEY_VIDEO_ROTATION);
            if (!TextUtils.isEmpty(metadata3)) {
                i13 = Integer.parseInt(metadata3);
            } else {
                i13 = 0;
            }
            if (i13 != 90 && i13 != 270) {
                int i14 = i12;
                i12 = i11;
                i11 = i14;
            }
            int mo125626r0 = mo125626r0();
            if (i11 > i12 && i12 > 0) {
                return (mo125626r0() * i11) / i12;
            }
            return mo125626r0;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return 0;
        }
    }

    /* renamed from: n1 */
    private void m125571n1() {
        try {
            File mo125612i0 = mo125612i0();
            if (mo125612i0 != null && mo125612i0.exists()) {
                this.f116127C.m125647A(3);
                this.f116166y = mo125604a0(this.f116162u, mo125612i0, this.f116127C);
            } else {
                File file = new File(this.f116145U.m132439q());
                if (file.exists()) {
                    AbstractC23041d2.m118211j(file);
                }
                this.f116127C.m125652c(-10003);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            this.f116127C.m125652c(-104);
        }
        f116124u0 = this.f116127C.m125657h();
        this.f116127C.m125654e();
    }

    /* renamed from: o */
    private void m125572o() {
        m125531M0("** After Work: " + this.f116162u + " " + this.f116131G);
        C23995f c23995f = this.f116127C;
        if (c23995f != null) {
            c23995f.m125675z(false);
        }
        String str = this.f116162u;
        if (str != null && this.f116131G) {
            mo125598R0(str, this.f116166y);
        }
        m125636w();
        m125585B();
        f116117n0.remove(this.f116162u);
        m125525J();
    }

    /* renamed from: o0 */
    public File m125573o0() {
        File file;
        if (mo125593J0()) {
            file = this.f116126B;
            if (file == null) {
                if (this.f116130F) {
                    file = mo125612i0();
                } else {
                    File m18758O = AbstractC3972e.m18758O();
                    if (m18758O == null) {
                        m18758O = this.f116125A;
                    }
                    file = AbstractC3972e.m18808u(m18758O, this.f116162u);
                }
            }
        } else {
            file = null;
        }
        if (file != null && !file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                file.createNewFile();
            } catch (Exception e11) {
                AbstractC3972e.m18779e0(e11);
                return null;
            }
        }
        return file;
    }

    /* renamed from: p1 */
    private byte[] m125574p1(String str, InputStream inputStream) {
        if ("gzip".equalsIgnoreCase(str)) {
            inputStream = new GZIPInputStream(inputStream);
        }
        return AbstractC3972e.m18801p0(inputStream);
    }

    /* renamed from: r */
    private void m125575r() {
        m125531M0("Background work local: " + this.f116162u);
        try {
            if (this.f116130F) {
                mo125606d0();
            }
            if (this.f116166y == null) {
                m125535Q();
            }
            if (this.f116166y == null) {
                m125528L();
            }
        } catch (Exception e11) {
            AbstractC3972e.m18796n(e11);
            this.f116127C.m125652c(-104).m125670u("unknown error");
        }
        if (this.f116166y == null) {
            this.f116127C.m125652c(-103).m125670u("transform error");
        }
        f116124u0 = this.f116127C.m125657h();
        this.f116127C.m125654e();
    }

    /* renamed from: s */
    private void m125576s() {
        m125531M0("Background work network: " + Thread.currentThread().getName() + " " + this.f116162u);
        if (this.f116130F) {
            mo125606d0();
        }
        if (this.f116166y == null) {
            m125535Q();
        }
        if (this.f116166y == null) {
            m125528L();
        }
        if (this.f116166y == null) {
            m125540T0();
        } else {
            m125636w();
        }
    }

    /* renamed from: u1 */
    public static boolean m125577u1(String str) {
        if (!NativeHttpDownload.m93196e()) {
            return false;
        }
        return d.m125646e(str);
    }

    /* renamed from: w1 */
    private void m125578w1() {
        if (!this.f116155e0) {
            return;
        }
        synchronized (this) {
            try {
                notifyAll();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: x0 */
    private void m125579x0(String str, Map map, C23995f c23995f) {
        AbstractC3972e.m18794m("get", str);
        m125580y0(m125544V0(str), map, c23995f);
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0125: MOVE (r6 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]) (LINE:294), block:B:224:0x0125 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e7 A[Catch: all -> 0x02f1, Exception -> 0x02f3, TryCatch #12 {Exception -> 0x02f3, blocks: (B:65:0x02dc, B:67:0x02e7, B:69:0x02f5), top: B:64:0x02dc }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0160 A[Catch: all -> 0x0124, Exception -> 0x0137, TRY_LEAVE, TryCatch #3 {all -> 0x0124, blocks: (B:209:0x011b, B:60:0x0148, B:62:0x014e, B:78:0x0160, B:219:0x010d, B:213:0x0133), top: B:54:0x00cd }] */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m125580y0(String str, Map map, C23995f c23995f) {
        OutputStream outputStream;
        InputStream inputStream;
        File m125573o0;
        String m18759P;
        URL url;
        HttpURLConnection httpURLConnection;
        String str2;
        int responseCode;
        int responseCode2;
        String responseMessage;
        boolean z11;
        OutputStream outputStream2;
        OutputStream outputStream3;
        String headerField;
        String str3;
        int i11;
        OutputStream outputStream4;
        File file;
        byte[] bArr;
        int i12;
        int i13;
        List<String> list;
        String str4;
        try {
            m125573o0 = m125573o0();
            if (m125573o0 != null) {
                m125573o0.createNewFile();
                outputStream = new BufferedOutputStream(new FileOutputStream(m125573o0));
            } else {
                outputStream = null;
            }
        } catch (Exception e11) {
            e = e11;
            outputStream = null;
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
        try {
            try {
                C24574j.m127992c().m127999i();
                this.f116147W = true;
                m18759P = AbstractC3972e.m18759P(str);
                url = new URL(m18759P);
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                if (httpURLConnection != null) {
                    try {
                        AbstractC23228u2.m119706e(httpURLConnection);
                    } catch (Exception e12) {
                        e = e12;
                        inputStream = null;
                        AbstractC3972e.m18796n(e);
                        throw e;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                        if (this.f116147W) {
                        }
                        AbstractC29237l.m145996a(null);
                        AbstractC29237l.m145996a(outputStream);
                        AbstractC29237l.m145996a(inputStream);
                        throw th;
                    }
                }
                httpURLConnection.setConnectTimeout(AbstractC3972e.m18755L(2));
                httpURLConnection.setReadTimeout(20000);
                httpURLConnection.setInstanceFollowRedirects(false);
                if (map != null) {
                    for (String str5 : map.keySet()) {
                        httpURLConnection.setRequestProperty(str5, (String) map.get(str5));
                    }
                }
                String str6 = f116112i0;
                if (str6 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str6);
                }
                if (f116115l0 && (map == null || !map.containsKey("Accept-Encoding"))) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                }
                String m125534O0 = m125534O0();
                if (m125534O0 != null) {
                    httpURLConnection.setRequestProperty("Cookie", m125534O0);
                }
                c23995f.m125675z(true);
                str2 = "";
                responseCode = httpURLConnection.getResponseCode();
                responseCode2 = httpURLConnection.getResponseCode();
                responseMessage = httpURLConnection.getResponseMessage();
                if (responseCode != 302 && responseCode != 301 && responseCode != 303) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                try {
                    try {
                        if (z11) {
                            try {
                                headerField = httpURLConnection.getHeaderField("Location");
                            } catch (Exception e13) {
                                e = e13;
                                outputStream3 = outputStream;
                            }
                            if (!TextUtils.isEmpty(headerField)) {
                                if (URLUtil.isValidUrl(headerField)) {
                                    str2 = headerField;
                                    outputStream3 = outputStream;
                                } else {
                                    String protocol = url.getProtocol();
                                    String host = httpURLConnection.getURL().getHost();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(protocol);
                                    sb2.append("://");
                                    sb2.append(host);
                                    sb2.append("/");
                                    String trim = headerField.trim();
                                    outputStream3 = outputStream;
                                    try {
                                        sb2.append(trim.replaceAll(" ", "%20"));
                                        str2 = sb2.toString();
                                    } catch (Exception e14) {
                                        e = e14;
                                        try {
                                            e.printStackTrace();
                                            if (responseCode >= 300) {
                                            }
                                            AbstractC3972e.m18794m("response", Integer.valueOf(responseCode));
                                            if (bArr != null) {
                                            }
                                            c23995f.m125675z(false);
                                            c23995f.m125652c(responseCode).m125670u(responseMessage).m125655f(null).m125671v(str3).m125649C(new Date()).m125653d(bArr).m125656g(m125573o0).m125648B(i12);
                                            if (this.f116147W) {
                                            }
                                            AbstractC29237l.m145996a(null);
                                            AbstractC29237l.m145996a(outputStream);
                                            AbstractC29237l.m145996a(inputStream);
                                            return;
                                        } catch (Exception e15) {
                                            e = e15;
                                            outputStream = outputStream3;
                                            inputStream = null;
                                            AbstractC3972e.m18796n(e);
                                            throw e;
                                        }
                                    }
                                }
                                httpURLConnection = m125533O(str2, map);
                                responseCode = httpURLConnection.getResponseCode();
                                if (responseCode >= 300) {
                                    if (z11 && !str.contains("https://graph.facebook.com")) {
                                        AbstractC3972e.m18794m("cleanCachedRedirect", m18759P);
                                        mo125592I(m18759P);
                                        c23995f.m125674y(responseCode2);
                                    }
                                    str3 = str2;
                                    outputStream = outputStream3;
                                    bArr = null;
                                    inputStream = null;
                                    i12 = 0;
                                } else {
                                    inputStream = httpURLConnection.getInputStream();
                                    try {
                                        try {
                                            String headerField2 = httpURLConnection.getHeaderField("content-type");
                                            String headerField3 = httpURLConnection.getHeaderField("Location");
                                            str3 = str2;
                                            String contentEncoding = httpURLConnection.getContentEncoding();
                                            try {
                                                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                                                if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str4 = list.get(0)) != null) {
                                                    i13 = AbstractC3972e.m18773b0(str4).intValue();
                                                } else {
                                                    i13 = 0;
                                                }
                                                i11 = i13;
                                            } catch (Exception e16) {
                                                e16.printStackTrace();
                                                i11 = 0;
                                            }
                                            try {
                                                AbstractC23347b.m122759a(headerField2, headerField3);
                                            } catch (Exception e17) {
                                                e17.printStackTrace();
                                            }
                                            int max = Math.max(32, Math.min(65536, i11));
                                            if (m125573o0 == null) {
                                                outputStream4 = new C3983p(max);
                                            } else {
                                                outputStream4 = outputStream3;
                                            }
                                            try {
                                                m125530M(inputStream, outputStream4, contentEncoding, i11);
                                                C24574j.m127992c().m128000j();
                                                this.f116147W = false;
                                                outputStream4.flush();
                                                AbstractC29237l.m145996a(null);
                                                AbstractC29237l.m145996a(outputStream4);
                                                if (this.f116130F) {
                                                    try {
                                                        try {
                                                            if (this.f116126B == null) {
                                                                if (mo125593J0()) {
                                                                    file = mo125612i0();
                                                                } else {
                                                                    file = null;
                                                                }
                                                                if (m125573o0 != null && file != null && !file.exists()) {
                                                                    if (!AbstractC23238v2.m119720e(m125573o0, file)) {
                                                                        try {
                                                                            m125573o0.delete();
                                                                        } catch (SecurityException e18) {
                                                                            AbstractC20110a.m104539h(e18);
                                                                        }
                                                                    }
                                                                } else if (m125573o0 != null) {
                                                                    try {
                                                                        m125573o0.delete();
                                                                    } catch (Exception e19) {
                                                                        AbstractC20110a.m104539h(e19);
                                                                    }
                                                                }
                                                                if (file != null && file.exists() && file.length() > 0) {
                                                                    m125573o0 = file;
                                                                }
                                                            }
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            outputStream = outputStream4;
                                                            if (this.f116147W) {
                                                            }
                                                            AbstractC29237l.m145996a(null);
                                                            AbstractC29237l.m145996a(outputStream);
                                                            AbstractC29237l.m145996a(inputStream);
                                                            throw th;
                                                        }
                                                    } catch (Exception e21) {
                                                        e = e21;
                                                        outputStream = outputStream4;
                                                        AbstractC3972e.m18796n(e);
                                                        throw e;
                                                    }
                                                }
                                                if (m125573o0 == null) {
                                                    bArr = ((C3983p) outputStream4).toByteArray();
                                                    outputStream3 = outputStream4;
                                                } else {
                                                    if (m125573o0.exists() && m125573o0.length() != 0) {
                                                        outputStream3 = outputStream4;
                                                        if (m125573o0.length() >= max) {
                                                            bArr = null;
                                                        }
                                                    } else {
                                                        outputStream3 = outputStream4;
                                                    }
                                                    if (m125573o0.exists()) {
                                                        m125573o0.delete();
                                                    }
                                                    bArr = null;
                                                    m125573o0 = null;
                                                }
                                                if (m125573o0 != null) {
                                                    try {
                                                    } catch (Exception e22) {
                                                        e22.printStackTrace();
                                                    }
                                                    if (!m125573o0.getAbsolutePath().endsWith(".apk") && !m125573o0.getAbsolutePath().endsWith(".mp4") && !m125573o0.getAbsolutePath().endsWith(".zip") && !AbstractC23258x2.m119957p(m125573o0, false) && i11 != 0 && i11 != m125573o0.length()) {
                                                        m125573o0.delete();
                                                        i12 = -1001;
                                                        m125573o0 = null;
                                                        if (z11 && ((responseCode2 == 301 || responseCode2 == 302) && !str.contains("https://graph.facebook.com"))) {
                                                            AbstractC3972e.m18794m("cleanCachedRedirect", m18759P);
                                                            mo125592I(m18759P);
                                                            c23995f.m125674y(responseCode2);
                                                        }
                                                        outputStream = outputStream3;
                                                    }
                                                }
                                                i12 = 0;
                                                if (z11) {
                                                    AbstractC3972e.m18794m("cleanCachedRedirect", m18759P);
                                                    mo125592I(m18759P);
                                                    c23995f.m125674y(responseCode2);
                                                }
                                                outputStream = outputStream3;
                                            } catch (Exception e23) {
                                                e = e23;
                                                outputStream3 = outputStream4;
                                                outputStream = outputStream3;
                                                AbstractC3972e.m18796n(e);
                                                throw e;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                outputStream3 = outputStream4;
                                                outputStream = outputStream3;
                                                if (this.f116147W) {
                                                }
                                                AbstractC29237l.m145996a(null);
                                                AbstractC29237l.m145996a(outputStream);
                                                AbstractC29237l.m145996a(inputStream);
                                                throw th;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } catch (Exception e24) {
                                        e = e24;
                                    }
                                }
                                AbstractC3972e.m18794m("response", Integer.valueOf(responseCode));
                                if (bArr != null) {
                                    AbstractC3972e.m18794m(Integer.valueOf(bArr.length), str);
                                }
                                c23995f.m125675z(false);
                                c23995f.m125652c(responseCode).m125670u(responseMessage).m125655f(null).m125671v(str3).m125649C(new Date()).m125653d(bArr).m125656g(m125573o0).m125648B(i12);
                                if (this.f116147W) {
                                    C24574j.m127992c().m128000j();
                                }
                                AbstractC29237l.m145996a(null);
                                AbstractC29237l.m145996a(outputStream);
                                AbstractC29237l.m145996a(inputStream);
                                return;
                            }
                        }
                        AbstractC3972e.m18794m("response", Integer.valueOf(responseCode));
                        if (bArr != null) {
                        }
                        c23995f.m125675z(false);
                        c23995f.m125652c(responseCode).m125670u(responseMessage).m125655f(null).m125671v(str3).m125649C(new Date()).m125653d(bArr).m125656g(m125573o0).m125648B(i12);
                        if (this.f116147W) {
                        }
                        AbstractC29237l.m145996a(null);
                        AbstractC29237l.m145996a(outputStream);
                        AbstractC29237l.m145996a(inputStream);
                        return;
                    } catch (Throwable th8) {
                        th = th8;
                        if (this.f116147W) {
                        }
                        AbstractC29237l.m145996a(null);
                        AbstractC29237l.m145996a(outputStream);
                        AbstractC29237l.m145996a(inputStream);
                        throw th;
                    }
                } catch (Exception e25) {
                    e = e25;
                    AbstractC3972e.m18796n(e);
                    throw e;
                }
                outputStream3 = outputStream;
                if (responseCode >= 300) {
                }
            } catch (Throwable th9) {
                th = th9;
                outputStream = outputStream2;
                inputStream = null;
                if (this.f116147W) {
                    C24574j.m127992c().m128000j();
                }
                AbstractC29237l.m145996a(null);
                AbstractC29237l.m145996a(outputStream);
                AbstractC29237l.m145996a(inputStream);
                throw th;
            }
        } catch (Exception e26) {
            e = e26;
        }
    }

    /* renamed from: y1 */
    private static void m125581y1(DataOutputStream dataOutputStream, String str, String str2, InputStream inputStream) {
        dataOutputStream.writeBytes("--*****\r\n");
        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str + "\"; filename=\"" + str2 + "\"\r\n");
        dataOutputStream.writeBytes("\r\n");
        AbstractC3972e.m18788j(inputStream, dataOutputStream);
        dataOutputStream.writeBytes("\r\n");
    }

    /* renamed from: z0 */
    private void m125582z0(String str, Map map, Map map2, C23995f c23995f) {
        if (map != null && !map.containsKey("Content-Type")) {
            map.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        }
        m125580y0(str, map, c23995f);
    }

    /* renamed from: z1 */
    private static void m125583z1(DataOutputStream dataOutputStream, String str, String str2) {
        dataOutputStream.writeBytes("--*****\r\n");
        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str + "\"");
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.write(str2.getBytes(StandardCharsets.UTF_8));
        dataOutputStream.writeBytes("\r\n");
    }

    /* renamed from: A */
    public void m125584A() {
        c cVar = this.f116153c0;
        if (cVar != null) {
            cVar.mo65969b(this.f116162u);
        }
    }

    /* renamed from: B */
    void m125585B() {
        m125531M0("callback:" + this.f116162u);
        m125619m1(false);
        this.f116154d0 = true;
        if (m125522E0()) {
            if (this.f116160s != null) {
                AbstractC3972e.m18760Q(m125617l0(), this.f116160s, true, true, new Class[]{String.class, this.f116157p, C23995f.class}, f116119p0, this.f116162u, this.f116166y, this.f116127C);
            } else {
                try {
                    mo1932C(this.f116162u, this.f116166y, this.f116127C);
                } catch (Exception e11) {
                    AbstractC3972e.m18779e0(e11);
                }
            }
        } else {
            m125531M0("missing callback:" + this.f116162u);
            if (this instanceof C23999j) {
                ((C23999j) this).m125770Z1();
            } else if (this instanceof AbstractC24006q) {
                ((AbstractC24006q) this).m125872M1();
            } else if (this instanceof C24002m) {
                ((C24002m) this).m125827H1();
            }
        }
        m125551b0();
        if (!this.f116155e0) {
            this.f116127C.m125650a();
        }
        m125578w1();
        AbstractC3972e.m18798o();
    }

    /* renamed from: C */
    public void mo1932C(String str, Object obj, C23995f c23995f) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: o3.a.<init>(o3.c, int):void, class status: GENERATED_AND_UNLOADED
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
    /* renamed from: E */
    public void m125586E() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f116149Y
            r1 = 1
            r0.set(r1)
            r0 = r2
            o3.j r0 = (p379o3.C23999j) r0
            java.lang.String r1 = r2.f116162u
            boolean r0 = r0.m125772b3(r1)
            int r1 = r2.hashCode()
            if (r0 == 0) goto L25
            java.lang.String r0 = r2.f116162u
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r0)
            if (r0 == 0) goto L25
            o3.a r0 = new o3.a
            r0.<init>()
            m125537S(r0)
        L25:
            java.lang.Runnable r0 = r2.f116151a0
            m125552b1(r0)
            m125552b1(r2)
            java.lang.Runnable r0 = r2.f116150Z
            m125552b1(r0)
            o3.c$c r0 = r2.f116153c0
            if (r0 == 0) goto L3b
            java.lang.String r1 = r2.f116162u
            r0.mo65972e(r1)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p379o3.AbstractRunnableC23992c.m125586E():void");
    }

    /* renamed from: F */
    protected void mo125587F() {
        m125638x();
    }

    /* renamed from: F0 */
    public boolean m125588F0() {
        return this.f116149Y.get();
    }

    /* renamed from: G */
    protected void mo125589G(String str, int i11) {
        m125640y(str, i11);
    }

    /* renamed from: G0 */
    protected boolean mo125590G0() {
        return false;
    }

    /* renamed from: H */
    protected void mo125591H(String str, int i11) {
        m125641z(str, i11);
    }

    /* renamed from: I */
    public void mo125592I(String str) {
    }

    /* renamed from: J0 */
    protected boolean mo125593J0() {
        if (!File.class.equals(this.f116157p) && !XmlPullParser.class.equals(this.f116157p) && !InputStream.class.equals(this.f116157p) && !C3988u.class.equals(this.f116157p)) {
            return false;
        }
        return true;
    }

    /* renamed from: N0 */
    public void m125594N0(Context context) {
        if (this.f116130F) {
            b bVar = new b(context);
            this.f116151a0 = bVar;
            m125536R(bVar);
        }
    }

    /* renamed from: P */
    protected Object m125595P(String str) {
        return null;
    }

    /* renamed from: P0 */
    public Object m125596P0(boolean z11) {
        this.f116131G = z11;
        return m125554c1();
    }

    /* renamed from: Q0 */
    protected Object mo125597Q0(String str) {
        return null;
    }

    /* renamed from: R0 */
    protected void mo125598R0(String str, Object obj) {
    }

    /* renamed from: W */
    public Object m125599W(long j11) {
        this.f116134J = j11;
        return m125554c1();
    }

    /* renamed from: W0 */
    public Object m125600W0(int i11) {
        this.f116167z = i11;
        return m125554c1();
    }

    /* renamed from: Y0 */
    public Object m125601Y0(int i11) {
        this.f116139O = i11;
        return m125554c1();
    }

    /* renamed from: Z */
    public Object m125602Z(boolean z11) {
        this.f116130F = z11;
        return m125554c1();
    }

    /* renamed from: Z0 */
    public Object m125603Z0(Object obj) {
        if (obj != null) {
            this.f116161t = new WeakReference(obj);
        }
        return m125554c1();
    }

    /* renamed from: a0 */
    public Object mo125604a0(String str, File file, C23995f c23995f) {
        byte[] m18801p0;
        try {
            m125531M0("fileGet: type=" + this.f116157p);
            if (mo125593J0()) {
                c23995f.m125656g(file);
                m18801p0 = null;
            } else {
                m18801p0 = AbstractC3972e.m18801p0(new FileInputStream(file));
            }
            return mo125625q1(str, m18801p0, c23995f);
        } catch (Exception e11) {
            AbstractC3972e.m18796n(e11);
            return null;
        }
    }

    /* renamed from: c0 */
    protected void m125605c0(String str, Object obj, File file, byte[] bArr) {
        if (file != null && bArr != null) {
            AbstractC3972e.m18797n0(file, bArr, 0L);
        }
    }

    /* renamed from: d0 */
    public void mo125606d0() {
        File mo125618m = mo125618m(this.f116125A, m125614j0());
        if (mo125618m != null) {
            m125531M0("File work: " + mo125618m.getPath());
            C23995f m125647A = new C23995f().m125647A(3);
            if (mo125618m.exists()) {
                if (mo125618m.length() == 0) {
                    mo125618m.delete();
                    m125531M0("Delete File:  " + mo125618m.length() + " " + this.f116162u);
                    return;
                }
                Object mo125604a0 = mo125604a0(this.f116162u, mo125618m, m125647A);
                this.f116166y = mo125604a0;
                if (mo125604a0 != null) {
                    m125647A.m125649C(new Date(mo125618m.lastModified())).m125654e();
                    this.f116127C = m125647A;
                    return;
                } else {
                    if (mo125618m.exists() && this.f116162u.startsWith("http")) {
                        m125531M0("Delete File:  " + this.f116162u);
                        mo125618m.delete();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        m125531M0("File work: null");
    }

    /* renamed from: d1 */
    public Object m125607d1(c cVar) {
        this.f116153c0 = cVar;
        return m125554c1();
    }

    /* renamed from: e0 */
    public void m125608e0() {
        this.f116146V = true;
    }

    /* renamed from: e1 */
    public Object m125609e1(boolean z11) {
        this.f116129E = z11;
        return m125554c1();
    }

    /* renamed from: h0 */
    protected File mo125610h0(Context context, int i11) {
        return AbstractC3972e.m18807t(context, i11);
    }

    /* renamed from: h1 */
    public Object m125611h1(int i11, int i12) {
        this.f116138N = i11;
        this.f116140P = i12;
        return m125554c1();
    }

    /* renamed from: i0 */
    public File mo125612i0() {
        if (AbstractC23254w8.m119859g(this.f116162u)) {
            return AbstractC3972e.m18809v(this.f116125A, m125614j0(), mo125626r0());
        }
        return AbstractC3972e.m18808u(this.f116125A, m125614j0());
    }

    /* renamed from: i1 */
    public Object m125613i1(C25630b c25630b) {
        this.f116145U = c25630b;
        return m125554c1();
    }

    /* renamed from: j0 */
    protected String m125614j0() {
        return this.f116162u;
    }

    /* renamed from: k1 */
    public Object m125615k1(int i11) {
        this.f116144T = i11;
        return m125554c1();
    }

    /* renamed from: l */
    public void m125616l() {
        this.f116156f0 = true;
    }

    /* renamed from: l0 */
    public Object m125617l0() {
        Object obj = this.f116159r;
        if (obj != null) {
            return obj;
        }
        Reference reference = this.f116158q;
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* renamed from: m */
    public File mo125618m(File file, String str) {
        File m18747D;
        if (this.f116134J < 0) {
            return null;
        }
        if (AbstractC23254w8.m119859g(str)) {
            m18747D = AbstractC3972e.m18748E(file, str, mo125626r0());
        } else {
            m18747D = AbstractC3972e.m18747D(file, str);
        }
        if (m18747D != null && this.f116134J != 0 && System.currentTimeMillis() - m18747D.lastModified() > this.f116134J) {
            return null;
        }
        return m18747D;
    }

    /* renamed from: m1 */
    public void m125619m1(boolean z11) {
        Object obj;
        WeakReference weakReference = this.f116161t;
        if (weakReference == null) {
            obj = null;
        } else {
            obj = weakReference.get();
        }
        if (obj != null) {
            if (AbstractC3972e.m18764U()) {
                RunnableC3975h.m18829k(obj, this.f116162u, z11);
            } else {
                AbstractC3972e.m18775c0(new Runnable() { // from class: o3.b

                    /* renamed from: q */
                    public final /* synthetic */ Object f116108q;

                    /* renamed from: r */
                    public final /* synthetic */ boolean f116109r;

                    public /* synthetic */ RunnableC23991b(Object obj2, boolean z112) {
                        r2 = obj2;
                        r3 = z112;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractRunnableC23992c.this.m125529L0(r2, r3);
                    }
                });
            }
        }
    }

    /* renamed from: o1 */
    public Object m125620o1(File file) {
        this.f116126B = file;
        return m125554c1();
    }

    /* renamed from: p */
    public void m125621p(Activity activity) {
        if (activity.isFinishing()) {
            AbstractC3972e.m18803q0("Warning", "Possible memory leak. Calling ajax with a terminated activity.");
            m125531M0("Possible memory leak. Calling ajax with a terminated activity.");
        }
        if (this.f116157p == null) {
            AbstractC3972e.m18803q0("Warning", "type() is not called with response type.");
            m125531M0("type() is not called with response type.");
        } else {
            this.f116136L = new WeakReference(activity);
            mo125623q(activity);
        }
    }

    /* renamed from: p0 */
    public Object m125622p0() {
        return this.f116166y;
    }

    /* renamed from: q */
    public void mo125623q(Context context) {
        C23995f c23995f = this.f116127C;
        if (c23995f == null) {
            C23995f c23995f2 = new C23995f();
            this.f116127C = c23995f2;
            c23995f2.m125671v(this.f116162u).m125672w(this.f116132H);
        } else if (c23995f.m125660k()) {
            this.f116127C.m125673x();
            this.f116166y = null;
        }
        m125531M0("Work: " + m125633u0());
        f116117n0.put(this.f116162u, Long.valueOf(System.currentTimeMillis()));
        a aVar = new a(context);
        this.f116150Z = aVar;
        m125536R(aVar);
    }

    /* renamed from: q0 */
    public C23995f m125624q0() {
        return this.f116127C;
    }

    /* renamed from: q1 */
    protected Object mo125625q1(String str, byte[] bArr, C23995f c23995f) {
        String str2;
        if (this.f116157p == null) {
            return null;
        }
        File m125662m = c23995f.m125662m();
        if (bArr != null) {
            if (this.f116157p.equals(Bitmap.class)) {
                m125531M0("Transform " + str + "; type = " + this.f116157p.getName());
                return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            }
            if (this.f116157p.equals(JSONObject.class)) {
                try {
                    str2 = new String(bArr, this.f116135K);
                    try {
                        return (JSONObject) new JSONTokener(str2).nextValue();
                    } catch (Exception e11) {
                        e = e11;
                        AbstractC3972e.m18796n(e);
                        AbstractC3972e.m18792l(str2);
                        return null;
                    }
                } catch (Exception e12) {
                    e = e12;
                    str2 = null;
                }
            } else {
                if (this.f116157p.equals(JSONArray.class)) {
                    try {
                        return (JSONArray) new JSONTokener(new String(bArr, this.f116135K)).nextValue();
                    } catch (Exception e13) {
                        AbstractC3972e.m18796n(e13);
                        return null;
                    }
                }
                if (this.f116157p.equals(String.class)) {
                    if (c23995f.m125666q() == 1) {
                        AbstractC3972e.m18792l("network");
                        return m125532N(bArr, this.f116135K, c23995f);
                    }
                    AbstractC3972e.m18792l("file");
                    try {
                        return new String(bArr, this.f116135K);
                    } catch (Exception e14) {
                        AbstractC3972e.m18796n(e14);
                        return null;
                    }
                }
                if (this.f116157p.equals(byte[].class)) {
                    return bArr;
                }
            }
        } else if (m125662m != null) {
            if (this.f116157p.equals(File.class)) {
                return m125662m;
            }
            if (this.f116157p.equals(C3988u.class)) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(m125662m);
                    C3988u c3988u = new C3988u(fileInputStream);
                    c23995f.m125651b(fileInputStream);
                    return c3988u;
                } catch (Exception e15) {
                    AbstractC3972e.m18779e0(e15);
                    return null;
                }
            }
            if (this.f116157p.equals(XmlPullParser.class)) {
                XmlPullParser newPullParser = Xml.newPullParser();
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(m125662m);
                    newPullParser.setInput(fileInputStream2, this.f116135K);
                    c23995f.m125651b(fileInputStream2);
                    return newPullParser;
                } catch (Exception e16) {
                    AbstractC3972e.m18779e0(e16);
                    return null;
                }
            }
            if (this.f116157p.equals(InputStream.class)) {
                try {
                    Closeable fileInputStream3 = new FileInputStream(m125662m);
                    c23995f.m125651b(fileInputStream3);
                    return fileInputStream3;
                } catch (Exception e17) {
                    AbstractC3972e.m18779e0(e17);
                }
            }
        }
        return null;
    }

    /* renamed from: r0 */
    protected abstract int mo125626r0();

    /* renamed from: r1 */
    public Object m125627r1(InterfaceC24007r interfaceC24007r) {
        return m125554c1();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        int i11;
        m125531M0("Executing job ... (" + this.f116162u + ")");
        if (!this.f116127C.m125660k()) {
            try {
                i11 = this.f116144T;
            } catch (Throwable th2) {
                AbstractC3972e.m18796n(th2);
                this.f116127C.m125652c(-101).m125654e();
                this.f116148X.set(false);
                m125531M0("HTTP: ERROR " + this.f116162u);
            }
            if (i11 != 0 && i11 != 3 && i11 != 2) {
                if (i11 == 1) {
                    if (this.f116143S) {
                        if (!AbstractC3972e.m18787i0()) {
                            this.f116127C.m125652c(-10001);
                            this.f116127C.m125654e();
                        } else if (!AbstractC3972e.m18785h0()) {
                            this.f116127C.m125652c(-10002);
                            this.f116127C.m125654e();
                        } else {
                            m125540T0();
                        }
                    } else {
                        m125571n1();
                    }
                }
                if (!this.f116127C.m125665p() && !this.f116148X.get()) {
                    if (!this.f116141Q) {
                        AbstractC3972e.m18775c0(this);
                    } else {
                        m125572o();
                    }
                }
            }
            if (this.f116143S) {
                m125584A();
                m125576s();
            } else {
                m125575r();
                m125636w();
            }
            if (!this.f116127C.m125665p()) {
                if (!this.f116141Q) {
                }
            }
        } else if (!this.f116148X.get()) {
            m125572o();
        }
        m125549a1(this);
    }

    /* renamed from: s1 */
    public Object m125628s1(Class cls) {
        this.f116157p = cls;
        return m125554c1();
    }

    /* renamed from: t */
    public void m125629t() {
        if (!AbstractC3972e.m18764U()) {
            if (this.f116154d0) {
                return;
            }
            try {
                synchronized (this) {
                    this.f116155e0 = true;
                    wait(f116111h0 + AbstractC26080o.a.f124275b);
                }
                return;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
                return;
            }
        }
        throw new IllegalStateException("Cannot block UI thread.");
    }

    /* renamed from: t0 */
    protected Bitmap mo125630t0(String str) {
        return null;
    }

    /* renamed from: t1 */
    public Object m125631t1(boolean z11) {
        this.f116141Q = z11;
        return m125554c1();
    }

    /* renamed from: u */
    public boolean m125632u(Context context) {
        if (this.f116130F && AbstractC3972e.m18747D(mo125610h0(context, this.f116167z), this.f116162u) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: u0 */
    public String m125633u0() {
        return this.f116162u;
    }

    /* renamed from: v0 */
    protected Bitmap m125634v0(String str) {
        try {
            ZVideoUtilMetadata zVideoUtilMetadata = new ZVideoUtilMetadata(str);
            try {
                Bitmap bitmap = zVideoUtilMetadata.getBitmap(-1L, 2, m125570n0(zVideoUtilMetadata));
                zVideoUtilMetadata.close();
                return bitmap;
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: v1 */
    public Object m125635v1(String str) {
        this.f116162u = str;
        if (!TextUtils.isEmpty(str)) {
            try {
                int length = str.length();
                if ((length < 30 || length > 100) && URI.create(str) == null) {
                    AbstractC20110a.m104535d("aquery load wrong url: %s", str);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        return m125554c1();
    }

    /* renamed from: w */
    protected void m125636w() {
        if (this.f116153c0 != null) {
            C23995f c23995f = this.f116127C;
            if (c23995f != null && c23995f.m125657h() == 200) {
                mo125587F();
                return;
            }
            C23995f c23995f2 = this.f116127C;
            if (c23995f2 == null) {
                mo125589G(this.f116162u, -104);
            } else {
                mo125589G(this.f116162u, c23995f2.m125657h());
            }
        }
    }

    /* renamed from: w0 */
    public Object m125637w0(String str, String str2) {
        if (this.f116164w == null) {
            this.f116164w = new HashMap();
        }
        this.f116164w.put(str, str2);
        return m125554c1();
    }

    /* renamed from: x */
    public void m125638x() {
        c cVar = this.f116153c0;
        if (cVar != null) {
            cVar.mo65973f(this.f116162u);
        }
    }

    /* renamed from: x1 */
    protected void m125639x1(Context context) {
        if ((this instanceof C23999j) && this.f116149Y.get()) {
            return;
        }
        int i11 = this.f116144T;
        if (i11 != 0 && i11 != 3 && i11 != 2) {
            if (i11 == 1) {
                boolean z11 = !mo125590G0();
                this.f116143S = z11;
                if (z11) {
                    m125619m1(true);
                    m125543V(this);
                    return;
                } else {
                    m125619m1(false);
                    m125541U(this);
                    return;
                }
            }
            return;
        }
        Object mo125597Q0 = mo125597Q0(this.f116162u);
        if (mo125597Q0 != null) {
            this.f116166y = mo125597Q0;
            this.f116127C.m125647A(4).m125654e();
            m125531M0("Exist in mem: " + this.f116162u);
            m125585B();
            return;
        }
        m125619m1(true);
        this.f116125A = mo125610h0(context, this.f116167z);
        m125531M0("Not exist in mem, execute job : " + this.f116162u);
        this.f116142R = context.getContentResolver();
        this.f116143S = true;
        if (!this.f116132H && this.f116130F && mo125612i0() != null && mo125612i0().exists() && mo125612i0().length() > 0) {
            this.f116143S = false;
        }
        String str = this.f116162u;
        if (str != null && (str.startsWith("content://") || this.f116162u.startsWith("/") || this.f116162u.startsWith("file://"))) {
            this.f116143S = false;
        }
        if (this.f116143S) {
            m125539T(this);
        } else {
            run();
        }
    }

    /* renamed from: y */
    public void m125640y(String str, int i11) {
        c cVar = this.f116153c0;
        if (cVar != null) {
            cVar.mo65971d(str, i11);
        }
    }

    /* renamed from: z */
    public void m125641z(String str, int i11) {
        c cVar = this.f116153c0;
        if (cVar != null) {
            cVar.mo65970c(str, i11);
        }
    }
}
