package p716zh;

import com.zing.zalocore.connection.socket.AbstractC17522a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23238v2;
import org.json.JSONObject;

/* renamed from: zh.l */
/* loaded from: classes3.dex */
public class C31997l {

    /* renamed from: a */
    public int f147235a;

    /* renamed from: b */
    public Object f147236b;

    public C31997l(int i11, Object obj) {
        this.f147235a = i11;
        this.f147236b = obj;
    }

    /* renamed from: a */
    public static void m154260a(ByteArrayOutputStream byteArrayOutputStream, int i11, Object obj) {
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.write(i11);
                switch (i11) {
                    case 0:
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(((Integer) obj).intValue()));
                        return;
                    case 1:
                        Object[] objArr = (Object[]) obj;
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(objArr.length));
                        for (Object obj2 : objArr) {
                            byteArrayOutputStream.write(AbstractC17522a.m93344g(Integer.parseInt((String) obj2)));
                        }
                        return;
                    case 2:
                        AbstractC23238v2.m119728m(byteArrayOutputStream, obj.toString());
                        return;
                    case 3:
                        Object[] objArr2 = (Object[]) obj;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("title", objArr2[0]);
                        jSONObject.put("desc", objArr2[1]);
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject.toString());
                        return;
                    case 4:
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("repeatRule", obj);
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject2.toString());
                        return;
                    case 5:
                    default:
                        return;
                    case 6:
                        Object[] objArr3 = (Object[]) obj;
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("calendarType", ((Integer) objArr3[0]).intValue());
                        jSONObject3.put("startTime", ((Long) objArr3[1]).longValue());
                        jSONObject3.put("endTime", ((Long) objArr3[2]).longValue());
                        jSONObject3.put("allDay", ((Integer) objArr3[3]).intValue());
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject3.toString());
                        return;
                    case 7:
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(((Integer) obj).intValue()));
                        return;
                    case 8:
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(((Integer) obj).intValue()));
                        return;
                    case 9:
                        AbstractC23238v2.m119728m(byteArrayOutputStream, obj.toString());
                        return;
                    case 10:
                        byteArrayOutputStream.write(((Integer) obj).intValue());
                        return;
                    case 11:
                        byteArrayOutputStream.write(AbstractC17522a.m93344g(((Integer) obj).intValue()));
                        return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m154261b(ByteArrayOutputStream byteArrayOutputStream, ArrayList arrayList) {
        if (byteArrayOutputStream != null) {
            if (arrayList != null) {
                byteArrayOutputStream.write(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C31997l c31997l = (C31997l) it.next();
                    m154260a(byteArrayOutputStream, c31997l.f147235a, c31997l.f147236b);
                }
                return;
            }
            byteArrayOutputStream.write(0);
        }
    }
}
