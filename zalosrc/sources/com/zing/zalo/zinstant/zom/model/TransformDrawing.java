package com.zing.zalo.zinstant.zom.model;

import com.google.android.gms.ads.RequestConfiguration;
import com.zing.zalo.zinstant.utils.C17206r;
import com.zing.zalo.zinstant.utils.C17209u;
import com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D;
import com.zing.zalo.zinstant.zom.properties.ZOMTransform;
import com.zing.zalo.zinstant.zom.properties.ZOMTransformElement;
import com.zing.zalo.zinstant.zom.properties.ZOMTranslate;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.LinkedList;
import java.util.List;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25358n;

/* loaded from: classes7.dex */
public final class TransformDrawing {
    public static final Companion Companion = new Companion(null);
    private C17250a mCurrent;
    private float mFraction;
    private ZOMMatrix2D mOuter;
    private C17251b matrixOrigin = new C17251b(new ZOMMatrix2D(), new C17252c(new ZOMTranslate(), new ZOMTranslate()));
    private ZOMMatrix2D transformMatrix = new ZOMMatrix2D();
    private ZOMMatrix2D outerTransformMatrix = new ZOMMatrix2D();
    private ZOMMatrix2D innerTransformMatrix = new ZOMMatrix2D();
    private ZOMMatrix2D matrixPosition = new ZOMMatrix2D();
    private ZOMMatrix2D inverseMatrixPosition = new ZOMMatrix2D();

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void getOuter(ZOMMatrix2D zOMMatrix2D, TransformDrawing transformDrawing) {
            zOMMatrix2D.clear();
            ZOMMatrix2D zOMMatrix2D2 = transformDrawing.mOuter;
            if (zOMMatrix2D2 != null) {
                zOMMatrix2D2.postMatrix(zOMMatrix2D);
            }
            transformDrawing.matrixOrigin.m92087b().m92088a().postMatrix(zOMMatrix2D);
            transformDrawing.matrixOrigin.m92086a().postMatrix(zOMMatrix2D);
            transformDrawing.matrixOrigin.m92087b().m92089b().postMatrix(zOMMatrix2D);
        }

