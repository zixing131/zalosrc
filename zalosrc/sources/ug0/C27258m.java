package ug0;

import android.net.Uri;
import ch0.AbstractC3488c;
import ch0.C3487b;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.zalocloud.model.api.BaseResponse;
import com.zing.zalo.data.zalocloud.model.api.MsgInfo;
import com.zing.zalo.data.zalocloud.model.api.RequestMigrateServerItemParams;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.C20096c;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Random;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import me0.AbstractC23041d2;
import me0.AbstractC23227u1;
import od0.C24226d;
import od0.C24230h;
import od0.EnumC24229g;
import od0.InterfaceC24232j;
import p239ih.C20556f;
import p487rl.C25823d;
import p550ul.C27298d;
import p645xh.C29628e;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import qg0.AbstractC25270e;
import qg0.C25271f;
import rd0.AbstractC25752r;
import sg0.AbstractC26246b;
import sg0.C26245a;
import sg0.C26247c;
import tg0.C26675a;
import tg0.C26676b;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: ug0.m */
/* loaded from: classes7.dex */
public final class C27258m {

    /* renamed from: a */
    public static final C27258m f128131a = new C27258m();

    /* renamed from: b */
    private static final InterfaceC24854k f128132b;

    /* renamed from: ug0.m$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        private final File f128133a;

        /* renamed from: b */
        private final AbstractC25270e f128134b;

        /* renamed from: c */
        private final String f128135c;

        public a(File file, AbstractC25270e abstractC25270e, String str) {
            AbstractC19074t.m100208f(file, "outputFile");
            AbstractC19074t.m100208f(abstractC25270e, "encryptionKey");
            AbstractC19074t.m100208f(str, "md5Checksum");
            this.f128133a = file;
            this.f128134b = abstractC25270e;
            this.f128135c = str;
        }

        /* renamed from: a */
        public final AbstractC25270e m139484a() {
            return this.f128134b;
        }

        /* renamed from: b */
        public final String m139485b() {
            return this.f128135c;
        }

