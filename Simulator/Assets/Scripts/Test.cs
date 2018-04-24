using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Test : MonoBehaviour {

#if UNITY_ANDROID && !UNITY_EDITOR
    private void Start()
    {
        var ajc = new AndroidJavaClass("service.PathFinder");
        ajc.CallStatic("test");
    }
#endif

}
