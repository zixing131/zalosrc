package sy;

import am.AbstractC0924m0;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import androidx.core.os.AbstractC1438d;
import androidx.core.text.AbstractC1463b;
import bn0.AbstractC2933b;
import bp0.AbstractC3096i0;
import bp0.AbstractC3104p;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.p077ui.widget.QRCardTemplate;
import com.zing.zalo.p077ui.zviews.QRCodeViewerView;
import com.zing.zalo.qrcode.p069ui.scan.ScanQRCodeView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.phonenumbers.C16741a;
import com.zing.zalo.zqrcode.Result;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import dj.C17945a0;
import dm0.C18028a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23041d2;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23238v2;
import me0.AbstractC23280z4;
import me0.C23257x1;
import my.AbstractC23490m;
import my.C23488k;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p135em.C18489c;
import p306ku.AbstractC21943a;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25358n;
import sx.C26404f;
import sy.AbstractC26412d;
import th.C26691l;
import ul0.AbstractC27302a;
import ul0.AbstractC27304c;
import ul0.C27306e;
import un0.AbstractC27330h;
import un0.C27324b;
import un0.C27342t;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import ym0.AbstractC31022c;

/* renamed from: sy.d */
/* loaded from: classes4.dex */
public abstract class AbstractC26412d {

    /* renamed from: a */
    private static String f125564a;
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static int f125565b = 1;

    /* renamed from: c */
    private static String f125566c = "";

    /* renamed from: sy.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sy.d$a$a */
        /* loaded from: classes4.dex */
        public static final class C32975a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ int[] f125567q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32975a(int[] iArr) {
                super(1);
                this.f125567q = iArr;
            }

