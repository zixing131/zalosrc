package p20;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.AbstractC1388a;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import qm0.AbstractC25366r;
import v00.AbstractC27408c;

/* renamed from: p20.j */
/* loaded from: classes5.dex */
public final class C24619j extends HashMap {

    /* renamed from: p */
    private final ArrayList f118422p = new ArrayList();

    /* renamed from: a */
    public /* bridge */ boolean m128107a(String str) {
        return super.containsKey(str);
    }

    /* renamed from: b */
    public /* bridge */ boolean m128108b(C24620k c24620k) {
        return super.containsValue(c24620k);
    }

    /* renamed from: c */
    public /* bridge */ C24620k m128109c(String str) {
        return (C24620k) super.get(str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return m128107a((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C24620k)) {
            return false;
        }
        return m128108b((C24620k) obj);
    }

    /* renamed from: e */
    public /* bridge */ Set m128110e() {
        return super.entrySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        return m128110e();
    }

    /* renamed from: f */
    public final C24620k m128111f() {
        Object obj = get(this.f118422p.get(0));
        AbstractC19074t.m100205c(obj);
        return (C24620k) obj;
    }

    /* renamed from: g */
    public /* bridge */ Set m128112g() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return m128109c((String) obj);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return m128113h((String) obj, (C24620k) obj2);
    }

    /* renamed from: h */
    public /* bridge */ C24620k m128113h(String str, C24620k c24620k) {
        return (C24620k) super.getOrDefault(str, c24620k);
    }

    /* renamed from: i */
    public /* bridge */ int m128114i() {
        return super.size();
    }

    /* renamed from: k */
    public /* bridge */ Collection m128115k() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        return m128112g();
    }

    /* renamed from: l */
    public /* bridge */ C24620k m128116l(String str) {
        return (C24620k) super.remove(str);
    }

    /* renamed from: n */
    public /* bridge */ boolean m128117n(String str, C24620k c24620k) {
        return super.remove(str, c24620k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public final void m128118o(Context context, Object obj) {
        List m131496e;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(obj, "typesConfig");
        Drawable m6964f = AbstractC1388a.m6964f(context, AbstractC27408c.zch_ic_heart_livestream_reaction);
        Drawable m6964f2 = AbstractC1388a.m6964f(context, AbstractC27408c.zch_ic_heart_livestream_reaction_fly);
        AbstractC19074t.m100205c(m6964f2);
        m131496e = AbstractC25366r.m131496e(m6964f2);
        C24620k c24620k = new C24620k("0", 1, 1, null, null, m6964f, m131496e);
        this.f118422p.add(c24620k.m128121c());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof String) {
            return m128116l((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return m128114i();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        return m128115k();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof C24620k)) {
            return m128117n((String) obj, (C24620k) obj2);
        }
        return false;
    }
}
