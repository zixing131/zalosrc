package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p031b5.AbstractC2552a;
import p229i5.AbstractC20281b;
import p229i5.AbstractC20282c;
import p229i5.AbstractC20292m;
import p229i5.AbstractC20293n;

/* loaded from: classes2.dex */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new C4263e();

    /* renamed from: p */
    private final int f16752p;

    /* renamed from: q */
    private final Parcel f16753q;

    /* renamed from: r */
    private final int f16754r = 2;

    /* renamed from: s */
    private final zan f16755s;

    /* renamed from: t */
    private final String f16756t;

    /* renamed from: u */
    private int f16757u;

    /* renamed from: v */
    private int f16758v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SafeParcelResponse(int i11, Parcel parcel, zan zanVar) {
        String m19881t;
        this.f16752p = i11;
        this.f16753q = (Parcel) AbstractC4205o.m19722k(parcel);
        this.f16755s = zanVar;
        if (zanVar == null) {
            m19881t = null;
        } else {
            m19881t = zanVar.m19881t();
        }
        this.f16756t = m19881t;
        this.f16757u = 2;
    }

    /* renamed from: i */
    private final void m19875i(StringBuilder sb2, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).m19873Z(), entry);
        }
        sb2.append('{');
        int m19765N = SafeParcelReader.m19765N(parcel);
        boolean z11 = false;
        while (parcel.dataPosition() < m19765N) {
            int m19755D = SafeParcelReader.m19755D(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.m19789v(m19755D));
            if (entry2 != null) {
                if (z11) {
                    sb2.append(",");
                }
                String str = (String) entry2.getKey();
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb2.append("\"");
                sb2.append(str);
                sb2.append("\":");
                if (field.m19872H0()) {
                    int i11 = field.f16744s;
                    switch (i11) {
                        case 0:
                            m19877k(sb2, field, FastJsonResponse.m19857f(field, Integer.valueOf(SafeParcelReader.m19757F(parcel, m19755D))));
                            break;
                        case 1:
                            m19877k(sb2, field, FastJsonResponse.m19857f(field, SafeParcelReader.m19770c(parcel, m19755D)));
                            break;
                        case 2:
                            m19877k(sb2, field, FastJsonResponse.m19857f(field, Long.valueOf(SafeParcelReader.m19760I(parcel, m19755D))));
                            break;
                        case 3:
                            m19877k(sb2, field, FastJsonResponse.m19857f(field, Float.valueOf(SafeParcelReader.m19753B(parcel, m19755D))));
                            break;
                        case 4:
                            m19877k(sb2, field, FastJsonResponse.m19857f(field, Double.valueOf(SafeParcelReader.m19793z(parcel, m19755D))));
                            break;
                        case 5:
                            m19877k(sb2, field, FastJsonResponse.m19857f(field, SafeParcelReader.m19768a(parcel, m19755D)));
                            break;
                        case 6:
                            m19877k(sb2, field, FastJsonResponse.m19857f(field, Boolean.valueOf(SafeParcelReader.m19790w(parcel, m19755D))));
                            break;
                        case 7:
                            m19877k(sb2, field, FastJsonResponse.m19857f(field, SafeParcelReader.m19783p(parcel, m19755D)));
                            break;
                        case 8:
                        case 9:
                            m19877k(sb2, field, FastJsonResponse.m19857f(field, SafeParcelReader.m19774g(parcel, m19755D)));
                            break;
                        case 10:
                            Bundle m19773f = SafeParcelReader.m19773f(parcel, m19755D);
                            HashMap hashMap = new HashMap();
                            for (String str2 : m19773f.keySet()) {
                                hashMap.put(str2, (String) AbstractC4205o.m19722k(m19773f.getString(str2)));
                            }
                            m19877k(sb2, field, FastJsonResponse.m19857f(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i11);
                    }
                } else if (field.f16745t) {
                    sb2.append("[");
                    switch (field.f16744s) {
                        case 0:
                            AbstractC20281b.m105903e(sb2, SafeParcelReader.m19777j(parcel, m19755D));
                            break;
                        case 1:
                            AbstractC20281b.m105905g(sb2, SafeParcelReader.m19771d(parcel, m19755D));
                            break;
                        case 2:
                            AbstractC20281b.m105904f(sb2, SafeParcelReader.m19779l(parcel, m19755D));
                            break;
                        case 3:
                            AbstractC20281b.m105902d(sb2, SafeParcelReader.m19776i(parcel, m19755D));
                            break;
                        case 4:
                            AbstractC20281b.m105901c(sb2, SafeParcelReader.m19775h(parcel, m19755D));
                            break;
                        case 5:
                            AbstractC20281b.m105905g(sb2, SafeParcelReader.m19769b(parcel, m19755D));
                            break;
                        case 6:
                            AbstractC20281b.m105906h(sb2, SafeParcelReader.m19772e(parcel, m19755D));
                            break;
                        case 7:
                            AbstractC20281b.m105907i(sb2, SafeParcelReader.m19784q(parcel, m19755D));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] m19781n = SafeParcelReader.m19781n(parcel, m19755D);
                            int length = m19781n.length;
                            for (int i12 = 0; i12 < length; i12++) {
                                if (i12 > 0) {
                                    sb2.append(",");
                                }
                                m19781n[i12].setDataPosition(0);
                                m19875i(sb2, field.m19870F0(), m19781n[i12]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb2.append("]");
                } else {
                    switch (field.f16744s) {
                        case 0:
                            sb2.append(SafeParcelReader.m19757F(parcel, m19755D));
                            break;
                        case 1:
                            sb2.append(SafeParcelReader.m19770c(parcel, m19755D));
                            break;
                        case 2:
                            sb2.append(SafeParcelReader.m19760I(parcel, m19755D));
                            break;
                        case 3:
                            sb2.append(SafeParcelReader.m19753B(parcel, m19755D));
                            break;
                        case 4:
                            sb2.append(SafeParcelReader.m19793z(parcel, m19755D));
                            break;
                        case 5:
                            sb2.append(SafeParcelReader.m19768a(parcel, m19755D));
                            break;
                        case 6:
                            sb2.append(SafeParcelReader.m19790w(parcel, m19755D));
                            break;
                        case 7:
                            String m19783p = SafeParcelReader.m19783p(parcel, m19755D);
                            sb2.append("\"");
                            sb2.append(AbstractC20292m.m105944a(m19783p));
                            sb2.append("\"");
                            break;
                        case 8:
                            byte[] m19774g = SafeParcelReader.m19774g(parcel, m19755D);
                            sb2.append("\"");
                            sb2.append(AbstractC20282c.m105908a(m19774g));
                            sb2.append("\"");
                            break;
                        case 9:
                            byte[] m19774g2 = SafeParcelReader.m19774g(parcel, m19755D);
                            sb2.append("\"");
                            sb2.append(AbstractC20282c.m105909b(m19774g2));
                            sb2.append("\"");
                            break;
                        case 10:
                            Bundle m19773f2 = SafeParcelReader.m19773f(parcel, m19755D);
                            Set<String> keySet = m19773f2.keySet();
                            sb2.append("{");
                            boolean z12 = true;
                            for (String str3 : keySet) {
                                if (!z12) {
                                    sb2.append(",");
                                }
                                sb2.append("\"");
                                sb2.append(str3);
                                sb2.append("\":\"");
                                sb2.append(AbstractC20292m.m105944a(m19773f2.getString(str3)));
                                sb2.append("\"");
                                z12 = false;
                            }
                            sb2.append("}");
                            break;
                        case 11:
                            Parcel m19780m = SafeParcelReader.m19780m(parcel, m19755D);
                            m19780m.setDataPosition(0);
                            m19875i(sb2, field.m19870F0(), m19780m);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z11 = true;
            }
        }
        if (parcel.dataPosition() == m19765N) {
            sb2.append('}');
            return;
        }
        throw new SafeParcelReader.ParseException("Overread allowed size end=" + m19765N, parcel);
    }

    /* renamed from: j */
    private static final void m19876j(StringBuilder sb2, int i11, Object obj) {
        switch (i11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                sb2.append(AbstractC20292m.m105944a(AbstractC4205o.m19722k(obj).toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                sb2.append(AbstractC20282c.m105908a((byte[]) obj));
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                sb2.append(AbstractC20282c.m105909b((byte[]) obj));
                sb2.append("\"");
                return;
            case 10:
                AbstractC20293n.m105945a(sb2, (HashMap) AbstractC4205o.m19722k(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i11);
        }
    }

    /* renamed from: k */
    private static final void m19877k(StringBuilder sb2, FastJsonResponse.Field field, Object obj) {
        if (field.f16743r) {
            ArrayList arrayList = (ArrayList) obj;
            sb2.append("[");
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (i11 != 0) {
                    sb2.append(",");
                }
                m19876j(sb2, field.f16742q, arrayList.get(i11));
            }
            sb2.append("]");
            return;
        }
        m19876j(sb2, field.f16742q, obj);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: a */
    public final Map mo19034a() {
        zan zanVar = this.f16755s;
        if (zanVar == null) {
            return null;
        }
        return zanVar.m19879F((String) AbstractC4205o.m19722k(this.f16756t));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: c */
    public final Object mo19859c(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    /* renamed from: e */
    public final boolean mo19860e(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: h */
    public final Parcel m19878h() {
        int i11 = this.f16757u;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC2552a.m12913b(this.f16753q, this.f16758v);
                this.f16757u = 2;
            }
        } else {
            int m12912a = AbstractC2552a.m12912a(this.f16753q);
            this.f16758v = m12912a;
            AbstractC2552a.m12913b(this.f16753q, m12912a);
            this.f16757u = 2;
        }
        return this.f16753q;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final String toString() {
        AbstractC4205o.m19723l(this.f16755s, "Cannot convert to JSON on client side.");
        Parcel m19878h = m19878h();
        m19878h.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        m19875i(sb2, (Map) AbstractC4205o.m19722k(this.f16755s.m19879F((String) AbstractC4205o.m19722k(this.f16756t))), m19878h);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        zan zanVar;
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f16752p);
        AbstractC2552a.m12931t(parcel, 2, m19878h(), false);
        int i12 = this.f16754r;
        if (i12 != 0) {
            if (i12 != 1) {
                zanVar = this.f16755s;
            } else {
                zanVar = this.f16755s;
            }
        } else {
            zanVar = null;
        }
        AbstractC2552a.m12932u(parcel, 3, zanVar, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
