package q20;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import on0.AbstractC24342w;
import p021an.AbstractC0955d;
import p542ub.InterfaceC27218a;
import pm0.C24848g0;
import q20.AbstractC25088k;
import s10.InterfaceC26090a;
import v00.AbstractC27413h;

/* renamed from: q20.k */
/* loaded from: classes5.dex */
public abstract class AbstractC25088k {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static final String[] f120491a = {"png", "jpg", "jpeg"};

    /* renamed from: b */
    private static final String[] f120492b = {"mp4"};

    /* renamed from: q20.k$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q20.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C32942a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final C32942a f120493q = new C32942a();

            C32942a() {
                super(1);
            }

            /* renamed from: a */
            public final void m130040a(Uri uri) {
                AbstractC19074t.m100208f(uri, "it");
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m130040a((Uri) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q20.k$a$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            public static final b f120494q = new b();

            b() {
                super(1);
            }

            /* renamed from: a */
            public final void m130041a(Uri uri) {
                AbstractC19074t.m100208f(uri, "it");
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m130041a((Uri) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q20.k$a$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ InterfaceC18505l f120495q;

            /* renamed from: r */
            final /* synthetic */ Context f120496r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InterfaceC18505l interfaceC18505l, Context context) {
                super(1);
                this.f120495q = interfaceC18505l;
                this.f120496r = context;
            }

            /* renamed from: a */
            public final void m130042a(Uri uri) {
                AbstractC19074t.m100208f(uri, "imageUri");
                if (AbstractC25088k.Companion.m130033d(uri, AbstractC25088k.f120491a)) {
                    this.f120495q.mo205i9(uri);
                } else {
                    C25097t.f120556a.m130153n(this.f120496r, AbstractC27413h.zch_error_not_support_format);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m130042a((Uri) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q20.k$a$d */
        /* loaded from: classes5.dex */
        public static final class d extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ InterfaceC18505l f120497q;

            /* renamed from: r */
            final /* synthetic */ Context f120498r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(InterfaceC18505l interfaceC18505l, Context context) {
                super(1);
                this.f120497q = interfaceC18505l;
                this.f120498r = context;
            }

            /* renamed from: a */
            public final void m130043a(Uri uri) {
                AbstractC19074t.m100208f(uri, "videoUri");
                if (AbstractC25088k.Companion.m130033d(uri, AbstractC25088k.f120492b)) {
                    this.f120497q.mo205i9(uri);
                } else {
                    C25097t.f120556a.m130153n(this.f120498r, AbstractC27413h.zch_error_not_support_format);
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m130043a((Uri) obj);
                return C24848g0.f119245a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final boolean m130033d(Uri uri, String[] strArr) {
            String str;
            int m127178g0;
            if (AbstractC19074t.m100204b(uri.getScheme(), "content")) {
                str = MimeTypeMap.getSingleton().getExtensionFromMimeType(CoreUtility.getAppContext().getContentResolver().getType(uri));
            } else {
                String path = uri.getPath();
                if (path != null) {
                    m127178g0 = AbstractC24342w.m127178g0(path, ".", 0, false, 6, null);
                    str = path.substring(m127178g0 + 1);
                    AbstractC19074t.m100207e(str, "substring(...)");
                } else {
                    str = null;
                }
            }
            for (String str2 : strArr) {
                if (AbstractC19074t.m100204b(str2, str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public static /* synthetic */ boolean m130034f(a aVar, Context context, int i11, int i12, Intent intent, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, int i13, Object obj) {
            if ((i13 & 16) != 0) {
                interfaceC18505l = C32942a.f120493q;
            }
            InterfaceC18505l interfaceC18505l3 = interfaceC18505l;
            if ((i13 & 32) != 0) {
                interfaceC18505l2 = b.f120494q;
            }
            return aVar.m130038e(context, i11, i12, intent, interfaceC18505l3, interfaceC18505l2);
        }

        /* renamed from: g */
        private final void m130035g(final Intent intent, final Context context, final InterfaceC18505l interfaceC18505l) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: q20.i
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC25088k.a.m130036h(context, intent, interfaceC18505l);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m130036h(Context context, Intent intent, final InterfaceC18505l interfaceC18505l) {
            final Uri mo4497a;
            AbstractC19074t.m100208f(interfaceC18505l, "$block");
            try {
                InterfaceC26090a interfaceC26090a = (InterfaceC26090a) AbstractC0955d.m4496a(context, AbstractC19061k0.m100169b(InterfaceC26090a.class));
                if (interfaceC26090a != null && (mo4497a = interfaceC26090a.mo4497a(intent)) != null) {
                    AbstractC19444a.m101697e(new Runnable() { // from class: q20.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC25088k.a.m130037i(InterfaceC18505l.this, mo4497a);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static final void m130037i(InterfaceC18505l interfaceC18505l, Uri uri) {
            AbstractC19074t.m100208f(interfaceC18505l, "$block");
            AbstractC19074t.m100208f(uri, "$it");
            interfaceC18505l.mo205i9(uri);
        }

        /* renamed from: e */
        public final boolean m130038e(Context context, int i11, int i12, Intent intent, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2) {
            AbstractC19074t.m100208f(interfaceC18505l, "imageConsumer");
            AbstractC19074t.m100208f(interfaceC18505l2, "videoConsumer");
            if (i12 == -1) {
                if (i11 != 609) {
                    if (i11 == 610) {
                        m130035g(intent, context, new d(interfaceC18505l2, context));
                        return true;
                    }
                    return false;
                }
                m130035g(intent, context, new c(interfaceC18505l, context));
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public final void m130039j(ZaloView zaloView) {
            AbstractC19074t.m100208f(zaloView, "zaloView");
            InterfaceC26090a interfaceC26090a = (InterfaceC26090a) AbstractC0955d.m4496a(zaloView.getContext(), AbstractC19061k0.m100169b(InterfaceC26090a.class));
            if (interfaceC26090a != null) {
                InterfaceC27218a m92692wK = zaloView.m92692wK();
                AbstractC19074t.m100207e(m92692wK, "requireZaloActivity(...)");
                interfaceC26090a.mo4498b(m92692wK, 609);
            }
        }
    }
}
