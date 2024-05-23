package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC16802y;
import is.AbstractC20826v0;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.C23278z2;

/* loaded from: classes4.dex */
public class FeedGridView extends RelativeLayout {

    /* renamed from: A */
    InterfaceC8858a f47320A;

    /* renamed from: B */
    private ArrayList f47321B;

    /* renamed from: C */
    private ArrayList f47322C;

    /* renamed from: p */
    private final String f47323p;

    /* renamed from: q */
    private final boolean f47324q;

    /* renamed from: r */
    private int f47325r;

    /* renamed from: s */
    private int f47326s;

    /* renamed from: t */
    private int f47327t;

    /* renamed from: u */
    private int f47328u;

    /* renamed from: v */
    private int f47329v;

    /* renamed from: w */
    private final boolean f47330w;

    /* renamed from: x */
    private final int f47331x;

    /* renamed from: y */
    private boolean f47332y;

    /* renamed from: z */
    private int f47333z;

    /* renamed from: com.zing.zalo.feed.uicontrols.FeedGridView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8858a {
    }

    /* renamed from: com.zing.zalo.feed.uicontrols.FeedGridView$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC8859b {
    }

    public FeedGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47323p = FeedGridView.class.getSimpleName();
        this.f47324q = false;
        this.f47325r = 9;
        this.f47326s = 0;
        this.f47327t = 0;
        this.f47329v = 0;
        this.f47330w = C23278z2.m120139l1();
        this.f47331x = 0;
        this.f47332y = false;
        this.f47333z = -1;
        this.f47321B = new ArrayList();
        this.f47322C = new ArrayList();
        m47304a();
    }

    /* renamed from: a */
    private void m47304a() {
        float m118712h = AbstractC23136l9.m118712h(getContext(), 0.0f) * 2;
        if (!this.f47330w) {
            m118712h = getResources().getDimension(AbstractC16802y.feed_padding_left) + getResources().getDimension(AbstractC16802y.feed_padding_right);
        }
        this.f47327t = getContext().getResources().getDisplayMetrics().widthPixels - ((int) m118712h);
        this.f47328u = AbstractC23136l9.m118712h(getContext(), 1.0f);
    }

    public ArrayList<Rect> getDefaultCoordinates() {
        int size;
        ArrayList<Rect> arrayList = new ArrayList<>();
        if (AbstractC20826v0.m108824n0(this.f47333z)) {
            size = Math.min(this.f47321B.size(), 9);
        } else {
            size = this.f47321B.size();
        }
        int i11 = 1;
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    if (size != 4) {
                        this.f47325r = 9;
                        this.f47326s = ((int) Math.ceil(size / 3)) * (this.f47325r / 3);
                    } else {
                        this.f47325r = 8;
                        this.f47326s = 8;
                    }
                } else {
                    this.f47325r = 9;
                    this.f47326s = 3;
                }
                i11 = 3;
            } else {
                this.f47325r = 8;
                this.f47326s = 4;
            }
            i11 = 2;
        } else {
            this.f47325r = 4;
            this.f47326s = 4;
        }
        int i12 = this.f47325r / i11;
        for (int i13 = 0; i13 < size; i13++) {
            int i14 = (i13 % i11) * i12;
            int i15 = (i13 / i11) * i12;
            arrayList.add(new Rect(i14, i15, i14 + i12, i15 + i12));
        }
        return arrayList;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f47327t, 1073741824);
        int i13 = this.f47326s;
        if (i13 > 0) {
            i12 = View.MeasureSpec.makeMeasureSpec((int) (this.f47327t * ((i13 * 1.0f) / this.f47325r)), 1073741824);
        }
        super.onMeasure(makeMeasureSpec, i12);
    }

    public void setChangeLayout(boolean z11) {
        this.f47332y = z11;
    }

    public void setCurrentPositionInGroup(int i11) {
        this.f47329v = i11;
    }

    @Override // android.view.ViewGroup
    public void setLayoutMode(int i11) {
        this.f47333z = i11;
    }

    public void setMaxColumns(int i11) {
        this.f47325r = i11;
    }

    public void setMaxRows(int i11) {
        this.f47326s = i11;
    }

    public void setMaxWidth(int i11) {
        this.f47327t = i11;
    }

    public void setOnItemClickListener(InterfaceC8858a interfaceC8858a) {
        this.f47320A = interfaceC8858a;
    }

    public void setOnItemLongClickListener(InterfaceC8859b interfaceC8859b) {
    }
}
