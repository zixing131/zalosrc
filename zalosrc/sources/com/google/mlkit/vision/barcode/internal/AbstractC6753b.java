package com.google.mlkit.vision.barcode.internal;

import android.util.SparseArray;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p234ia.C20464i;
import p294ka.C21631b;
import p670y5.C30318b1;
import p670y5.C30424gc;
import p670y5.C30561ng;
import p670y5.C30618qg;
import p670y5.C30693uf;
import p670y5.C30709vc;
import p670y5.C30731wf;
import p670y5.EnumC30367dc;
import p670y5.EnumC30386ec;
import p670y5.EnumC30405fc;
import p670y5.EnumC30614qc;
import p670y5.EnumC30633rc;
import p670y5.EnumC30674tf;
import p670y5.InterfaceC30352cg;
import p670y5.InterfaceC30542mg;

/* renamed from: com.google.mlkit.vision.barcode.internal.b */
/* loaded from: classes3.dex */
public abstract class AbstractC6753b {

    /* renamed from: a */
    private static final SparseArray f37141a;

    /* renamed from: b */
    private static final SparseArray f37142b;

    /* renamed from: c */
    static final AtomicReference f37143c;

    /* renamed from: d */
    private static final Map f37144d;

    static {
        SparseArray sparseArray = new SparseArray();
        f37141a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f37142b = sparseArray2;
        f37143c = new AtomicReference();
        sparseArray.put(-1, EnumC30614qc.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC30614qc.FORMAT_CODE_128);
        sparseArray.put(2, EnumC30614qc.FORMAT_CODE_39);
        sparseArray.put(4, EnumC30614qc.FORMAT_CODE_93);
        sparseArray.put(8, EnumC30614qc.FORMAT_CODABAR);
        sparseArray.put(16, EnumC30614qc.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC30614qc.FORMAT_EAN_13);
        sparseArray.put(64, EnumC30614qc.FORMAT_EAN_8);
        sparseArray.put(128, EnumC30614qc.FORMAT_ITF);
        sparseArray.put(256, EnumC30614qc.FORMAT_QR_CODE);
        sparseArray.put(512, EnumC30614qc.FORMAT_UPC_A);
        sparseArray.put(1024, EnumC30614qc.FORMAT_UPC_E);
        sparseArray.put(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA, EnumC30614qc.FORMAT_PDF417);
        sparseArray.put(4096, EnumC30614qc.FORMAT_AZTEC);
        sparseArray2.put(0, EnumC30633rc.TYPE_UNKNOWN);
        sparseArray2.put(1, EnumC30633rc.TYPE_CONTACT_INFO);
        sparseArray2.put(2, EnumC30633rc.TYPE_EMAIL);
        sparseArray2.put(3, EnumC30633rc.TYPE_ISBN);
        sparseArray2.put(4, EnumC30633rc.TYPE_PHONE);
        sparseArray2.put(5, EnumC30633rc.TYPE_PRODUCT);
        sparseArray2.put(6, EnumC30633rc.TYPE_SMS);
        sparseArray2.put(7, EnumC30633rc.TYPE_TEXT);
        sparseArray2.put(8, EnumC30633rc.TYPE_URL);
        sparseArray2.put(9, EnumC30633rc.TYPE_WIFI);
        sparseArray2.put(10, EnumC30633rc.TYPE_GEO);
        sparseArray2.put(11, EnumC30633rc.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, EnumC30633rc.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        f37144d = hashMap;
        hashMap.put(1, EnumC30674tf.CODE_128);
        hashMap.put(2, EnumC30674tf.CODE_39);
        hashMap.put(4, EnumC30674tf.CODE_93);
        hashMap.put(8, EnumC30674tf.CODABAR);
        hashMap.put(16, EnumC30674tf.DATA_MATRIX);
        hashMap.put(32, EnumC30674tf.EAN_13);
        hashMap.put(64, EnumC30674tf.EAN_8);
        hashMap.put(128, EnumC30674tf.ITF);
        hashMap.put(256, EnumC30674tf.QR_CODE);
        hashMap.put(512, EnumC30674tf.UPC_A);
        hashMap.put(1024, EnumC30674tf.UPC_E);
        hashMap.put(Integer.valueOf(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA), EnumC30674tf.PDF417);
        hashMap.put(4096, EnumC30674tf.AZTEC);
    }

    /* renamed from: a */
    public static EnumC30614qc m34570a(int i11) {
        EnumC30614qc enumC30614qc = (EnumC30614qc) f37141a.get(i11);
        if (enumC30614qc == null) {
            return EnumC30614qc.FORMAT_UNKNOWN;
        }
        return enumC30614qc;
    }

    /* renamed from: b */
    public static EnumC30633rc m34571b(int i11) {
        EnumC30633rc enumC30633rc = (EnumC30633rc) f37142b.get(i11);
        if (enumC30633rc == null) {
            return EnumC30633rc.TYPE_UNKNOWN;
        }
        return enumC30633rc;
    }

    /* renamed from: c */
    public static C30731wf m34572c(C21631b c21631b) {
        int m111558a = c21631b.m111558a();
        C30318b1 c30318b1 = new C30318b1();
        if (m111558a == 0) {
            c30318b1.m149465f(f37144d.values());
        } else {
            for (Map.Entry entry : f37144d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & m111558a) != 0) {
                    c30318b1.m149464e((EnumC30674tf) entry.getValue());
                }
            }
        }
        C30693uf c30693uf = new C30693uf();
        c30693uf.m149664b(c30318b1.m149466g());
        return c30693uf.m149665c();
    }

    /* renamed from: d */
    public static String m34573d() {
        if (true != m34575f()) {
            return "play-services-mlkit-barcode-scanning";
        }
        return "barcode-scanning";
    }

    /* renamed from: e */
    public static void m34574e(C30561ng c30561ng, EnumC30386ec enumC30386ec) {
        c30561ng.m149589f(new InterfaceC30542mg() { // from class: com.google.mlkit.vision.barcode.internal.a
            public /* synthetic */ C6752a() {
            }

            @Override // p670y5.InterfaceC30542mg
            public final InterfaceC30352cg zza() {
                EnumC30367dc enumC30367dc;
                EnumC30386ec enumC30386ec2 = EnumC30386ec.this;
                C30424gc c30424gc = new C30424gc();
                if (AbstractC6753b.m34575f()) {
                    enumC30367dc = EnumC30367dc.TYPE_THICK;
                } else {
                    enumC30367dc = EnumC30367dc.TYPE_THIN;
                }
                c30424gc.m149518e(enumC30367dc);
                C30709vc c30709vc = new C30709vc();
                c30709vc.m149679b(enumC30386ec2);
                c30424gc.m149521h(c30709vc.m149680c());
                return C30618qg.m149613d(c30424gc);
            }
        }, EnumC30405fc.ON_DEVICE_BARCODE_LOAD);
    }

    /* renamed from: f */
    public static boolean m34575f() {
        AtomicReference atomicReference = f37143c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean m34586b = C6761j.m34586b(C20464i.m106493c().m106497b());
        atomicReference.set(Boolean.valueOf(m34586b));
        return m34586b;
    }
}
