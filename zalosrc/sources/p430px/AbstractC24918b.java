package p430px;

import android.content.Context;
import android.view.MotionEvent;
import p407ox.AbstractC24576a;

/* renamed from: px.b */
/* loaded from: classes4.dex */
public abstract class AbstractC24918b extends AbstractC24917a {

    /* renamed from: k */
    private int f119541k;

    /* renamed from: l */
    private int f119542l;

    public AbstractC24918b(Context context) {
        super(context);
        this.f119541k = -1;
        this.f119542l = 0;
    }

    @Override // p430px.AbstractC24917a, p430px.InterfaceC24920d
    /* renamed from: a */
    public boolean mo129587a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int i11 = 0;
        if (action != 0) {
            int i12 = 1;
            if (action != 1 && action != 3) {
                if (action == 6) {
                    int m128005a = AbstractC24576a.m128005a(motionEvent.getAction());
                    if (motionEvent.getPointerId(m128005a) == this.f119541k) {
                        if (m128005a != 0) {
                            i12 = 0;
                        }
                        this.f119541k = motionEvent.getPointerId(i12);
                        this.f119532b = motionEvent.getX(i12);
                        this.f119533c = motionEvent.getY(i12);
                    }
                }
            } else {
                this.f119541k = -1;
            }
        } else {
            this.f119541k = motionEvent.getPointerId(0);
        }
        int i13 = this.f119541k;
        if (i13 != -1) {
            i11 = i13;
        }
        this.f119542l = motionEvent.findPointerIndex(i11);
        return super.mo129587a(motionEvent);
    }

    @Override // p430px.AbstractC24917a
    /* renamed from: d */
    float mo129589d(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f119542l);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    @Override // p430px.AbstractC24917a
    /* renamed from: e */
    float mo129590e(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f119542l);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }
}
