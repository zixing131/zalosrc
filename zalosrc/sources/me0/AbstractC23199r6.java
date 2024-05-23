package me0;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import java.util.List;
import java.util.Map;

/* renamed from: me0.r6 */
/* loaded from: classes4.dex */
public abstract class AbstractC23199r6 {

    /* renamed from: a */
    public static boolean f112459a = false;

    /* renamed from: a */
    public static float m119528a(float f11, float f12, float f13) {
        return Math.min(f13, Math.max(f12, f11));
    }

    /* renamed from: b */
    public static void m119529b(int i11, ActionBar actionBar, View view, View view2, View view3, Avatar avatar, View view4, View view5, boolean z11, int i12, int i13, Drawable drawable, List list, Map map, Map map2, View.OnClickListener onClickListener, int i14, boolean z12) {
        float f11 = i14;
        float f12 = (i12 - i13) + (f11 / 2.0f);
        int i15 = i13 - i12;
        try {
            float f13 = f11 * 0.6666666f;
            float f14 = i11;
            float m119528a = m119528a((f14 - (i12 - f13)) / ((i14 + AbstractC23136l9.m118742r(6.0f)) - i13), 0.0f, 1.0f);
            if (f14 < f12) {
                f112459a = false;
            }
            if (!f112459a || z12) {
                if (view5 != null) {
                    float f15 = 1.0f - m119528a;
                    view5.setAlpha(f15);
                    view5.setVisibility(f15 > 0.1f ? 0 : 8);
                }
                if (z11 && actionBar != null && avatar != null) {
                    drawable.setAlpha((int) (255.0f * m119528a));
                    AbstractC23136l9.m118696b1(actionBar, drawable);
                    actionBar.getAvatarLayout().setAlpha(m119528a);
                    actionBar.getTitleTextView().setAlpha(m119528a);
                    boolean m119603k = C23212s8.m119603k();
                    if (m119528a == 1.0f) {
                        actionBar.getAvatarLayout().setOnClickListener(onClickListener);
                        actionBar.getTitleTextView().setOnClickListener(onClickListener);
                        if (m119603k) {
                            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_black);
                            m119530c(list, map2);
                        }
                    } else if (m119528a == 0.0f && m119603k) {
                        actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                        m119530c(list, map);
                    } else {
                        actionBar.getAvatarLayout().setOnClickListener(null);
                        actionBar.getTitleTextView().setOnClickListener(null);
                    }
                }
                if (view != null) {
                    AbstractC1579n0.m7857b1(view, m119528a((-i11) / 2.0f, i15, 0.0f));
                }
                float m118713h0 = 1.2f - ((0.2f * f14) / (i12 - ((int) (AbstractC23136l9.m118713h0() * 0.33f))));
                if (view != null) {
                    AbstractC1579n0.m7845W0(view, m119528a(m118713h0, 1.0f, 1.2f));
                    AbstractC1579n0.m7847X0(view, m119528a(m118713h0, 1.0f, 1.2f));
                }
                if (view2 != null) {
                    AbstractC1579n0.m7857b1(view2, m119528a(-i11, i15, 0.0f));
                }
                float f16 = i12 - f13;
                float min = Math.min(f16 - f14, f16);
                if (view3 != null) {
                    AbstractC1579n0.m7857b1(view3, min);
                }
                if (f14 >= f12) {
                    f112459a = true;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m119530c(List list, Map map) {
        if (list != null && map != null) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                Integer num = (Integer) map.get(Integer.valueOf(((ActionBarMenuItem) list.get(i11)).getIconView().getId()));
                if (num != null) {
                    ((ActionBarMenuItem) list.get(i11)).setIcon(num.intValue());
                }
            }
        }
    }
}
