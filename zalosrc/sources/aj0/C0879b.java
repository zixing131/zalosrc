package aj0;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import p008a2.AbstractC0065f;
import p008a2.AbstractC0066f0;
import p008a2.AbstractC0074k;
import p008a2.AbstractC0086w;
import p008a2.C0089z;
import p046c2.AbstractC3205a;
import p046c2.AbstractC3206b;
import p119e2.InterfaceC18186k;

/* renamed from: aj0.b */
/* loaded from: classes7.dex */
public final class C0879b extends AbstractC0878a {

    /* renamed from: a */
    private final AbstractC0086w f3263a;

    /* renamed from: b */
    private final AbstractC0074k f3264b;

    /* renamed from: c */
    private final AbstractC0066f0 f3265c;

    /* renamed from: d */
    private final AbstractC0066f0 f3266d;

    /* renamed from: e */
    private final AbstractC0066f0 f3267e;

    /* renamed from: f */
    private final AbstractC0066f0 f3268f;

    /* renamed from: g */
    private final AbstractC0066f0 f3269g;

    /* renamed from: h */
    private final AbstractC0066f0 f3270h;

    /* renamed from: i */
    private final AbstractC0066f0 f3271i;

    /* renamed from: aj0.b$a */
    /* loaded from: classes7.dex */
    class a implements Callable {

        /* renamed from: a */
        final /* synthetic */ int f3272a;

        /* renamed from: b */
        final /* synthetic */ String f3273b;

        a(int i11, String str) {
            this.f3272a = i11;
            this.f3273b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            InterfaceC18186k m248b = C0879b.this.f3265c.m248b();
            m248b.mo220l0(1, this.f3272a);
            String str = this.f3273b;
            if (str == null) {
                m248b.mo222u0(2);
            } else {
                m248b.mo219a0(2, str);
            }
            C0879b.this.f3263a.m342e();
            try {
                Integer valueOf = Integer.valueOf(m248b.mo223w());
                C0879b.this.f3263a.m339E();
                return valueOf;
            } finally {
                C0879b.this.f3263a.m347j();
                C0879b.this.f3265c.m251h(m248b);
            }
        }
    }

    /* renamed from: aj0.b$b */
    /* loaded from: classes7.dex */
    class b implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f3275a;

        /* renamed from: b */
        final /* synthetic */ String f3276b;