            /* renamed from: a */
            public final void m136252a(C27324b c27324b) {
                AbstractC19074t.m100208f(c27324b, "$this$putJsonArray");
                AbstractC27330h.m139899a(c27324b, Integer.valueOf(this.f125567q[0]));
                AbstractC27330h.m139899a(c27324b, Integer.valueOf(this.f125567q[1]));
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m136252a((C27324b) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sy.d$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ float[] f125568q;

            /* renamed from: r */
            final /* synthetic */ InterfaceC18509p f125569r;

            /* renamed from: s */
            final /* synthetic */ int[] f125570s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(float[] fArr, InterfaceC18509p interfaceC18509p, int[] iArr) {
                super(1);
                this.f125568q = fArr;
                this.f125569r = interfaceC18509p;
                this.f125570s = iArr;
            }

            /* renamed from: a */
            public final void m136253a(C27324b c27324b) {
                AbstractC19074t.m100208f(c27324b, "$this$putJsonArray");
                float[] fArr = this.f125568q;
                InterfaceC18509p interfaceC18509p = this.f125569r;
                int[] iArr = this.f125570s;
                int length = fArr.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    AbstractC27330h.m139899a(c27324b, (Number) interfaceC18509p.mo240pC(Integer.valueOf(i12), Float.valueOf(fArr[i11] - iArr[i12 % 2])));
                    i11++;
                    i12++;
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m136253a((C27324b) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sy.d$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ List f125571q;

            /* renamed from: r */
            final /* synthetic */ InterfaceC18509p f125572r;

            /* renamed from: sy.d$a$c$a */
            /* loaded from: classes4.dex */
            public static final class C32976a extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                final /* synthetic */ C18028a f125573q;

                /* renamed from: r */
                final /* synthetic */ InterfaceC18509p f125574r;

                /* renamed from: sy.d$a$c$a$a */
                /* loaded from: classes4.dex */
                public static final class C32977a extends AbstractC19075u implements InterfaceC18505l {

                    /* renamed from: q */
                    final /* synthetic */ C18028a f125575q;

                    /* renamed from: r */
                    final /* synthetic */ InterfaceC18509p f125576r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32977a(C18028a c18028a, InterfaceC18509p interfaceC18509p) {
                        super(1);
                        this.f125575q = c18028a;
                        this.f125576r = interfaceC18509p;
                    }

                    /* renamed from: a */
                    public final void m136256a(C27324b c27324b) {
                        AbstractC19074t.m100208f(c27324b, "$this$putJsonArray");
                        float[] m95863a = this.f125575q.m95863a();
                        InterfaceC18509p interfaceC18509p = this.f125576r;
                        int length = m95863a.length;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < length) {
                            AbstractC27330h.m139899a(c27324b, (Number) interfaceC18509p.mo240pC(Integer.valueOf(i12), Float.valueOf(m95863a[i11])));
                            i11++;
                            i12++;
                        }
                    }

                    @Override // en0.InterfaceC18505l
                    /* renamed from: i9 */
                    public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                        m136256a((C27324b) obj);
                        return C24848g0.f119245a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32976a(C18028a c18028a, InterfaceC18509p interfaceC18509p) {
                    super(1);
                    this.f125573q = c18028a;
                    this.f125574r = interfaceC18509p;
                }

                /* renamed from: a */
                public final void m136255a(C27342t c27342t) {
                    AbstractC19074t.m100208f(c27342t, "$this$addJsonObject");
                    AbstractC27330h.m139903e(c27342t, "rect", new C32977a(this.f125573q, this.f125574r));
                    AbstractC27330h.m139902d(c27342t, "text", this.f125573q.m95864b());
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                    m136255a((C27342t) obj);
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, InterfaceC18509p interfaceC18509p) {
                super(1);
                this.f125571q = list;
                this.f125572r = interfaceC18509p;
            }

            /* renamed from: a */
            public final void m136254a(C27324b c27324b) {
                AbstractC19074t.m100208f(c27324b, "$this$putJsonArray");
                List list = this.f125571q;
                InterfaceC18509p interfaceC18509p = this.f125572r;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC27330h.m139900b(c27324b, new C32976a((C18028a) it.next(), interfaceC18509p));
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m136254a((C27324b) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sy.d$a$d */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            final /* synthetic */ int[] f125577q;

            /* renamed from: r */
            final /* synthetic */ int[] f125578r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(int[] iArr, int[] iArr2) {
                super(2);
                this.f125577q = iArr;
                this.f125578r = iArr2;
            }

            /* renamed from: a */
            public final Integer m136257a(int i11, float f11) {
                int i12 = i11 % 2;
                float f12 = f11 * this.f125577q[i12];
                int[] iArr = this.f125578r;
                return Integer.valueOf((int) (f12 / (iArr[i12 + 2] - iArr[i12])));
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
                return m136257a(((Number) obj).intValue(), ((Number) obj2).floatValue());
            }
        }

        /* renamed from: sy.d$a$e */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f125579t;

            /* renamed from: u */
            final /* synthetic */ AtomicBoolean f125580u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(AtomicBoolean atomicBoolean, Continuation continuation) {
                super(2, continuation);
                this.f125580u = atomicBoolean;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new e(this.f125580u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f125579t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    this.f125579t = 1;
                    if (DelayKt.m112666b(1000L, this) == m142578e) {
                        return m142578e;
                    }
                }
                this.f125580u.set(false);
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sy.d$a$f */
        /* loaded from: classes4.dex */
        public static final class f extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final f f125581q = new f();

            f() {
                super(1);
            }

            /* renamed from: a */
            public final void m136259a(File file) {
                AbstractC19074t.m100208f(file, "it");
                AbstractC23041d2.m118207f(file);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m136259a((File) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: sy.d$a$g */
        /* loaded from: classes4.dex */
        public static final class g extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f125582t;

            /* renamed from: u */
            final /* synthetic */ String f125583u;

            /* renamed from: v */
            final /* synthetic */ InterfaceC18505l f125584v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(String str, InterfaceC18505l interfaceC18505l, Continuation continuation) {
                super(2, continuation);
                this.f125583u = str;
                this.f125584v = interfaceC18505l;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new g(this.f125583u, this.f125584v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f125582t == 0) {
                    AbstractC24862s.m129228b(obj);
                    String str = this.f125583u;
                    if (str != null && str.length() != 0) {
                        InterfaceC18505l interfaceC18505l = this.f125584v;
                        String str2 = this.f125583u;
                        AbstractC19074t.m100207e(str2, "$result");
                        interfaceC18505l.mo205i9(str2);
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
                    }
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: B */
        public static final void m136220B(File file) {
            AbstractC19074t.m100208f(file, "$it");
            AbstractC23041d2.m118207f(file);
        }

        /* renamed from: F */
        private final String m136221F(List list) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Number) it.next()).longValue());
            }
            String jSONArray2 = jSONArray.toString();
            AbstractC19074t.m100207e(jSONArray2, "toString(...)");
            return jSONArray2;
        }

        /* renamed from: g */
        public static final void m136224g(String str) {
            AbstractC19074t.m100208f(str, "$groupId");
            C23744a.Companion.m124119a().m124116d(151, str);
        }

        /* renamed from: k */
        private final int m136225k(int i11, int i12) {
            int i13 = 1;
            while (i11 / i13 > i12) {
                i13 *= 2;
            }
            if (i13 > 1) {
                return i13 / 2;
            }
            return i13;
        }

        /* renamed from: o */
        public static /* synthetic */ String m136226o(a aVar, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return aVar.m136243n(str, z11);
        }

        /* renamed from: s */
        private final String m136227s() {
            boolean m127120J;
            boolean m127120J2;
            int i11;
            String str = C18489c.m97849k(C7962g.c.a.ZALO_APP_S) + "/qr/l";
            m127120J = AbstractC24341v.m127120J(str, "https://", false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(str, "http://", false, 2, null);
                if (m127120J2) {
                    i11 = 7;
                }
                AbstractC26412d.f125564a = str;
                return str;
            }
            i11 = 8;
            str = str.substring(i11);
            AbstractC19074t.m100207e(str, "substring(...)");
            AbstractC26412d.f125564a = str;
            return str;
        }

        /* renamed from: t */
        private final int m136228t(File file, int i11) {
            int i12;
            C23257x1 c23257x1 = new C23257x1(file);
            if (i11 != 90) {
                if (i11 != 180) {
                    if (i11 != 270) {
                        i12 = 1;
                    } else {
                        i12 = 8;
                    }
                } else {
                    i12 = 3;
                }
            } else {
                i12 = 6;
            }
            c23257x1.m119905R("Orientation", String.valueOf(i12));
            c23257x1.m119904P();
            return i12;
        }

        /* renamed from: v */
        private final List m136229v(String str) {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    Long valueOf = Long.valueOf(jSONArray.optLong(i11, -1L));
                    if (valueOf.longValue() == -1) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        arrayList.add(Long.valueOf(valueOf.longValue()));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00dd A[Catch: all -> 0x00ea, TryCatch #4 {all -> 0x00ea, blocks: (B:30:0x00d6, B:32:0x00dd, B:34:0x00e3, B:39:0x00fa, B:41:0x0102, B:48:0x013f, B:51:0x0146, B:53:0x014b, B:55:0x0162, B:59:0x0135, B:62:0x00f4, B:65:0x0168, B:43:0x0105, B:45:0x0113, B:47:0x0124), top: B:29:0x00d6, inners: #0 }] */
        /* renamed from: A */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m136230A(String str, File file, int i11, String str2, String str3, boolean z11) {
            Object m129218b;
            Paint paint;
            Canvas canvas;
            FileOutputStream fileOutputStream;
            JSONArray optJSONArray;
            Object m129218b2;
            int length;
            int i12;
            String str4;
            int i13;
            int i14;
            JSONArray optJSONArray2;
            Object m129218b3;
            float[] m131380b0;
            JSONArray optJSONArray3;
            Object m129218b4;
            float[] m131380b02;
            AbstractC19074t.m100208f(str, "ownerUid");
            AbstractC19074t.m100208f(str2, "ocrJson");
            AbstractC19074t.m100208f(str3, "caption");
            try {
                C24861r.a aVar = C24861r.f119264q;
                m129218b = C24861r.m129218b(new JSONObject(str2));
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (C24861r.m129223g(m129218b)) {
                m129218b = null;
            }
            JSONObject jSONObject = (JSONObject) m129218b;
            if (file != null) {
                if (z11) {
                    String absolutePath = file.getAbsolutePath();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inMutable = true;
                    Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
                    Canvas canvas2 = new Canvas(decodeFile);
                    Paint paint2 = new Paint(1);
                    paint2.setColor(-5600);
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setStrokeWidth(1.0f);
                    try {
                        if (jSONObject != null && (optJSONArray3 = jSONObject.optJSONArray("qr_rect")) != null) {
                            try {
                                ArrayList arrayList = new ArrayList();
                                int length2 = optJSONArray3.length();
                                for (int i15 = 0; i15 < length2; i15++) {
                                    arrayList.add(Float.valueOf(optJSONArray3.getInt(i15)));
                                }
                                m131380b02 = AbstractC25358n.m131380b0((Float[]) arrayList.toArray(new Float[0]));
                                m129218b4 = C24861r.m129218b(m131380b02);
                            } catch (Throwable th3) {
                                C24861r.a aVar3 = C24861r.f119264q;
                                m129218b4 = C24861r.m129218b(AbstractC24862s.m129227a(th3));
                            }
                            if (C24861r.m129223g(m129218b4)) {
                                m129218b4 = null;
                            }
                            float[] fArr = (float[]) m129218b4;
                            if (fArr != null) {
                                paint = paint2;
                                canvas = canvas2;
                                AbstractC26412d.Companion.m136240j(canvas2, paint2, fArr, "qr_rect", 10.0f, i11);
                                if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("ocr_result")) != null) {
                                    try {
                                        length = optJSONArray.length();
                                        i12 = 0;
                                        while (i12 < length) {
                                            JSONObject optJSONObject = optJSONArray.optJSONObject(i12);
                                            if (optJSONObject != null) {
                                                str4 = optJSONObject.optString("text");
                                            } else {
                                                str4 = null;
                                            }
                                            if (str4 == null) {
                                                str4 = "<blank>";
                                            } else {
                                                AbstractC19074t.m100205c(str4);
                                            }
                                            String str5 = str4;
                                            if (optJSONObject != null && (optJSONArray2 = optJSONObject.optJSONArray("rect")) != null) {
                                                AbstractC19074t.m100205c(optJSONArray2);
                                                try {
                                                    C24861r.a aVar4 = C24861r.f119264q;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    int length3 = optJSONArray2.length();
                                                    for (int i16 = 0; i16 < length3; i16++) {
                                                        arrayList2.add(Float.valueOf(optJSONArray2.getInt(i16)));
                                                    }
                                                    m131380b0 = AbstractC25358n.m131380b0((Float[]) arrayList2.toArray(new Float[0]));
                                                    m129218b3 = C24861r.m129218b(m131380b0);
                                                } catch (Throwable th4) {
                                                    C24861r.a aVar5 = C24861r.f119264q;
                                                    m129218b3 = C24861r.m129218b(AbstractC24862s.m129227a(th4));
                                                }
                                                if (C24861r.m129223g(m129218b3)) {
                                                    m129218b3 = null;
                                                }
                                                float[] fArr2 = (float[]) m129218b3;
                                                if (fArr2 != null) {
                                                    i13 = i12;
                                                    i14 = length;
                                                    AbstractC26412d.Companion.m136240j(canvas, paint, fArr2, str5, 10.0f, i11);
                                                    i12 = i13 + 1;
                                                    length = i14;
                                                }
                                            }
                                            i13 = i12;
                                            i14 = length;
                                            i12 = i13 + 1;
                                            length = i14;
                                        }
                                        m129218b2 = C24861r.m129218b(C24848g0.f119245a);
                                    } catch (Throwable th5) {
                                        C24861r.a aVar6 = C24861r.f119264q;
                                        m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th5));
                                    }
                                    C24861r.m129217a(m129218b2);
                                }
                                fileOutputStream = new FileOutputStream(file);
                                decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                AbstractC2933b.m13890a(fileOutputStream, null);
                                AbstractC26412d.Companion.m136228t(file, 360 - i11);
                            }
                        }
                        decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        AbstractC2933b.m13890a(fileOutputStream, null);
                        AbstractC26412d.Companion.m136228t(file, 360 - i11);
                    } catch (Throwable th6) {
                        try {
                            throw th6;
                        } catch (Throwable th7) {
                            AbstractC2933b.m13890a(fileOutputStream, th6);
                            throw th7;
                        }
                    }
                    paint = paint2;
                    canvas = canvas2;
                    if (jSONObject != null) {
                        length = optJSONArray.length();
                        i12 = 0;
                        while (i12 < length) {
                        }
                        m129218b2 = C24861r.m129218b(C24848g0.f119245a);
                        C24861r.m129217a(m129218b2);
                    }
                    fileOutputStream = new FileOutputStream(file);
                }
                C26404f c26404f = new C26404f(10);
                c26404f.m136162o(file.getAbsolutePath());
                c26404f.m136172y(str2 + "\n" + str3);
                AbstractC23112j7.m118513W(str, c26404f);
                AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: sy.c

                    /* renamed from: p */
                    public final /* synthetic */ File f125563p;

                    public /* synthetic */ RunnableC26411c(File file2) {
                        r1 = file2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC26412d.a.m136220B(r1);
                    }
                }, 5000L);
                return;
            }
            AbstractC23112j7.m118532h0(str, str3);
        }

        /* renamed from: C */
        public final void m136231C(List list) {
            AbstractC19074t.m100208f(list, "value");
            AbstractC0924m0.m4058nm(m136221F(list));
        }

        /* renamed from: D */
        public final void m136232D(InterfaceC27218a interfaceC27218a, Bundle bundle, int i11) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSerializable("qrcode_type_view", QRCodeViewerView.EnumC14816e.MY_QRCODE);
            if (interfaceC27218a != null) {
                interfaceC27218a.mo35573l4(QRCodeViewerView.class, bundle, 1, true);
            }
        }

        /* renamed from: E */
        public final void m136233E(InterfaceC27218a interfaceC27218a, Bundle bundle, int i11) {
            C17487o0 mo35579p;
            if (AbstractC22470k.m116151c() && interfaceC27218a != null && (mo35579p = interfaceC27218a.mo35579p()) != null) {
                Class m136245q = m136245q();
                if (bundle == null) {
                    bundle = AbstractC1438d.m7340a();
                }
                mo35579p.m93066i2(m136245q, bundle, i11, 1, true);
            }
        }

        /* renamed from: c */
        public final String m136234c(int i11) {
            C27342t c27342t = new C27342t();
            AbstractC27330h.m139901c(c27342t, "ocr_empty", Integer.valueOf(i11));
            return c27342t.m139948a().toString();
        }

        /* renamed from: d */
        public final String m136235d(int[] iArr, int[] iArr2, float[] fArr, List list, int i11) {
            AbstractC19074t.m100208f(iArr, "qrImageSize");
            AbstractC19074t.m100208f(iArr2, "frameQrImageRect");
            AbstractC19074t.m100208f(fArr, "frameQrCodeCorners");
            AbstractC19074t.m100208f(list, "frameLines");
            d dVar = new d(iArr, iArr2);
            C27342t c27342t = new C27342t();
            AbstractC27330h.m139903e(c27342t, "result_size", new C32975a(iArr));
            AbstractC27330h.m139903e(c27342t, "qr_rect", new b(fArr, dVar, iArr2));
            AbstractC27330h.m139903e(c27342t, "ocr_result", new c(list, dVar));
            AbstractC27330h.m139901c(c27342t, "ocr_empty", Integer.valueOf(i11));
            return c27342t.m139948a().toString();
        }

        /* renamed from: e */
        public final void m136236e() {
            if (C26691l.m137129b()) {
                try {
                    Thread.sleep(20000L);
                } catch (InterruptedException e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* renamed from: f */
        public final void m136237f(String str, int i11, Object... objArr) {
            String str2;
            AbstractC19074t.m100208f(str, "groupId");
            AbstractC19074t.m100208f(objArr, "args");
            if (i11 == 51 && objArr.length >= 2) {
                String str3 = "group_" + str;
                Object obj = objArr[0];
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                if (AbstractC19074t.m100204b(str3, str2)) {
                    Object obj2 = objArr[1];
                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatContent");
                    if (((C17945a0) obj2).m95041W4() != 20) {
                        return;
                    }
                    AbstractC17930e.Companion.m94551d().mo94530d("DEBOUNCE_CHECK_SHARE_GROUP_INFO", new Runnable() { // from class: sy.b

                        /* renamed from: p */
                        public final /* synthetic */ String f125562p;

                        public /* synthetic */ RunnableC26410b(String str4) {
                            r1 = str4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC26412d.a.m136224g(r1);
                        }
                    }, 500L);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:            if (r0 == null) goto L19;     */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean m136238h(String str, boolean z11) {
            boolean m127149O;
            AbstractC19074t.m100208f(str, "text");
            String str2 = AbstractC26412d.f125564a;
            if (str2 != null) {
                if (!z11) {
                    str2 = null;
                }
            }
            str2 = m136227s();
            m127149O = AbstractC24342w.m127149O(str, str2, false, 2, null);
            return m127149O;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:            if (r12 == null) goto L71;     */
        /* JADX WARN: Code restructure failed: missing block: B:3:0x003d, code lost:            if (r30 != 0) goto L56;     */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String m136239i(Context context, C3979l c3979l, C3979l c3979l2, C3979l c3979l3, int i11, String str, boolean z11, AtomicBoolean atomicBoolean, CharSequence charSequence, CharSequence charSequence2, InterfaceC18505l interfaceC18505l) {
            Bitmap m18839c;
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(str, "qrPhotoFileName");
            AbstractC19074t.m100208f(atomicBoolean, "isProcessingDownloadImage");
            AbstractC19074t.m100208f(charSequence, "name");
            AbstractC19074t.m100208f(interfaceC18505l, "showDialogDownloadFinish");
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() == null) {
                    }
                    if (c3979l2 != null) {
                        if (atomicBoolean.get()) {
                            return "";
                        }
                        atomicBoolean.set(true);
                        QRCardTemplate qRCardTemplate = null;
                        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new e(atomicBoolean, null), 3, null);
                        if (c3979l3 != null && (m18839c = c3979l3.m18839c()) != null) {
                            if (m18839c.getWidth() != 0 && m18839c.getHeight() != 0) {
                                qRCardTemplate = new QRCardTemplate(context, null, 0, 420, Integer.valueOf((int) (420 * (m18839c.getHeight() / m18839c.getWidth()))), null, null, null, 230, null);
                            }
                        }
                        qRCardTemplate = new QRCardTemplate(context, null, 0, null, null, null, null, null, 254, null);
                        if (c3979l3 != null) {
                            qRCardTemplate.getBackgroundView().setImageInfo(c3979l3);
                        } else {
                            qRCardTemplate.getBackgroundView().setBackgroundResource(AbstractC16803z.res_qr_default_background);
                        }
                        qRCardTemplate.getNameView().setText(charSequence);
                        if (charSequence2 != null) {
                            qRCardTemplate.getSubNameView().setText(charSequence2);
                        }
                        if (c3979l != null) {
                            qRCardTemplate.getAvatarView().setImageInfo(c3979l);
                        } else {
                            qRCardTemplate.getAvatarView().setImageResource(i11);
                        }
                        qRCardTemplate.getQrImageView().setImageInfo(c3979l2);
                        Bitmap m136241l = m136241l(qRCardTemplate);
                        if (z11) {
                            String absolutePath = new File(AbstractC20130d.m104905y(), str).getAbsolutePath();
                            FileOutputStream fileOutputStream = new FileOutputStream(absolutePath);
                            m136241l.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            AbstractC19074t.m100205c(absolutePath);
                            return absolutePath;
                        }
                        String path = AbstractC21943a.m114579c().getPath();
                        FileOutputStream fileOutputStream2 = new FileOutputStream(path);
                        m136241l.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        AbstractC19074t.m100205c(path);
                        return m136251z(path, str, interfaceC18505l);
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error));
                    return "";
                } catch (Exception e11) {
                    e11.printStackTrace();
                    atomicBoolean.set(false);
                    return "";
                }
            }
        }

        /* renamed from: j */
        public final void m136240j(Canvas canvas, Paint paint, float[] fArr, String str, float f11, int i11) {
            AbstractC19074t.m100208f(canvas, "canvas");
            AbstractC19074t.m100208f(paint, "paint");
            AbstractC19074t.m100208f(fArr, "points");
            AbstractC19074t.m100208f(str, "caption");
            int length = (fArr.length / 2) - 1;
            for (int i12 = 0; i12 < length; i12++) {
                int i13 = i12 * 2;
                canvas.drawLine(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], fArr[i13 + 3], paint);
            }
            if (fArr.length >= 4) {
                canvas.drawLine(fArr[fArr.length - 2], fArr[fArr.length - 1], fArr[0], fArr[1], paint);
                paint.setTextSize(f11);
                float f12 = fArr[fArr.length - 2];
                float f13 = fArr[fArr.length - 1];
                int save = canvas.save();
                canvas.rotate(i11, f12, f13);
                try {
                    canvas.drawText(str, fArr[fArr.length - 2], fArr[fArr.length - 1], paint);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        }

        /* renamed from: l */
        public final Bitmap m136241l(View view) {
            AbstractC19074t.m100208f(view, "view");
            AbstractC3104p.m15693v0(AbstractC3096i0.m15574y());
            view.measure(0, 0);
            Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(createBitmap);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.draw(canvas);
            return createBitmap;
        }

        /* renamed from: m */
        public final List m136242m() {
            String m2954C4 = AbstractC0924m0.m2954C4();
            AbstractC19074t.m100207e(m2954C4, "getRecentQrToDeleteList(...)");
            return m136229v(m2954C4);
        }

        /* renamed from: n */
        public final String m136243n(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "text");
            if (m136238h(str, z11)) {
                String queryParameter = Uri.parse(str).getQueryParameter("tk");
                if (queryParameter == null) {
                    return "";
                }
                return queryParameter;
            }
            return null;
        }

        /* renamed from: p */
        public final String m136244p(String str) {
            String m127112B;
            AbstractC19074t.m100208f(str, "text");
            m127112B = AbstractC24341v.m127112B(str, "tel:", "", true);
            if (!Patterns.PHONE.matcher(m127112B).matches() || !C16741a.m89329r().m89334E(m127112B, AbstractC23309i.m121704a5())) {
                return null;
            }
            return m127112B;
        }

        /* renamed from: q */
        public final Class m136245q() {
            C26691l.m137148w();
            return ScanQRCodeView.class;
        }

        /* renamed from: r */
        public final List m136246r(int i11) {
            Uri contentUri = MediaStore.Files.getContentUri("external");
            String str = "(" + ("(media_type = 1 AND mime_type not in ('image/gif'))") + " AND _size >= 0)";
            ArrayList arrayList = new ArrayList();
            try {
                Cursor m120358v0 = AbstractC23280z4.m120358v0(contentUri, null, str, null, "date_added DESC ", i11, new SensitiveData("gallery_get_last_media_thumb", "camera", null, 4, null));
                while (m120358v0 != null) {
                    try {
                        if (!m120358v0.moveToNext()) {
                            break;
                        }
                        if (arrayList.size() == 2) {
                            AbstractC2933b.m13890a(m120358v0, null);
                            return arrayList;
                        }
                        String m120357v = AbstractC23280z4.m120357v(m120358v0, contentUri, m120358v0.getColumnIndex("_id"), m120358v0.getColumnIndex("_data"));
                        AbstractC19074t.m100205c(m120357v);
                        arrayList.add(m120357v);
                    } finally {
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(m120358v0, null);
            } catch (Throwable th2) {
                AbstractC20110a.f98889a.mo104552e(th2);
            }
            return arrayList;
        }

        /* renamed from: u */
        public final byte[] m136247u(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int[] iArr, InterfaceC18505l interfaceC18505l) {
            boolean z11;
            boolean z12;
            Object m129218b;
            InterfaceC18505l interfaceC18505l2;
            int i16 = i11;
            int i17 = i12;
            AbstractC19074t.m100208f(bArr, "yuvData");
            AbstractC19074t.m100208f(iArr, "outputFrameSizeAndFileSize");
            YuvImage yuvImage = new YuvImage(bArr, 17, i11, i12, null);
            int i18 = AbstractC26412d.f125565b;
            AbstractC26412d.f125565b = i18 + 1;
            String valueOf = String.valueOf(i18);
            File file = new File(CoreUtility.getAppContext().getFilesDir(), "pc_login_qr_image_" + valueOf + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                int i19 = 0;
                yuvImage.compressToJpeg(new Rect(0, 0, i16, i17), 100, fileOutputStream);
                Object obj = null;
                AbstractC2933b.m13890a(fileOutputStream, null);
                long length = file.length();
                if (i16 <= i14 && i17 <= i14) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (length <= i15) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z11) {
                    int max = Math.max(i11, i12);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    int m136225k = AbstractC26412d.Companion.m136225k(max, i14);
                    options.inSampleSize = m136225k;
                    options.inDensity = max;
                    options.inTargetDensity = i14 * m136225k;
                    options.inJustDecodeBounds = false;
                    Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                    int width = decodeFile.getWidth();
                    i17 = decodeFile.getHeight();
                    if (!z12) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        int i21 = 80;
                        try {
                            int m150827c = AbstractC31022c.m150827c(80, 0, -10);
                            if (m150827c <= 80) {
                                while (true) {
                                    byteArrayOutputStream.reset();
                                    decodeFile.compress(Bitmap.CompressFormat.JPEG, i21, byteArrayOutputStream);
                                    if (byteArrayOutputStream.size() <= i15 || i21 == m150827c) {
                                        break;
                                    }
                                    i21 -= 10;
                                }
                            }
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                byteArrayOutputStream.writeTo(fileOutputStream);
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                AbstractC2933b.m13890a(fileOutputStream, null);
                                AbstractC2933b.m13890a(byteArrayOutputStream, null);
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            decodeFile.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            AbstractC2933b.m13890a(fileOutputStream, null);
                        } finally {
                        }
                    }
                    i16 = width;
                }
                if (i13 != 0 && i13 != 360) {
                    m136228t(file, 360 - i13);
                }
                iArr[0] = i16;
                iArr[1] = i17;
                try {
                    C24861r.a aVar = C24861r.f119264q;
                    m129218b = C24861r.m129218b(Integer.valueOf((int) file.length()));
                } catch (Throwable th2) {
                    C24861r.a aVar2 = C24861r.f119264q;
                    m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
                }
                if (!C24861r.m129223g(m129218b)) {
                    obj = m129218b;
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    i19 = num.intValue();
                }
                iArr[2] = i19;
                byte[] m119724i = AbstractC23238v2.m119724i(file);
                if (interfaceC18505l == null) {
                    interfaceC18505l2 = f.f125581q;
                } else {
                    interfaceC18505l2 = interfaceC18505l;
                }
                interfaceC18505l2.mo205i9(file);
                return m119724i;
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }

        /* renamed from: w */
        public final C23488k m136248w(C20096c c20096c) {
            Object m129218b;
            String str;
            String str2;
            String str3;
            String m104493e;
            String str4;
            Spanned spanned;
            CharSequence charSequence;
            String str5;
            long j11;
            String optString;
            Object m129218b2;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                C24861r.a aVar = C24861r.f119264q;
                String m104490b = c20096c.m104490b();
                if (m104490b == null) {
                    m104490b = "";
                } else {
                    AbstractC19074t.m100205c(m104490b);
                }
                m129218b = C24861r.m129218b(new JSONObject(m104490b));
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            String str6 = null;
            if (C24861r.m129223g(m129218b)) {
                m129218b = null;
            }
            JSONObject jSONObject = (JSONObject) m129218b;
            int m104491c = c20096c.m104491c();
            String m104492d = c20096c.m104492d();
            if (m104492d == null) {
                str = "";
            } else {
                str = m104492d;
            }
            if (jSONObject != null) {
                str2 = jSONObject.optString("title");
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str3 = "";
            } else {
                str3 = str2;
            }
            if ((jSONObject == null || (m104493e = jSONObject.optString("description")) == null) && (m104493e = c20096c.m104493e()) == null) {
                m104493e = c20096c.m104492d();
            }
            if (m104493e == null) {
                str4 = "";
            } else {
                str4 = m104493e;
            }
            if (jSONObject != null && (optString = jSONObject.optString("warning")) != null) {
                try {
                    m129218b2 = C24861r.m129218b(AbstractC1463b.m7440a(optString, 0));
                } catch (Throwable th3) {
                    C24861r.a aVar3 = C24861r.f119264q;
                    m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th3));
                }
                if (C24861r.m129223g(m129218b2)) {
                    m129218b2 = null;
                }
                spanned = (Spanned) m129218b2;
            } else {
                spanned = null;
            }
            if (spanned == null) {
                charSequence = "";
            } else {
                charSequence = spanned;
            }
            if (jSONObject != null) {
                str6 = jSONObject.optString("cta");
            }
            if (str6 == null) {
                str5 = "";
            } else {
                str5 = str6;
            }
            if (jSONObject != null) {
                j11 = jSONObject.optLong("timeoutNextQR");
            } else {
                j11 = 0;
            }
            return new C23488k(c20096c, m104491c, str, str3, str4, charSequence, str5, j11);
        }

        /* renamed from: x */
        public final AbstractC23490m m136249x(String str) {
            AbstractC19074t.m100208f(str, "qrCodeText");
            return m136250y(str, 0);
        }

        /* renamed from: y */
        public final AbstractC23490m m136250y(String str, int i11) {
            C27306e c27306e;
            String str2;
            String str3;
            String str4;
            String str5;
            AbstractC19074t.m100208f(str, "qrCodeText");
            AbstractC27302a m139830b = AbstractC27304c.Companion.m139830b(new Result.Success(0L, str, new byte[0], new float[0], new float[0]));
            if (m139830b instanceof C27306e) {
                c27306e = (C27306e) m139830b;
            } else {
                c27306e = null;
            }
            if (c27306e != null) {
                str2 = c27306e.m139831b();
            } else {
                str2 = null;
            }
            if (str2 != null) {
                str3 = m136226o(this, str2, false, 2, null);
            } else {
                str3 = null;
            }
            if (str2 == null) {
                str4 = m136244p(str);
            } else {
                str4 = null;
            }
            if (str2 != null && str3 != null) {
                if (str3.length() == 0) {
                    str5 = null;
                } else {
                    str5 = str3;
                }
                return new AbstractC23490m.b(i11, str, str2, str5, null, null);
            }
            if (str2 != null) {
                return new AbstractC23490m.a(i11, str, str2);
            }
            if (str4 != null) {
                return new AbstractC23490m.c(i11, str, str4);
            }
            return new AbstractC23490m.d(i11, str);
        }

        /* renamed from: z */
        public final String m136251z(String str, String str2, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(str, "path");
            AbstractC19074t.m100208f(str2, "qrPhotoFileName");
            AbstractC19074t.m100208f(interfaceC18505l, "showDialogDownloadFinish");
            try {
                if (!TextUtils.isEmpty(str)) {
                    str2 = AbstractC23041d2.m118212k(str);
                }
                String m120304P = AbstractC23280z4.m120304P(str, str2, true, false, false, new SensitiveData("gallery_save_qr", "scan_qr", null, 4, null));
                BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112681c()), null, null, new g(m120304P, interfaceC18505l, null), 3, null);
                if (m120304P == null) {
                    return "";
                }
                return m120304P;
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }
    }

    /* renamed from: e */
    public static final void m136216e(String str, int i11, Object... objArr) {
        Companion.m136237f(str, i11, objArr);
    }

    /* renamed from: f */
    public static final String m136217f(Context context, C3979l c3979l, C3979l c3979l2, C3979l c3979l3, int i11, String str, boolean z11, AtomicBoolean atomicBoolean, CharSequence charSequence, CharSequence charSequence2, InterfaceC18505l interfaceC18505l) {
        return Companion.m136239i(context, c3979l, c3979l2, c3979l3, i11, str, z11, atomicBoolean, charSequence, charSequence2, interfaceC18505l);
    }

    /* renamed from: g */
    public static final Class m136218g() {
        return Companion.m136245q();
    }

    /* renamed from: h */
    public static final void m136219h(InterfaceC27218a interfaceC27218a, Bundle bundle, int i11) {
        Companion.m136233E(interfaceC27218a, bundle, i11);
    }
}
