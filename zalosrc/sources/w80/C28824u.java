package w80;

import android.os.Bundle;
import java.io.Serializable;
import p205hc.InterfaceC19969h;
import p365nk.C23805a;

/* renamed from: w80.u */
/* loaded from: classes6.dex */
public class C28824u implements InterfaceC19969h {

    /* renamed from: a */
    private int f133508a;

    /* renamed from: b */
    private C23805a.e f133509b;

    /* renamed from: c */
    private boolean f133510c;

    /* renamed from: d */
    private boolean f133511d;

    /* renamed from: e */
    private long f133512e;

    public C28824u(Bundle bundle) {
        C23805a.e eVar;
        boolean z11;
        C23805a.e eVar2 = C23805a.e.f115063p;
        this.f133509b = eVar2;
        if (bundle != null) {
            boolean z12 = false;
            this.f133508a = bundle.getInt("extra_fake_header_height", 0);
            Serializable serializable = bundle.getSerializable("extra_view_mode");
            if (serializable instanceof C23805a.e) {
                eVar = (C23805a.e) serializable;
            } else {
                eVar = null;
            }
            this.f133509b = eVar != null ? eVar : eVar2;
            if (bundle.containsKey("extra_is_in_search_mode") && bundle.getBoolean("extra_is_in_search_mode")) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f133510c = z11;
            if (bundle.containsKey("extra_is_in_multi_selection_mode") && bundle.getBoolean("extra_is_in_multi_selection_mode")) {
                z12 = true;
            }
            this.f133511d = z12;
            this.f133512e = bundle.getLong("extra_collection_id", 0L);
        }
    }

    /* renamed from: a */
    public final long m144071a() {
        return this.f133512e;
    }

    /* renamed from: b */
    public final int m144072b() {
        return this.f133508a;
    }

    /* renamed from: c */
    public final boolean m144073c() {
        return this.f133511d;
    }

    /* renamed from: d */
    public final C23805a.e m144074d() {
        return this.f133509b;
    }

    /* renamed from: e */
    public final boolean m144075e() {
        return this.f133510c;
    }
}
