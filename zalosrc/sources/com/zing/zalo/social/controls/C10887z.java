package com.zing.zalo.social.controls;

import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import com.zing.zalo.AbstractC6918a0;
import kd0.C21697g;
import me0.AbstractC23093i;
import vg.C28100j3;

/* renamed from: com.zing.zalo.social.controls.z */
/* loaded from: classes5.dex */
public class C10887z extends C10880s {

    /* renamed from: h */
    public static C10887z f54998h;

    /* renamed from: k */
    public static C10887z m56529k() {
        if (f54998h == null) {
            f54998h = new C10887z();
        }
        return f54998h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.social.controls.C10880s
    /* renamed from: e */
    public boolean mo56524e(C21697g c21697g, MotionEvent motionEvent) {
        try {
            Object tag = c21697g.getTag(AbstractC6918a0.tag_callback_span_listener);
            Object tag2 = c21697g.getTag(AbstractC6918a0.tag_callback_span_data);
            if ((tag2 instanceof C28100j3) && (tag instanceof InterfaceC10861a) && !AbstractC23093i.m118471x() && motionEvent.getAction() == 1) {
                ((InterfaceC10861a) tag).mo43566yf((C28100j3) tag2);
                return true;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return super.mo56524e(c21697g, motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:            return true;     */
    @Override // com.zing.zalo.social.controls.C10880s
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo56525h(int i11, int i12, int i13, Layout layout, float f11, int i14) {
        int i15;
        int i16;
        try {
            int lineForOffset = layout.getLineForOffset(i12);
            int lineForOffset2 = layout.getLineForOffset(i13);
            float primaryHorizontal = layout.getPrimaryHorizontal(i12);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(i13);
            if (i12 < i11 && i11 < i13) {
                if (lineForOffset == lineForOffset2) {
                    return true;
                }
                int lineStart = layout.getLineStart(i14);
                int lineEnd = layout.getLineEnd(i14);
                if (i14 == layout.getLineCount() - 1) {
                    i15 = 0;
                } else {
                    i15 = 1;
                }
                int i17 = lineEnd - i15;
                if (lineStart >= i12 && lineStart <= i13 && i17 >= i12 && i17 <= i13) {
                    float primaryHorizontal3 = layout.getPrimaryHorizontal(lineStart);
                    float primaryHorizontal4 = layout.getPrimaryHorizontal(i17);
                    TextPaint paint = layout.getPaint();
                    String charSequence = layout.getText().toString();
                    float[] fArr = new float[1];
                    if (i17 == i13) {
                        i16 = i17;
                    } else {
                        i16 = i17 + 1;
                    }
                    paint.getTextWidths(charSequence, i17, i16, fArr);
                    float f12 = fArr[0];
                    if (f12 <= 0.0f) {
                        f12 = 0.0f;
                    }
                    if (i14 == lineForOffset) {
                        if (primaryHorizontal <= f11 && f11 <= primaryHorizontal4 + f12) {
                            return true;
                        }
                        return false;
                    }
                    if (i14 == lineForOffset2) {
                        if (primaryHorizontal3 <= f11 && f11 <= primaryHorizontal2) {
                            return true;
                        }
                        return false;
                    }
                    if (primaryHorizontal3 <= f11 && f11 <= primaryHorizontal4 + f12) {
                        return true;
                    }
                    return false;
                }
                throw new Exception();
            }
            if (i11 != i12 && i11 != i13) {
                return false;
            }
            if (lineForOffset != lineForOffset2) {
                return i11 == i12 ? false : false;
            }
            if (primaryHorizontal <= f11 && f11 <= primaryHorizontal2) {
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return super.mo56525h(i11, i12, i13, layout, f11, i14);
        }
    }
}