        private final /* synthetic */ <T> T[] toArrayFromList(List<? extends T> list) {
            List<? extends T> list2 = list;
            if (!list2.isEmpty()) {
                int size = list2.size();
                AbstractC19074t.m100213k(0, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
                T[] tArr = (T[]) new Object[size];
                for (int i11 = 0; i11 < size; i11++) {
                    tArr[i11] = list2.get(i11);
                }
                return tArr;
            }
            AbstractC19074t.m100213k(0, "T?");
            return (T[]) new Object[0];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zinstant.zom.model.TransformDrawing$a */
    /* loaded from: classes7.dex */
    public static final class C17250a {

        /* renamed from: a */
        private final LinkedList f87939a;

        /* renamed from: b */
        private final LinkedList f87940b;

        /* renamed from: c */
        private final LinkedList f87941c;

        /* renamed from: d */
        private final LinkedList f87942d;

        public C17250a(LinkedList linkedList, LinkedList linkedList2, LinkedList linkedList3, LinkedList linkedList4) {
            AbstractC19074t.m100208f(linkedList, "src");
            AbstractC19074t.m100208f(linkedList2, "des");
            AbstractC19074t.m100208f(linkedList3, "comp");
            AbstractC19074t.m100208f(linkedList4, "combine");
            this.f87939a = linkedList;
            this.f87940b = linkedList2;
            this.f87941c = linkedList3;
            this.f87942d = linkedList4;
        }

        /* renamed from: a */
        public final LinkedList m92082a() {
            return this.f87942d;
        }

        /* renamed from: b */
        public final LinkedList m92083b() {
            return this.f87941c;
        }

        /* renamed from: c */
        public final LinkedList m92084c() {
            return this.f87940b;
        }

        /* renamed from: d */
        public final LinkedList m92085d() {
            return this.f87939a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17250a)) {
                return false;
            }
            C17250a c17250a = (C17250a) obj;
            return AbstractC19074t.m100204b(this.f87939a, c17250a.f87939a) && AbstractC19074t.m100204b(this.f87940b, c17250a.f87940b) && AbstractC19074t.m100204b(this.f87941c, c17250a.f87941c) && AbstractC19074t.m100204b(this.f87942d, c17250a.f87942d);
        }

        public int hashCode() {
            return (((((this.f87939a.hashCode() * 31) + this.f87940b.hashCode()) * 31) + this.f87941c.hashCode()) * 31) + this.f87942d.hashCode();
        }

        public String toString() {
            return "Data(src=" + this.f87939a + ", des=" + this.f87940b + ", comp=" + this.f87941c + ", combine=" + this.f87942d + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zinstant.zom.model.TransformDrawing$b */
    /* loaded from: classes7.dex */
    public static final class C17251b {

        /* renamed from: a */
        private final ZOMMatrix2D f87943a;

        /* renamed from: b */
        private final C17252c f87944b;

        public C17251b(ZOMMatrix2D zOMMatrix2D, C17252c c17252c) {
            AbstractC19074t.m100208f(zOMMatrix2D, "matrix");
            AbstractC19074t.m100208f(c17252c, "origin");
            this.f87943a = zOMMatrix2D;
            this.f87944b = c17252c;
        }

        /* renamed from: a */
        public final ZOMMatrix2D m92086a() {
            return this.f87943a;
        }

        /* renamed from: b */
        public final C17252c m92087b() {
            return this.f87944b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17251b)) {
                return false;
            }
            C17251b c17251b = (C17251b) obj;
            return AbstractC19074t.m100204b(this.f87943a, c17251b.f87943a) && AbstractC19074t.m100204b(this.f87944b, c17251b.f87944b);
        }

        public int hashCode() {
            return (this.f87943a.hashCode() * 31) + this.f87944b.hashCode();
        }

        public String toString() {
            return "MatrixOrigin(matrix=" + this.f87943a + ", origin=" + this.f87944b + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.zinstant.zom.model.TransformDrawing$c */
    /* loaded from: classes7.dex */
    public static final class C17252c {

        /* renamed from: a */
        private final ZOMTranslate f87945a;

        /* renamed from: b */
        private final ZOMTranslate f87946b;

        public C17252c(ZOMTranslate zOMTranslate, ZOMTranslate zOMTranslate2) {
            AbstractC19074t.m100208f(zOMTranslate, "first");
            AbstractC19074t.m100208f(zOMTranslate2, "last");
            this.f87945a = zOMTranslate;
            this.f87946b = zOMTranslate2;
        }

        /* renamed from: a */
        public final ZOMTranslate m92088a() {
            return this.f87945a;
        }

        /* renamed from: b */
        public final ZOMTranslate m92089b() {
            return this.f87946b;
        }

        /* renamed from: c */
        public final void m92090c(float f11, float f12) {
            ZOMTranslate zOMTranslate = this.f87945a;
            zOMTranslate.f88010mX = f11;
            zOMTranslate.f88011mY = f12;
            ZOMTranslate zOMTranslate2 = this.f87946b;
            zOMTranslate2.f88010mX = -f11;
            zOMTranslate2.f88011mY = -f12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C17252c)) {
                return false;
            }
            C17252c c17252c = (C17252c) obj;
            return AbstractC19074t.m100204b(this.f87945a, c17252c.f87945a) && AbstractC19074t.m100204b(this.f87946b, c17252c.f87946b);
        }

        public int hashCode() {
            return (this.f87945a.hashCode() * 31) + this.f87946b.hashCode();
        }

        public String toString() {
            return "Origin(first=" + this.f87945a + ", last=" + this.f87946b + ')';
        }
    }

