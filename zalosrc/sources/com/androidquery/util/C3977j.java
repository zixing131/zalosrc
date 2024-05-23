package com.androidquery.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.animation.Animation;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;

/* renamed from: com.androidquery.util.j */
/* loaded from: classes2.dex */
public final class C3977j implements InterfaceC3968a {

    /* renamed from: p */
    private final Context f15726p;

    /* renamed from: q */
    private C3979l f15727q;

    /* renamed from: r */
    private boolean f15728r;

    /* renamed from: s */
    private SparseArray f15729s;

    /* renamed from: t */
    private Object f15730t;

    /* renamed from: u */
    private int f15731u;

    public C3977j(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f15726p = context;
        this.f15731u = -1;
    }

    /* renamed from: b */
    private final void m18835b(int i11, Object obj) {
        if (this.f15729s == null) {
            this.f15729s = new SparseArray(2);
        }
        SparseArray sparseArray = this.f15729s;
        AbstractC19074t.m100205c(sparseArray);
        sparseArray.put(i11, obj);
    }

    /* renamed from: a */
    public final C3979l m18836a() {
        return this.f15727q;
    }

    protected final void finalize() {
        try {
            C3979l c3979l = this.f15727q;
            if (c3979l != null) {
                AbstractC19074t.m100205c(c3979l);
                c3979l.mo18853q(false);
            }
            this.f15727q = null;
            this.f15728r = false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public Context getContext() {
        return this.f15726p;
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public Resources getResources() {
        return this.f15726p.getResources();
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public Object getTag() {
        return this.f15730t;
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public void setAnimation(Animation animation) {
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public void setImageBitmap(Bitmap bitmap) {
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public void setImageDrawable(Drawable drawable) {
        if (!this.f15728r) {
            C3979l c3979l = this.f15727q;
            if (c3979l != null) {
                AbstractC19074t.m100205c(c3979l);
                c3979l.mo18853q(false);
            }
            this.f15727q = null;
        }
        this.f15728r = false;
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public void setImageInfo(C3979l c3979l) {
        setImageInfo(c3979l, true);
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public void setImageResource(int i11) {
        C3979l c3979l = this.f15727q;
        if (c3979l != null) {
            AbstractC19074t.m100205c(c3979l);
            c3979l.mo18853q(false);
        }
        this.f15727q = null;
        this.f15728r = false;
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public void setTag(Object obj) {
        this.f15730t = obj;
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public void setVisibility(int i11) {
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public void startAnimation(Animation animation) {
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public Object getTag(int i11) {
        SparseArray sparseArray = this.f15729s;
        if (sparseArray == null) {
            return null;
        }
        AbstractC19074t.m100205c(sparseArray);
        return sparseArray.get(i11);
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public void setImageInfo(C3979l c3979l, boolean z11) {
        try {
            C3979l c3979l2 = this.f15727q;
            if (c3979l != null) {
                this.f15727q = c3979l;
                AbstractC19074t.m100205c(c3979l);
                c3979l.mo18853q(true);
                this.f15728r = true;
                if (z11) {
                    setImageBitmap(c3979l.m18839c());
                }
            } else {
                this.f15727q = null;
                setImageBitmap(null);
            }
            if (c3979l2 != null) {
                c3979l2.mo18853q(false);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // com.androidquery.util.InterfaceC3968a
    public void setTag(int i11, Object obj) {
        if ((i11 >>> 24) >= 2) {
            m18835b(i11, obj);
            return;
        }
        throw new IllegalArgumentException("The key must be an application-specific resource id.".toString());
    }
}
