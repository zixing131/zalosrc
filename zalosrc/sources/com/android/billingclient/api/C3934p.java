package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.AbstractC5766h;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.android.billingclient.api.p */
/* loaded from: classes2.dex */
public final class C3934p {

    /* renamed from: a */
    private final String f15590a;

    /* renamed from: b */
    private final JSONObject f15591b;

    /* renamed from: c */
    private final String f15592c;

    /* renamed from: d */
    private final String f15593d;

    /* renamed from: e */
    private final String f15594e;

    /* renamed from: f */
    private final String f15595f;

    /* renamed from: g */
    private final String f15596g;

    /* renamed from: h */
    private final String f15597h;

    /* renamed from: i */
    private final String f15598i;

    /* renamed from: j */
    private final String f15599j;

    /* renamed from: k */
    private final String f15600k;

    /* renamed from: l */
    private final List f15601l;

    /* renamed from: m */
    private final List f15602m;

    /* renamed from: com.android.billingclient.api.p$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        private final String f15603a;

        /* renamed from: b */
        private final long f15604b;

        /* renamed from: c */
        private final String f15605c;

        /* renamed from: d */
        private final String f15606d;

        /* renamed from: e */
        private final String f15607e;

        /* renamed from: f */
        private final AbstractC5766h f15608f;

        /* renamed from: g */
        private final Long f15609g;

        /* renamed from: h */
        private final C3912i1 f15610h;

        /* renamed from: i */
        private final C3924l1 f15611i;

        /* renamed from: j */
        private final C3916j1 f15612j;

        /* renamed from: k */
        private final C3920k1 f15613k;

