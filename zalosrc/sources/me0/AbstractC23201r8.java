package me0;

import android.view.View;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;

/* renamed from: me0.r8 */
/* loaded from: classes4.dex */
public abstract class AbstractC23201r8 {
    /* renamed from: a */
    public static void m119531a(View view, int i11) {
        if (view != null) {
            try {
                if (view instanceof ActionBarMenuItem) {
                    m119532b((ActionBarMenuItem) view, i11);
                } else {
                    view.setContentDescription(AbstractC23136l9.m118743r0(i11));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m119532b(ActionBarMenuItem actionBarMenuItem, int i11) {
        if (actionBarMenuItem != null) {
            try {
                if (actionBarMenuItem.getIconView() != null) {
                    actionBarMenuItem.getIconView().setContentDescription(AbstractC23136l9.m118743r0(i11));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
