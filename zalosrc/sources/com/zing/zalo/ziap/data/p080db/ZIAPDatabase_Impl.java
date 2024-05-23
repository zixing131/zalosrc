package com.zing.zalo.ziap.data.p080db;

import aj0.AbstractC0878a;
import aj0.C0879b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p008a2.AbstractC0086w;
import p008a2.C0069h;
import p008a2.C0080q;
import p008a2.C0088y;
import p046c2.AbstractC3206b;
import p046c2.C3209e;
import p119e2.InterfaceC18182g;
import p119e2.InterfaceC18183h;

/* loaded from: classes7.dex */
public final class ZIAPDatabase_Impl extends ZIAPDatabase {

    /* renamed from: p */
    private volatile AbstractC0878a f87437p;

    /* renamed from: com.zing.zalo.ziap.data.db.ZIAPDatabase_Impl$a */
    /* loaded from: classes7.dex */
    class C17090a extends C0088y.b {
        C17090a(int i11) {
            super(i11);
        }

        @Override // p008a2.C0088y.b
        /* renamed from: a */
        public void mo394a(InterfaceC18182g interfaceC18182g) {
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS `za_billing` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `tranx_id` TEXT NOT NULL, `product_id` TEXT NOT NULL, `purchase_data` TEXT NOT NULL, `purchase_token` TEXT NOT NULL, `purchase_sig` TEXT NOT NULL, `tranxid_request_time` INTEGER NOT NULL, `verification_url` TEXT NOT NULL, `is_already_submit_to_server` INTEGER NOT NULL, `product_type` TEXT NOT NULL, `request_product_id` TEXT NOT NULL, `obfuscated_account_id` TEXT NOT NULL DEFAULT '')");
            interfaceC18182g.mo201u("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC18182g.mo201u("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd8b34130d63f4c0dbd916da113b70791')");
        }

        @Override // p008a2.C0088y.b
        /* renamed from: b */
        public void mo395b(InterfaceC18182g interfaceC18182g) {
            interfaceC18182g.mo201u("DROP TABLE IF EXISTS `za_billing`");
            if (((AbstractC0086w) ZIAPDatabase_Impl.this).f375h != null) {
                int size = ((AbstractC0086w) ZIAPDatabase_Impl.this).f375h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0086w.b) ((AbstractC0086w) ZIAPDatabase_Impl.this).f375h.get(i11)).m370b(interfaceC18182g);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p008a2.C0088y.b
        /* renamed from: c */
        public void mo396c(InterfaceC18182g interfaceC18182g) {
            if (((AbstractC0086w) ZIAPDatabase_Impl.this).f375h != null) {
                int size = ((AbstractC0086w) ZIAPDatabase_Impl.this).f375h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0086w.b) ((AbstractC0086w) ZIAPDatabase_Impl.this).f375h.get(i11)).mo369a(interfaceC18182g);
                }
            }
        }

        @Override // p008a2.C0088y.b
        /* renamed from: d */
        public void mo397d(InterfaceC18182g interfaceC18182g) {
            ((AbstractC0086w) ZIAPDatabase_Impl.this).f368a = interfaceC18182g;
            ZIAPDatabase_Impl.this.m359x(interfaceC18182g);
            if (((AbstractC0086w) ZIAPDatabase_Impl.this).f375h != null) {
                int size = ((AbstractC0086w) ZIAPDatabase_Impl.this).f375h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC0086w.b) ((AbstractC0086w) ZIAPDatabase_Impl.this).f375h.get(i11)).mo371c(interfaceC18182g);
                }
            }
        }

        @Override // p008a2.C0088y.b
        /* renamed from: e */
        public void mo398e(InterfaceC18182g interfaceC18182g) {
        }

        @Override // p008a2.C0088y.b
        /* renamed from: f */
        public void mo399f(InterfaceC18182g interfaceC18182g) {
            AbstractC3206b.m16305b(interfaceC18182g);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p008a2.C0088y.b
        /* renamed from: g */
        public C0088y.c mo400g(InterfaceC18182g interfaceC18182g) {
            HashMap hashMap = new HashMap(12);
            hashMap.put("id", new C3209e.a("id", "INTEGER", true, 1, null, 1));
            hashMap.put("tranx_id", new C3209e.a("tranx_id", "TEXT", true, 0, null, 1));
            hashMap.put("product_id", new C3209e.a("product_id", "TEXT", true, 0, null, 1));
            hashMap.put("purchase_data", new C3209e.a("purchase_data", "TEXT", true, 0, null, 1));
            hashMap.put("purchase_token", new C3209e.a("purchase_token", "TEXT", true, 0, null, 1));
            hashMap.put("purchase_sig", new C3209e.a("purchase_sig", "TEXT", true, 0, null, 1));
            hashMap.put("tranxid_request_time", new C3209e.a("tranxid_request_time", "INTEGER", true, 0, null, 1));
            hashMap.put("verification_url", new C3209e.a("verification_url", "TEXT", true, 0, null, 1));
            hashMap.put("is_already_submit_to_server", new C3209e.a("is_already_submit_to_server", "INTEGER", true, 0, null, 1));
            hashMap.put("product_type", new C3209e.a("product_type", "TEXT", true, 0, null, 1));
            hashMap.put("request_product_id", new C3209e.a("request_product_id", "TEXT", true, 0, null, 1));
            hashMap.put("obfuscated_account_id", new C3209e.a("obfuscated_account_id", "TEXT", true, 0, "''", 1));
            C3209e c3209e = new C3209e("za_billing", hashMap, new HashSet(0), new HashSet(0));
            C3209e m16311a = C3209e.m16311a(interfaceC18182g, "za_billing");
            if (!c3209e.equals(m16311a)) {
                return new C0088y.c(false, "za_billing(com.zing.zalo.ziap.data.db.BillingItem).\n Expected:\n" + c3209e + "\n Found:\n" + m16311a);
            }
            return new C0088y.c(true, null);
        }
    }

    @Override // com.zing.zalo.ziap.data.p080db.ZIAPDatabase
    /* renamed from: I */
    public AbstractC0878a mo91399I() {
        AbstractC0878a abstractC0878a;
        if (this.f87437p != null) {
            return this.f87437p;
        }
        synchronized (this) {
            try {
                if (this.f87437p == null) {
                    this.f87437p = new C0879b(this);
                }
                abstractC0878a = this.f87437p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC0878a;
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: h */
    protected C0080q mo345h() {
        return new C0080q(this, new HashMap(0), new HashMap(0), "za_billing");
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: i */
    protected InterfaceC18183h mo346i(C0069h c0069h) {
        return c0069h.f286c.mo232a(InterfaceC18183h.b.m96928a(c0069h.f284a).m96932d(c0069h.f285b).m96931c(new C0088y(c0069h, new C17090a(2), "d8b34130d63f4c0dbd916da113b70791", "21f7ae7af2dd209cd47d9a3bf562a9eb")).m96930b());
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: k */
    public List mo348k(Map map) {
        return Arrays.asList(new C17091a());
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: q */
    public Set mo354q() {
        return new HashSet();
    }

    @Override // p008a2.AbstractC0086w
    /* renamed from: r */
    protected Map mo355r() {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC0878a.class, C0879b.m2681u());
        return hashMap;
    }
}
