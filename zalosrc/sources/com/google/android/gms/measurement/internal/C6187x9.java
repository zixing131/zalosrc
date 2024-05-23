package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.google.android.gms.measurement.internal.x9 */
/* loaded from: classes.dex */
public final class C6187x9 {

    /* renamed from: a */
    private final C6127s4 f34604a;

    public C6187x9(C6127s4 c6127s4) {
        this.f34604a = c6127s4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m31492a(String str, Bundle bundle) {
        String uri;
        this.f34604a.mo31037v().mo31036g();
        if (!this.f34604a.m31394n()) {
            if (bundle.isEmpty()) {
                uri = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                uri = builder.build().toString();
            }
            if (!TextUtils.isEmpty(uri)) {
                this.f34604a.m31374F().f33826v.m30804b(uri);
                this.f34604a.m31374F().f33827w.m31503b(this.f34604a.mo31031a().mo105913a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m31493b() {
        String str;
        this.f34604a.mo31037v().mo31036g();
        if (!m31495d()) {
            return;
        }
        if (m31496e()) {
            this.f34604a.m31374F().f33826v.m30804b(null);
            Bundle bundle = new Bundle();
            bundle.putString("source", "(not set)");
            bundle.putString("medium", "(not set)");
            bundle.putString("_cis", "intent");
            bundle.putLong("_cc", 1L);
            this.f34604a.m31376I().m31440t("auto", "_cmpx", bundle);
        } else {
            String m30803a = this.f34604a.m31374F().f33826v.m30803a();
            if (TextUtils.isEmpty(m30803a)) {
                this.f34604a.mo31033c().m31199s().m31108a("Cache still valid but referrer not found");
            } else {
                long m31502a = this.f34604a.m31374F().f33827w.m31502a() / 3600000;
                Uri parse = Uri.parse(m30803a);
                Bundle bundle2 = new Bundle();
                Pair pair = new Pair(parse.getPath(), bundle2);
                for (String str2 : parse.getQueryParameterNames()) {
                    bundle2.putString(str2, parse.getQueryParameter(str2));
                }
                ((Bundle) pair.second).putLong("_cc", (m31502a - 1) * 3600000);
                Object obj = pair.first;
                if (obj == null) {
                    str = "app";
                } else {
                    str = (String) obj;
                }
                this.f34604a.m31376I().m31440t(str, "_cmp", (Bundle) pair.second);
            }
            this.f34604a.m31374F().f33826v.m30804b(null);
        }
        this.f34604a.m31374F().f33827w.m31503b(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m31494c() {
        if (m31495d() && m31496e()) {
            this.f34604a.m31374F().f33826v.m30804b(null);
        }
    }

    /* renamed from: d */
    final boolean m31495d() {
        if (this.f34604a.m31374F().f33827w.m31502a() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    final boolean m31496e() {
        if (!m31495d() || this.f34604a.mo31031a().mo105913a() - this.f34604a.m31374F().f33827w.m31502a() <= this.f34604a.m31401z().m30927q(null, AbstractC5972e3.f33901U)) {
            return false;
        }
        return true;
    }
}
