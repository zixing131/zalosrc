package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zing.zalo.p077ui.widget.C13646i;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import java.util.ArrayList;
import java.util.List;
import tj.C26712d;

/* loaded from: classes6.dex */
public class ChatRichFooterViewV2 extends View {

    /* renamed from: p */
    List f69043p;

    /* renamed from: q */
    C13646i.b f69044q;

    public ChatRichFooterViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    private int m75620b() {
        List list = this.f69043p;
        if (list == null || list.size() == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f69043p.size(); i12++) {
            i11 += ((C13646i) this.f69043p.get(i12)).m76259g();
        }
        return i11;
    }

    /* renamed from: c */
    private void m75621c() {
        if (this.f69043p != null) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.f69043p.size(); i12++) {
                ((C13646i) this.f69043p.get(i12)).m76262n(0, i11);
                i11 += ((C13646i) this.f69043p.get(i12)).m76259g();
            }
        }
    }

    /* renamed from: a */
    public void m75622a(List list, int i11, ActionLogChatLocation.FooterLogData footerLogData) {
        if (list != null && list.size() != 0) {
            this.f69043p = new ArrayList();
            for (int i12 = 0; i12 < list.size(); i12++) {
                C13646i c13646i = new C13646i(this, (C26712d) list.get(i12), footerLogData);
                c13646i.m76263o(i11);
                c13646i.m76261m(this.f69044q);
                this.f69043p.add(c13646i);
            }
            m75621c();
            requestLayout();
        }
    }

    /* renamed from: d */
    protected boolean m75623d(MotionEvent motionEvent) {
        if (this.f69043p == null) {
            return false;
        }
        boolean z11 = false;
        for (int i11 = 0; i11 < this.f69043p.size() && !(z11 = ((C13646i) this.f69043p.get(i11)).m76260k(motionEvent)); i11++) {
        }
        return z11;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        List list = this.f69043p;
        if (list != null && list.size() != 0) {
            for (int i11 = 0; i11 < this.f69043p.size(); i11++) {
                ((C13646i) this.f69043p.get(i11)).m76258d(canvas);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        setMeasuredDimension(View.MeasureSpec.getSize(i11), m75620b());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m75623d(motionEvent);
        return true;
    }

    public void setFooterClickListener(C13646i.b bVar) {
        this.f69044q = bVar;
    }

    public ChatRichFooterViewV2(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
