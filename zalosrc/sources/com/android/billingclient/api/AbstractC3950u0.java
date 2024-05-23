package com.android.billingclient.api;

import com.android.billingclient.api.C3918k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.u0 */
/* loaded from: classes2.dex */
public abstract class AbstractC3950u0 {

    /* renamed from: A */
    static final C3918k f15630A;

    /* renamed from: B */
    static final C3918k f15631B;

    /* renamed from: C */
    static final C3918k f15632C;

    /* renamed from: D */
    static final C3918k f15633D;

    /* renamed from: E */
    static final C3918k f15634E;

    /* renamed from: a */
    static final C3918k f15635a;

    /* renamed from: b */
    static final C3918k f15636b;

    /* renamed from: c */
    static final C3918k f15637c;

    /* renamed from: d */
    static final C3918k f15638d;

    /* renamed from: e */
    static final C3918k f15639e;

    /* renamed from: f */
    static final C3918k f15640f;

    /* renamed from: g */
    static final C3918k f15641g;

    /* renamed from: h */
    static final C3918k f15642h;

    /* renamed from: i */
    static final C3918k f15643i;

    /* renamed from: j */
    static final C3918k f15644j;

    /* renamed from: k */
    static final C3918k f15645k;

    /* renamed from: l */
    static final C3918k f15646l;

    /* renamed from: m */
    static final C3918k f15647m;

    /* renamed from: n */
    static final C3918k f15648n;

    /* renamed from: o */
    static final C3918k f15649o;

    /* renamed from: p */
    static final C3918k f15650p;

    /* renamed from: q */
    static final C3918k f15651q;

    /* renamed from: r */
    static final C3918k f15652r;

    /* renamed from: s */
    static final C3918k f15653s;

    /* renamed from: t */
    static final C3918k f15654t;

    /* renamed from: u */
    static final C3918k f15655u;

    /* renamed from: v */
    static final C3918k f15656v;

    /* renamed from: w */
    static final C3918k f15657w;

    /* renamed from: x */
    static final C3918k f15658x;

    /* renamed from: y */
    static final C3918k f15659y;

    /* renamed from: z */
    static final C3918k f15660z;