        a(JSONObject jSONObject) {
            Long l11;
            C3912i1 c3912i1;
            C3924l1 c3924l1;
            C3916j1 c3916j1;
            this.f15603a = jSONObject.optString("formattedPrice");
            this.f15604b = jSONObject.optLong("priceAmountMicros");
            this.f15605c = jSONObject.optString("priceCurrencyCode");
            this.f15606d = jSONObject.optString("offerIdToken");
            this.f15607e = jSONObject.optString("offerId");
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    arrayList.add(optJSONArray.getString(i11));
                }
            }
            this.f15608f = AbstractC5766h.m30236p(arrayList);
            if (jSONObject.has("fullPriceMicros")) {
                l11 = Long.valueOf(jSONObject.optLong("fullPriceMicros"));
            } else {
                l11 = null;
            }
            this.f15609g = l11;
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            if (optJSONObject == null) {
                c3912i1 = null;
            } else {
                c3912i1 = new C3912i1(optJSONObject);
            }
            this.f15610h = c3912i1;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            if (optJSONObject2 == null) {
                c3924l1 = null;
            } else {
                c3924l1 = new C3924l1(optJSONObject2);
            }
            this.f15611i = c3924l1;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            if (optJSONObject3 == null) {
                c3916j1 = null;
            } else {
                c3916j1 = new C3916j1(optJSONObject3);
            }
            this.f15612j = c3916j1;
            JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            this.f15613k = optJSONObject4 != null ? new C3920k1(optJSONObject4) : null;
        }

        /* renamed from: a */
        public final String m18675a() {
            return this.f15606d;
        }
    }

    /* renamed from: com.android.billingclient.api.p$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final String f15614a;

        /* renamed from: b */
        private final long f15615b;

        /* renamed from: c */
        private final String f15616c;

        /* renamed from: d */
        private final String f15617d;

        /* renamed from: e */
        private final int f15618e;

        /* renamed from: f */
        private final int f15619f;

        b(JSONObject jSONObject) {
            this.f15617d = jSONObject.optString("billingPeriod");
            this.f15616c = jSONObject.optString("priceCurrencyCode");
            this.f15614a = jSONObject.optString("formattedPrice");
            this.f15615b = jSONObject.optLong("priceAmountMicros");
            this.f15619f = jSONObject.optInt("recurrenceMode");
            this.f15618e = jSONObject.optInt("billingCycleCount");
        }

        /* renamed from: a */
        public long m18676a() {
            return this.f15615b;
        }
    }

    /* renamed from: com.android.billingclient.api.p$c */
    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a */
        private final List f15620a;

        c(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                    if (optJSONObject != null) {
                        arrayList.add(new b(optJSONObject));
                    }
                }
            }
            this.f15620a = arrayList;
        }

        /* renamed from: a */
        public List m18677a() {
            return this.f15620a;
        }
    }

    /* renamed from: com.android.billingclient.api.p$d */
    /* loaded from: classes2.dex */
    public static final class d {

        /* renamed from: a */
        private final String f15621a;

        /* renamed from: b */
        private final String f15622b;

        /* renamed from: c */
        private final String f15623c;

        /* renamed from: d */
        private final c f15624d;

        /* renamed from: e */
        private final List f15625e;

        /* renamed from: f */
        private final C3908h1 f15626f;

        d(JSONObject jSONObject) {
            this.f15621a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            this.f15622b = true == optString.isEmpty() ? null : optString;
            this.f15623c = jSONObject.getString("offerIdToken");
            this.f15624d = new c(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f15626f = optJSONObject != null ? new C3908h1(optJSONObject) : null;
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    arrayList.add(optJSONArray.getString(i11));
                }
            }
            this.f15625e = arrayList;
        }

        /* renamed from: a */
        public String m18678a() {
            return this.f15621a;
        }

        /* renamed from: b */
        public String m18679b() {
            return this.f15622b;
        }

        /* renamed from: c */
        public List m18680c() {
            return this.f15625e;
        }

        /* renamed from: d */
        public String m18681d() {
            return this.f15623c;
        }

        /* renamed from: e */
        public c m18682e() {
            return this.f15624d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3934p(String str) {
        ArrayList arrayList;
        this.f15590a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f15591b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f15592c = optString;
        String optString2 = jSONObject.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f15593d = optString2;
        if (!TextUtils.isEmpty(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                this.f15594e = jSONObject.optString("title");
                this.f15595f = jSONObject.optString("name");
                this.f15596g = jSONObject.optString("description");
                this.f15598i = jSONObject.optString("packageDisplayName");
                this.f15599j = jSONObject.optString("iconUrl");
                this.f15597h = jSONObject.optString("skuDetailsToken");
                this.f15600k = jSONObject.optString("serializedDocid");
                JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        arrayList2.add(new d(optJSONArray.getJSONObject(i11)));
                    }
                    this.f15601l = arrayList2;
                } else {
                    if (!optString2.equals("subs") && !optString2.equals("play_pass_subs")) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                    }
                    this.f15601l = arrayList;
                }
                JSONObject optJSONObject = this.f15591b.optJSONObject("oneTimePurchaseOfferDetails");
                JSONArray optJSONArray2 = this.f15591b.optJSONArray("oneTimePurchaseOfferDetailsList");
                ArrayList arrayList3 = new ArrayList();
                if (optJSONArray2 != null) {
                    for (int i12 = 0; i12 < optJSONArray2.length(); i12++) {
                        arrayList3.add(new a(optJSONArray2.getJSONObject(i12)));
                    }
                    this.f15602m = arrayList3;
                    return;
                }
                if (optJSONObject != null) {
                    arrayList3.add(new a(optJSONObject));
                    this.f15602m = arrayList3;
                    return;
                } else {
                    this.f15602m = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        throw new IllegalArgumentException("Product id cannot be empty.");
    }

    /* renamed from: a */
    public a m18668a() {
        List list = this.f15602m;
        if (list != null && !list.isEmpty()) {
            return (a) this.f15602m.get(0);
        }
        return null;
    }

    /* renamed from: b */
    public String m18669b() {
        return this.f15592c;
    }

    /* renamed from: c */
    public String m18670c() {
        return this.f15593d;
    }

    /* renamed from: d */
    public List m18671d() {
        return this.f15601l;
    }

    /* renamed from: e */
    public final String m18672e() {
        return this.f15591b.optString("packageName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3934p)) {
            return false;
        }
        return TextUtils.equals(this.f15590a, ((C3934p) obj).f15590a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final String m18673f() {
        return this.f15597h;
    }

    /* renamed from: g */
    public String m18674g() {
        return this.f15600k;
    }

    public int hashCode() {
        return this.f15590a.hashCode();
    }

    public String toString() {
        List list = this.f15601l;
        return "ProductDetails{jsonString='" + this.f15590a + "', parsedJson=" + this.f15591b.toString() + ", productId='" + this.f15592c + "', productType='" + this.f15593d + "', title='" + this.f15594e + "', productDetailsToken='" + this.f15597h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }
}