        /* renamed from: c */
        public final File m139486c() {
            return this.f128133a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f128133a, aVar.f128133a) && AbstractC19074t.m100204b(this.f128134b, aVar.f128134b) && AbstractC19074t.m100204b(this.f128135c, aVar.f128135c);
        }

        public int hashCode() {
            return (((this.f128133a.hashCode() * 31) + this.f128134b.hashCode()) * 31) + this.f128135c.hashCode();
        }

        public String toString() {
            return "EncryptInfo(outputFile=" + this.f128133a + ", encryptionKey=" + this.f128134b + ", md5Checksum=" + this.f128135c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ug0.m$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a */
        private final MsgInfo f128136a;

        /* renamed from: b */
        private final String f128137b;

        /* renamed from: c */
        private final String f128138c;

        /* renamed from: d */
        private final AbstractC25270e f128139d;

        /* renamed from: e */
        private final String f128140e;

        /* renamed from: f */
        private final AbstractC25270e f128141f;

        public b(MsgInfo msgInfo, String str, String str2, AbstractC25270e abstractC25270e, String str3, AbstractC25270e abstractC25270e2) {
            AbstractC19074t.m100208f(msgInfo, "msgInfo");
            AbstractC19074t.m100208f(str, "md5Checksum");
            AbstractC19074t.m100208f(str3, "mediaExtInfo");
            this.f128136a = msgInfo;
            this.f128137b = str;
            this.f128138c = str2;
            this.f128139d = abstractC25270e;
            this.f128140e = str3;
            this.f128141f = abstractC25270e2;
        }

        /* renamed from: a */
        public final String m139487a() {
            return this.f128138c;
        }

        /* renamed from: b */
        public final String m139488b() {
            return this.f128137b;
        }

        /* renamed from: c */
        public final String m139489c() {
            return this.f128140e;
        }

        /* renamed from: d */
        public final AbstractC25270e m139490d() {
            return this.f128141f;
        }

        /* renamed from: e */
        public final MsgInfo m139491e() {
            return this.f128136a;
        }

        /* renamed from: f */
        public final AbstractC25270e m139492f() {
            return this.f128139d;
        }
    }

    /* renamed from: ug0.m$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f128142q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C27298d mo12V4() {
            return new C27298d();
        }
    }

    /* renamed from: ug0.m$d */
    /* loaded from: classes7.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ long f128143q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j11) {
            super(1);
            this.f128143q = j11;
        }

        /* renamed from: a */
        public final void m139494a(Throwable th2) {
            C26676b.m136957g("SMLZCloudMigrationUploadHelper", "requestMigrateServerItem(): Cancel migration request reqId=" + this.f128143q + ", reason=" + th2, null, 4, null);
            C29628e.m147249E0().m93379G(this.f128143q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139494a((Throwable) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ug0.m$e */
    /* loaded from: classes7.dex */
    static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ CancellableContinuation f128144q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CancellableContinuation cancellableContinuation) {
            super(1);
            this.f128144q = cancellableContinuation;
        }

        /* renamed from: a */
        public final void m139495a(BaseResponse baseResponse) {
            AbstractC19074t.m100208f(baseResponse, "it");
            this.f128144q.mo112492g(C24861r.m129218b(baseResponse));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m139495a((BaseResponse) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ug0.m$f */
    /* loaded from: classes7.dex */
    static final class f extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ CancellableContinuation f128145q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(CancellableContinuation cancellableContinuation) {
            super(2);
            this.f128145q = cancellableContinuation;
        }

        /* renamed from: a */
        public final void m139496a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errMsg");
            CancellableContinuation cancellableContinuation = this.f128145q;
            C24861r.a aVar = C24861r.f119264q;
            cancellableContinuation.mo112492g(C24861r.m129218b(new BaseResponse(i11, str)));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139496a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug0.m$g */
    /* loaded from: classes7.dex */
    public static final class g extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f128146s;

        /* renamed from: u */
        int f128148u;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f128146s = obj;
            this.f128148u |= Integer.MIN_VALUE;
            return C27258m.this.m139483h(null, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ug0.m$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: A */
        final /* synthetic */ C24230h f128149A;

        /* renamed from: B */
        final /* synthetic */ C25823d f128150B;

        /* renamed from: C */
        final /* synthetic */ boolean f128151C;

        /* renamed from: D */
        final /* synthetic */ String f128152D;

        /* renamed from: t */
        Object f128153t;

        /* renamed from: u */
        Object f128154u;

        /* renamed from: v */
        Object f128155v;

        /* renamed from: w */
        Object f128156w;

        /* renamed from: x */
        boolean f128157x;

        /* renamed from: y */
        int f128158y;

        /* renamed from: z */
        final /* synthetic */ MessageId f128159z;

        /* renamed from: ug0.m$h$a */
        /* loaded from: classes7.dex */
        public static final class a implements InterfaceC24232j {

            /* renamed from: a */
            final /* synthetic */ C25823d f128160a;

            /* renamed from: b */
            final /* synthetic */ boolean f128161b;

            /* renamed from: c */
            final /* synthetic */ String f128162c;

            /* renamed from: d */
            final /* synthetic */ CancellableContinuation f128163d;

            /* renamed from: e */
            final /* synthetic */ MessageId f128164e;

            a(C25823d c25823d, boolean z11, String str, CancellableContinuation cancellableContinuation, MessageId messageId) {
                this.f128160a = c25823d;
                this.f128161b = z11;
                this.f128162c = str;
                this.f128163d = cancellableContinuation;
                this.f128164e = messageId;
            }

            @Override // od0.InterfaceC24232j
            /* renamed from: a */
            public void mo14379a(AbstractC25752r.b bVar) {
                AbstractC19074t.m100208f(bVar, "uploadSuccess");
                C26676b.m136957g("SMLZCloudMigrationUploadHelper", "Upload success: " + this.f128160a.m133185k().m41044h(), null, 4, null);
                if (this.f128161b) {
                    AbstractC23041d2.m118208g(this.f128162c);
                }
                this.f128163d.mo112492g(C24861r.m129218b(bVar));
            }

            @Override // od0.InterfaceC24232j
            /* renamed from: b */
            public void mo14380b(AbstractC25752r.a aVar) {
                Integer num;
                AbstractC19074t.m100208f(aVar, "uploadFailure");
                String m41044h = this.f128164e.m41044h();
                C20096c m132886a = aVar.m132886a();
                String str = null;
                if (m132886a != null) {
                    num = Integer.valueOf(m132886a.m104489a());
                } else {
                    num = null;
                }
                C20096c m132886a2 = aVar.m132886a();
                if (m132886a2 != null) {
                    str = m132886a2.m104493e();
                }
                C26676b.m136955e("SMLZCloudMigrationUploadHelper", "Upload FAILED: msgId=" + m41044h + ", errorCode=" + num + ", errorMsg=" + str, C26676b.b.f126335t);
                if (this.f128161b) {
                    AbstractC23041d2.m118208g(this.f128162c);
                }
                this.f128163d.mo112492g(C24861r.m129218b(aVar));
            }

            @Override // od0.InterfaceC24232j
            /* renamed from: c */
            public void mo14381c(long j11) {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ug0.m$h$b */
        /* loaded from: classes7.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C24230h f128165q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C24230h c24230h) {
                super(1);
                this.f128165q = c24230h;
            }

            /* renamed from: a */
            public final void m139498a(Throwable th2) {
                this.f128165q.m126507i();
                this.f128165q.m126509j();
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m139498a((Throwable) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(MessageId messageId, C24230h c24230h, C25823d c25823d, boolean z11, String str, Continuation continuation) {
            super(2, continuation);
            this.f128159z = messageId;
            this.f128149A = c24230h;
            this.f128150B = c25823d;
            this.f128151C = z11;
            this.f128152D = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f128159z, this.f128149A, this.f128150B, this.f128151C, this.f128152D, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Continuation m142576c;
            Object m142578e2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f128158y;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                MessageId messageId = this.f128159z;
                C24230h c24230h = this.f128149A;
                C25823d c25823d = this.f128150B;
                boolean z11 = this.f128151C;
                String str = this.f128152D;
                this.f128153t = messageId;
                this.f128154u = c24230h;
                this.f128155v = c25823d;
                this.f128156w = str;
                this.f128157x = z11;
                this.f128158y = 1;
                m142576c = AbstractC28297c.m142576c(this);
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
                cancellableContinuationImpl.m112574F();
                try {
                    C26676b.m136957g("SMLZCloudMigrationUploadHelper", "Start upload: " + messageId.m41044h(), null, 4, null);
                    C24226d.b bVar = C24226d.Companion;
                    c24230h.m126505h(new a(c25823d, z11, str, cancellableContinuationImpl, messageId));
                    bVar.m126442j(c24230h);
                    cancellableContinuationImpl.mo112543I(new b(c24230h));
                } catch (Exception e11) {
                    C26676b.m136954d("SMLZCloudMigrationUploadHelper", e11);
                    C24861r.a aVar = C24861r.f119264q;
                    cancellableContinuationImpl.mo112492g(C24861r.m129218b(new AbstractC25752r.a(new C20096c(1000004, e11.getMessage()), null, 0, 6, null)));
                }
                obj = cancellableContinuationImpl.m112571A();
                m142578e2 = AbstractC28298d.m142578e();
                if (obj == m142578e2) {
                    AbstractC29100h.m145355c(this);
                }
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            return obj;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(c.f128142q);
        f128132b = m129210a;
    }

    private C27258m() {
    }

    /* renamed from: d */
    private final Hashtable m139477d(b bVar) {
        Hashtable hashtable = new Hashtable();
        C27258m c27258m = f128131a;
        hashtable.put("x-zl-mdck", c27258m.m139480b(bVar.m139488b(), bVar.m139487a()));
        hashtable.put("x-zl-msi", bVar.m139491e().m41370j());
        if (bVar.m139492f() != null) {
            hashtable.put("x-zl-eci", c27258m.m139481c(bVar.m139492f()));
        }
        hashtable.put("x-zl-ex-inf", bVar.m139489c());
        if (bVar.m139490d() != null) {
            hashtable.put("x-zl-ex-eci", c27258m.m139481c(bVar.m139490d()));
        }
        return hashtable;
    }

    /* renamed from: e */
    private final a m139478e(C25823d c25823d) {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        C20556f m133183i = c25823d.m133183i();
        BufferedInputStream bufferedInputStream2 = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        C26676b.m136957g("SMLZCloudMigrationUploadHelper", "Start encrypt file with size = " + m133183i.m106845r(), null, 4, null);
        if (m133183i.m106845r() > 0) {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            File m17471j = C3487b.f14598a.m17471j(m133183i.m106835h());
            try {
                InputStream m106838k = m133183i.m106838k();
                if (m106838k != null) {
                    if (m106838k instanceof BufferedInputStream) {
                        bufferedInputStream = (BufferedInputStream) m106838k;
                    } else {
                        bufferedInputStream = new BufferedInputStream(m106838k, 8192);
                    }
                    try {
                        OutputStream digestOutputStream = new DigestOutputStream(new FileOutputStream(m17471j), messageDigest);
                        if (digestOutputStream instanceof BufferedOutputStream) {
                            bufferedOutputStream2 = (BufferedOutputStream) digestOutputStream;
                        } else {
                            bufferedOutputStream2 = new BufferedOutputStream(digestOutputStream, 8192);
                        }
                        AbstractC25270e m134972f = C26247c.f124659a.m134972f(AbstractC27247b.m139393e(c25823d), bufferedInputStream, bufferedOutputStream2);
                        bufferedInputStream.close();
                        bufferedOutputStream2.close();
                        C26245a c26245a = C26245a.f124654a;
                        byte[] digest = messageDigest.digest();
                        AbstractC19074t.m100207e(digest, "digest(...)");
                        return new a(m17471j, m134972f, c26245a.m134952k(digest));
                    } catch (Throwable th2) {
                        th = th2;
                        BufferedOutputStream bufferedOutputStream3 = bufferedOutputStream2;
                        bufferedInputStream2 = bufferedInputStream;
                        bufferedOutputStream = bufferedOutputStream3;
                        if (bufferedInputStream2 != null) {
                            bufferedInputStream2.close();
                        }
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Input file not found");
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } else {
            throw new FileNotFoundException("File not found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final C27298d m139479f() {
        return (C27298d) f128132b.getValue();
    }

    /* renamed from: b */
    public final String m139480b(String str, String str2) {
        AbstractC19074t.m100208f(str, "md5Checksum");
        if (str2 != null && str2.length() != 0) {
            String format = String.format("orig=%s; encr=%s", Arrays.copyOf(new Object[]{str, str2}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
        return "orig=" + str;
    }

    /* renamed from: c */
    public final String m139481c(AbstractC25270e abstractC25270e) {
        AbstractC19074t.m100208f(abstractC25270e, "encryptionKey");
        String format = String.format("v=%d; i=%s", Arrays.copyOf(new Object[]{Integer.valueOf(abstractC25270e.m130786a()), C25271f.f121221a.m130799g(abstractC25270e)}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: g */
    public final Object m139482g(MsgInfo msgInfo, String str, String str2, String str3, String str4, String str5, String str6, long j11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        String builder = Uri.parse(str).buildUpon().clearQuery().toString();
        AbstractC19074t.m100207e(builder, "toString(...)");
        m142576c = AbstractC28297c.m142576c(continuation);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
        cancellableContinuationImpl.m112574F();
        cancellableContinuationImpl.mo112543I(new d(f128131a.m139479f().m139746G(new RequestMigrateServerItemParams(msgInfo, builder, null, str3, str4, str5, str6), new e(cancellableContinuationImpl), new f(cancellableContinuationImpl), j11)));
        Object m112571A = cancellableContinuationImpl.m112571A();
        m142578e = AbstractC28298d.m142578e();
        if (m112571A == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m112571A;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m139483h(C25823d c25823d, long j11, Continuation continuation) {
        g gVar;
        Object m142578e;
        int i11;
        String m139485b;
        String absolutePath;
        AbstractC25270e abstractC25270e;
        String str;
        AbstractC25270e abstractC25270e2;
        boolean z11;
        AbstractC25752r abstractC25752r;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i12 = gVar.f128148u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                gVar.f128148u = i12 - Integer.MIN_VALUE;
                Object obj = gVar.f128146s;
                m142578e = AbstractC28298d.m142578e();
                i11 = gVar.f128148u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    MessageId m133185k = c25823d.m133185k();
                    MsgInfo m133179e = c25823d.m133179e();
                    String m133184j = c25823d.m133184j();
                    if (m133184j == null) {
                        return new AbstractC25752r.a(new C20096c(1000007, "Migration item media ext info is null"), null, 0, 6, null);
                    }
                    if (!AbstractC27247b.m139396h(c25823d)) {
                        try {
                            a m139478e = m139478e(c25823d);
                            try {
                                C24860q m17479b = AbstractC3488c.m17479b(m133184j);
                                byte[] bArr = (byte[]) m17479b.m129213a();
                                AbstractC25270e abstractC25270e3 = (AbstractC25270e) m17479b.m129214b();
                                String m134963b = AbstractC26246b.m134963b(bArr);
                                AbstractC25270e m139484a = m139478e.m139484a();
                                m139485b = m139478e.m139485b();
                                absolutePath = m139478e.m139486c().getAbsolutePath();
                                AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
                                abstractC25270e = abstractC25270e3;
                                str = m134963b;
                                abstractC25270e2 = m139484a;
                                z11 = true;
                            } catch (Exception e11) {
                                C26676b.m136954d("SMLZCloudMigrationUploadHelper", e11);
                                return new AbstractC25752r.a(new C20096c(1000008, e11.getMessage()), null, 0, 6, null);
                            }
                        } catch (IOException e12) {
                            C26676b.m136954d("SMLZCloudMigrationUploadHelper", e12);
                            if (AbstractC23227u1.m119701a(e12)) {
                                return new AbstractC25752r.a(new C20096c(1000009, e12.getMessage()), null, 0, 6, null);
                            }
                            C26675a.m136890L(C26675a.f126213a, 1504411, 1000001, null, null, 0L, 0L, 60, null);
                            return new AbstractC25752r.a(new C20096c(1000001, e12.getMessage()), null, 0, 6, null);
                        } catch (Exception e13) {
                            C26676b.m136954d("SMLZCloudMigrationUploadHelper", e13);
                            C26675a.m136890L(C26675a.f126213a, 1504411, 1000002, e13.getMessage(), null, 0L, 0L, 56, null);
                            return new AbstractC25752r.a(new C20096c(1000002, e13.getMessage()), null, 0, 6, null);
                        }
                    } else {
                        C26676b.m136957g("SMLZCloudMigrationUploadHelper", "Raw file: checksum=" + c25823d.m133178d() + ", size=" + c25823d.m133183i().m106845r(), null, 4, null);
                        absolutePath = c25823d.m133182h();
                        str = m133184j;
                        m139485b = null;
                        abstractC25270e2 = null;
                        abstractC25270e = null;
                        z11 = false;
                    }
                    if (AbstractC23041d2.m118194A(absolutePath) && AbstractC23041d2.m118224w(absolutePath) > 0) {
                        String m139392d = AbstractC27247b.m139392d(c25823d);
                        if (m139392d != null && m139392d.length() != 0) {
                            try {
                                Hashtable m139477d = m139477d(new b(m133179e, m139392d, m139485b, abstractC25270e2, str, abstractC25270e));
                                C24230h m126433h = C24226d.b.m126433h(C24226d.Companion, new Random().nextInt(Integer.MAX_VALUE), EnumC24229g.f116968G, absolutePath, null, null, null, j11, false, 56, null);
                                m126433h.m126515m0(m139477d);
                                m126433h.m126482B0(m133185k.m41048l());
                                m126433h.m126503f0(true);
                                h hVar = new h(m133185k, m126433h, c25823d, z11, absolutePath, null);
                                gVar.f128148u = 1;
                                obj = TimeoutKt.m112879d(j11, hVar, gVar);
                                if (obj == m142578e) {
                                    return m142578e;
                                }
                            } catch (FileNotFoundException e14) {
                                C26676b.m136954d("SMLZCloudMigrationUploadHelper", e14);
                                return new AbstractC25752r.a(new C20096c(1000001, e14.getMessage()), null, 0, 6, null);
                            } catch (Exception e15) {
                                C26676b.m136954d("SMLZCloudMigrationUploadHelper", e15);
                                return new AbstractC25752r.a(new C20096c(1000003, e15.getMessage()), null, 0, 6, null);
                            }
                        } else {
                            return new AbstractC25752r.a(new C20096c(1000006, "Could not get local file checksum"), null, 0, 6, null);
                        }
                    } else {
                        return new AbstractC25752r.a(new C20096c(1000001, "File not existed or file size is zero"), null, 0, 6, null);
                    }
                }
                abstractC25752r = (AbstractC25752r) obj;
                if (abstractC25752r != null) {
                    return new AbstractC25752r.a(new C20096c(1000005, "Upload timeout"), null, 0, 6, null);
                }
                return abstractC25752r;
            }
        }
        gVar = new g(continuation);
        Object obj2 = gVar.f128146s;
        m142578e = AbstractC28298d.m142578e();
        i11 = gVar.f128148u;
        if (i11 == 0) {
        }
        abstractC25752r = (AbstractC25752r) obj2;
        if (abstractC25752r != null) {
        }
    }
}