        b(String str, String str2) {
            this.f3275a = str;
            this.f3276b = str2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            InterfaceC18186k m248b = C0879b.this.f3266d.m248b();
            String str = this.f3275a;
            if (str == null) {
                m248b.mo222u0(1);
            } else {
                m248b.mo219a0(1, str);
            }
            String str2 = this.f3276b;
            if (str2 == null) {
                m248b.mo222u0(2);
            } else {
                m248b.mo219a0(2, str2);
            }
            C0879b.this.f3263a.m342e();
            try {
                Integer valueOf = Integer.valueOf(m248b.mo223w());
                C0879b.this.f3263a.m339E();
                return valueOf;
            } finally {
                C0879b.this.f3263a.m347j();
                C0879b.this.f3266d.m251h(m248b);
            }
        }
    }

    /* renamed from: aj0.b$c */
    /* loaded from: classes7.dex */
    class c implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f3278a;

        /* renamed from: b */
        final /* synthetic */ String f3279b;

        /* renamed from: c */
        final /* synthetic */ String f3280c;

        /* renamed from: d */
        final /* synthetic */ String f3281d;

        c(String str, String str2, String str3, String str4) {
            this.f3278a = str;
            this.f3279b = str2;
            this.f3280c = str3;
            this.f3281d = str4;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            InterfaceC18186k m248b = C0879b.this.f3267e.m248b();
            String str = this.f3278a;
            if (str == null) {
                m248b.mo222u0(1);
            } else {
                m248b.mo219a0(1, str);
            }
            String str2 = this.f3279b;
            if (str2 == null) {
                m248b.mo222u0(2);
            } else {
                m248b.mo219a0(2, str2);
            }
            String str3 = this.f3280c;
            if (str3 == null) {
                m248b.mo222u0(3);
            } else {
                m248b.mo219a0(3, str3);
            }
            String str4 = this.f3281d;
            if (str4 == null) {
                m248b.mo222u0(4);
            } else {
                m248b.mo219a0(4, str4);
            }
            C0879b.this.f3263a.m342e();
            try {
                Integer valueOf = Integer.valueOf(m248b.mo223w());
                C0879b.this.f3263a.m339E();
                return valueOf;
            } finally {
                C0879b.this.f3263a.m347j();
                C0879b.this.f3267e.m251h(m248b);
            }
        }
    }

    /* renamed from: aj0.b$d */
    /* loaded from: classes7.dex */
    class d implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f3283a;

        d(String str) {
            this.f3283a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            InterfaceC18186k m248b = C0879b.this.f3269g.m248b();
            String str = this.f3283a;
            if (str == null) {
                m248b.mo222u0(1);
            } else {
                m248b.mo219a0(1, str);
            }
            C0879b.this.f3263a.m342e();
            try {
                Integer valueOf = Integer.valueOf(m248b.mo223w());
                C0879b.this.f3263a.m339E();
                return valueOf;
            } finally {
                C0879b.this.f3263a.m347j();
                C0879b.this.f3269g.m251h(m248b);
            }
        }
    }

    /* renamed from: aj0.b$e */
    /* loaded from: classes7.dex */
    class e implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f3285a;

        e(String str) {
            this.f3285a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            InterfaceC18186k m248b = C0879b.this.f3270h.m248b();
            String str = this.f3285a;
            if (str == null) {
                m248b.mo222u0(1);
            } else {
                m248b.mo219a0(1, str);
            }
            C0879b.this.f3263a.m342e();
            try {
                Integer valueOf = Integer.valueOf(m248b.mo223w());
                C0879b.this.f3263a.m339E();
                return valueOf;
            } finally {
                C0879b.this.f3263a.m347j();
                C0879b.this.f3270h.m251h(m248b);
            }
        }
    }

    /* renamed from: aj0.b$f */
    /* loaded from: classes7.dex */
    class f implements Callable {

        /* renamed from: a */
        final /* synthetic */ C0089z f3287a;

        f(C0089z c0089z) {
            this.f3287a = c0089z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0880c call() {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            C0880c c0880c = null;
            String string9 = null;
            Cursor m16306c = AbstractC3206b.m16306c(C0879b.this.f3263a, this.f3287a, false, null);
            try {
                int m16303e = AbstractC3205a.m16303e(m16306c, "id");
                int m16303e2 = AbstractC3205a.m16303e(m16306c, "tranx_id");
                int m16303e3 = AbstractC3205a.m16303e(m16306c, "product_id");
                int m16303e4 = AbstractC3205a.m16303e(m16306c, "purchase_data");
                int m16303e5 = AbstractC3205a.m16303e(m16306c, "purchase_token");
                int m16303e6 = AbstractC3205a.m16303e(m16306c, "purchase_sig");
                int m16303e7 = AbstractC3205a.m16303e(m16306c, "tranxid_request_time");
                int m16303e8 = AbstractC3205a.m16303e(m16306c, "verification_url");
                int m16303e9 = AbstractC3205a.m16303e(m16306c, "is_already_submit_to_server");
                int m16303e10 = AbstractC3205a.m16303e(m16306c, "product_type");
                int m16303e11 = AbstractC3205a.m16303e(m16306c, "request_product_id");
                int m16303e12 = AbstractC3205a.m16303e(m16306c, "obfuscated_account_id");
                if (m16306c.moveToFirst()) {
                    int i11 = m16306c.getInt(m16303e);
                    if (m16306c.isNull(m16303e2)) {
                        string = null;
                    } else {
                        string = m16306c.getString(m16303e2);
                    }
                    if (m16306c.isNull(m16303e3)) {
                        string2 = null;
                    } else {
                        string2 = m16306c.getString(m16303e3);
                    }
                    if (m16306c.isNull(m16303e4)) {
                        string3 = null;
                    } else {
                        string3 = m16306c.getString(m16303e4);
                    }
                    if (m16306c.isNull(m16303e5)) {
                        string4 = null;
                    } else {
                        string4 = m16306c.getString(m16303e5);
                    }
                    if (m16306c.isNull(m16303e6)) {
                        string5 = null;
                    } else {
                        string5 = m16306c.getString(m16303e6);
                    }
                    long j11 = m16306c.getLong(m16303e7);
                    if (m16306c.isNull(m16303e8)) {
                        string6 = null;
                    } else {
                        string6 = m16306c.getString(m16303e8);
                    }
                    int i12 = m16306c.getInt(m16303e9);
                    if (m16306c.isNull(m16303e10)) {
                        string7 = null;
                    } else {
                        string7 = m16306c.getString(m16303e10);
                    }
                    if (m16306c.isNull(m16303e11)) {
                        string8 = null;
                    } else {
                        string8 = m16306c.getString(m16303e11);
                    }
                    if (!m16306c.isNull(m16303e12)) {
                        string9 = m16306c.getString(m16303e12);
                    }
                    c0880c = new C0880c(i11, string, string2, string3, string4, string5, j11, string6, i12, string7, string8, string9);
                }
                return c0880c;
            } finally {
                m16306c.close();
                this.f3287a.m406h();
            }
        }
    }

    /* renamed from: aj0.b$g */
    /* loaded from: classes7.dex */
    class g implements Callable {

        /* renamed from: a */
        final /* synthetic */ C0089z f3289a;

        g(C0089z c0089z) {
            this.f3289a = c0089z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0880c call() {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            C0880c c0880c = null;
            String string9 = null;
            Cursor m16306c = AbstractC3206b.m16306c(C0879b.this.f3263a, this.f3289a, false, null);
            try {
                int m16303e = AbstractC3205a.m16303e(m16306c, "id");
                int m16303e2 = AbstractC3205a.m16303e(m16306c, "tranx_id");
                int m16303e3 = AbstractC3205a.m16303e(m16306c, "product_id");
                int m16303e4 = AbstractC3205a.m16303e(m16306c, "purchase_data");
                int m16303e5 = AbstractC3205a.m16303e(m16306c, "purchase_token");
                int m16303e6 = AbstractC3205a.m16303e(m16306c, "purchase_sig");
                int m16303e7 = AbstractC3205a.m16303e(m16306c, "tranxid_request_time");
                int m16303e8 = AbstractC3205a.m16303e(m16306c, "verification_url");
                int m16303e9 = AbstractC3205a.m16303e(m16306c, "is_already_submit_to_server");
                int m16303e10 = AbstractC3205a.m16303e(m16306c, "product_type");
                int m16303e11 = AbstractC3205a.m16303e(m16306c, "request_product_id");
                int m16303e12 = AbstractC3205a.m16303e(m16306c, "obfuscated_account_id");
                if (m16306c.moveToFirst()) {
                    int i11 = m16306c.getInt(m16303e);
                    if (m16306c.isNull(m16303e2)) {
                        string = null;
                    } else {
                        string = m16306c.getString(m16303e2);
                    }
                    if (m16306c.isNull(m16303e3)) {
                        string2 = null;
                    } else {
                        string2 = m16306c.getString(m16303e3);
                    }
                    if (m16306c.isNull(m16303e4)) {
                        string3 = null;
                    } else {
                        string3 = m16306c.getString(m16303e4);
                    }
                    if (m16306c.isNull(m16303e5)) {
                        string4 = null;
                    } else {
                        string4 = m16306c.getString(m16303e5);
                    }
                    if (m16306c.isNull(m16303e6)) {
                        string5 = null;
                    } else {
                        string5 = m16306c.getString(m16303e6);
                    }
                    long j11 = m16306c.getLong(m16303e7);
                    if (m16306c.isNull(m16303e8)) {
                        string6 = null;
                    } else {
                        string6 = m16306c.getString(m16303e8);
                    }
                    int i12 = m16306c.getInt(m16303e9);
                    if (m16306c.isNull(m16303e10)) {
                        string7 = null;
                    } else {
                        string7 = m16306c.getString(m16303e10);
                    }
                    if (m16306c.isNull(m16303e11)) {
                        string8 = null;
                    } else {
                        string8 = m16306c.getString(m16303e11);
                    }
                    if (!m16306c.isNull(m16303e12)) {
                        string9 = m16306c.getString(m16303e12);
                    }
                    c0880c = new C0880c(i11, string, string2, string3, string4, string5, j11, string6, i12, string7, string8, string9);
                }
                return c0880c;
            } finally {
                m16306c.close();
                this.f3289a.m406h();
            }
        }
    }

    /* renamed from: aj0.b$h */
    /* loaded from: classes7.dex */
    class h extends AbstractC0074k {
        h(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "INSERT OR ABORT INTO `za_billing` (`id`,`tranx_id`,`product_id`,`purchase_data`,`purchase_token`,`purchase_sig`,`tranxid_request_time`,`verification_url`,`is_already_submit_to_server`,`product_type`,`request_product_id`,`obfuscated_account_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p008a2.AbstractC0074k
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void mo262i(InterfaceC18186k interfaceC18186k, C0880c c0880c) {
            interfaceC18186k.mo220l0(1, c0880c.m2693a());
            if (c0880c.m2701i() == null) {
                interfaceC18186k.mo222u0(2);
            } else {
                interfaceC18186k.mo219a0(2, c0880c.m2701i());
            }
            if (c0880c.m2695c() == null) {
                interfaceC18186k.mo222u0(3);
            } else {
                interfaceC18186k.mo219a0(3, c0880c.m2695c());
            }
            if (c0880c.m2697e() == null) {
                interfaceC18186k.mo222u0(4);
            } else {
                interfaceC18186k.mo219a0(4, c0880c.m2697e());
            }
            if (c0880c.m2699g() == null) {
                interfaceC18186k.mo222u0(5);
            } else {
                interfaceC18186k.mo219a0(5, c0880c.m2699g());
            }
            if (c0880c.m2698f() == null) {
                interfaceC18186k.mo222u0(6);
            } else {
                interfaceC18186k.mo219a0(6, c0880c.m2698f());
            }
            interfaceC18186k.mo220l0(7, c0880c.m2702j());
            if (c0880c.m2703k() == null) {
                interfaceC18186k.mo222u0(8);
            } else {
                interfaceC18186k.mo219a0(8, c0880c.m2703k());
            }
            interfaceC18186k.mo220l0(9, c0880c.m2704l());
            if (c0880c.m2696d() == null) {
                interfaceC18186k.mo222u0(10);
            } else {
                interfaceC18186k.mo219a0(10, c0880c.m2696d());
            }
            if (c0880c.m2700h() == null) {
                interfaceC18186k.mo222u0(11);
            } else {
                interfaceC18186k.mo219a0(11, c0880c.m2700h());
            }
            if (c0880c.m2694b() == null) {
                interfaceC18186k.mo222u0(12);
            } else {
                interfaceC18186k.mo219a0(12, c0880c.m2694b());
            }
        }
    }

    /* renamed from: aj0.b$i */
    /* loaded from: classes7.dex */
    class i implements Callable {

        /* renamed from: a */
        final /* synthetic */ C0089z f3292a;

        i(C0089z c0089z) {
            this.f3292a = c0089z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0880c call() {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            C0880c c0880c = null;
            String string9 = null;
            Cursor m16306c = AbstractC3206b.m16306c(C0879b.this.f3263a, this.f3292a, false, null);
            try {
                int m16303e = AbstractC3205a.m16303e(m16306c, "id");
                int m16303e2 = AbstractC3205a.m16303e(m16306c, "tranx_id");
                int m16303e3 = AbstractC3205a.m16303e(m16306c, "product_id");
                int m16303e4 = AbstractC3205a.m16303e(m16306c, "purchase_data");
                int m16303e5 = AbstractC3205a.m16303e(m16306c, "purchase_token");
                int m16303e6 = AbstractC3205a.m16303e(m16306c, "purchase_sig");
                int m16303e7 = AbstractC3205a.m16303e(m16306c, "tranxid_request_time");
                int m16303e8 = AbstractC3205a.m16303e(m16306c, "verification_url");
                int m16303e9 = AbstractC3205a.m16303e(m16306c, "is_already_submit_to_server");
                int m16303e10 = AbstractC3205a.m16303e(m16306c, "product_type");
                int m16303e11 = AbstractC3205a.m16303e(m16306c, "request_product_id");
                int m16303e12 = AbstractC3205a.m16303e(m16306c, "obfuscated_account_id");
                if (m16306c.moveToFirst()) {
                    int i11 = m16306c.getInt(m16303e);
                    if (m16306c.isNull(m16303e2)) {
                        string = null;
                    } else {
                        string = m16306c.getString(m16303e2);
                    }
                    if (m16306c.isNull(m16303e3)) {
                        string2 = null;
                    } else {
                        string2 = m16306c.getString(m16303e3);
                    }
                    if (m16306c.isNull(m16303e4)) {
                        string3 = null;
                    } else {
                        string3 = m16306c.getString(m16303e4);
                    }
                    if (m16306c.isNull(m16303e5)) {
                        string4 = null;
                    } else {
                        string4 = m16306c.getString(m16303e5);
                    }
                    if (m16306c.isNull(m16303e6)) {
                        string5 = null;
                    } else {
                        string5 = m16306c.getString(m16303e6);
                    }
                    long j11 = m16306c.getLong(m16303e7);
                    if (m16306c.isNull(m16303e8)) {
                        string6 = null;
                    } else {
                        string6 = m16306c.getString(m16303e8);
                    }
                    int i12 = m16306c.getInt(m16303e9);
                    if (m16306c.isNull(m16303e10)) {
                        string7 = null;
                    } else {
                        string7 = m16306c.getString(m16303e10);
                    }
                    if (m16306c.isNull(m16303e11)) {
                        string8 = null;
                    } else {
                        string8 = m16306c.getString(m16303e11);
                    }
                    if (!m16306c.isNull(m16303e12)) {
                        string9 = m16306c.getString(m16303e12);
                    }
                    c0880c = new C0880c(i11, string, string2, string3, string4, string5, j11, string6, i12, string7, string8, string9);
                }
                return c0880c;
            } finally {
                m16306c.close();
                this.f3292a.m406h();
            }
        }
    }

    /* renamed from: aj0.b$j */
    /* loaded from: classes7.dex */
    class j implements Callable {

        /* renamed from: a */
        final /* synthetic */ C0089z f3294a;

        j(C0089z c0089z) {
            this.f3294a = c0089z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0880c call() {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            C0880c c0880c = null;
            String string9 = null;
            Cursor m16306c = AbstractC3206b.m16306c(C0879b.this.f3263a, this.f3294a, false, null);
            try {
                int m16303e = AbstractC3205a.m16303e(m16306c, "id");
                int m16303e2 = AbstractC3205a.m16303e(m16306c, "tranx_id");
                int m16303e3 = AbstractC3205a.m16303e(m16306c, "product_id");
                int m16303e4 = AbstractC3205a.m16303e(m16306c, "purchase_data");
                int m16303e5 = AbstractC3205a.m16303e(m16306c, "purchase_token");
                int m16303e6 = AbstractC3205a.m16303e(m16306c, "purchase_sig");
                int m16303e7 = AbstractC3205a.m16303e(m16306c, "tranxid_request_time");
                int m16303e8 = AbstractC3205a.m16303e(m16306c, "verification_url");
                int m16303e9 = AbstractC3205a.m16303e(m16306c, "is_already_submit_to_server");
                int m16303e10 = AbstractC3205a.m16303e(m16306c, "product_type");
                int m16303e11 = AbstractC3205a.m16303e(m16306c, "request_product_id");
                int m16303e12 = AbstractC3205a.m16303e(m16306c, "obfuscated_account_id");
                if (m16306c.moveToFirst()) {
                    int i11 = m16306c.getInt(m16303e);
                    if (m16306c.isNull(m16303e2)) {
                        string = null;
                    } else {
                        string = m16306c.getString(m16303e2);
                    }
                    if (m16306c.isNull(m16303e3)) {
                        string2 = null;
                    } else {
                        string2 = m16306c.getString(m16303e3);
                    }
                    if (m16306c.isNull(m16303e4)) {
                        string3 = null;
                    } else {
                        string3 = m16306c.getString(m16303e4);
                    }
                    if (m16306c.isNull(m16303e5)) {
                        string4 = null;
                    } else {
                        string4 = m16306c.getString(m16303e5);
                    }
                    if (m16306c.isNull(m16303e6)) {
                        string5 = null;
                    } else {
                        string5 = m16306c.getString(m16303e6);
                    }
                    long j11 = m16306c.getLong(m16303e7);
                    if (m16306c.isNull(m16303e8)) {
                        string6 = null;
                    } else {
                        string6 = m16306c.getString(m16303e8);
                    }
                    int i12 = m16306c.getInt(m16303e9);
                    if (m16306c.isNull(m16303e10)) {
                        string7 = null;
                    } else {
                        string7 = m16306c.getString(m16303e10);
                    }
                    if (m16306c.isNull(m16303e11)) {
                        string8 = null;
                    } else {
                        string8 = m16306c.getString(m16303e11);
                    }
                    if (!m16306c.isNull(m16303e12)) {
                        string9 = m16306c.getString(m16303e12);
                    }
                    c0880c = new C0880c(i11, string, string2, string3, string4, string5, j11, string6, i12, string7, string8, string9);
                }
                return c0880c;
            } finally {
                m16306c.close();
                this.f3294a.m406h();
            }
        }
    }

    /* renamed from: aj0.b$k */
    /* loaded from: classes7.dex */
    class k extends AbstractC0066f0 {
        k(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE za_billing SET is_already_submit_to_server = ? WHERE purchase_token = ?";
        }
    }

    /* renamed from: aj0.b$l */
    /* loaded from: classes7.dex */
    class l extends AbstractC0066f0 {
        l(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE za_billing SET obfuscated_account_id = ? WHERE purchase_token = ?";
        }
    }

    /* renamed from: aj0.b$m */
    /* loaded from: classes7.dex */
    class m extends AbstractC0066f0 {
        m(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE za_billing SET purchase_data = ?, purchase_token = ?, purchase_sig = ? WHERE tranx_id = ?";
        }
    }

    /* renamed from: aj0.b$n */
    /* loaded from: classes7.dex */
    class n extends AbstractC0066f0 {
        n(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "UPDATE za_billing SET is_already_submit_to_server = ? WHERE tranx_id = ?";
        }
    }

    /* renamed from: aj0.b$o */
    /* loaded from: classes7.dex */
    class o extends AbstractC0066f0 {
        o(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM za_billing WHERE purchase_token=?";
        }
    }

    /* renamed from: aj0.b$p */
    /* loaded from: classes7.dex */
    class p extends AbstractC0066f0 {
        p(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM za_billing WHERE tranx_id=?";
        }
    }

    /* renamed from: aj0.b$q */
    /* loaded from: classes7.dex */
    class q extends AbstractC0066f0 {
        q(AbstractC0086w abstractC0086w) {
            super(abstractC0086w);
        }

        @Override // p008a2.AbstractC0066f0
        /* renamed from: e */
        public String mo250e() {
            return "DELETE FROM za_billing WHERE product_id=?";
        }
    }

    /* renamed from: aj0.b$r */
    /* loaded from: classes7.dex */
    class r implements Callable {

        /* renamed from: a */
        final /* synthetic */ C0880c f3303a;

        r(C0880c c0880c) {
            this.f3303a = c0880c;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long call() {
            C0879b.this.f3263a.m342e();
            try {
                long m264k = C0879b.this.f3264b.m264k(this.f3303a);
                C0879b.this.f3263a.m339E();
                return Long.valueOf(m264k);
            } finally {
                C0879b.this.f3263a.m347j();
            }
        }
    }

    public C0879b(AbstractC0086w abstractC0086w) {
        this.f3263a = abstractC0086w;
        this.f3264b = new h(abstractC0086w);
        this.f3265c = new k(abstractC0086w);
        this.f3266d = new l(abstractC0086w);
        this.f3267e = new m(abstractC0086w);
        this.f3268f = new n(abstractC0086w);
        this.f3269g = new o(abstractC0086w);
        this.f3270h = new p(abstractC0086w);
        this.f3271i = new q(abstractC0086w);
    }

    /* renamed from: u */
    public static List m2681u() {
        return Collections.emptyList();
    }

    @Override // aj0.AbstractC0878a
    /* renamed from: b */
    public Object mo2662b(String str, Continuation continuation) {
        return AbstractC0065f.m235b(this.f3263a, true, new d(str), continuation);
    }

    @Override // aj0.AbstractC0878a
    /* renamed from: c */
    public Object mo2663c(String str, Continuation continuation) {
        return AbstractC0065f.m235b(this.f3263a, true, new e(str), continuation);
    }

    @Override // aj0.AbstractC0878a
    /* renamed from: d */
    public Object mo2664d(long j11, String str, String str2, Continuation continuation) {
        C0089z m401c = C0089z.m401c("SELECT * FROM za_billing WHERE product_id = ? AND purchase_token = '' AND obfuscated_account_id = ? ORDER BY abs(? - tranxid_request_time) ASC LIMIT 1", 3);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        if (str2 == null) {
            m401c.mo222u0(2);
        } else {
            m401c.mo219a0(2, str2);
        }
        m401c.mo220l0(3, j11);
        return AbstractC0065f.m234a(this.f3263a, false, AbstractC3206b.m16304a(), new g(m401c), continuation);
    }

    @Override // aj0.AbstractC0878a
    /* renamed from: e */
    public Object mo2665e(long j11, String str, Continuation continuation) {
        C0089z m401c = C0089z.m401c("SELECT * FROM za_billing WHERE product_id = ? AND purchase_token = '' ORDER BY abs(? - tranxid_request_time) ASC LIMIT 1", 2);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        m401c.mo220l0(2, j11);
        return AbstractC0065f.m234a(this.f3263a, false, AbstractC3206b.m16304a(), new f(m401c), continuation);
    }

    @Override // aj0.AbstractC0878a
    /* renamed from: f */
    public Object mo2666f(String str, Continuation continuation) {
        C0089z m401c = C0089z.m401c("SELECT * FROM za_billing WHERE purchase_token = ? LIMIT 1", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        return AbstractC0065f.m234a(this.f3263a, false, AbstractC3206b.m16304a(), new i(m401c), continuation);
    }

    @Override // aj0.AbstractC0878a
    /* renamed from: g */
    public Object mo2667g(String str, Continuation continuation) {
        C0089z m401c = C0089z.m401c("SELECT * FROM za_billing WHERE tranx_id = ? LIMIT 1", 1);
        if (str == null) {
            m401c.mo222u0(1);
        } else {
            m401c.mo219a0(1, str);
        }
        return AbstractC0065f.m234a(this.f3263a, false, AbstractC3206b.m16304a(), new j(m401c), continuation);
    }

    @Override // aj0.AbstractC0878a
    /* renamed from: i */
    public List mo2669i(List list) {
        this.f3263a.m341d();
        this.f3263a.m342e();
        try {
            List m265l = this.f3264b.m265l(list);
            this.f3263a.m339E();
            return m265l;
        } finally {
            this.f3263a.m347j();
        }
    }

    @Override // aj0.AbstractC0878a
    /* renamed from: j */
    protected Object mo2670j(C0880c c0880c, Continuation continuation) {
        return AbstractC0065f.m235b(this.f3263a, true, new r(c0880c), continuation);
    }

    @Override // aj0.AbstractC0878a
    /* renamed from: k */
    public Object mo2671k(String str, String str2, Continuation continuation) {
        return AbstractC0065f.m235b(this.f3263a, true, new b(str2, str), continuation);
    }

    @Override // aj0.AbstractC0878a
    /* renamed from: l */
    public Object mo2672l(String str, String str2, String str3, String str4, Continuation continuation) {
        return AbstractC0065f.m235b(this.f3263a, true, new c(str2, str3, str4, str), continuation);
    }

    @Override // aj0.AbstractC0878a
    /* renamed from: m */
    public Object mo2673m(String str, int i11, Continuation continuation) {
        return AbstractC0065f.m235b(this.f3263a, true, new a(i11, str), continuation);
    }
}
