package p716zh;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zh.rb */
/* loaded from: classes3.dex */
public class C32096rb {

    /* renamed from: e */
    public static final String f147935e = MainApplication.getAppContext().getString(AbstractC8020f0.str_cate_bg_feed_recents);

    /* renamed from: f */
    public static final String f147936f = MainApplication.getAppContext().getString(AbstractC8020f0.str_cate_bg_feed_others);

    /* renamed from: a */
    public int f147937a;

    /* renamed from: b */
    public String f147938b;

    /* renamed from: c */
    public int f147939c;

    /* renamed from: d */
    public List f147940d;

    public C32096rb(int i11, String str, int i12) {
        this.f147937a = i11;
        this.f147938b = str;
        this.f147939c = i12;
    }

    /* renamed from: a */
    public void m154927a(C31890dc c31890dc) {
        if (this.f147940d == null) {
            this.f147940d = new ArrayList();
        }
        this.f147940d.add(c31890dc);
    }

    /* renamed from: b */
    public int m154928b() {
        List list = this.f147940d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
