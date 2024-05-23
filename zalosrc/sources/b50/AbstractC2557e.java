package b50;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b50.C2553a;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import java.util.List;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;

/* renamed from: b50.e */
/* loaded from: classes5.dex */
public abstract class AbstractC2557e {
    /* renamed from: a */
    private static int m13009a(ImageView imageView, boolean z11, boolean z12) {
        try {
            if (C2556d.m12981o().m12999m()) {
                C2553a.b m13002s = C2556d.m12981o().m13002s();
                if (m13002s == null) {
                    imageView.setVisibility(8);
                    return -1;
                }
                int m12954e = m13002s.m12954e();
                if (m12954e >= 0) {
                    int[] iArr = C2556d.f10467e;
                    if (m12954e < iArr.length) {
                        if (z12 && m12954e != 1) {
                            imageView.setVisibility(8);
                            return m12954e;
                        }
                        imageView.setImageResource(iArr[m12954e]);
                        imageView.setVisibility(0);
                        if (z11) {
                            m13012d(imageView, m12954e);
                        }
                        return m12954e;
                    }
                }
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return -1;
    }

    /* renamed from: b */
    public static int m13010b(ViewGroup viewGroup, int i11) {
        ImageView imageView = (ImageView) viewGroup.findViewById(i11);
        if (imageView == null) {
            return -1;
        }
        return m13009a(imageView, viewGroup instanceof ActionBarMenuItem, false);
    }

    /* renamed from: c */
    public static int m13011c(ImageView imageView, List list) {
        int m13009a = m13009a(imageView, false, true);
        if (m13009a >= 0) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (list.get(i11) != null) {
                    ((View) list.get(i11)).setVisibility(8);
                }
            }
            return m13009a;
        }
        return -1;
    }

    /* renamed from: d */
    private static void m13012d(ImageView imageView, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        int i12 = AbstractC23222t7.f112558f;
        if (i11 == 0) {
            i12 = AbstractC23222t7.f112574n;
        }
        layoutParams.topMargin = i12;
        layoutParams.rightMargin = i12;
        imageView.setLayoutParams(layoutParams);
    }
}