    static {
        C3918k.a m18648c = C3918k.m18648c();
        m18648c.m18655c(3);
        m18648c.m18654b("Google Play In-app Billing API version is less than 3");
        f15635a = m18648c.m18653a();
        C3918k.a m18648c2 = C3918k.m18648c();
        m18648c2.m18655c(3);
        m18648c2.m18654b("Google Play In-app Billing API version is less than 9");
        f15636b = m18648c2.m18653a();
        C3918k.a m18648c3 = C3918k.m18648c();
        m18648c3.m18655c(3);
        m18648c3.m18654b("Billing service unavailable on device.");
        f15637c = m18648c3.m18653a();
        C3918k.a m18648c4 = C3918k.m18648c();
        m18648c4.m18655c(5);
        m18648c4.m18654b("Client is already in the process of connecting to billing service.");
        f15638d = m18648c4.m18653a();
        C3918k.a m18648c5 = C3918k.m18648c();
        m18648c5.m18655c(5);
        m18648c5.m18654b("The list of SKUs can't be empty.");
        f15639e = m18648c5.m18653a();
        C3918k.a m18648c6 = C3918k.m18648c();
        m18648c6.m18655c(5);
        m18648c6.m18654b("SKU type can't be empty.");
        f15640f = m18648c6.m18653a();
        C3918k.a m18648c7 = C3918k.m18648c();
        m18648c7.m18655c(5);
        m18648c7.m18654b("Product type can't be empty.");
        f15641g = m18648c7.m18653a();
        C3918k.a m18648c8 = C3918k.m18648c();
        m18648c8.m18655c(-2);
        m18648c8.m18654b("Client does not support extra params.");
        f15642h = m18648c8.m18653a();
        C3918k.a m18648c9 = C3918k.m18648c();
        m18648c9.m18655c(5);
        m18648c9.m18654b("Invalid purchase token.");
        f15643i = m18648c9.m18653a();
        C3918k.a m18648c10 = C3918k.m18648c();
        m18648c10.m18655c(6);
        m18648c10.m18654b("An internal error occurred.");
        f15644j = m18648c10.m18653a();
        C3918k.a m18648c11 = C3918k.m18648c();
        m18648c11.m18655c(5);
        m18648c11.m18654b("SKU can't be null.");
        f15645k = m18648c11.m18653a();
        C3918k.a m18648c12 = C3918k.m18648c();
        m18648c12.m18655c(0);
        f15646l = m18648c12.m18653a();
        C3918k.a m18648c13 = C3918k.m18648c();
        m18648c13.m18655c(-1);
        m18648c13.m18654b("Service connection is disconnected.");
        f15647m = m18648c13.m18653a();
        C3918k.a m18648c14 = C3918k.m18648c();
        m18648c14.m18655c(2);
        m18648c14.m18654b("Timeout communicating with service.");
        f15648n = m18648c14.m18653a();
        C3918k.a m18648c15 = C3918k.m18648c();
        m18648c15.m18655c(-2);
        m18648c15.m18654b("Client does not support subscriptions.");
        f15649o = m18648c15.m18653a();
        C3918k.a m18648c16 = C3918k.m18648c();
        m18648c16.m18655c(-2);
        m18648c16.m18654b("Client does not support subscriptions update.");
        f15650p = m18648c16.m18653a();
        C3918k.a m18648c17 = C3918k.m18648c();
        m18648c17.m18655c(-2);
        m18648c17.m18654b("Client does not support get purchase history.");
        f15651q = m18648c17.m18653a();
        C3918k.a m18648c18 = C3918k.m18648c();
        m18648c18.m18655c(-2);
        m18648c18.m18654b("Client does not support price change confirmation.");
        f15652r = m18648c18.m18653a();
        C3918k.a m18648c19 = C3918k.m18648c();
        m18648c19.m18655c(-2);
        m18648c19.m18654b("Play Store version installed does not support cross selling products.");
        f15653s = m18648c19.m18653a();
        C3918k.a m18648c20 = C3918k.m18648c();
        m18648c20.m18655c(-2);
        m18648c20.m18654b("Client does not support multi-item purchases.");
        f15654t = m18648c20.m18653a();
        C3918k.a m18648c21 = C3918k.m18648c();
        m18648c21.m18655c(-2);
        m18648c21.m18654b("Client does not support offer_id_token.");
        f15655u = m18648c21.m18653a();
        C3918k.a m18648c22 = C3918k.m18648c();
        m18648c22.m18655c(-2);
        m18648c22.m18654b("Client does not support ProductDetails.");
        f15656v = m18648c22.m18653a();
        C3918k.a m18648c23 = C3918k.m18648c();
        m18648c23.m18655c(-2);
        m18648c23.m18654b("Client does not support in-app messages.");
        f15657w = m18648c23.m18653a();
        C3918k.a m18648c24 = C3918k.m18648c();
        m18648c24.m18655c(-2);
        m18648c24.m18654b("Client does not support user choice billing.");
        f15658x = m18648c24.m18653a();
        C3918k.a m18648c25 = C3918k.m18648c();
        m18648c25.m18655c(5);
        m18648c25.m18654b("Unknown feature");
        f15659y = m18648c25.m18653a();
        C3918k.a m18648c26 = C3918k.m18648c();
        m18648c26.m18655c(-2);
        m18648c26.m18654b("Play Store version installed does not support get billing config.");
        f15660z = m18648c26.m18653a();
        C3918k.a m18648c27 = C3918k.m18648c();
        m18648c27.m18655c(-2);
        m18648c27.m18654b("Query product details with serialized docid is not supported.");
        f15630A = m18648c27.m18653a();
        C3918k.a m18648c28 = C3918k.m18648c();
        m18648c28.m18655c(4);
        m18648c28.m18654b("Item is unavailable for purchase.");
        f15631B = m18648c28.m18653a();
        C3918k.a m18648c29 = C3918k.m18648c();
        m18648c29.m18655c(-2);
        m18648c29.m18654b("Query product details with developer specified account is not supported.");
        f15632C = m18648c29.m18653a();
        C3918k.a m18648c30 = C3918k.m18648c();
        m18648c30.m18655c(-2);
        m18648c30.m18654b("Play Store version installed does not support alternative billing only.");
        f15633D = m18648c30.m18653a();
        C3918k.a m18648c31 = C3918k.m18648c();
        m18648c31.m18655c(5);
        m18648c31.m18654b("To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.");
        f15634E = m18648c31.m18653a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3918k m18701a(int i11, String str) {
        C3918k.a m18648c = C3918k.m18648c();
        m18648c.m18655c(i11);
        m18648c.m18654b(str);
        return m18648c.m18653a();
    }
}
