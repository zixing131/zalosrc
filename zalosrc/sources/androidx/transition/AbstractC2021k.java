package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: androidx.transition.k */
/* loaded from: classes2.dex */
abstract class AbstractC2021k {

    /* renamed from: a */
    static final Matrix f8589a = new a();

    /* renamed from: androidx.transition.k$a */
    /* loaded from: classes2.dex */
    static class a extends Matrix {
        a() {
        }

        /* renamed from: a */
        void m11018a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f11, float f12, float f13) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f11, float f12, float f13, float f14) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f11, float f12, float f13, float f14) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f11, float f12) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f11, float f12, float f13) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f11, float f12, float f13, float f14) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f11, float f12, float f13, float f14) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f11, float f12) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            m11018a();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            m11018a();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i11, float[] fArr2, int i12, int i13) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f11, float f12, float f13) {
            m11018a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f11, float f12, float f13, float f14) {
            m11018a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f11, float f12, float f13, float f14) {
            m11018a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f11, float f12, float f13, float f14) {
            m11018a();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f11, float f12) {
            m11018a();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            m11018a();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f11) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f11, float f12) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f11, float f12) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f11) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f11, float f12) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f11, float f12) {
            m11018a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f11) {
            m11018a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f11, float f12) {
            m11018a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f11, float f12) {
            m11018a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f11, float f12) {
            m11018a();
        }
    }
}
