package p329lo;

import android.os.Bundle;
import bo.C3003l3;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3039t0;
import bo.C3051w0;
import com.zing.zalo.zinstant.C17244x0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p726zr.C32546b;

/* renamed from: lo.r0 */
/* loaded from: classes4.dex */
public class C22579r0 {

    /* renamed from: a */
    public String f110490a;

    /* renamed from: b */
    public boolean f110491b;

    /* renamed from: c */
    public ArrayList f110492c;

    /* renamed from: d */
    public int f110493d;

    /* renamed from: e */
    public int f110494e;

    /* renamed from: f */
    public boolean f110495f;

    /* renamed from: g */
    public C3051w0 f110496g;

    /* renamed from: h */
    public C32546b f110497h;

    /* renamed from: i */
    public int f110498i;

    /* renamed from: j */
    public boolean f110499j;

    /* renamed from: k */
    public C3003l3 f110500k;

    /* renamed from: l */
    public boolean f110501l;

    /* renamed from: m */
    public String f110502m;

    /* renamed from: n */
    public double f110503n;

    /* renamed from: o */
    public String f110504o;

    /* renamed from: p */
    public boolean f110505p;

    /* renamed from: q */
    public boolean f110506q;

    private C22579r0() {
    }

    private C22579r0(String str, boolean z11, ArrayList arrayList, int i11, int i12, boolean z12, C3051w0 c3051w0, C32546b c32546b, int i13, boolean z13, C3003l3 c3003l3, boolean z14, String str2, double d11, String str3, boolean z15, boolean z16) {
        this.f110490a = str;
        this.f110491b = z11;
        this.f110492c = arrayList;
        this.f110493d = i11;
        this.f110494e = i12;
        this.f110495f = z12;
        this.f110496g = c3051w0;
        this.f110497h = c32546b;
        this.f110498i = i13;
        this.f110499j = z13;
        this.f110500k = c3003l3;
        this.f110501l = z14;
        this.f110502m = str2;
        this.f110503n = d11;
        this.f110504o = str3;
        this.f110505p = z15;
        this.f110506q = z16;
    }

    /* renamed from: a */
    public static C22579r0 m116834a(C3020p0 c3020p0, boolean z11, String str, ArrayList arrayList, boolean z12) {
        C3051w0 c3051w0;
        boolean z13;
        String str2;
        if (c3020p0 != null) {
            String str3 = c3020p0.f12057p;
            C3039t0 c3039t0 = c3020p0.f12025E;
            int i11 = c3039t0.f12244b;
            int i12 = c3039t0.f12243a;
            boolean z14 = c3020p0.f12064w;
            C3051w0 c3051w02 = c3039t0.f12246d;
            JSONObject jSONObject = null;
            if (c3051w02 != null) {
                c3051w0 = new C3051w0(c3051w02);
            } else {
                c3051w0 = null;
            }
            C32546b c32546b = c3020p0.f12025E.f12247e;
            int i13 = c3020p0.f12042V.f45973p;
            boolean m14482K = c3020p0.m14482K();
            C3003l3 c3003l3 = c3020p0.f12059r;
            if (c3020p0.f12058q == 22) {
                z13 = true;
            } else {
                z13 = false;
            }
            C3025q0 c3025q0 = c3020p0.f12023C;
            String str4 = c3025q0.f12101J;
            double d11 = c3025q0.f12103L;
            try {
                C17244x0 c17244x0 = c3025q0.f12104M;
                if (c17244x0 != null) {
                    jSONObject = c17244x0.m92066d();
                }
            } catch (JSONException e11) {
                AbstractC20110a.m104536e(e11);
            }
            if (jSONObject != null) {
                str2 = jSONObject.toString();
            } else {
                str2 = "";
            }
            return new C22579r0(str3, z11, arrayList, i11, i12, z14, c3051w0, c32546b, i13, m14482K, c3003l3, z13, str4, d11, str2, c3020p0.f12023C.f12105N, z12);
        }
        return new C22579r0(str, z11, arrayList, 0, 0, false, null, null, 0, false, null, false, "", 0.0d, null, false, false);
    }

    /* renamed from: b */
    public static C22579r0 m116835b(Bundle bundle) {
        C22579r0 c22579r0 = new C22579r0();
        try {
            c22579r0.f110491b = bundle.getBoolean("deleted", false);
            c22579r0.f110490a = bundle.getString("feedId");
            if (!c22579r0.f110491b) {
                c22579r0.f110493d = bundle.getInt("lik");
                c22579r0.f110494e = bundle.getInt("cmt");
                c22579r0.f110495f = bundle.getBoolean("isl");
                c22579r0.f110498i = bundle.getInt("privacy_type");
                c22579r0.f110492c = bundle.getStringArrayList("deletedPhoto");
                C3003l3 c3003l3 = new C3003l3();
                c22579r0.f110500k = c3003l3;
                c3003l3.f11956a = bundle.getInt("extra_result_tag_count", -1);
                c22579r0.f110500k.f11957b = (LinkedHashMap) bundle.getSerializable("extra_result_tag_uids");
                c22579r0.f110502m = bundle.getString("extra_feed_memory_id");
                c22579r0.f110503n = bundle.getDouble("extra_ratio_zinstant");
                c22579r0.f110504o = bundle.getString("extra_memory_zinstant_feed_info");
                c22579r0.f110505p = bundle.getBoolean("extra_is_valid_content", true);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return c22579r0;
    }
}
