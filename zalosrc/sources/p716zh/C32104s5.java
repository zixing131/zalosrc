package p716zh;

import ge.C19418j;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23238v2;
import org.json.JSONObject;

/* renamed from: zh.s5 */
/* loaded from: classes3.dex */
public class C32104s5 {

    /* renamed from: a */
    public int f148001a;

    /* renamed from: b */
    public Object f148002b;

    public C32104s5(int i11, Object obj) {
        this.f148001a = i11;
        this.f148002b = obj;
    }

    /* renamed from: a */
    public static void m154970a(ByteArrayOutputStream byteArrayOutputStream, int i11, Object obj) {
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.write(i11);
                switch (i11) {
                    case 0:
                        AbstractC23238v2.m119728m(byteArrayOutputStream, (String) obj);
                        break;
                    case 1:
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("repeatRule", obj);
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject.toString());
                        break;
                    case 2:
                        AbstractC23238v2.m119728m(byteArrayOutputStream, ((C19418j) obj).m101555e().toString());
                        break;
                    case 3:
                        Object[] objArr = (Object[]) obj;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("calendarType", objArr[0]);
                        jSONObject2.put("startTime", objArr[1]);
                        jSONObject2.put("endTime", objArr[2]);
                        jSONObject2.put("allDay", objArr[3]);
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject2.toString());
                        break;
                    case 4:
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("emoji", obj);
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject3.toString());
                        break;
                    case 5:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("needPin", booleanValue ? 1 : 0);
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject4.toString());
                        break;
                    case 6:
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("topicType", ((Integer) obj).intValue());
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject5.toString());
                        break;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m154971b(ByteArrayOutputStream byteArrayOutputStream, ArrayList arrayList) {
        if (byteArrayOutputStream != null) {
            if (arrayList != null) {
                byteArrayOutputStream.write(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C32104s5 c32104s5 = (C32104s5) it.next();
                    m154970a(byteArrayOutputStream, c32104s5.f148001a, c32104s5.f148002b);
                }
                return;
            }
            byteArrayOutputStream.write(0);
        }
    }
}
