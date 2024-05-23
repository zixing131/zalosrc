package p716zh;

import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: zh.v4 */
/* loaded from: classes3.dex */
public class C32145v4 {

    /* renamed from: a */
    public String f148248a;

    /* renamed from: b */
    public int f148249b;

    /* renamed from: c */
    public String f148250c;

    public C32145v4(JSONObject jSONObject) {
        this.f148248a = "";
        this.f148250c = "";
        try {
            this.f148248a = AbstractC18069a.m96089h(jSONObject, "campid");
            this.f148249b = AbstractC18069a.m96085d(jSONObject, "srcidx");
            this.f148250c = AbstractC18069a.m96089h(jSONObject, "distribute_id");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
