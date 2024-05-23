package p224i0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p224i0.AbstractC20175d;

/* renamed from: i0.f */
/* loaded from: classes2.dex */
abstract class AbstractC20177f extends AbstractC20175d {

    /* renamed from: B */
    private a f99699B;

    /* renamed from: C */
    private boolean f99700C;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0.f$a */
    /* loaded from: classes2.dex */
    public static class a extends AbstractC20175d.c {

        /* renamed from: J */
        int[][] f99701J;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(a aVar, AbstractC20177f abstractC20177f, Resources resources) {
            super(aVar, abstractC20177f, resources);
            if (aVar != null) {
                this.f99701J = aVar.f99701J;
            } else {
                this.f99701J = new int[m105237f()];
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: A */
        public int m105258A(int[] iArr) {
            int[][] iArr2 = this.f99701J;
            int m105239h = m105239h();
            for (int i11 = 0; i11 < m105239h; i11++) {
                if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // p224i0.AbstractC20175d.c
        /* renamed from: o */
        public void mo105246o(int i11, int i12) {
            super.mo105246o(i11, i12);
            int[][] iArr = new int[i12];
            System.arraycopy(this.f99701J, 0, iArr, 0, i11);
            this.f99701J = iArr;
        }

        @Override // p224i0.AbstractC20175d.c
        /* renamed from: r */
        abstract void mo105215r();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: z */
        public int m105259z(int[] iArr, Drawable drawable) {
            int m105233a = m105233a(drawable);
            this.f99701J[m105233a] = iArr;
            return m105233a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC20177f(a aVar) {
        if (aVar != null) {
            mo105202h(aVar);
        }
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p224i0.AbstractC20175d
    /* renamed from: h */
    public void mo105202h(AbstractC20175d.c cVar) {
        super.mo105202h(cVar);
        if (cVar instanceof a) {
            this.f99699B = (a) cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] m105257j(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i11 = 0;
        for (int i12 = 0; i12 < attributeCount; i12++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i12);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i13 = i11 + 1;
                if (!attributeSet.getAttributeBooleanValue(i12, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i11] = attributeNameResource;
                i11 = i13;
            }
        }
        return StateSet.trimStateSet(iArr, i11);
    }

    @Override // p224i0.AbstractC20175d, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f99700C && super.mutate() == this) {
            this.f99699B.mo105215r();
            this.f99700C = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected abstract boolean onStateChange(int[] iArr);
}
