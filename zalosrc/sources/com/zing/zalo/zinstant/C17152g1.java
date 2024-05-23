package com.zing.zalo.zinstant;

import ae.C0766k;
import android.os.Build;
import android.text.TextUtils;
import com.zing.zalo.zinstant.exception.ZinstantException;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import lk0.C22504b;
import me0.AbstractC23138m0;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24792r;

/* renamed from: com.zing.zalo.zinstant.g1 */
/* loaded from: classes.dex */
public class C17152g1 implements InterfaceC24792r {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.g1$a */
    /* loaded from: classes7.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f87684a;

        /* renamed from: b */
        final /* synthetic */ String f87685b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC24775a f87686c;

        a(int i11, String str, InterfaceC24775a interfaceC24775a) {
            this.f87684a = i11;
            this.f87685b = str;
            this.f87686c = interfaceC24775a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c.m104491c() == 50001) {
                this.f87686c.mo15338c(new ZinstantException(302, c20096c.m104492d()));
            } else {
                this.f87686c.mo15338c(new Exception(c20096c.toString()));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                C22504b c22504b = new C22504b(this.f87684a, jSONObject.getJSONObject("zinstantdata"));
                if (TextUtils.equals(this.f87685b, c22504b.f110128b)) {
                    c22504b.f110133g = jSONObject.optLong("expiration_time");
                    c22504b.f110134h = System.currentTimeMillis();
                    this.f87686c.onSuccess(c22504b);
                    return;
                }
                throw new Exception("Incorrect ZinstantDataId");
            } catch (Exception e11) {
                this.f87686c.mo15338c(e11);
            }
        }
    }

    /* renamed from: b */
    private void m91707b(JSONObject jSONObject) {
        jSONObject.put("os_version", Build.VERSION.RELEASE);
        jSONObject.put("os_version_enum", Build.VERSION.SDK_INT);
    }

    @Override // pj0.InterfaceC24792r
    /* renamed from: a */
    public void mo91708a(int i11, String str, String str2, int i12, int i13, int i14, String str3, InterfaceC24775a interfaceC24775a) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(i11, str2, interfaceC24775a));
        if (i13 > 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("zinstantdata_id", str2);
                m91707b(jSONObject);
                jSONObject.put("ver_zins_cli", i14);
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject.put("data_extras", str3);
                c0766k.mo1779xa(i13, 0, jSONObject.toString(), false);
                return;
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
                interfaceC24775a.mo15338c(e11);
                return;
            }
        }
        if (AbstractC23138m0.m118770b()) {
            String[] strArr = {"zinstantdata_id", "os_version", "os_version_enum", "ver_zins_cli", "data_extras"};
            String[] strArr2 = new String[5];
            strArr2[0] = str2;
            strArr2[1] = Build.VERSION.RELEASE;
            strArr2[2] = String.valueOf(Build.VERSION.SDK_INT);
            strArr2[3] = String.valueOf(i14);
            if (str3 == null) {
                str3 = "";
            }
            strArr2[4] = str3;
            c0766k.mo1532S6(str, strArr, strArr2, i12, AbstractC17148f0.m91689h(i11), false);
            return;
        }
        interfaceC24775a.mo15338c(new Exception("User is not logged in or logging out!"));
    }
}
