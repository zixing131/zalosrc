package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23304d;
import zl0.AbstractC32232i;

/* loaded from: classes4.dex */
public class StepSeekBar extends FrameLayout {

    /* renamed from: p */
    SeekBar f83492p;

    /* renamed from: q */
    String[] f83493q;

    /* renamed from: r */
    Paint f83494r;

    /* renamed from: s */
    Paint f83495s;

    /* renamed from: t */
    SeekBar.OnSeekBarChangeListener f83496t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.StepSeekBar$a */
    /* loaded from: classes4.dex */
    public class C16515a extends SeekBar {
        C16515a(Context context) {
            super(context);
        }

        @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
        protected synchronized void onDraw(Canvas canvas) {
            try {
                canvas.save();
                canvas.translate(getPaddingLeft(), getHeight() / 2.0f);
                canvas.drawLine(0.0f, 0.0f, (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft(), 0.0f, StepSeekBar.this.f83494r);
                canvas.restore();
                canvas.save();
                canvas.translate(getPaddingLeft(), getHeight() / 2.0f);
                for (int i11 = 0; i11 < StepSeekBar.this.f83493q.length; i11++) {
                    canvas.drawCircle((((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / (StepSeekBar.this.f83493q.length - 1)) * i11, 0.0f, AbstractC32232i.m155453a(3.0f), StepSeekBar.this.f83495s);
                }
                canvas.restore();
                super.onDraw(canvas);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public StepSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    void m88048a() {
        this.f83492p = new C16515a(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.f83492p.setLayoutParams(layoutParams);
        this.f83492p.setProgressDrawable(AbstractC1388a.m6964f(getContext(), AbstractC16803z.step_seek_bar_style));
        this.f83492p.setThumb(AbstractC1388a.m6964f(getContext(), AbstractC16803z.step_thumb_drawable));
        this.f83492p.setOnSeekBarChangeListener(this.f83496t);
        this.f83492p.setBackgroundColor(0);
    }

    public int getProgress() {
        SeekBar seekBar = this.f83492p;
        if (seekBar != null) {
            return seekBar.getProgress();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i13 - i11) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i14 - i12) - getPaddingBottom();
        int childCount = getChildCount();
        for (int i23 = 0; i23 < childCount; i23++) {
            View childAt = getChildAt(i23);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight() + AbstractC32232i.m155453a(8.0f);
                int i24 = layoutParams.gravity;
                if (i24 == -1) {
                    i24 = 51;
                }
                int i25 = i24 & 112;
                int i26 = i24 & 7;
                if (i26 != 1) {
                    if (i26 != 5) {
                        i17 = layoutParams.leftMargin + paddingLeft;
                        if (i25 == 16) {
                            if (i25 != 48) {
                                if (i25 != 80) {
                                    i22 = layoutParams.topMargin;
                                } else {
                                    i18 = paddingBottom - measuredHeight;
                                    i19 = layoutParams.bottomMargin;
                                }
                            } else {
                                i22 = layoutParams.topMargin;
                            }
                            i21 = i22 + paddingTop;
                            if (childAt instanceof TextView) {
                                i17 = ((((Integer) childAt.getTag()).intValue() * (((this.f83492p.getMeasuredWidth() - this.f83492p.getPaddingLeft()) - this.f83492p.getPaddingRight()) / (this.f83493q.length - 1))) - (measuredWidth / 2)) + this.f83492p.getLeft() + this.f83492p.getPaddingLeft();
                                i21 = (this.f83492p.getTop() - measuredHeight) - AbstractC32232i.m155453a(4.0f);
                            }
                            childAt.layout(i17, i21, measuredWidth + i17, measuredHeight + i21);
                        } else {
                            i18 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                            i19 = layoutParams.bottomMargin;
                        }
                        i21 = i18 - i19;
                        if (childAt instanceof TextView) {
                        }
                        childAt.layout(i17, i21, measuredWidth + i17, measuredHeight + i21);
                    } else {
                        i15 = paddingRight - measuredWidth;
                        i16 = layoutParams.rightMargin;
                    }
                } else {
                    i15 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i16 = layoutParams.rightMargin;
                }
                i17 = i15 - i16;
                if (i25 == 16) {
                }
                i21 = i18 - i19;
                if (childAt instanceof TextView) {
                }
                childAt.layout(i17, i21, measuredWidth + i17, measuredHeight + i21);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i11, 0, i12, 0);
                if (childAt instanceof TextView) {
                    i13 = childAt.getMeasuredHeight();
                }
            }
        }
        setMeasuredDimension(size, this.f83492p.getMeasuredHeight() + i13 + getPaddingTop() + getPaddingBottom() + AbstractC32232i.m155453a(8.0f));
    }

    public void setItems(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            this.f83493q = strArr;
            if (getChildCount() > 1) {
                removeAllViews();
                if (this.f83492p == null) {
                    m88048a();
                }
                addView(this.f83492p);
            }
            SeekBar seekBar = this.f83492p;
            seekBar.setPadding(seekBar.getPaddingLeft(), this.f83492p.getPaddingTop(), this.f83492p.getPaddingRight(), this.f83492p.getPaddingBottom());
            this.f83492p.setMax(strArr.length - 1);
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f83493q;
                if (i11 < strArr2.length) {
                    if (!TextUtils.isEmpty(strArr2[i11])) {
                        TextView textView = new TextView(getContext());
                        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        textView.setTextSize(1, 12.0f * AbstractC23304d.f113312O2[i11]);
                        textView.setText(this.f83493q[i11]);
                        textView.setTextColor(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor2));
                        if (C13778s1.m76960a()) {
                            textView.setTypeface(C13718q1.m76694c(getContext(), 5));
                        }
                        textView.setTag(Integer.valueOf(i11));
                        addView(textView);
                    }
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f83496t = onSeekBarChangeListener;
        SeekBar seekBar = this.f83492p;
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(onSeekBarChangeListener);
        }
    }

    public synchronized void setProgress(int i11) {
        SeekBar seekBar = this.f83492p;
        if (seekBar != null) {
            seekBar.setProgress(i11);
        }
    }

    public StepSeekBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f83494r = new Paint(1);
        this.f83495s = new Paint(1);
        setPadding(0, 0, 0, 0);
        this.f83494r.setColor(C23212s8.m119607o(context, AbstractC2807a.slider_thumb_neutral));
        this.f83494r.setStrokeWidth(AbstractC32232i.m155453a(2.0f));
        this.f83495s.setColor(C23212s8.m119607o(context, AbstractC2807a.slider_thumb_neutral));
        m88048a();
        addView(this.f83492p);
    }
}