    private final C24860q algorithm(ZOMTransformElement[] zOMTransformElementArr, ZOMTransformElement[] zOMTransformElementArr2) {
        if (zOMTransformElementArr == null && zOMTransformElementArr2 == null) {
            return new C24860q(new LinkedList(), new LinkedList());
        }
        if (zOMTransformElementArr == null) {
            zOMTransformElementArr = new ZOMTransformElement[0];
        }
        if (zOMTransformElementArr2 == null) {
            zOMTransformElementArr2 = new ZOMTransformElement[0];
        }
        return processAlgorithm(zOMTransformElementArr, zOMTransformElementArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ZOMTransformElement[] getCurrentElements() {
        LinkedList m91852b;
        C17250a c17250a = this.mCurrent;
        if (c17250a != null) {
            if (Float.valueOf(this.mFraction).equals(Float.valueOf(1.0f))) {
                m91852b = c17250a.m92084c();
            } else {
                m91852b = C17209u.f87766a.m91852b(c17250a.m92085d(), c17250a.m92083b(), 1.0f, this.mFraction);
            }
            if (m91852b != null) {
                if (!m91852b.isEmpty()) {
                    int size = m91852b.size();
                    ZOMTransformElement[] zOMTransformElementArr = new ZOMTransformElement[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        zOMTransformElementArr[i11] = m91852b.get(i11);
                    }
                    return zOMTransformElementArr;
                }
                return new ZOMTransformElement[0];
            }
        }
        return null;
    }

    private final C24860q processAlgorithm(ZOMTransformElement[] zOMTransformElementArr, ZOMTransformElement[] zOMTransformElementArr2) {
        int i11;
        int length = zOMTransformElementArr.length;
        int length2 = zOMTransformElementArr2.length;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            if (i13 >= length2) {
                i11 = i12 + 1;
                ZOMTransformElement cloneTransform = zOMTransformElementArr[i12].cloneTransform();
                if (cloneTransform.getType() == 4) {
                    C17209u c17209u = C17209u.f87766a;
                    AbstractC19074t.m100206d(cloneTransform, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D");
                    for (ZOMTransformElement zOMTransformElement : c17209u.m91854d((ZOMMatrix2D) cloneTransform)) {
                        linkedList.add(zOMTransformElement);
                        linkedList2.add(C17209u.f87766a.m91855f(zOMTransformElement.getType()));
                    }
                } else {
                    linkedList.add(cloneTransform);
                    linkedList2.add(C17209u.f87766a.m91855f(cloneTransform.getType()));
                }
            } else {
                if (zOMTransformElementArr[i12].getType() != zOMTransformElementArr2[i13].getType()) {
                    break;
                }
                if (zOMTransformElementArr[i12].getType() == 4) {
                    C17209u c17209u2 = C17209u.f87766a;
                    i11 = i12 + 1;
                    ZOMTransformElement zOMTransformElement2 = zOMTransformElementArr[i12];
                    AbstractC19074t.m100206d(zOMTransformElement2, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D");
                    linkedList.addAll(c17209u2.m91854d((ZOMMatrix2D) zOMTransformElement2));
                    int i14 = i13 + 1;
                    ZOMTransformElement zOMTransformElement3 = zOMTransformElementArr2[i13];
                    AbstractC19074t.m100206d(zOMTransformElement3, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D");
                    linkedList2.addAll(c17209u2.m91854d((ZOMMatrix2D) zOMTransformElement3));
                    i13 = i14;
                } else {
                    linkedList.add(zOMTransformElementArr[i12].cloneTransform());
                    linkedList2.add(zOMTransformElementArr2[i13].cloneTransform());
                    i13++;
                    i12++;
                }
            }
            i12 = i11;
        }
        if (i12 < length) {
            C17209u c17209u3 = C17209u.f87766a;
            linkedList.addAll(c17209u3.m91854d(c17209u3.m91856g(zOMTransformElementArr, i12, length - 1)));
            linkedList2.addAll(c17209u3.m91854d(c17209u3.m91856g(zOMTransformElementArr2, i13, length2 - 1)));
        } else {
            while (i13 < length2) {
                int i15 = i13 + 1;
                ZOMTransformElement cloneTransform2 = zOMTransformElementArr2[i13].cloneTransform();
                if (cloneTransform2.getType() == 4) {
                    C17209u c17209u4 = C17209u.f87766a;
                    AbstractC19074t.m100206d(cloneTransform2, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.properties.ZOMMatrix2D");
                    for (ZOMTransformElement zOMTransformElement4 : c17209u4.m91854d((ZOMMatrix2D) cloneTransform2)) {
                        linkedList.add(C17209u.f87766a.m91855f(zOMTransformElement4.getType()));
                        linkedList2.add(zOMTransformElement4);
                    }
                } else {
                    linkedList.add(C17209u.f87766a.m91855f(cloneTransform2.getType()));
                    linkedList2.add(cloneTransform2);
                }
                i13 = i15;
            }
        }
        return new C24860q(linkedList, linkedList2);
    }

    private final void updateMatrixPosition() {
        this.matrixPosition.clear();
        ZOMMatrix2D zOMMatrix2D = this.mOuter;
        if (zOMMatrix2D != null) {
            zOMMatrix2D.postMatrix(this.matrixPosition);
        }
        this.matrixOrigin.m92087b().m92088a().postMatrix(this.matrixPosition);
        this.matrixOrigin.m92086a().postMatrix(this.matrixPosition);
        this.matrixOrigin.m92087b().m92089b().postMatrix(this.matrixPosition);
        this.matrixPosition.inverse(this.inverseMatrixPosition);
    }

    private final void updateTransformMatrix() {
        this.transformMatrix.clear();
        this.outerTransformMatrix.postMatrix(this.transformMatrix);
        this.innerTransformMatrix.postMatrix(this.transformMatrix);
    }

    public final float getCurrentFraction() {
        return this.mFraction;
    }

    public final LinkedList<ZOMTransformElement> getDrawElements() {
        C17250a c17250a = this.mCurrent;
        if (c17250a != null) {
            return c17250a.m92082a();
        }
        return null;
    }

    public final ZOMMatrix2D getInverseMatrixPosition() {
        return this.inverseMatrixPosition;
    }

    public final ZOMMatrix2D getMatrixPosition() {
        return this.matrixPosition;
    }

    public final ZOMMatrix2D getTransformMatrix() {
        return this.transformMatrix;
    }

    public final void handleNewTransform(ZOMTransform zOMTransform) {
        List m131381c0;
        AbstractC19074t.m100208f(zOMTransform, "transform");
        C24860q algorithm = algorithm(getCurrentElements(), zOMTransform.mTransformElements);
        C17209u c17209u = C17209u.f87766a;
        LinkedList m91852b = c17209u.m91852b((LinkedList) algorithm.m129216d(), (LinkedList) algorithm.m129215c(), 1.0f, -1.0f);
        LinkedList m91851a = c17209u.m91851a((LinkedList) algorithm.m129215c());
        LinkedList linkedList = (LinkedList) algorithm.m129215c();
        LinkedList linkedList2 = new LinkedList();
        ZOMTransformElement[] zOMTransformElementArr = zOMTransform.mTransformElements;
        if (zOMTransformElementArr != null) {
            AbstractC19074t.m100207e(zOMTransformElementArr, "mTransformElements");
            m131381c0 = AbstractC25358n.m131381c0(zOMTransformElementArr);
            if (m131381c0 != null) {
                linkedList2.addAll(m131381c0);
            }
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
        this.mCurrent = new C17250a(linkedList, linkedList2, m91852b, m91851a);
        ZOMTransformElement[] zOMTransformElementArr2 = zOMTransform.mTransformElements;
        if (zOMTransformElementArr2 != null) {
            for (ZOMTransformElement zOMTransformElement : zOMTransformElementArr2) {
                zOMTransformElement.postMatrix(this.innerTransformMatrix);
            }
        }
        updateTransformMatrix();
        this.mFraction = 0.0f;
    }

    public final boolean setFraction(float f11) {
        if (C17206r.m91844b(f11, this.mFraction, 0.0d, 4, null)) {
            return false;
        }
        this.mFraction = f11;
        C17250a c17250a = this.mCurrent;
        if (c17250a == null) {
            return false;
        }
        C17209u c17209u = C17209u.f87766a;
        c17209u.m91853c(c17250a.m92082a(), c17250a.m92085d(), c17250a.m92083b(), 1.0f, f11);
        this.matrixOrigin.m92086a().clear();
        if (Float.valueOf(f11).equals(Float.valueOf(1.0f))) {
            c17209u.m91857h(this.matrixOrigin.m92086a(), c17250a.m92084c());
        } else {
            c17209u.m91857h(this.matrixOrigin.m92086a(), c17250a.m92082a());
        }
        updateMatrixPosition();
        this.innerTransformMatrix = this.matrixOrigin.m92086a();
        updateTransformMatrix();
        return true;
    }

    public final boolean setOuter(TransformDrawing transformDrawing) {
        ZOMMatrix2D zOMMatrix2D;
        if (transformDrawing == null || (zOMMatrix2D = transformDrawing.transformMatrix) == null) {
            zOMMatrix2D = new ZOMMatrix2D();
        }
        this.outerTransformMatrix = zOMMatrix2D;
        updateTransformMatrix();
        if (transformDrawing == null) {
            if (this.mOuter != null) {
                this.mOuter = null;
                updateMatrixPosition();
                return true;
            }
            return false;
        }
        if (this.mOuter == null) {
            this.mOuter = new ZOMMatrix2D();
        }
        ZOMMatrix2D zOMMatrix2D2 = this.mOuter;
        if (zOMMatrix2D2 != null) {
            Companion.getOuter(zOMMatrix2D2, transformDrawing);
        }
        updateMatrixPosition();
        return true;
    }

    public final boolean updateOrigin(float f11, float f12) {
        if (this.matrixOrigin.m92087b().m92088a().f88010mX == f11 && this.matrixOrigin.m92087b().m92088a().f88011mY == f12) {
            return false;
        }
        this.matrixOrigin.m92087b().m92090c(f11, f12);
        updateMatrixPosition();
        return true;
    }
}
